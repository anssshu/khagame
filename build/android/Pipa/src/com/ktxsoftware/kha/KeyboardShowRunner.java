// Generated by Haxe 3.4.2
package com.ktxsoftware.kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class KeyboardShowRunner extends haxe.lang.HxObject implements java.lang.Runnable
{
	public KeyboardShowRunner(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public KeyboardShowRunner(com.ktxsoftware.kha.KhaView view)
	{
		//line 17 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		com.ktxsoftware.kha.KeyboardShowRunner.__hx_ctor_com_ktxsoftware_kha_KeyboardShowRunner(this, view);
	}
	
	
	public static void __hx_ctor_com_ktxsoftware_kha_KeyboardShowRunner(com.ktxsoftware.kha.KeyboardShowRunner __hx_this, com.ktxsoftware.kha.KhaView view)
	{
		//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		__hx_this.view = view;
	}
	
	
	public com.ktxsoftware.kha.KhaView view;
	
	public void run()
	{
		//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		this.view.showKeyboard();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		{
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			switch (field.hashCode())
			{
				case 3619493:
				{
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					if (field.equals("view")) 
					{
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						__temp_executeDef1 = false;
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						this.view = ((com.ktxsoftware.kha.KhaView) (value) );
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						return value;
					}
					
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					break;
				}
				
				
			}
			
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		{
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			switch (field.hashCode())
			{
				case 113291:
				{
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					if (field.equals("run")) 
					{
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						__temp_executeDef1 = false;
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
					}
					
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					break;
				}
				
				
				case 3619493:
				{
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					if (field.equals("view")) 
					{
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						__temp_executeDef1 = false;
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						return this.view;
					}
					
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					break;
				}
				
				
			}
			
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		{
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			switch (field.hashCode())
			{
				case 113291:
				{
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					if (field.equals("run")) 
					{
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						__temp_executeDef1 = false;
						//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
						this.run();
					}
					
					//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
					break;
				}
				
				
			}
			
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		baseArr.push("view");
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaRenderer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


