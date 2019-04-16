---
layout: post
title: 3.Refactoring the code
date:   2018-08-01 13:27:51 +0530
categories: Kha
---
Open the Main.hx file and paste  the following code
{% highlight javascript %}
//Main.hx
package;

import kha.System;
import kha.Scheduler;
import kha.Assets;



class Main {
	public static function main() {
		System.init({title: "Project", width: 1024, height: 768}, function () {
			Assets.loadEverything(function(){
				var Project = new Project();
				System.notifyOnRender(Project.render);
				Scheduler.addTimeTask(Project.update,0,1/60);
			});
			
		});
	}
}





{% endhighlight %}

<h2>Opne the Project.hx file and paste the following code</h2>

{% highlight javascript %}
//Project.hx
package;

import kha.Framebuffer;



class Project {
		
	//init of project object
	public function new() {	
		
	}
	//pudate function for the Project object
	public function update(): Void {
	
	}

	//draw inside this function
	public function render(framebuffer: Framebuffer): Void {
		
	
		
	}
}


{% endhighlight %}


