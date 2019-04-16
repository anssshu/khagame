package entities;


import components.JsonSpriteAtlas;
import kha.Assets;
//create an entity class
class Ant extends JsonSpriteAtlas{
	//initialize
	public function new(){
		super(Assets.images.foo,Assets.blobs.foo_json,"./ant");
		//setFrame("./poo");
		x=600;
		y=400;
		s=2;
	}
	//update
	public override function update(){
		r+=10;
	}
	
}