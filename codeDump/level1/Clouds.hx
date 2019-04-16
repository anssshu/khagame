package entities.level1;

import kha.graphics2.Graphics;
import kha.Assets;

import components.Entity;
import components.Sprite;
//import nape.space.Space;

//create an entity class
class Clouds extends Entity{
	//initialize
	public var speed=0.0;
	public var cloud1 = new Sprite(Assets.images.cloud1);
	public var cloud2 = new Sprite(Assets.images.cloud2);
	public var cloud3 = new Sprite(Assets.images.cloud3);
	public var cloud4 = new Sprite(Assets.images.cloud4);
	public var cloud5 = new Sprite(Assets.images.cloud5);
	public var clouds:Array<Sprite>;
	public function new(){
		super();
		cloud1.name = "cloud1";
		cloud2.name = "cloud2";
		cloud3.name = "cloud3";
		cloud4.name = "cloud4";
		cloud5.name = "cloud5";

		clouds = [cloud1,cloud2,cloud3,cloud4,cloud5];
		for (c in clouds){
			addComponent(c.name,c);
			c.ax = 0;
			c.ay = 0;
			c.x = Math.random()*1600;
			c.y = Math.random()*1200;
		}
		
		

	}
	//update
	public override function update(){
		super.update();
		if (speed >7){
				speed += 9.8*.001; 
		}
		for (c in clouds){
			
			//c.x = Math.random()*1600;
			c.y -= 1*speed;
			if (c.y<-c.h){
			c.y = 1200;
			c.x = Math.random()*1600;
			//o0.x = 250+1150*Math.random();
		}
		}
		
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
		
	}
}