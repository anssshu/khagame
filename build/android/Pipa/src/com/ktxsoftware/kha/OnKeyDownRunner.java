// Generated by Haxe 3.4.2
package com.ktxsoftware.kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class OnKeyDownRunner extends haxe.lang.HxObject implements java.lang.Runnable
{
	public OnKeyDownRunner(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public OnKeyDownRunner(com.ktxsoftware.kha.KhaRenderer renderer, int keyCode)
	{
		//line 37 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		com.ktxsoftware.kha.OnKeyDownRunner.__hx_ctor_com_ktxsoftware_kha_OnKeyDownRunner(this, renderer, keyCode);
	}
	
	
	public static void __hx_ctor_com_ktxsoftware_kha_OnKeyDownRunner(com.ktxsoftware.kha.OnKeyDownRunner __hx_this, com.ktxsoftware.kha.KhaRenderer renderer, int keyCode)
	{
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		__hx_this.renderer = renderer;
		//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		__hx_this.keyCode = keyCode;
	}
	
	
	public com.ktxsoftware.kha.KhaRenderer renderer;
	
	public int keyCode;
	
	public void run()
	{
		//line 43 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		this.renderer.key(this.keyCode, true);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		{
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			switch (field.hashCode())
			{
				case -815957780:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("keyCode")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						this.keyCode = ((int) (value) );
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return value;
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
			}
			
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		{
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			switch (field.hashCode())
			{
				case -815957780:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("keyCode")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						this.keyCode = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return value;
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
				case -494845757:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("renderer")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						this.renderer = ((com.ktxsoftware.kha.KhaRenderer) (value) );
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return value;
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
			}
			
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		{
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			switch (field.hashCode())
			{
				case 113291:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("run")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
				case -494845757:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("renderer")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return this.renderer;
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
				case -815957780:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("keyCode")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return this.keyCode;
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
			}
			
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		{
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			switch (field.hashCode())
			{
				case -815957780:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("keyCode")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						return ((double) (this.keyCode) );
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
			}
			
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		{
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			switch (field.hashCode())
			{
				case 113291:
				{
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					if (field.equals("run")) 
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						__temp_executeDef1 = false;
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
						this.run();
					}
					
					//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
					break;
				}
				
				
			}
			
			//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		baseArr.push("keyCode");
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		baseArr.push("renderer");
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/com/ktxsoftware/kha/KhaView.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

