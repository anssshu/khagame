package entities;

import components.Sprite;
//import kha.Image;
import kha.Assets;
class Fan extends Sprite {
	public var speed = 2.0;
	public function new(){
		super(Assets.images.fan);
	}
	
	
	public override function update(){
		this.r+=1*this.speed;
	}
}