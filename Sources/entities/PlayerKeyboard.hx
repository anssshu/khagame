package entities;
import kha.input.Keyboard;
import kha.input.KeyCode;
//import components.Entity;
import entities.NapePlayer;
import nape.geom.Vec2;
class PlayerKeyboard {
	public var player:NapePlayer;
	public function new(player:NapePlayer){
		
		Keyboard.get().notify(onKeyDown,onKeyUp);
		this.player = player;
	}
	//keydown function
	public function onKeyDown(key:KeyCode):Void{
		//trace(key);
		switch(key){
			case A : {
				player.left = true;
			}
			case D : {
				
				player.right = true;
			}
			case W : {
				player.up = true;
				if (player.onGround)
				player.body.applyImpulse(new Vec2(0,-4000));
				}
			case S : {
				//trace("down pressed");
				player.down = true;
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
				}
			case S : {
				player.down = false;
				}
			default:return;
		}
		
	}

}