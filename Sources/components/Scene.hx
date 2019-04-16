package components;
/*
the scene contains 3 layers and one camera
objects are inserted into these arrays 
then update function and render function 
of all the objects are looped through
*/
//import components.Game;
import nape.space.Space;
//import nape.geom.Vec2;
//the base scene object
import kha.graphics2.Graphics;
import components.Camera;
import components.Entity;
//import kha.Assets;
//import components.Sprite;
//create an entity class
class Scene{
	//initialize
	public var space:Space;
	public var entities:Map<String,Entity>;
	public var bgLayer:Array<String>;
	public var camLayer:Array<String>;
	public var fgLayer:Array<String>;
	public var camera:Camera;
	public var play = true;
	public var lastId = 0;
	public var game:Game;
	public function new(game:Game){
		//entity database
		this.game = game;
		this.entities = new Map<String,Entity>();
		this.camera = new Camera(this);
		this.bgLayer = [];
		this.camLayer = [];
		this.fgLayer = [];
		create();
		
	}
	//add entities inside inside this
	public function create(){

	}
	public function restart(){
		reset();
		create();
	}
	//find entity in scene
	public function find(name:String){
		return entities.get(name);
	}
	//public function 
	
	//reset
	public function reset(){
		this.pause();
		//entity map to store all the scene object
		this.entities = new Map<String,Entity>();
		this.camera = new Camera(this);
		this.bgLayer = [];
		this.camLayer = [];
		this.fgLayer = [];
		//reset physics
		if(this.space != null){
			space = null;
		}
		this.resume();
	}
	//-------------------------
	public function pause(){
		this.play = false;
	}
	//---------------------------
	public function resume(){
		this.play = true;
	}
	//----------------------------
	//add an object to cameraLayer
	public function addChild(obj:Entity,layer:String = "camLayer"){
		//increase entity id and set id for the entity
		lastId+=1;
		obj.id = lastId;

		//give a unique name to entity
		if (obj.name == "Entity"){
			obj.name = 'Entity'+lastId;
		}
		
		//add object names to different Layers

		if (layer  == "camLayer"){
			this.camLayer.push(obj.name);
		}
		if (layer  == "fgLayer"){
			this.fgLayer.push(obj.name);
		}
		if (layer  == "bgLayer"){
			this.bgLayer.push(obj.name);
		}
		
		//add the entity to object dataBASE
		entities.set(obj.name,obj);
	}
	//
	public function removeChild(name:String){
		pause();
		bgLayer.remove(name);
		camLayer.remove(name);
		fgLayer.remove(name);
		entities.remove(name);
		resume();
	}
	//find an object
	//update
	public function update(){
		//update if game is not paused
		if (this.play){
			//update all the objects
		for (o in this.bgLayer)  entities.get(o).update();
		for (o in this.camLayer) entities.get(o).update();
		for (o in this.fgLayer)  entities.get(o).update();
		//update the camera
		this.camera.update();
		//update physics
		if (space != null)	space.step(1/60.0);
		//update from the scene
		}
		
		
	}
	//render
	public function render(g:Graphics){
		//trace(camera.x,camera.y);
		//var p = entityInViewport(entities.get("babu"));
		//trace(p);
		for (o in this.bgLayer) entities.get(o).render(g);
		//this.camera.set(g);
		for (o in this.camLayer) {
			var ent = entities.get(o);
			ent.render(g);
			//update object position as per camera position    
			this.camera.set(ent);	
			}
		//this.camera.unset(g);
		for (o in this.fgLayer) entities.get(o).render(g);
		this.camera.render(g);
		//for extra stuff to render
		
	}
	
	//check object inside viewport
	public function entityInViewport(e:Entity):Bool{
		var colliding = false;
		//entity bounding box
		var a = {
		"topLeft":{
			"x":e.x-e.ax*e.w,
			"y":e.y-e.ay*e.h
			},
		"bottomRight":{
			"x":e.x+e.ax*e.w,
			"y":e.y+e.ay*e.h
			}
		};
		//viewport bounding box
		var b = {
		"topLeft":{
			"x":camera.x,
			"y":camera.y,
			},
		"bottomRight":{
			"x":camera.x+game.viewport.width,
			"y":camera.y+game.viewport.height
			}
		};
		//trace("player",a,"view",b);
		//check A inside B or collideing
		if ((e.x > b.topLeft.x && e.x < b.bottomRight.x )&&
		(e.y > b.topLeft.y && e.y < b.bottomRight.y )) colliding = true;
		
		return colliding;	
	}
	
}