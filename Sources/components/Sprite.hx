package components;

//import libraries
import kha.graphics2.Graphics;
import kha.math.FastMatrix3;
import kha.Image;
import components.Component;
class  Sprite extends Component{
	public var img:Image;
	public function new(image:Image){
		super();
		this.img = image;
		this.w = this.img.width;
		this.h = this.img.height;
	}

	public override  function update(){
		//this.r+=1.0;
	
	}
	
	public override function render(graphics:Graphics){
		
		graphics.pushTransformation(FastMatrix3.translation(this.x+this.ox,this.y+this.oy));
		graphics.rotate(this.degTorad(this.r+this.or),this.x+this.ox,this.y+this.oy);
		//graphics.fillRect(-this.ax*this.w,-this.ay*this.h,this.w,this.h);
		graphics.drawScaledImage(this.img,//image
		-this.ax*this.w*this.sx*this.s,//x-coord
		-this.ay*this.h*this.sy*this.s,//y-coord
		this.w*this.sx*this.s,//width of the scaled image
		this.s*this.h*this.sy //height of the scaled image
		);
		graphics.popTransformation();
	}

	private function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
}