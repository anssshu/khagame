package components;

import kha.input.Gamepad;


class GamepadController {
	public var buttonPressed = true;
	public var left  = false;
	public var right = false;
	public var up  = false;
	public var down = false;
	public var a = false;	
	//init of project object
	public function new() {	
		//bind the gamepad
		Gamepad.get(0).notify(onGamepadAxis,onGamepadButton);
	}
	//pudate function for the Project object
	

	
	public function onGamepadAxis(axis:Int, value:Float):Void {
		//For left right
		if (axis == 0){
			if (value < -0.5){
				//trace('LEFT LEFT ANALOG');
				this.left = true;
			} else if (value > 0.5){
				//trace('RIGHT LEFT ANALOG');
				this.right = true;
			}
			else{
				//trace("released left analog");
				this.right = false;
				this.left = false;
			}
		}
		//for up down
		if (axis == 1){
			if (value > 0.5){
				this.up = true;
				//race('UP LEFT ANALOG');
			} else if (value < -0.5){
				//trace('DOWN LEFT ANALOG');
				this.down = true;
			}
			else{
				//trace("released left analog");
				this.up = false;
				this.down = false;
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
		this.buttonPressed = !this.buttonPressed;
		
		//trace(button);
		if (button == 0){
			//trace('A');
			//this.a = !this.a;
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
			if (this.buttonPressed){
				//trace('DPAD right pressed');
				//this.right = true;
			}
			else{
				//trace('DPAD right released');
				//this.right = false;
			}
		}
		else if (button == 12){
			
			if (this.buttonPressed){
				//this.up = true;
				//trace('DPAD up pressed');
			}
			else{
				//this.up = false;
				//trace('DPAD up released');
			}
		}
		else if (button == 13){
			
			if (this.buttonPressed){
				//trace('DPAD down pressed');
				//this.down = true;
			}
			else{
				//trace('DPAD down released');
				//this.down = false;
			}
		}
		else if (button == 14){
			//this.left = !this.left;
			if (this.buttonPressed){
				//trace('DPAD left pressed');
				//this.left = true;
			}
			else{
				//trace('DPAD left released');
				//this.left = false;
			}
			
		}
		else{
			//trace ("fuck button");
		}
		
	}
	
}
