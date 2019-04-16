package components;

import kha.graphics2.Graphics;
import kha.math.FastMatrix3;
import components.Entity;
import components.Scene;
//import components.Component;
//create an entity class
class Camera extends Entity{
	//initialize
	public var target:Entity;
	public var hide = false;
	public function new(scene:Scene){
		super();
		//camera origin
		this.ox = scene.game.viewport.width/2;
		this.oy = scene.game.viewport.height/2;

		this.w = scene.game.viewport.width*0.75;
		this.h = scene.game.viewport.height*0.75;
		this.x = 0;
		this.y = 0;
	}
	public function smoothFollow(o:Entity){
		this.target = o;
	}
	//helper function interpolation
	public function lerp(a:Float,b:Float,r:Float){
  		return a*(1-r)+b*r;
	}
	//update
	public override function update(){
		if (this.target != null){
			x = lerp(x,target.x-ox,0.15);
			//y = lerp(y,target.y-oy,1.0);
		}
		//trace(x,y);
	}
	//render
	public override function render(g:Graphics){
		if (hide == false)
		g.drawRect(ox-w/2,oy-h/2,w,h);
	}
	//set the camera on objects
	public function set(o:Entity){
		//g.pushTransformation(FastMatrix3.translation(-this.x,-this.y));
		o.setOrigin(-this.x,-this.y);
		
		//set for all components
		for (c in o.components.keys()){
			o.getComponent(c).setOrigin(-this.x,-this.y);
		}

		//set for all childern
		//for (e in o.children){
			//e.setOrigin(-this.x,-this.y);
		//}
	}
	//unset the camera
	public function unset(g:Graphics){
		g.popTransformation();
	}
	//
	
}