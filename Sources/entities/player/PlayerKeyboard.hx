package entities.player;

import components.Component;
import kha.input.Keyboard;
import kha.input.KeyCode;
//import components.Entity;
import entities.player.Player;
import nape.geom.Vec2;
class PlayerKeyboard extends Component{
	public var player:Player;
	public function new(player:Player){
		super();
		Keyboard.get().notify(onKeyDown,onKeyUp);
		this.player = player;
	}
	//keydown function
	public function onKeyDown(key:KeyCode):Void{
		//trace(key);
		switch(key){
			case A : {
				if (player.state != "die")
				player.left = true;
				
			}
			case D : {
				if (player.state != "die")
				player.right = true;
				
			}
			case W : {
				if (player.state != "die"){
				player.up = true;
				if (player.onGround)
				player.rigidBody.body.applyImpulse(new Vec2(0,-4000));
				//player.anim.play("jump",60);
					}
				}
			case S : {
				//trace("down pressed");
				if (player.state != "die"){
				player.down = true;
				if (player.rigidBody.body.velocity.length <750)
				player.rigidBody.body.applyImpulse(new Vec2(player.anim.sx*5000*player.rigidBody.tangent.x,5000*player.rigidBody.tangent.y));
					}
				}
			default:return;
		}
		
	}
	//keyup function
	public function onKeyUp(key:KeyCode):Void{
		//trace(key);
		switch(key){
			case A : {
				player.left = false;
				
			}
			case D : {
				player.right = false;
				
			}
			case W : {
				player.up = false;
				//player.state = "idle";
				}
			case S : {
				player.down = false;
				}
			default:return;
		}
		
	}

}