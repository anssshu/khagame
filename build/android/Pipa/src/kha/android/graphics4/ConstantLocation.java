// Generated by Haxe 3.4.2
package kha.android.graphics4;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ConstantLocation extends haxe.lang.HxObject implements kha.graphics4.ConstantLocation
{
	public ConstantLocation(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ConstantLocation(int value, int type)
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		kha.android.graphics4.ConstantLocation.__hx_ctor_kha_android_graphics4_ConstantLocation(this, value, type);
	}
	
	
	public static void __hx_ctor_kha_android_graphics4_ConstantLocation(kha.android.graphics4.ConstantLocation __hx_this, int value, int type)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		__hx_this.value = value;
		//line 9 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		__hx_this.type = type;
	}
	
	
	public int value;
	
	public int type;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("type")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						this.type = ((int) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("value")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						this.value = ((int) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("type")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						this.type = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("value")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						this.value = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("type")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return this.type;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("value")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return this.value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("type")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return ((double) (this.type) );
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					if (field.equals("value")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
						return ((double) (this.value) );
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		baseArr.push("type");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		baseArr.push("value");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/graphics4/ConstantLocation.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


