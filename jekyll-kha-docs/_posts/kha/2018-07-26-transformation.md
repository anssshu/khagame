---
layout: post
title:  11.Trnsformation
date:   2018-08-01 13:27:51 +0530
categories: Kha
---




{% highlight javascript %}
package;

import kha.graphics2.Graphics;
import kha.math.FastMatrix3;

class Block{

	public var ax = 0.5; //anchor x
	public var ay = 0.5; //anchor y
	public var  r = 0.0; //rotation in rad
	public var x=200.0;  //x pos
	public var y=200.0;  //y pos
	public var w=100.0;  //width 
	public var h=100.0;  //height

	public function new(){
		
	}

	public function update(){
		this.r+=10;
	
	}

	public function render(graphics:Graphics){

		graphics.pushTransformation(FastMatrix3.translation(this.x,this.y));
		graphics.rotate(this.degTorad(this.r),this.x,this.y);
		graphics.fillRect(-this.ax*this.w,-this.ay*this.h,this.w,this.h);
		graphics.popTransformation();
	}

	public function degTorad(deg:Float){
		return deg*(Math.PI/180.0);
	}
}

{% endhighlight %}


