// Generated by Haxe 3.4.2
package kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TargetDisplay extends haxe.lang.ParamEnum
{
	public TargetDisplay(int index, java.lang.Object[] params)
	{
		//line 99 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Primary", "ById"};
	
	public static final kha.TargetDisplay Primary = new kha.TargetDisplay(0, null);
	
	public static kha.TargetDisplay ById(int id)
	{
		//line 13 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/WindowOptions.hx"
		return new kha.TargetDisplay(1, new java.lang.Object[]{id});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 11 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/WindowOptions.hx"
		return kha.TargetDisplay.__hx_constructs[this.index];
	}
	
	
}


