package entities.level1.oody;

import components.Component;
import kha.input.Keyboard;
import kha.input.KeyCode;
//import components.Entity;
import entities.level1.oody.Oody;
class PlayerKeyboard extends Component{
	public var player:Oody;
	public function new(player:Oody){
		super();
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
				//player.anim.play("jump",60);
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
				//player.state = "idle";
				}
			case S : {
				player.down = false;
				}
			case P : {
				player.scene.pause(); //= false;
				}
			case R : {
				player.scene.resume(); //= false;
				}
			default:return;
		}
		
	}

}