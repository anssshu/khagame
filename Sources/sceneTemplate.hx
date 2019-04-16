package scenes;


import kha.graphics2.Graphics;

import components.Scene;
import kha.Color;

import nape.space.Space;
import nape.geom.Vec2;




//create an entity class
class ExperimentScene extends Scene{
	//initialize
	
	public var gravity:Vec2;
	public var game:MyGame;
	public function new(game:MyGame){
		this.game = game;
		super();
	}
	//add all the entities inside this
	public override function initialiseScene(){
		//create the new space
		gravity = new Vec2(0,300);
		space = new Space(gravity);



		
	}
	//update
	public override function update(){
		super.update();
		//update the space
		space.step(1/60);
		//trace(player.x,camera.x);
	}
	//render
	public override function render(g:Graphics){
		
		g.clear(Color.Purple);
		super.render(g);
		
		
	}
}