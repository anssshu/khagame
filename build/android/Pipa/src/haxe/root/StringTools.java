// Generated by Haxe 3.4.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static void __hx_ctor__StringTools(haxe.root.StringTools __hx_this)
	{
	}
	
	
	public static java.lang.String urlDecode(java.lang.String s)
	{
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		try 
		{
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			return java.net.URLDecoder.decode(s, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 119 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 119 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 119 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 119 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			{
				//line 119 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
				java.lang.Object e = __temp_catchall2;
				//line 119 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 249 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 250 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		if ( ! ((( ( haxe.lang.Runtime.compare(c, 8) > 0 ) && ( haxe.lang.Runtime.compare(c, 14) < 0 ) ))) ) 
		{
			//line 250 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			return haxe.lang.Runtime.eq(c, 32);
		}
		else
		{
			//line 250 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			return true;
		}
		
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 266 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		int l = s.length();
		//line 267 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		int r = 0;
		//line 268 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 269 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			 ++ r;
		}
		
		//line 271 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
		if (( r > 0 )) 
		{
			//line 272 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 274 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/StringTools.hx"
			return s;
		}
		
	}
	
	
}


