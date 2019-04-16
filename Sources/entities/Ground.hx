package entities;


import kha.graphics2.Graphics;
//import kha.Assets;
//import kha.Blob;
import kha.Color;
import components.Entity;
import nape.geom.Vec2;
//import haxe.Json;

import nape.shape.Polygon;

import nape.space.Space;
import nape.phys.Body;
import nape.phys.BodyType;
//import nape.shape.Shape;
import components.Sprite;
//typedef Points2 = { x:Int,y:Int};
//typedef Poly = {
	//polygon:Array<Points2>,
//};
//create an entity class
class Ground extends Entity{
	//initialize
	//public var poly:Poly;//inp json
	public var sprite:Sprite;
	public var points:Array<Vec2>;// vec2 points from json
	public var tArr:Array<Array<Vec2>>;// triangle array
	public var body:Body;
	public function new(space:Space){
		super();
		x=0;
		y=0;

		body = new Body();
		body.position.setxy(x,y);
		body.space = space;
		//read the json file
		//poly = Json.parse(json.toString());

		//create an array of vec 2 from json file
		points = getCurvyGroundPoints();
		//trace(points);
		
		//create a triangle array from the point array
		tArr = createTriangles(points);
		//create shapes from triangles and add it to the body
		createTriangleShapes(tArr);
		body.type = BodyType.STATIC;
		body.shapes.at(0).filter.collisionGroup = 5;

		//sprite
		/*
		sprite = new Sprite(kha.Assets.images.ground);
		sprite.ax=0;
		sprite.ay=0;
		sprite.x=0;
		sprite.y = 1000;
		addComponent("sprite",sprite);
		*/
	}
	//create vec2 point array from json point array
	public function getCurvyGroundPoints(){	
		
		
		var points = [
			new Vec2(0,-500),
			new Vec2(1,400),
			new Vec2(2,401),
			new Vec2(3,1000),
			new Vec2(56000,1001),
			new Vec2(56001,550),
			new Vec2(56700,451),
			new Vec2(56701,-450),
		];	
		
		return points;//vec2 points
	}
	//create rect shapes and add it to the bodies
	public function createTriangleShapes(s:Array<Array<Vec2>>){
			for (t in s){
				body.shapes.add(new Polygon(t));
			}
	}
	//draw the rect array
	public function drawTriangle(g:Graphics,tring:Array<Vec2>){
		g.drawLine(tring[0].x,tring[0].y,tring[1].x,tring[1].y,5);
		g.drawLine(tring[1].x,tring[1].y,tring[2].x,tring[2].y,5);
		g.drawLine(tring[2].x,tring[2].y,tring[0].x,tring[0].y,5);
	}
	//create a rect array
	public function createTriangles(points:Array<Vec2>){
		//for each point
		var tArr = [];
		var tring = [];//triangle
		for (i in 0...points.length-1){
			//check the cases
			
			var p0 = points[i];
			var p1 = points[i+1];
			
			//case 1
			if ( points[i+1].x > points[i].x && points[i+1].y >= points[i].y ){
				//create the rectangle
				tring = [new Vec2(p0.x,p0.y),new Vec2(p1.x,p1.y),new Vec2(p0.x,p1.y)];
			}
			//case 2
			if (points[i+1].x < points[i].x && points[i+1].y >= points[i].y){
				tring = [new Vec2(p0.x,p0.y),new Vec2(p1.x,p1.y),new Vec2(p1.x,p0.y)];
			}
			//case 3
			if (points[i+1].x < points[i].x && points[i+1].y <= points[i].y){
				tring = [new Vec2(p0.x,p0.y),new Vec2(p1.x,p1.y),new Vec2(p0.x,p1.y)];
			}
			//case 4
			  if (points[i+1].x > points[i].x && points[i+1].y <= points[i].y){
				tring = [new Vec2(p0.x,p0.y),new Vec2(p1.x,p1.y),new Vec2(p1.x,p0.y)];
			}
			
			//add the rect as per the cases
			tArr.push(tring);
		}
		//return the rectangle array
		return tArr;
	}
	//update
	public override function update(){
		x=body.position.x;
		y=body.position.y;
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		g.pushTransformation(kha.math.FastMatrix3.translation(x+ox,
		y+oy));
		g.rotate(r,x+ox,y+oy);
		//draw the rectangles	
		//g.drawLine(p[0].x,p[0].y,p[1].x,p[1].y,10);
		g.color=Color.Black;
		for (i in 0...points.length-1){
			//trace(points[i]);
			g.drawLine(points[i].x,points[i].y,points[i+1].x,points[i+1].y,4);
		}
		//g.drawLine(points[0].x,points[0].y,points[points.length-1].x,points[points.length-1].y,4);
		//g.drawRect(-w/2,-h/2,w,h,5);
		
		//draw triangles
		//for (t in tArr)drawTriangle(g,t);
		g.color=Color.White;
		g.popTransformation();
	}
}