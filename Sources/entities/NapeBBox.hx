package entities;


import kha.graphics2.Graphics;

import kha.Color;

import nape.space.Space;
//import nape.geom.Vec2;

import nape.phys.Body;
import nape.phys.BodyType;
import nape.shape.Polygon;
import nape.shape.Shape;





import components.Entity;
//create an entity class
class NapeBBox extends Entity{
	//initialize
	public var sh:Shape;
	public var bb:Body;
	public var bt:Body;
	public var bl:Body;
	public var br:Body;
	public var shape:Shape;
	public var color:Color;
	public var bh = 2.0;
	public function new(space:Space,x:Float=30.0,y:Float=10.0,w:Float=800.0,h:Float=600.0,color:Color=Color.Cyan){
		super();
		this.w=w;
		this.h=h;
		this.x=x;
		this.y=y;
		this.color = color;
		//create the bottom rectangle
		bb = new Body(BodyType.STATIC);
		shape = new Polygon(Polygon.box(w,bh));
		bb.shapes.add(shape);
		//sh.filter.collisionGroup = 2;
		bb.position.setxy(x+w/2,y+h+bh/2);
		bb.space = space;

		//top rectangle
		bt = new Body(BodyType.STATIC);
		bt.shapes.add(new Polygon(Polygon.box(w,bh)));
		bt.position.setxy(x+w/2,y-bh/2);
		bt.space = space;

		//left rectangle
		bl = new Body(BodyType.STATIC);
		bl.shapes.add(new Polygon(Polygon.box(bh,h)));
		bl.position.setxy(x-bh/2,y+h/2);
		bl.space = space;

		//right rectangle
		br = new Body(BodyType.STATIC);
		br.shapes.add(new Polygon(Polygon.box(bh,h)));
		br.position.setxy(x+w+bh/2,y+h/2);
		br.space = space;

		
	}
	
	//update
	public override function update(){
		super.update();
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		g.pushTransformation(kha.math.FastMatrix3.translation(x+ox,y+oy));
		//g.rotate(shape.body.rotation,shape.body.position.x,body.position.y);
		g.color=this.color;	
		//draw the bottom rect
		g.drawRect(0,h,w,bh,bh); 
		//draw the top rect
		g.drawRect(0,-bh,w,bh,bh); 
		//draw the left rect
		g.drawRect(-bh,0,bh,h,bh); 
		//draw the right rect
		g.drawRect(w,0,bh,h,bh); 
		g.color=Color.White;
		g.popTransformation();
	}
}