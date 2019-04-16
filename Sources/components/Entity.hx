package components;

import kha.graphics2.Graphics;
import components.Component;
import components.Scene;
//create an entity class
class Entity extends GameObject{

	public var components:Map<String,Component>;
	//public var children:Array<Entity>;
	public var physics = false;
	public var name = "Entity" ;
	public var id = 0;
	public function new(){
		this.components = new Map<String,Component>();
		//this.children = new Array<Entity>();
		//class variables
	}
	//update
	public function update(){
		//update physics body position
		
		
		//update all the componets
		for (c in this.components.keys()){
			this.components.get(c).update();
		}
		//update children
		//for (e in this.children){
			//e.update();
		//}
	}
	//render
	public function render(g:Graphics){
		//render all the components
		for (c in this.components.keys()){
			this.components.get(c).render(g);
		}
		//render children
		//for (e in this.children){
			//e.render(g);
		//}

	}
		
	
//function for getting camera input
	public function setOrigin(x:Float=0.0,y:Float=0.0,r:Float=0.0,s:Float=1.0){
		this.ox=x;
		this.oy=y;
		this.or=r;
		this.os=s;

	}
	//add a component
	public function addComponent(name:String,component:Component){
		this.components.set(name,component);
	}
	//get a component
	public function getComponent(name:String){
		return this.components.get(name);
	}
	//addChild
	//public function addChild(e:Entity){
		//this.children.push(e);
	//}
	public function kill(scene:Scene){
		//
		scene.removeChild(this.name);
	}
}



