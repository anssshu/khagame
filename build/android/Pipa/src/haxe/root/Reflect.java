// Generated by Haxe 3.4.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Reflect extends haxe.lang.HxObject
{
	public Reflect(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Reflect()
	{
		//line 28 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		haxe.root.Reflect.__hx_ctor__Reflect(this);
	}
	
	
	public static void __hx_ctor__Reflect(haxe.root.Reflect __hx_this)
	{
	}
	
	
	public static boolean hasField(java.lang.Object o, java.lang.String field)
	{
		//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			return ( ! (haxe.lang.Runtime.eq(((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, true, false), haxe.lang.Runtime.undefined)) );
		}
		
		//line 35 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		return haxe.lang.Runtime.slowHasField(o, field);
	}
	
	
	public static java.lang.Object field(java.lang.Object o, java.lang.String field)
	{
		//line 41 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 42 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, false);
		}
		
		//line 44 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setField(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 51 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, false);
		}
		else
		{
			//line 53 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			haxe.lang.Runtime.slowSetField(o, field, value);
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		//line 87 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 88 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			//line 89 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_getFields(ret);
			//line 90 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			return ret;
		}
		else
		{
			//line 91 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
			if (( o instanceof java.lang.Class )) 
			{
				//line 92 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
				return haxe.root.Type.getClassFields(((java.lang.Class) (o) ));
			}
			else
			{
				//line 94 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/_std/Reflect.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			}
			
		}
		
	}
	
	
}


