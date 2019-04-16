package components;

import kha.graphics2.Graphics;
import kha.math.FastMatrix3;
import components.Component;
//create an entity class
class Rect extends Component{
	public var lw:Float;
	public var color:kha.Color;
	//initialize
	public function new(x0:Float=0,y0:Float=0.0,w0:Float=100.0,h0:Float=100.0,lw:Float=5.0,color=kha.Color.Orange){
		super();
		x=x0;
		y=y0;
		w=w0;
		h=h0;
		this.color = color;
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
		g.color = color;
		g.drawRect(
		-this.ax*this.w*this.sx*this.s,//x-coord
		-this.ay*this.h*this.sy*this.s,//y-coord
		this.w*this.sx*this.s,//width of the scaled image
		this.s*this.h*this.sy, //height of the scaled image
		lw//line width
		);
		g.color=kha.Color.White;
		g.popTransformation();
	}
	//deg to rad
	private function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
}