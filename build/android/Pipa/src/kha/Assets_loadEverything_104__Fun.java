// Generated by Haxe 3.4.2
package kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Assets_loadEverything_104__Fun extends haxe.lang.Function
{
	public Assets_loadEverything_104__Fun(int[] filesLeft, int fileCount, haxe.lang.Function callback)
	{
		//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		super(0, 0);
		//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		this.filesLeft = filesLeft;
		//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		this.fileCount = fileCount;
		//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		this.callback = callback;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 105 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		 -- this.filesLeft[0];
		//line 106 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		kha.Assets.progress = ( 1 - ( ((double) (this.filesLeft[0]) ) / this.fileCount ) );
		//line 107 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		if (( this.filesLeft[0] == 0 )) 
		{
			//line 107 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
			this.callback.__hx_invoke0_o();
		}
		
		//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Assets.hx"
		return null;
	}
	
	
	public int[] filesLeft;
	
	public int fileCount;
	
	public haxe.lang.Function callback;
	
}


