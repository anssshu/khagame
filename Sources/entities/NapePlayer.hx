package entities;

import kha.graphics2.Graphics;
import kha.Color;


import nape.geom.Vec2;
import nape.space.Space;
import nape.phys.BodyType;

import nape.callbacks.InteractionCallback;


import nape.geom.Ray;
import nape.geom.RayResult;

import entities.PlayerKeyboard;
import entities.PlayerGamepad;
import entities.NapeRect;

//create an entity class
class NapePlayer extends NapeCircle{
	//initialize player states
	public var left = false;
	public var right = false;
	public var up = false;
	public var down = false;
	public var jumping = false;
	public var onGround = false;
	
	public var tangent = new Vec2(1.0,0.0);
	public var normal = new Vec2(0.0,-1.0);

	public var ray = new Ray(Vec2.weak(),Vec2.weak());
	public var result:RayResult;//ray cast result
	//public var impulse = new Vec2()
	//public var preListener:PreListener;
	//var precolType:CbType;
	public var collider:NapeRect;
	public var space:Space;
	public function new(space:Space){
		radius = 30;
		this.space = space;
		super(space,700,300,radius,Color.Blue);
		//setup input controller
		new PlayerKeyboard(this);
		new PlayerGamepad(this);
		body.allowRotation = false;
		this.collider = new NapeRect(space,body.position.x,body.position.y,100,200,Color.Magenta);
		this.collider.body.type = BodyType.KINEMATIC;
		this.collider.shape.sensorEnabled = true;
		//this.addChild(this.collider);
		//ray cast then update it
		setupRayCast();
		//setup player collision
		setupCollision(space);
		
		//shape.filter.collisionGroup= 2;
		//shape.sensorEnabled = true;
		//shape.filter.sensorGroup = 2;
		//shape.filter.collisionMask= ~2;
		
	}
	//update state logic
	public function updateStateLogic(){
		if (left){
			if (body.velocity.length <1500)
			body.applyImpulse(new Vec2(-1000*tangent.x,-1000*tangent.y));
		}
		if (right){
			if (body.velocity.length <1500)
			body.applyImpulse(new Vec2(1000*tangent.x,1000*tangent.y));
		}
		if (up){

		}	
		if (down){

		}  
		
	}
	//
	public function setupRayCast(){
		ray.origin.set(body.localPointToWorld(Vec2.weak(0,0),true));
        ray.direction.set(body.localVectorToWorld(Vec2.weak(0,1),true));
        ray.maxDistance = 50; // cast as far as 1000px
		
	}
	public function updateRayCast(){
		//ray.origin.set(body.localPointToWorld(Vec2.weak(0,0),true));
		ray.origin = Vec2.weak(x,y);
		//ray.direction.set(body.localVectorToWorld(new Vec2(normal.x,-normal.y),true));
		result = this.space.rayCast(ray,false);
		if (result != null) onGround = true;
		else onGround = false;
		//trace(onGround);
	}
	//on collision
	public override function duringContact(cb:InteractionCallback){
		//set the tangent of the player
		setTangent(cb);
		ray.direction.set(body.localVectorToWorld(new Vec2(-normal.x,-normal.y),true));
	}
	//
	public function setTangent(cb:InteractionCallback){
		//calculate the tangent for the player
		
		cb.arbiters.foreach(function(o){
			this.normal = o.collisionArbiter.normal;
			//trace(this.normal);
		});
		if (cb.int2.castBody.shapes.at(0).filter.collisionGroup == 5){
			tangent.x = -normal.y;
			tangent.y = normal.x;
		}
		//trace(normal);
	}
	
	//update
	public override function update(){

		super.update();
		//update position
		this.x = body.position.x;
		this.y = body.position.y;
		this.collider.body.position.x = this.x; 
		this.collider.body.position.y =this.y-70;
		//ray cast
		updateRayCast();
		updateStateLogic();
		//this.collider.update();
		
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		g.pushTransformation(kha.math.FastMatrix3.translation(x+ox,y+oy));
		g.drawLine(0,0,tangent.x*100,tangent.y*100,3);
		g.color = Color.Red;
		g.drawLine(0,0,ray.direction.x*ray.maxDistance,ray.direction.y*ray.maxDistance,3);	
		g.color = Color.White;
		//this.collider.render(g);
		g.popTransformation();
		
	}
} 