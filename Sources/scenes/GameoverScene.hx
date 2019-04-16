package scenes;

import kha.graphics2.Graphics;
import components.Scene;

//create an entity class
class GameoverScene extends Scene{
	//initialize
	public function new(game:MyGame){
		//this.game = game;
		super(game);
		cast(this.game,MyGame);		
	}
	//update
	public override function update(){
		super.update();
	}
	//render
	public override function render(g:Graphics){
		g.clear(kha.Color.Green);
		super.render(g);
		
	}
}