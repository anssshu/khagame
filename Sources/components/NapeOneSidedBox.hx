package components;


import kha.graphics2.Graphics;
import components.NapeRect;

import nape.space.Space;
//import nape.geom.Vec2;
import kha.Color;

import nape.callbacks.PreCallback;
import nape.callbacks.PreFlag;

import nape.phys.BodyType;
//create an entity class
class NapeOneSidedBox extends NapeRect{
	//initialize
	
	public function new(space:Space,x:Float,y:Float,w:Float,h:Float,lw:Float=20.0,color:kha.Color=kha.Color.Black){
		super(space,x,y,w,h,lw,color);
		body.type = BodyType.STATIC;
		setupPreCollision(space);
	}
	public override function onBeforeContact(cb:PreCallback):PreFlag{
		//cb.int2.cbTypes.add(oneWayType);
		//return PreFlag.IGNORE;
		//trace("hhhh");
		var colArb = cb.arbiter.collisionArbiter;
		
		//trace(normal);
		
		if ((colArb.normal.y > 0) != cb.swapped) {
            return PreFlag.IGNORE;
        }
        else {
            return PreFlag.ACCEPT;
        }
		
		//return PreFlag.IGNORE;
	}


	//update
	public override function update(){
			super.update();
	}


	//render
	public override function render(g:Graphics){
			super.render(g);
	}
}