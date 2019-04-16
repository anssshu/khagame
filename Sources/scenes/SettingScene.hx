package scenes;

//import kha.input.Keyboard;
//import kha.input.KeyCode;
import kha.graphics2.Graphics;
import components.Scene;
import MyGame;
//create an entity class
class SettingScene extends Scene{
	//initialize
	//public var game:MyGame;
	public function new(game:MyGame){
		//this.game = game;
		super(game);
		cast(this.game,MyGame);		
	}
	//
	
	//update
	public override function update(){
		super.update();
	}
	//render
	public override function render(g:Graphics){
		g.clear(kha.Color.Blue);
		super.render(g);
		
	}
}