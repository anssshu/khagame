package entities;


import kha.graphics2.Graphics;
import entities.NapeRect;
import components.Sprite;
import scenes.ExperimentScene;
import entities.player.Player;
//create an entity class
class Trap extends NapeRect{
	//initialize
	public var scene:ExperimentScene;
	public var sprite:Sprite;
	//public var redSprite:Sprite;
	public function new(scene:ExperimentScene,x0,y0){
		this.scene = scene;
		sprite = new Sprite(kha.Assets.images.trap);
		//redSprite = new Sprite(kha.Assets.images.trap_bloody);
		sprite.s =2;
		super(scene.space,x0,y0,sprite.w*sprite.s,sprite.h*sprite.s);
		body.type = nape.phys.BodyType.KINEMATIC;
		shape.sensorEnabled = true;
		setupSensor(scene.space);
		shape.filter.collisionGroup = 2;
		sprite.x = x0;
		sprite.y = y0;
		addComponent("sprite",sprite);
	}
	public override function onBeginSensorContact(cb:nape.callbacks.InteractionCallback){
		//collision with player
		if (cb.int2.castBody.shapes.at(0).filter.collisionGroup ==1){
			trace("player on trap");
			sprite.img = kha.Assets.images.trap_bloody;
			var p = cast(scene.find("babu"),Player);
			//cast(p,Player);
			if (p.health>0)
				p.health-=25;
			//p.health=0;
			if (p.health>25)
			p.rigidBody.body.applyImpulse(new nape.geom.Vec2(500,-2000));
			
		}
	}
	//update
	public override function update(){
		 super.update();
		 
		 
		 
	}
	//render
	public override function render(g:Graphics){
		 //super.render(g);
		 sprite.render(g);
	}
}