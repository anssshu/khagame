package components;

//import libraries
import kha.System;
import kha.graphics2.Graphics;
import kha.math.FastMatrix3;
import kha.Image;
import kha.Scheduler;
import components.Component;
//---------------------------------------------------------------------------------------
class  AnimatedSprite extends Component{
	public var img:Image;
	public var thread = false;//if animation runs on a separate thread

	public var frames:Float;
	public var hframes = 6.0;
	public var vframes = 1.0;
	
	public var fw = 100.0; //frame width
	public var fh = 160.0; //frame height
	
	public var reverse = false;//play in reverse
	public var fps=60.0;//fps of animation
	public var startFrame:Float;
	public var endFrame:Float;
	public var currentFrame:Float;
	public var animations=new Map<String,Array<Float>>();//map to store all the animations

	public var startTime:Float;//for timer
//---------------------------------------------------------------------------------------------
	//cunstructor
	public function new(image:Image,fw:Float,fh:Float,fps:Float=60.0){
		super();
		this.fps=fps;
		this.startTime = System.time;
		this.fw = fw;
		this.fh = fh;
		this.img = image;
		this.w = this.img.width;
		this.h = this.img.height;
		this.hframes = this.w/this.fw;
		this.vframes = this.h/this.fh;
		this.frames = this.hframes*this.vframes;
		this.startFrame=1.0;
		this.endFrame = this.frames;
		this.currentFrame = this.startFrame;
		//trace(hframes,vframes,frames);
		//schedule update the animation
		if(this.thread)
			Scheduler.addTimeTask(this.updateAnimation,0,1/this.fps);

	}
//-------------------------------------------------------------------------------------------	
	//function tocreate an animation
	public function createAnimation(name:String,startF:Float,endF:Float):Void{
		//push an animation into the map
		this.animations[name]=[startF,endF];
	}
//---------------------------------------------------------------------------------	
	//play a particular animation
	public function play(anim:String,mfps:Float=60.0):Void{
		this.fps = mfps;
		//get  an animation from animation map
		var f =this.animations[anim];

		//set the start and endrames
		this.startFrame = f[0];
		this.endFrame = f[1];
		if (this.startFrame > this.endFrame) {
			this.reverse = true;
			this.startFrame=f[1];
			this.endFrame = f[0];
			}
		else this.reverse = false;
		this.currentFrame = this.startFrame;
		
	}
//-----------------------------------------------------------------------------
	//update animation frames
	public function updateAnimation(){
		//trace(Scheduler.numTasksInSchedule());
		if (this.reverse){
				if (this.currentFrame <= this.startFrame) this.currentFrame = this.endFrame;
				else this.currentFrame-=1;
		}
		else{
				if (this.currentFrame >= this.endFrame) this.currentFrame = this.startFrame;
				else this.currentFrame+=1;
		}
		
		//trace(this.currentFrame);
	}
	//--------------------------------------------------------------------------------
	//helper function frame no to sprite coordinate
	public function getCurrentFrameXYCoordinate(frameNo:Float){

		var h = frameNo%this.hframes;
		var v = Math.ceil(frameNo/this.hframes);
		if (h==0){
			h = this.hframes;
		}
		var x = (h-1)*this.fw;
		var y = (v-1)*this.fh;
		//trace(x,y);
		return [x,y] ;
		
	}
	//---------------------------------------------------------------------------------
	//for animation in single thread
	public override function update(){
		//ensure animation is running in a single thread
		if(!this.thread){
			//trace(this.fps);
			var timer:Float = System.time - this.startTime;
			if (timer >= 1/this.fps) {
			this.updateAnimation();
			this.startTime = System.time;
		}

		}
		
	}
	//-----------------------------------------------------------------------------------
	//render the graphics
	public override function render(graphics:Graphics){

		graphics.pushTransformation(FastMatrix3.translation(x+ox,y+oy));
		graphics.rotate(this.degTorad(r+or),x+ox,y+oy);
		//draw the subimage of the image atlas
		//first param is image
		//next 4 parameter is for sub image x,y,w,h of the subimage
		//next 2 for positioning it x,y
		//next 2 for scaling the subimage width height
		var p = this.getCurrentFrameXYCoordinate(this.currentFrame);
		var x = p[0];
		var y =p[1];
		//trace(x,y);
		graphics.drawScaledSubImage(this.img,
		x,y,
		this.fw,this.fh,
		-this.ax*this.fw*this.sx*this.s,-this.ay*this.fh*this.sy*this.s,
		this.fw*this.sx*this.s,this.fh*this.sy*this.s);

		
		graphics.popTransformation();
	}
	//------------------------------------------------------------------------------
	//deg to rad converter
	private function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
}