package scenes;


import kha.graphics2.Graphics;

import components.Entity;
import components.Scene;
import kha.Color;

//import nape.space.Space;
//import nape.geom.Vec2;
//import nape.dynamics.InteractionGroup;
import components.Sprite;
import kha.Assets;

//import entities.level1.oody.Oody;
//import entities.level1.Clouds;
import components.AnimatedSprite;

//create an entity class
class World extends Scene{
	//initialize
	//create a space
	//public var gravity:Vec2;
	//public var space:Space;
	//public var clouds:Clouds;
	//public var player:Oody;
	//public var game:MyGame;
	public var bgImage:Sprite;
	public var baby:Entity;
	public var blueBird:Entity;
	
	public var cloud1 = new Sprite(Assets.images.cloud1);
	public var cloud4 = new Sprite(Assets.images.cloud4);
	public var cloud5 = new Sprite(Assets.images.cloud5);
	public var sun:Sprite;
	public function new(game:MyGame){
		//this.game = game;
		super(game);
		cast(this.game,MyGame);		
	}
	//add all the entities inside this
	public override function create(){
		//create the new space
		//gravity = new Vec2(0,300);
		//space = new Space(gravity);
		//hide camera
		camera.hide = true;
		//add the background image
		bgImage = new Sprite(Assets.images.sky);
		bgImage.ax =0;
		bgImage.ay = 0;
		addChild(bgImage);

		//add the sun
		sun = new Sprite(Assets.images.sun);
		sun.x = 200;
		sun.y = 120;
		sun.s = .6;
		addChild(sun);

		//add cloud1
		cloud1.x=1200;
		cloud1.y = 150;
		addChild(cloud1);

		
		//add cloud4
		cloud4.x=1300;
		cloud4.y = 600;
		addChild(cloud4);

		//add cloud5
		cloud5.x=200;
		cloud5.y = 1000;
		addChild(cloud5);

		//add baby 
		baby = new Entity();
		var anim = new AnimatedSprite(Assets.images.baby,200,400,7);
		anim.createAnimation("a",97,120);
		anim.play("a",18);
		anim.sx=-1;
		anim.s=2;
		anim.x=200;
		anim.y=600;
		baby.addComponent("anim",anim);
		addChild(baby);
		
		//add bird
		blueBird = new Entity();
		var anim2 = new AnimatedSprite(Assets.images.bluebird,240,150,7);
		anim2.createAnimation("a",1,6);
		anim2.play("a",18);
		//anim2.sx=-1;
		anim2.s=2;
		anim2.x=1350;
		anim2.y=200;
		blueBird.addComponent("anim2",anim2);
		addChild(blueBird);
		

	}
	//update
	public override function update(){
		super.update();
		//update the space
		//space.step(1/60);
		//trace(player.x,camera.x);
	}
	//render
	public override function render(g:Graphics){
		
		g.clear(Color.Black);
		super.render(g);	
		
	}
}