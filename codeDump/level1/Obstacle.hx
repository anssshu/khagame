package entities.level1;



import kha.graphics2.Graphics;
import components.NapeRect;
import nape.space.Space;
import components.Sprite;
//import components.Entity;
import components.Component;
import kha.Assets;
//create an entity class
class Obstacle extends Component{
	//initialize
	public var space:Space;
	public var door:Sprite;
	public var collider:NapeRect;
	public function new(space:Space){
		super();
		//setupSensor(space);
		x=200;
		y=600;
		collider = new NapeRect(space,x,y,400,150);
		//collider.ay =1.0;
		collider.body.type = nape.phys.BodyType.KINEMATIC;
		door = new Sprite(Assets.images.door);
		door.ay = 1.0;

		//addComponent("door",door);
		//addComponent("collider",collider);
		
		//shape.sensorEnabled = true;
		//setupCollision(space);
		
	}
	//on begin collision of the sensor
	
	//update
	public override function update(){
		super.update();
	 	door.x = x;
		door.y = y;
		collider.body.position.x = x;
		collider.body.position.y = y-95;
		door.update();
		collider.update();
	}
	//render
	public override function render(g:Graphics){
		//render kinematic body
		super.render(g);
		door.render(g);
		collider.render(g);
	}
}

