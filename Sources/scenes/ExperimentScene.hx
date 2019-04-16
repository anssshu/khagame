/*
collision groups
player = 1;
trap = 2;
*/
package scenes;


import components.Scene;


import nape.space.Space;
import nape.geom.Vec2;
import nape.phys.BodyType;
import entities.Bird;
import entities.player.Player;
import entities.NapeCircle;
import entities.OneSidedPlatform;
import entities.Ground;
import components.Sprite;
import components.Entity;
import components.Rect;
import entities.Tree;
import entities.Trap;
//create an entity class
class ExperimentScene extends Scene{
	//initialize
	//public var game:MyGame;
	
	public function new(game:MyGame){
		//this.game = game;
		super(game);
		cast(this.game,MyGame);		
	}

	public override function create(){
		//hide camera bounds
		//camera.hide = true ;
		

		var gravity = new Vec2(0,3000);
	    space = new Space(gravity);
		
		var bg = new Entity();
		bg.name = "bg";
		var sp = new Sprite(kha.Assets.images.bg);
		sp.ax=0;
		sp.ay=0;
		sp.y=-200;
		bg.addComponent("sp",sp);
		addChild(bg,"bgLayer");

		//add trees
		for (i in 0...60){
			var tree = new Tree();
			tree.x=1200+56000*Math.random();
			//tree.getComponent("sprite").sx = .5;
			tree.y=990;
			addChild(tree);
		}
		//add traps
		

		

		var rect = new Entity();
		var r= new Rect(0,1000,1600,100,30);
		r.ax=0;
		r.ay=0;
		rect.addComponent("r",r);
		addChild(rect,"bgLayer");

		var rect2 = new Entity();
		var r2= new Rect(0,1100,1600,180,180,kha.Color.Black);
		r2.ax=0;
		r2.ay=0;
		rect2.addComponent("r2",r2);
		addChild(rect2,"fgLayer");
		
		
		
		var g = new Ground(space);
		g.name  = "ground2";
		addChild(g);
		

		var c =new NapeCircle(space,1200,100,20);
		c.body.type = BodyType.DYNAMIC;
		c.body.velocity = new Vec2(0,100);
		c.shape.material.elasticity = 1.5;
		c.shape.material.density=.1;
		c.shape.material.staticFriction = .05;
		c.shape.filter.collisionGroup =10;
		addChild(c);
		//traps
		for (i in 0...5){
		var trap = new Trap(this,52000+400*i,1000);
		addChild(trap);
		}
		var trap2 = new Trap(this,54800,1000);
		addChild(trap2);

		for (i in 0...20){
		var trap = new Trap(this,2000+2400*i,1000);
		addChild(trap);
		}
		//add platforms
		for (i in 0...5){
		var myrect = new OneSidedPlatform(space,52000+500*i,750-100*i,300,25,kha.Color.Orange);
		//myrect.name = "onesided";
		addChild(myrect);
		}
		
		//add player at last for proper tangent calulation
		var player = new Player(this);
		player.name = "babu";
		
		var bird = new Bird(this);
		addChild(bird);

		camera.smoothFollow(player);
		addChild(player);

		
	}

}