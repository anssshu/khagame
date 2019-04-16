/*   
     DONT US IT INSTEAD USE THE ATLS MODULE
the json file and image files are created 
with  spriteSheetPacker;
*/

package components;

import kha.graphics2.Graphics;
import kha.Image;
import kha.math.FastMatrix3;
import kha.Blob;
import haxe.Json;
import components.Component;

//for accessing datastructure of JSON object dynamically
import haxe.DynamicAccess;
//json data
typedef JData = { 
		sourceSize : { width : Int, height : Int }, 
		rotated : Bool, 
		frame : { y : Int, x : Int, width : Int, height : Int } 
		};


//create an entity class
class JsonSpriteAtlas extends Component{
	//initialize
	
	public var img:Image;
	
	public var name:String;
	public var file:String;
	public var json:Blob;

	//position of image in atlas;
	public var px:Float;
	public var py:Float;
	public var data:DynamicAccess<JData>;


	public function new(image:Image,json:Blob,name:String){
		//set the image property
		super();
		this.img = image;
		this.json = json;
		this.setFrame(name);
		this.x = 400;
		this.y = 100;
		this.s = 1.0;
		//read the atlas json file 
		//get the data about the name and update px,py,w,h


	}
	//set frame of the Atlas Image
	public function setFrame(name:String){
		//read the json file and asign it to data dynamically
		this.data= Json.parse(this.json.toString());
		//var data:Dynamic = Json.parse(Assets.blobs.foo_json.toString());
		
		var frame = data.get(name).frame;
		this.px= frame.x;
		this.py = frame.y;
		this.w = frame.width;
		this.h = frame.height;
	}
	//update
	public override function update(){

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
		px,py,//x y of sub image
		this.w,this.h,//w h of sub image
		-this.ax*this.w*this.sx*this.s,-this.ay*this.h*this.sy*this.s,//x y of screen position
		this.w*this.sx*this.s,this.h*this.sy*this.s);//w h to be on screen

		
		graphics.popTransformation();
	}

	private function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
	//get the xy coordinate and w h of the image from the atlas
	
}