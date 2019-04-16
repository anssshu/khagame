package components;



import kha.graphics2.Graphics;
import kha.input.Surface;



class TouchController {
	
	public function new() {
		
		Surface.get().notify(onTouchDown, onTouchUp, onTouchMove);
	}

	public function update():Void {
		
	}

	public function render(graphics:Graphics):Void {
		
	}

	public function onTouchDown(id:Int, x:Int, y:Int){
		if (id == 0){
			trace('FIRST FINGER DOWN')
		}
		if (id == 1){
			trace('SECOND FINGER DOWN');
		}
	}

	public function onTouchUp(id:Int, x:Int, y:Int){
		if (id == 0){
			trace('FIRST FINGER UP');
		}
		if (id == 1){
			trace('SECOND FINGER UP');
		}
	}

	public function onTouchMove(id:Int, x:Int, y:Int){
		if (id == 0){
			if (x > 0){
				trace('FIRST FINGER MOVE X');
				
			}
			if (y > 0){
				trace('FIRST FINGER MOVE Y');
				
			}
		}

		if (id == 1){
			if (x > 0){
				trace('SECOND FINGER MOVE X');
				
			}
			if (y > 0){
				trace('SECOND FINGER MOVE Y');
			
			}
		}
	}
}
