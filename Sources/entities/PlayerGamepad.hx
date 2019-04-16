package entities;

import kha.input.Gamepad;
import entities.NapePlayer;
import nape.geom.Vec2;
class PlayerGamepad {
	public var player:NapePlayer;	
	//init of project object
	public function new(player:NapePlayer) {	
		//bind the gamepad
		Gamepad.get(0).notify(onGamepadAxis,onGamepadButton);
		this.player = player;
	}
	//pudate function for the Project object
	

	
	public function onGamepadAxis(axis:Int, value:Float):Void {
		//For left right
		if (axis == 0){
			if (value < -0.5){
				//trace('LEFT LEFT ANALOG');
				player.left = true;
			} else if (value > 0.5){
				//trace('RIGHT LEFT ANALOG');
				player.right = true;
			}
			else{
				//trace("released left analog");
				player.right = false;
				player.left = false;
			}
		}
		//for up down
		if (axis == 1){
			if (value > 0.5){
				player.up = true;
				//trace('UP LEFT ANALOG');
			} else if (value < -0.5){
				//trace('DOWN LEFT ANALOG');
				player.down = true;
			}
			else{
				//trace("released left analog");
				player.up = false;
				player.down = false;
			}
		}
		
		if (axis == 2){
			if (value > 0.5){
				//trace('RIGHT RIGHT ANALOG');
			} else if (value < -0.5){
				//trace('LEFT RIGHT ANALOG');
			}
			if (value == 0){
			//	trace("released left analog");
			}
		}
		
		if (axis == 3){
			if (value < -0.5){
				//trace('DOWN RIGHT ANALOG');
			} else if (value > 0.5){
				//trace('UP RIGHT ANALOG');
			}
			if (value == 0){
				//trace("released left analog");
			}
		}
		
		if (axis == 4){
			//trace("Axis no 4",value);
			if (value < -0.5){
				//trace('LEFT TRIGGER');
			}
			if (value == 0){
				//trace("released left analog");
			}
		}
		
		if (axis == 5){
			//trace("Axis no 5",value);
			if (value < -0.5){
				//trace('RIGHT TRIGGER');
			}if (value == 0){
				//trace("released left analog");
			}

		}
	}
	
	public function onGamepadButton(button:Int, value:Float):Void {
		
		
		//trace(button);
		if (button == 0 && value ==1){
			//trace('A');
			if (player.onGround)
			player.body.applyImpulse(new Vec2(0,-4000));
		}
		else if (button == 1){
			//trace('B');
		}
		else if (button == 2){
			//trace('X');
		}
		else if (button == 3){
			//trace('Y');
		}
		
		else if (button == 4){
			//trace('LEFT BUMPER');
		}
		else if (button == 5){
			//trace('RIGHT BUMPER');
		}
		
		else if (button == 6){
			//trace('LEFT ANALOG PRESS');
		}
		else if (button == 7){
			//trace('RIGHT ANALOG PRESS');
		}
		
		else if (button == 8){
			//trace('START');
		}
		else if (button == 9){
			//trace('BACK');
		}
		else if (button == 10){
			//trace('HOME');
		}
		
		else if (button == 15){
			//this.right = !this.right;
			
				//trace('DPAD right pressed');
				//this.right = true;
			
		}
		else if (button == 12){
			
			
				//this.up = true;
				//trace('DPAD up pressed');
			//trace('DPAD up released');
		
		}
		else if (button == 13){
			
			
				//trace('DPAD down pressed');
				//this.down = true;
			
		}
		else if (button == 14){
			//this.left = !this.left;
			
				//trace('DPAD left pressed');
				//this.left = true;
			
				//trace('DPAD left released');
				//this.left = false;
			
			
		}
		
		
	}
	
}
