/*
creates a game object
set the width and height of the gameScene not wondow
and create a back buffer and draw the scene into it
*/

package components;



import kha.Framebuffer;
import kha.graphics2.Graphics;
import kha.Scaler;
import kha.Image;
import kha.System;

import components.Scene;
class Viewport {
	public var width:Int;
	public var height:Int;
	public function new(w:Int,h:Int){
		width	=	w;
		height	=	h;
	}
	}
//create an entity class
class Game{
	//initialize
	public var backbuffer:Image;
	public var scenes = new Map<String,Scene>();
	//public var world:Scene;
	public var currentScene = "world";
	
	public var viewport:Viewport;
	//
	
	//--------------------------------------------------------------------
	public function new(viewport:Viewport){
		backbuffer = Image.createRenderTarget(viewport.width,viewport.height);
		//add an empty scene as world
		addScene("world",new Scene(this));	
	}
	//loadScene
	public function loadScene(s:Scene){
		var cs = getScene(currentScene);
		cs.pause();
		cs.reset();
		addScene("world",s);
		currentScene = "world";
	}
	//restart
	public function restart(){
		//var s = getScene(currentScene);
		//s.reset();
		//s.create();
	}

	//update
	public function update(){
		//update the world
		//world.update();
		scenes.get(currentScene).update();
		
	}
	//------------------------------------------------------
	//function to render the gameworld
	public function renderScene(graphics:Graphics){
		//world.render(graphics);
		scenes.get(currentScene).render(graphics);
	}
	//
	public function addScene(name:String,s:Scene){
		this.scenes.set(name,s);
	}
	//
	public function getScene(name:String){
		return this.scenes.get(name);
	}
//-----------------------RENDERING------------------------------
	//render
	public function render(framebuffer:Framebuffer):Void{
		//create a backbuffer and draw on it
		var graphics = backbuffer.g2;
	

		graphics.begin();
		graphics.clear(kha.Color.Black);
		//do all the rendering stuff here
		//render the scene
		this.renderScene(graphics);
		graphics.color=kha.Color.White;
		graphics.end();
		

		//after the backbuffer has been drawn copy it to the framebuffer
		framebuffer.g2.begin();
		graphics.clear(kha.Color.Purple);
		Scaler.scale(backbuffer, framebuffer, System.screenRotation);
		framebuffer.g2.end();

	}
}