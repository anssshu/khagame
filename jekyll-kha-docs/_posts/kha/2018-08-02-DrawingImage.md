---
layout: post
title:  5.Drawing Image
date:   2018-08-01 13:27:51 +0530
categories: Kha
---





{% highlight javascript %}
//Project.hx
package;

import kha.Framebuffer;
import kha.Image;
import kha.Assets;
import kha.graphics2.Graphics;

class Project {
		
	//create a variable to store image
	public var image:Image;

	public function new() {	
		this.image = Assets.images.ball //ball.png is inside the Assets folder
		
	}

	//udate function for the Project object
	public function update(): Void {
	
	}

	//draw inside this function
	public function render(framebuffer: Framebuffer): Void {
		
		var g = framebuffer.g2;
		g.begin();
		g.clear(kha.Color.Cyan);
		drawMyImage(g);
		g.end();
	
		
	}

	public function drawMyImage(g:Graphics){
		g.drawImage(this.image,100,100);
	}


}


{% endhighlight %}





