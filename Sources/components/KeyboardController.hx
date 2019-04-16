package components;

import kha.input.Keyboard;
import kha.input.KeyCode;

class KeyboardController{
	public var left = false;
	public var right = false;
	public var up = false;
	public var down = false;

	public function new(){
		Keyboard.get().notify(onKeyDown,onKeyUp);
	}
	//keydown function
	public function onKeyDown(key:KeyCode):Void{
		//trace(key);
		switch(key){
			case A : {
				trace("left pressed");
				this.left = true;
			}
			case D : {
				trace("right pressed");
				this.right = true;
			}
			case W : {
				trace("up pressed");
				this.up = true;
				}
			case S : {
				trace("down pressed");
				this.down = true;
				}
			default:return;
		}
		
	}
	//keyup function
	public function onKeyUp(key:KeyCode):Void{
		//trace(key);
		switch(key){
			case A : {
				trace("left  released");
				this.left = false;
			}
			case D : {
				trace("right  released");
				this.right = false;
			}
			case W : {
				trace("up  released");
				this.up = false;
				}
			case S : {
				trace("down released");
				this.down = false;
				}
			default:return;
		}
		
	}

}