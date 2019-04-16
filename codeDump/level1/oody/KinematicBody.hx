package entities.level1.oody;

import kha.graphics2.Graphics;
import components.NapeRect;
import nape.space.Space;
import nape.callbacks.InteractionCallback;
import scenes.HomeScene;
//create an entity class
class KinematicBody extends NapeRect{
	//initialize
	public var space:Space;
	public var scene:HomeScene;
	public function new(s:HomeScene){
		super(s.space,800,500,120,260);
		scene = s;
		setupSensor(scene.space);
		body.type = nape.phys.BodyType.KINEMATIC;
		shape.sensorEnabled = true;
		//setupCollision(space);
		
	}
	//on begin collision of the sensor
	public override function onBeginSensorContact(cb:InteractionCallback){
		//when Oody collides
		trace("coolided");
		//scene.clouds.speed = 0;
		//scene.player.collided = true;
		
		scene.restart();
	}
	//update
	public override function update(){
		super.update();
		
	}
	//render
	public override function render(g:Graphics){
		//render kinematic body
		super.render(g);
	}
}

