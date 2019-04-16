package entities.player;

import kha.graphics2.Graphics;
import components.NapeRect;
import entities.player.Player;
import nape.space.Space;
import nape.callbacks.InteractionCallback;


//create an entity class
class Collider extends NapeRect{
	//initialize
	public var space:Space;
	public var player:Player;
	public function new(space:Space,player:Player){
		super(space,0,0,100,250);
		this.player = player;
		setupSensor(space);
		body.type = nape.phys.BodyType.KINEMATIC;
		shape.sensorEnabled = true;
	
		
	}

	//on begin collision of the sensor
	//collision logic
	public override function onBeginSensorContact(cb:InteractionCallback){
	
		
	}

	//update
	public override function update(){
		super.update();
		this.body.position.x = player.x;
		this.body.position.y = player.y-70;
	}

	//render
	public override function render(g:Graphics){
		//super.render(g);
	}
}

