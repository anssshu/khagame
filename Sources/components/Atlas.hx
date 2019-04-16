/*
//foo.png and foo.json inside the Assets folder
example
var atlas = new Atlas(Assets.images.foo,Assets.blobs.foo_json);
var ant = atlas.create("./ant");
*/
package components;

import kha.graphics2.Graphics;
import kha.math.FastMatrix3;
import components.Component;
import kha.Image;
import kha.Blob;
import haxe.Json;
//for accessing datastructure of JSON object dynamically
import haxe.DynamicAccess;

//import components.AtlasSprite;
//json data
typedef Data = { 
		sourceSize : { width : Int, height : Int }, 
		rotated : Bool, 
		frame : { y : Int, x : Int, width : Int, height : Int } 
		};



//create an entity class
class Atlas{
	//initialize
	public var data:DynamicAccess<Data>;
	public var img:Image;
	public var frame:Frame;
	public var sp:AtlasSprite;
	public function new(img:Image,json:Blob){
		this.img= img;
		this.data  = Json.parse(json.toString());
		trace(this.data);
		
	}
	public function getFrame(name:String){
		this.frame =  this.data.get(name).frame;
		return frame;
	}
	public function create(name:String){
		return new AtlasSprite(this.img,this.data,name);
	}
}


//--------------------Atlas Sprite Helper class----------------------//


typedef Frame = { y : Int, x : Int, width : Int, height : Int } ;

class AtlasSprite extends Component{
	public var img:Image;
	public var data:DynamicAccess<Data>;
	public var frame:Frame;
	public function new(img:Image,data:DynamicAccess<Data>,name:String){
		super();
		this.img=img;
		this.data=data;
		this.frame = this.data.get(name).frame;
		this.w = this.frame.width;
		this.h = this.frame.height;
	}
	public function setFrame(name:String){
		this.frame =  this.data.get(name).frame;
		this.w = this.frame.width;
		this.h = this.frame.height;
	}
	public override function render(graphics:Graphics){

		graphics.pushTransformation(FastMatrix3.translation(this.x+this.ox,this.y+this.oy));
		graphics.rotate(this.degTorad(this.r+this.or),this.x+this.ox,this.y+this.oy);
		//draw the subimage of the image atlas
		//first param is image
		//next 4 parameter is for sub image x,y,w,h of the subimage
		//next 2 for positioning it x,y
		//next 2 for scaling the subimage width height
		
		//trace(x,y);
		graphics.drawScaledSubImage(this.img,//image
		this.frame.x,this.frame.y,//x y of sub image
		this.w,this.h,//w h of sub image
		-this.ax*this.w*this.sx*this.s,-this.ay*this.h*this.sy*this.s,//x y of screen position
		this.w*this.sx*this.s,this.h*this.sy*this.s);//w h to be on screen

		
		graphics.popTransformation();
	}

	private function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
}