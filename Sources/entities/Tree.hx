package entities;

import kha.graphics2.Graphics;
import components.Entity;
import components.Sprite;
//create an entity class
class Tree extends Entity{
	//initialize
	public var sprite:Sprite;
	public function new(){
		super();
		sprite = new Sprite(kha.Assets.images.tree2);
		sprite.ay=1.0;
		sprite.s =2;
		addComponent("sprite",sprite);
	}
	//update
	public override function update(){
		 super.update();
		 sprite.x = x;
		 sprite.y = y;
	}
	//render
	public override function render(g:Graphics){
		 super.render(g);
	}
}