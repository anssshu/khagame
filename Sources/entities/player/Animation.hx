package entities.player;

import kha.graphics2.Graphics;
import kha.Assets;
import components.AnimatedSprite;
import entities.player.Player;
//create an entity class
class Animation extends AnimatedSprite{
	//initialize
	public var player:Player;
	public function new(player:Player){
		super(Assets.images.baby,200,400,60.0);
		//thread = true;
		this.player = player;
		s = .8;
		ay = 0.86;
		createAnimation("run",27,3);
		createAnimation("jump",2,2);
		createAnimation("idle",50,27);
		createAnimation("slide",1,1);
		createAnimation("die",30,30);
		play("run",36);
	}
	//update
	public override function update(){
		super.update();
		x=player.x;
		y=player.y;
	}
	//render
	public override function render(g:Graphics){
		super.render(g);
	}
}