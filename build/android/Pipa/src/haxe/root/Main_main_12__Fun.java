// Generated by Haxe 3.4.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main_main_12__Fun extends haxe.lang.Function
{
	public Main_main_12__Fun()
	{
		//line 12 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/Main.hx"
		super(0, 0);
	}
	
	
	public static haxe.root.Main_main_12__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 13 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/Main.hx"
		haxe.root.Game Project = new haxe.root.Game();
		//line 14 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/Main.hx"
		kha.System.notifyOnRender(((haxe.lang.Function) (new haxe.lang.Closure(Project, "render")) ), null);
		//line 15 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/Main.hx"
		kha.Scheduler.addTimeTask(((haxe.lang.Function) (new haxe.lang.Closure(Project, "update")) ), ((double) (0) ), 0.0166666666666666664, null);
		//line 12 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/Main.hx"
		return null;
	}
	
	
}


