package entities;
import kha.Assets;
import kha.graphics2.Graphics;
import components.AnimatedSprite;
import entities.NapeCircle;
import nape.space.Space;
import nape.callbacks.InteractionCallback;
import scenes.ExperimentScene;
//create an entity class
class Bird extends NapeCircle{
	//initialize
	public var speed = 10.0;
	public var scene:ExperimentScene;
	public var anim:AnimatedSprite;
	public var circleCollider:NapeCircle;
	public function new(scene:ExperimentScene){
		this.scene = scene;
		//setup the collider
		super(scene.space,x,y,65,kha.Color.Red);
		body.type = nape.phys.BodyType.KINEMATIC;
		setupSensor(scene.space);
		
		//pos
		x=3200;
		y=300;

		//add animation component
		anim = new AnimatedSprite(Assets.images.bluebird,240,150,7);
		anim.s=2;
		//create all the animations
		anim.createAnimation("fly",1,6);
		anim.play("fly",18);
		addComponent("anim",anim);


		
	}
	public override function onBeginSensorContact(cb:InteractionCallback){
		
		var g = cb.int2.castBody.shapes.at(0).filter.collisionGroup;
		//player 
		if (g==1) trace("bird collided with player");
	}
	
	//update
	public override function update(){
		 super.update();
		 anim.x = x;
		 anim.y = y;
		 anim.ax = .5;
		 anim.ay=.5;
		 body.position.x = x-5;
		 body.position.y = y+35;

		 
		
		 var player = scene.find("babu");
		 if( player != null){
		 speed = 20*Math.abs(x-player.x)/1200.0;
		// trace(speed);
		 if (x > player.x) {
			 x-=speed;
			 anim.sx = 1.0;
			 }
		if   (x < player.x){
			 x+=speed;
			 anim.sx = -1.0;
			 }
			 }
	}
	public override function render(g:Graphics){
		//super.render(g);
		anim.render(g);
	}
}