/*
scene  switching logic goes here
*/
package;

//import kha.graphics2.Graphics;

//import the base game class
import components.Game;
import components.Scene;
import components.App;

import scenes.MenuScene;
import scenes.SettingScene;
import scenes.GameoverScene;
import scenes.World;
import scenes.LoadGameScene;
import scenes.ExperimentScene;
//create an entity class
class MyGame extends Game{
	//initialize
	//public var world:Scene;//here goes our main game
	//world is already declared
	public var menuScene:Scene;
	public var gameOverScene:Scene;
	public var settingScene:Scene;
	public var loadGameScene:Scene;
	public var experimentScene:Scene;
	public var app:App;
	public function new(app:App){
		//create a viewport to set the resolution
		viewport = new Viewport(1600,1200);
		this.app = app;
		super(viewport);
		//create all the scenes
		
		this.addScene("world",new World(this));
		this.addScene("menu",new MenuScene(this));
		this.addScene("setting",new SettingScene(this));
		this.addScene("gameover",new GameoverScene(this));
		this.addScene("loadgame",new LoadGameScene(this));
		this.addScene("experiment",new ExperimentScene(this));
		currentScene = "experiment"; 
	}
	
}