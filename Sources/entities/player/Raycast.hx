package entities.player;

import kha.graphics2.Graphics;
import kha.Color;
import components.Component;
import entities.player.Player;
import nape.geom.Vec2;
import nape.geom.Ray;
import nape.geom.RayResult;
import nape.space.Space;
//create an entity class
class Raycast extends Component {
	//initialize
	public var result:RayResult;
	public var ray=new Ray(Vec2.weak(),Vec2.weak());
	public var player:Player;
	public var space:Space;
	public function new(player:Player,space:Space){
		super();
		this.space = space;
		this.player = player;
		ray.origin.set(player.rigidBody.body.localPointToWorld(Vec2.weak(0,0),true));
        ray.direction.set(player.rigidBody.body.localVectorToWorld(Vec2.weak(0,1),true));
        ray.maxDistance = 50; // cast as far as 1000px
	}
	//update
	public override function update(){

		super.update();
		//update rayCast component position
		x=player.x;
		y=player.y;
		//ray.origin.set(body.localPointToWorld(Vec2.weak(0,0),true));
		ray.origin = Vec2.weak(x,y);
		//ray.direction.set(body.localVectorToWorld(new Vec2(normal.x,-normal.y),true));
		result = space.rayCast(ray,false);
		if (result != null) player.onGround = true;
		else player.onGround = false;
		//trace(onGround);
	}
	//
	private function drawRay(g:Graphics){
		g.pushTransformation(kha.math.FastMatrix3.translation(x+ox,y+oy));
		g.color = Color.Red;
		g.drawLine(0,0,ray.direction.x*ray.maxDistance,ray.direction.y*ray.maxDistance,3);	
		g.color = Color.White;
		//this.collider.render(g);
		g.popTransformation();
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		//drawRay(g);
	}
}