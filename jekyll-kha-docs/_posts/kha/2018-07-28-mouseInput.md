---
layout: post
title:  9.Mouse Input
date:   2018-08-01 13:27:51 +0530
categories: Kha
---




{% highlight javascript %}
//Project.hx
package;

import kha.Framebuffer;
import kha.input.Mouse;


class Project {
		
	//init of project object
	public function new() {	
		Mouse.get().notify(onMouseDown,onMouseUp,onMouseMove,null);
	}
	//pudate function for the Project object
	public function update(): Void {
	
	}

	//draw inside this function
	public function render(framebuffer: Framebuffer): Void {
		
	
		
	}

	public function onMouseDown(button:Int,x:Int,y:Int):Void{
		trace("mouse button is down");
		if (button==0) trace("left);
		if (button==1) trace("right);
		

	}
	public function onMouseMove(x:Int,y:Int,cx:Int,cy:Int):Void{

	}
}


{% endhighlight %}


