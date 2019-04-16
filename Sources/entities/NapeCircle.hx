package entities;


import kha.graphics2.Graphics;
using kha.graphics2.GraphicsExtension;
import kha.Color;



import nape.phys.Body;
//import nape.phys.BodyType;
import nape.shape.Shape;
import nape.shape.Circle;
import nape.space.Space;

import nape.callbacks.CbEvent;
import nape.callbacks.CbType;
import nape.callbacks.InteractionCallback;
import nape.callbacks.InteractionListener;
import nape.callbacks.PreFlag;
import nape.callbacks.PreListener;
import nape.callbacks.PreCallback;
import nape.callbacks.InteractionType;

import components.Entity;
//create an entity class
class NapeCircle extends Entity{
	//initialize
	public var body:Body;
	public var shape:Shape;
	public var color:Color;
	public var radius:Float;
	public var colType:CbType;
	public function new(space:Space,x:Float=300.0,y:Float=100.0,radius:Float=100.0,color:Color=Color.Green){
		super();
		this.radius=radius;
	
		this.color = color;
		body = new Body();
		body.position.setxy(x,y);
		shape = new Circle(radius);
		shape.body = body;
		//shape.material.elasticity = 2.0;
		body.space = space;
		body.shapes.add(shape);
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
            CbEvent.ONGOING,
            InteractionType.COLLISION,
            colType,
            CbType.ANY_BODY,
            duringContact
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
	public function onBeginSensorContact(cb:InteractionCallback){
		//trace("sensor");
		//cb.int1.castBody.shapes.at(0).sensorEnabled = false;
		//cb.int1.castBody.type = BodyType.DYNAMIC;
		//trace(cb.int1);
	}
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
	//before contact
	public function onBeforeContact(cb:PreCallback):PreFlag{
		
		return PreFlag.ACCEPT;
	}
	//begin contact
	public function onBeginContact(cb:InteractionCallback){

	}
	public function duringContact(cb:InteractionCallback){

	}
	//end contact
	public function onEndContact(cb:InteractionCallback){
		//trace("hahahah");
	}
	//update
	public override function update(){
		super.update();
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		g.pushTransformation(kha.math.FastMatrix3.translation(shape.body.position.x+this.ox,
		shape.body.position.y+this.oy));
		g.rotate(shape.body.rotation,shape.body.position.x+this.ox,body.position.y+this.oy);
		g.color=this.color;	
		g.drawCircle(0,0,radius,5);
		g.color=Color.White;
		g.popTransformation();
	}
}