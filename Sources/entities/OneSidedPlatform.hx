package entities;
import kha.graphics2.Graphics;
import components.Entity;
import components.NapeOneSidedBox;
import nape.space.Space;
//create an entity class
class OneSidedPlatform extends Entity{
	//initialize
	public var collider:NapeOneSidedBox;
	public function new(space:Space,x:Float,y:Float,w:Float,h:Float,color:kha.Color=kha.Color.Black){
		super();
		collider = new NapeOneSidedBox(space,x,y,w,h,h,color);
		this.addComponent("collider",collider);
	}
	//update
	public override function update(){
		 super.update();
	}
	//render
	public override function render(g:Graphics){
		 super.render(g);
	}
}