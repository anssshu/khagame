package entities;

import nape.space.Space;
import kha.graphics2.Graphics;

import kha.Color;

import nape.space.Space;

import nape.callbacks.CbEvent;
import nape.callbacks.CbType;
import nape.callbacks.InteractionCallback;
import nape.callbacks.InteractionListener;
import nape.callbacks.PreFlag;
import nape.callbacks.PreListener;
import nape.callbacks.PreCallback;
import nape.callbacks.InteractionType;

import nape.phys.Body;
import nape.phys.BodyType;
import nape.shape.Polygon;
import nape.shape.Shape;
import nape.geom.Vec2;
import nape.geom.GeomPoly;
import kha.graphics2.Graphics;

import components.Entity;
import haxe.Json;
import kha.Blob;
//create an entity class
typedef Points = { x:Int,y:Int};
typedef PolygonArray = {
	polygon:Array<Points>,
};


class NapePolygon extends Entity{
	//initialize
	public var body:Body;
	public var shape:Shape;
	public var color:Color;
	public var points:Array<Vec2>;
	public var colType:CbType;
	public var poly:PolygonArray;
	public var json:Blob;
	public function new(space:Space,json:Blob,x:Float=900,y:Float=500,color:Color=Color.Green){
		super();
		this.x = x;
		this.y=y;
		this.json  = json;
		poly = Json.parse(json.toString());
		this.color = color;
		body = new Body();
		body.position.setxy(x,y);
		//var p = Polygon.new(points);
		
		points = [new Vec2(0,0),
			new Vec2(0,-70),
			new Vec2(400,-470),
			new Vec2(1200,-500),new Vec2(1400,-300),new Vec2(1400,0)];
		
		points = getPoints(poly);
		var gom = new GeomPoly(points);
		shape = new Polygon(gom);
		//body.type = BodyType.STATIC;
		//shape.body = body;
		//shape.material.elasticity = 2.0;
		body.shapes.add(shape);
		body.space = space;

		colType = new CbType();
		//add the cbType to body
		body.cbTypes.add(colType);

		
		
		
	}
	public function getPoints(poly:PolygonArray){	
		var points = [];	
		for (p in poly.polygon){
			points.push(new Vec2(p.x,p.y)); 
		}
		return points;
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
		//trace('pre');
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
		var p = [new Vec2(0,0),new Vec2(100,500),new Vec2(200,0)];
			
		//g.drawLine(p[0].x,p[0].y,p[1].x,p[1].y,10);
		for (i in 0...points.length-1){
			//trace(points[i]);
			g.drawLine(points[i].x,points[i].y,points[i+1].x,points[i+1].y,4);
		}
		g.drawLine(points[0].x,points[0].y,points[points.length-1].x,points[points.length-1].y,4);
		//g.drawRect(-w/2,-h/2,w,h,5);
		g.color=Color.White;
		g.popTransformation();
	}
}