/*
remember to add  the player to the scene at the last
so that collision will work properly
*/
package entities.player;

import kha.graphics2.Graphics;
import components.Entity;
import entities.player.RigidBody;
import entities.player.Collider;
import entities.player.PlayerKeyboard;
import entities.player.Raycast;
import entities.player.Animation;
import scenes.ExperimentScene;
import nape.geom.Vec2;
//create an entity class
class Player extends Entity{

	public var left = false;
	public var right = false;
	public var up = false;
	public var down = false;
	public var jumping = false;
	public var state = "idle";
	public var lastState = "idle";
	public var onGround = false;
	public var health = 100;
	
	//initialize components
	public var rigidBody:RigidBody;
	public var collider:Collider;
	public var playerKeyboard:PlayerKeyboard;
	public var rayCast:Raycast;
	public var anim:Animation;
	public function new(scene:ExperimentScene){
		super();
		//var scene = game.experimentScene;
		//add all the components one by one

		//rigidBody
		rigidBody = new RigidBody(scene.space,this);
		addComponent("rigidBody",rigidBody);

		//collider
		collider = new Collider(scene.space,this);
		addComponent("collider",collider);
		//collider = cast( getComponent("collider"),Collider);

		//keyboadard
		playerKeyboard = new PlayerKeyboard(this);
		addComponent("playerKeyboard",playerKeyboard);

		//rayCast
		rayCast = new Raycast(this,scene.space);
		addComponent("rayCast",rayCast);

		//animation
		anim = new Animation(this);
		addComponent("animation",anim);
		
	}
	//update state logic 
	public function updateStateLogic(){
		if (left){
			this.anim.sx = -1;
			
			//this.anim.play("run",60);
			if (rigidBody.body.velocity.length <750)
			rigidBody.body.applyImpulse(new Vec2(-500*rigidBody.tangent.x,-500*rigidBody.tangent.y));
		}
		if (right){
			this.anim.sx = 1;
			
			//this.state = "run";
			//this.anim.play("run",60);
			if (rigidBody.body.velocity.length <750)
			rigidBody.body.applyImpulse(new Vec2(500*rigidBody.tangent.x,500*rigidBody.tangent.y));
		}
		if (up){

		}	
		//slide
		if (down){
			
		} 
		determinePlayerState();
		playPlayerAnimation();

		
		
	}
	//determine state
	public function determinePlayerState(){
		//run state
		if (onGround && (left || right)){
			
			lastState = state;
			state = "run";
		}
		//idle state
		if (onGround && !(left || right)){
			
			lastState = state;
			state = "idle";
		}
		//jump state
		if (!onGround){
			lastState = state;
			state = "jump";
		}
		//slide state
		if (onGround && down ){
			lastState = state;
			state = "slide";
		}
		if (health == 0 ){
			state = "die";
		}
	}
	//play animation asper state
	public function playPlayerAnimation(){
		//play animation as per state change
		if(lastState !="run" && state == "run" && onGround) {
			anim.play("run",72);
			anim.r=0;
		}
		if(lastState !="idle" && state == "idle" && onGround){
			anim.play("idle",18);
			anim.r=0;
		}
		if(lastState !="jump" && state == "jump" && !onGround){
			anim.play("jump",10);
			anim.r=0;
		}
		if(lastState !="slide" && state == "slide" && onGround){
			anim.play("slide",10);
			anim.r=0;
		}
		if(lastState !="die" && state == "die" ){
			anim.play("die",10);
			anim.r=90*anim.sx;
		}
	}
	//update
	public override function update(){
		super.update();
		//update component position and rot
		
		updateStateLogic();
		trace(health);
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
	}
}