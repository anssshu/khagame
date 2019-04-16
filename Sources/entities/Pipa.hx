package entities;


import kha.Assets;
import MyGame;
import components.Sprite;
import components.KeyboardController;
import components.GamepadController;

class Pipa extends Sprite{
	public var k = new KeyboardController();
	public var g = new GamepadController();
	public var speed = 8.0;
	//public var g = new GamepadController();

	public function new(game:MyGame){
		super(Assets.images.pipa);
		this.ay = 1.0;
		this.s = 0.5;
		this.x = 400;
		this.y = 400;
		
	}

	//function to update
	public override function update(){
		this.updateInputs();
		
		//trace(this.k.left,this.g.left);
	}

	//update the keyboard input
	private function updateInputs(){
		if (this.k.left  || this.g.left){
			this.x-=1*this.speed;
		}
		if (this.k.right || this.g.right){
			this.x+=1*this.speed;
		}
		if (this.k.up || this.g.up){
			this.y-=1*this.speed;
		}
		if (this.k.down || this.g.down){
			this.y+=1*this.speed;
		}
	}
	

}

