package entities.player;
import nape.phys.BodyType;
import kha.graphics2.Graphics;
import nape.callbacks.InteractionCallback;
import components.NapeCircle;
import entities.player.Player;
import nape.space.Space;
import nape.geom.Vec2;
import kha.Color;
//create an entity class
class RigidBody extends NapeCircle{
	//initialize
	public var curvyGroud = false;
	public var tangent = new Vec2(1.0,0.0);
	public var normal = new Vec2(0.0,-1.0);
	public var player:Player;
	public function new(space:Space,player:Player){
		super(space,1100,100,30);
		this.radius = 30;
		this.color = kha.Color.Yellow;
		this.player = player;
		body.type = BodyType.DYNAMIC;
		body.allowRotation = false;
		shape.filter.collisionGroup = 1;
		if(curvyGroud)
			setupCollision(space);
	}
	//update
	public override function update(){
		super.update();
		//update player position
		
		x=body.position.x;
		y=body.position.y;
		//update player position
		player.x = x;
		player.y = y;
		
	}
	//on collision
	public override function onBeginContact(cb:InteractionCallback){
		
	}
	//drawTangent
	private function drawTangent(g:Graphics){
		g.pushTransformation(kha.math.FastMatrix3.translation(x+ox,y+oy));
		g.color = Color.Red;
		g.drawLine(0,0,tangent.x*100,tangent.y*100,3);	
		g.color = Color.White;
		//this.collider.render(g);
		g.popTransformation();
	}
	//render
	public override function render(g:Graphics){
		//draw the rigirBody
		//super.render(g);
		//draw tangent;
		//drawTangent(g);
	}
	//calculate the tangent
	public override function duringContact(cb:InteractionCallback){
		cb.arbiters.foreach(function(o){
			normal = o.collisionArbiter.normal;
			//trace(this.normal);
		});
		if (cb.int2.castBody.shapes.at(0).filter.collisionGroup == 5){
			tangent.x = -normal.y;
			tangent.y = normal.x;
		}
		
		//update ray cast direction
		player.rayCast.ray.direction.set(body.localVectorToWorld(new Vec2(-normal.x,-normal.y),true));
	}
}