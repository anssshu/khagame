package entities;

//import nape.space.Space;
import kha.graphics2.Graphics;

import kha.Color;

import nape.space.Space;
import nape.phys.BodyType;
import nape.callbacks.CbEvent;
import nape.callbacks.CbType;
import nape.callbacks.InteractionCallback;
import nape.callbacks.InteractionListener;
import nape.callbacks.PreFlag;
import nape.callbacks.PreListener;
import nape.callbacks.PreCallback;
import nape.callbacks.InteractionType;


import nape.phys.Body;

import nape.shape.Polygon;
import nape.shape.Shape;

import components.Entity;
//create an entity class
class NapeRect extends Entity{
	//initialize
	public var body:Body;
	public var shape:Shape;
	public var color:Color;
	public var colType:CbType;
	public function new(space:Space,x:Float=300.0,y:Float=100.0,w:Float=100.0,h:Float=100.0,color:Color=Color.Green){
		super();
		this.w=w;
		this.h=h;
		this.color = color;
		body = new Body();
		body.position.setxy(x,y);
		shape = new Polygon(Polygon.box(w,h));
		//shape.body = body;
		//shape.material.elasticity = 2.0;
		body.shapes.add(shape);
		body.space = space;
		colType = new CbType();
		//add the cbType to body
		body.cbTypes.add(colType);
		//setupCollision(space);
		//setupPreCollision(space);
	}
	public function setupCollision(space:Space){
		//collision setup for the player
        
        space.listeners.add(new InteractionListener(
            CbEvent.BEGIN,
            InteractionType.COLLISION,
            colType,
            CbType.ANY_BODY,
            onBeginContact
        ));

		space.listeners.add(new InteractionListener(
            CbEvent.END,
            InteractionType.COLLISION,
            colType,
            CbType.ANY_BODY,
            onEndContact
        ));
		
		
	}
	public function setupSensor(space:Space){
		shape.sensorEnabled = true;
		space.listeners.add(new InteractionListener(
            CbEvent.BEGIN,
            InteractionType.SENSOR,
            colType,
            CbType.ANY_BODY,
            onBeginSensorContact
        ));

	}
	//
	public function setupPreCollision(space:Space){
		//add a pre listener to space
        space.listeners.add(new PreListener(
            InteractionType.COLLISION,
            colType,
            CbType.ANY_BODY,
            onBeforeContact,//callback
            /*precedence*/ 0,
            /*pure*/ true
        ));
	}
	//
	public function onBeginSensorContact(cb:InteractionCallback){
		//trace("sensor");
		cb.int1.castBody.shapes.at(0).sensorEnabled = false;
		cb.int1.castBody.type = BodyType.DYNAMIC;
		//trace(cb.int1);
	}
	
	//before contact
	public function onBeforeContact(cb:PreCallback):PreFlag{
		trace('pre');
		return PreFlag.ACCEPT;
	}
	//begin contact
	public function onBeginContact(cb:InteractionCallback){

	}
	//end contact
	public function onEndContact(cb:InteractionCallback){

	}
	//update
	public override function update(){
		super.update();
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		g.pushTransformation(kha.math.FastMatrix3.translation(shape.body.position.x+ox,
		shape.body.position.y+oy));
		g.rotate(shape.body.rotation,shape.body.position.x+ox,body.position.y+oy);
		g.color=this.color;	
		g.drawRect(-w/2,-h/2,w,h,5);
		g.color=Color.White;
		g.popTransformation();
	}
}