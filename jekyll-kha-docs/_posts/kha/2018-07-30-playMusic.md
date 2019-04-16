---
layout: post
title:  7.Playing Music
date:   2018-08-01 13:27:51 +0530
categories: Kha
---




{% highlight javascript %}
//Project.hx
package;

import kha.Framebuffer;
//import kha.Sound;
import kha.audio1.Audio;
import kha.audio1.AudioChannel;
import kha.Assets;


class Project {
	//public var sound:Sound;
	public var audioChannel:AudioChannel;
		
	//init of project object
	public function new() {	
		//sound = Assets.sounds.tone;
		//audioChannel = Audio.play(sound,true);//loop

		audioChannel = Audio.play(Assets.sounds.tone,true)//another way
		
		
	}
	//pudate function for the Project object
	public function update(): Void {
	
	}

	//draw inside this function
	public function render(framebuffer: Framebuffer): Void {
		
	
		
	}
}


{% endhighlight %}
