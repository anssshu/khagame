package entities.level1.oody;

import kha.graphics2.Graphics;
import components.Entity;

import scenes.HomeScene;
import components.Sprite;
import kha.Assets;
import components.AnimatedSprite;
//import nape.geom.Vec2;

//components
import entities.level1.oody.KinematicBody;
import entities.level1.oody.PlayerKeyboard;
//create an entity class
class Oody extends Entity{
	//initialize
	public var left = false;
	public var right = false;
	public var up = false;
	public var down = false;

	public var collided = false;

	//user variabes
	public var speed = 10;
	//components
	public var kBody:KinematicBody;
	public var playerKeyboard:PlayerKeyboard;
	public var sprite:Sprite;
	public var anim:AnimatedSprite;
	public var anim2:AnimatedSprite;
	public var scene:HomeScene;
	public function new(s:HomeScene){
		super();
		this.scene = s;
		//x=600;
		//add body
		kBody = new KinematicBody(scene);
		addComponent("kBody",kBody);

		//add keyboard
		playerKeyboard = new PlayerKeyboard(this);
		addComponent("playerKeyboard",playerKeyboard);
		//anim
		anim = new AnimatedSprite(Assets.images.baby,200,400,7);
		anim.createAnimation("a",97,120);
		anim.play("a",18);
		anim.sx=-1;
		anim.s=2;
		anim.x=200;
		anim.y=600;
		addComponent("anim",anim);
		//bird
		anim2 = new AnimatedSprite(Assets.images.bluebird,240,150,7);
		anim2.createAnimation("a",1,6);
		anim2.play("a",18);
		//anim2.sx=-1;
		anim2.s=2;
		anim2.x=1350;
		anim2.y=600;
		addComponent("anim2",anim2);
		//add Sprite
		sprite = new Sprite(Assets.images.player);
		//sprite.w = 200;
		//sprite.h = 320;
		addComponent("sprite",sprite);
	}
	//on begin collision of the sensor
	
	//update
	public override function update(){
		super.update();

		if (left && !collided){
			if (kBody.body.position.x > 100){
				sprite.sx = -1;
				kBody.body.position.x +=-1*speed;
			}
			//if (kBody.body.position.x < 1600)
			
		}
		if (right  && !collided){
			if (kBody.body.position.x < 1500){
				kBody.body.position.x +=1*speed;
				sprite.sx = 1;
			}
			
			
		}
		sprite.x = kBody.body.position.x;
		sprite.y = kBody.body.position.y;
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
	}
}

