---
layout: post
title:  4.Drawing a Rectangle;
date:   2018-08-01 13:27:51 +0530
categories: Kha
---

code inside the render function
{% highlight javascript %}

//Project.hx

package;

import kha.Framebuffer;

class Project {
		
	
	public function new() {
			
	}

	public function update(): Void {
		
	}

	public function render(framebuffer: Framebuffer): Void {
		
		var g = framebuffer.g2;
		g.begin();
		g.clear(kha.Color.Cyan);
		g.drawRect(10,10,680,580);
		g.end();
		
	}
}


{% endhighlight %}

