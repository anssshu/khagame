package components;

import kha.graphics2.Graphics;
using kha.graphics2.GraphicsExtension;
import kha.math.FastMatrix3;

import components.Component;
//create an entity class
class Circle extends Component{
	public var lw:Float;
	public var radius:Float;
	//initialize
	public function new(x0:Float=0,y0:Float=0.0,radius0:Float=100.0,lw:Float=5.0){
		super();
		x=x0;
		y=y0;
		w=2*radius0;
		h=2*radius0;
		this.radius=radius0;

		this.lw = lw;
	}
	//update
	public override function update(){
		//r+=2.0;
	}
	//render
	public override function render(g:Graphics){
		g.pushTransformation(FastMatrix3.translation(this.x+this.ox,this.y+this.oy));
		g.rotate(this.degTorad(this.r+this.or),this.x+this.ox,this.y+this.oy);
		g.drawCircle(
		0,//x-coord
		0,//y-coord
		this.radius*this.s,//radius of the scaled image
		lw//line width
		);
		
		g.popTransformation();
	}
	//deg to rad
	private function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
}