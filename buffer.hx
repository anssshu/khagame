package scenes;

import entities.player.Player;
import components.AnimatedSprite;
import kha.graphics2.Graphics;

import components.Scene;
import kha.Color;

import nape.space.Space;
import nape.geom.Vec2;
//import nape.dynamics.InteractionGroup;
import nape.phys.BodyType;
import kha.Assets;
//import entities.NapePolygon;
import entities.NapeRect;
import entities.NapeCircle;
import entities.NapeOneSidedBBox;

import entities.NapeBBox;
//import entities.NapeTerrain;
import entities.NapeGround;
import components.Sprite;
import entities.Fan;
//create an entity class
class ExperimentScene extends Scene{
	//initialize
	//create a space
	public var gravity:Vec2;
	public var space:Space;

	
	//public var circleBody:Body;
	//public var circle:Shape;
	public var bb:NapeBBox;
	public var r:NapeRect;
	public var b:NapeRect;
	public var c:NapeCircle;
	public var player:Player;

	public var r2:NapeRect;
	
	public function new(game:MyGame){
		super();
		camera.hide = true ;
		

		gravity = new Vec2(0,3000);
	    space = new Space(gravity);
		var f0 = new NapeGround(space);//new NapeTerrain(Assets.blobs.curve_json,space);
		f0.name = "ground";
		this.addChild(f0);

		var bg = new Sprite(Assets.images.background);
		bg.name = "bg";
		bg.x = 800;
		bg.y = 600;
		bg.s=2;
		this.addChild(bg);
		var fan = new Fan();
		fan.x = 265;
		fan.y = 305;
		this.addChild(fan);
		//trace(entities.iterator());
		//var p = new NapePolygon(space,Assets.blobs.base_json);
		//var gr = new InteractionGroup(false);
		//p.shape.filter.collisionGroup = 1;
		//p.body.group = gr;
		//this.addChild(p);
		
		//craete a bounding box and draw it
		bb = new NapeBBox(space,20,20,20560,1160);
		bb.shape.filter.collisionGroup = 5;
		bb.name = "bb";
		addChild(bb);

		
		for (i in 0...4){
			r = new NapeRect(space,400*i+100,400,100,100,Color.Red);
			r.shape.material.elasticity = 2.0 ;
			r.body.type = BodyType.STATIC;
			r.setupSensor(space);
			r.name = i+"r" ;
			addChild(r);
		}
		

		r2 = new NapeOneSidedBBox(space,500,1000,400,50);
		r2.body.type = BodyType.STATIC;
		r2.shape.filter.collisionGroup = 5;
		addChild(r2);

		//c=new NapeCircle(space,450,300,50);
		//c.shape.filter.collisionGroup = 2;
		//c.body.cbTypes.add(oneWayType);
		//addChild(c);

		var myrect = new NapeOneSidedBBox(space,900,600,600,50);
		myrect.shape.filter.collisionGroup = 5;
		myrect.name = "onesided";
		addChild(myrect);
		//add player at last for proper tangent calulation
		player = new Player(this);
		player.name = "bubu";
		//addChild(player.collider);
		camera.smoothFollow(player);
		addChild(player);
		
		
	}
	
	//update
	public override function update(){
		super.update();
		//update the space
		space.step(1/60);
		//trace(player.x,camera.x);
	}
	//render
	public override function render(g:Graphics){
		
		g.clear(Color.Purple);
		super.render(g);
		
		
	}
}