package scenes;

import kha.graphics2.Graphics;
import kha.Color;
//using kha.graphics2.GraphicsExtension;
import kha.input.Mouse;
import kha.input.Keyboard;
import kha.input.KeyCode;
import kha.System;
import MyGame;
import components.Scene;
//create an entity class
class MenuScene extends Scene{
	//initialize
	//public var game:MyGame;
	public var button = 1;
	public var c1=Color.Magenta;
	public var c2=Color.Magenta;
	public var c3=Color.Magenta;
	public var c4=Color.Magenta;
	public function new(game:MyGame){
		//this.game = game;
		super(game);
		cast(this.game,MyGame);		
	
		Mouse.get().notify(onMouseDown,null,onMouseMove,null,null);
		Keyboard.get().notify(onKeyDown,null,null);
		
	}
	//update
	public override function update(){
		super.update();
		if (this.button == 1) this.c1=Color.Red;
		else this.c1 = Color.White;
		if (this.button == 2) this.c2=Color.Red;
		else this.c2 = Color.White;
		if (this.button == 3) this.c3=Color.Red;
		else this.c3 = Color.White;
		if (this.button == 4) this.c4=Color.Red;
		else this.c4 = Color.White;
	}
	//render
	public override function render(g:Graphics){
		g.clear(kha.Color.Black);
		super.render(g);
		g.drawRect(470,380,660,500);

		g.color=this.c1;
		g.drawRect(500,400,600,100);
		//g.fillRect(510,410,580,80);
		g.color = Color.White;

		g.color=this.c2;
		g.drawRect(500,520,600,100);
		g.color=Color.White;

		g.color=this.c3;
		g.drawRect(500,640,600,100);
		g.color=Color.White;

		g.color=this.c4;
		g.drawRect(500,760,600,100);
		g.color=Color.White;
	}
	//navigate the menu buttons
	public function onKeyDown(k:KeyCode){

		if (k == Space) this.game.currentScene = "gameover";
		if (k == Escape) this.game.currentScene = "menu";
		if (k == Q) this.game.currentScene = "experiment";

		if (this.game.currentScene == "menu"){
			switch(k){
			case Up : {
				if (this.button > 0) this.button -=1;
				if (this.button == 0) this.button = 4;
				
			}
			case Down : {
				if (this.button < 5) this.button +=1;
				if (this.button == 5) this.button =1;
			
			}
			case Return:{
				if (this.button == 1) this.game.currentScene = "world";
				if (this.button == 2) this.game.currentScene = "setting";
				if (this.button == 3) this.game.currentScene = "loadgame";
				if (this.button == 4) System.requestShutdown();
			}
			
			default:return;
		}
		}

		
		
	}
	public function onMouseDown(button:Int, x:Int, y:Int):Void {
		//trace('mouse button is DOWN');
		//trace(button,x,y);
		//left mouse
		if (button == 0 && this.game.currentScene == "menu"){
			//if the first rectangle is clicked then play the game
			if (x>250 && x<550 && y>200 && y <250){
				this.game.currentScene = "world";
			}
			//if second rectangle is clicked
			if (x>250 && x<550 && y>260 && y <310){
				this.game.currentScene = "setting";
			}
		}
		
	}
	
	public function onWheel(i:Int):Void {
		//trace(i);
		if (i == 1 && this.button > 0) this.button -=1;
		if (i == 1 && this.button == 0) this.button = 4;
		if (i == -1 && this.button < 5) this.button +=1;
		if (i == -1 && this.button == 5) this.button =1;
		//trace(button);
	}
	
	public function onMouseMove(x:Int, y:Int, cx:Int, cy:Int):Void {
		//trace(x,y,cx,cy);
		if (x>250 && x<550 && y>200 && y <250){
				this.c1 = Color.Red;
			}
		else{
			this.c1 = Color.Magenta;
		}
	}
}