package components;
import kha.System;
import kha.Scheduler;
import kha.Assets;
import MyGame;
class App{
	public var title="title";
	public var width = 800;
	public var height = 600;
	public var fps = 60;
	//
	public function new(title:String="title",w:Int=800,h:Int=600,fps:Int=60){
		this.title = title;
		width = w;
		height = h;
		this.fps = fps;
	}
	//
	public function run(){
		System.init({title: this.title, width: this.width, height: this.height,samplesPerPixel:1}, function () {
			Assets.loadEverything(function(){
				var Project = new MyGame(this);
				System.notifyOnRender(Project.render);
				Scheduler.addTimeTask(Project.update,0,1/this.fps);
			});
			
		});
	}
}