// Generated by Haxe 3.4.2
package kha.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Matrix3 extends haxe.lang.HxObject
{
	static
	{
		//line 4 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		kha.math.Matrix3.width = 3;
		//line 5 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		kha.math.Matrix3.height = 3;
	}
	
	public Matrix3(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Matrix3(double _00, double _10, double _20, double _01, double _11, double _21, double _02, double _12, double _22)
	{
		//line 11 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		kha.math.Matrix3.__hx_ctor_kha_math_Matrix3(this, _00, _10, _20, _01, _11, _21, _02, _12, _22);
	}
	
	
	public static void __hx_ctor_kha_math_Matrix3(kha.math.Matrix3 __hx_this, double _00, double _10, double _20, double _01, double _11, double _21, double _02, double _12, double _22)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._00 = _00;
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._10 = _10;
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._20 = _20;
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._01 = _01;
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._11 = _11;
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._21 = _21;
		//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._02 = _02;
		//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._12 = _12;
		//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		__hx_this._22 = _22;
	}
	
	
	public static int width;
	
	public static int height;
	
	public double _00;
	
	public double _10;
	
	public double _20;
	
	public double _01;
	
	public double _11;
	
	public double _21;
	
	public double _02;
	
	public double _12;
	
	public double _22;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			switch (field.hashCode())
			{
				case 92895:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_22")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._22 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92831:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_00")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._00 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92864:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_12")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._12 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92862:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_10")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._10 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92833:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_02")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._02 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92893:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_20")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._20 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92894:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_21")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._21 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92832:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_01")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._01 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92863:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_11")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._11 = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			switch (field.hashCode())
			{
				case 92895:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_22")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._22 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92831:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_00")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._00 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92864:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_12")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._12 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92862:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_10")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._10 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92833:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_02")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._02 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92893:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_20")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._20 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92894:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_21")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._21 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92832:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_01")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._01 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92863:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_11")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						this._11 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			switch (field.hashCode())
			{
				case 92895:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_22")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._22;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92831:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_00")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._00;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92864:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_12")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._12;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92862:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_10")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._10;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92833:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_02")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._02;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92893:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_20")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._20;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92894:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_21")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._21;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92832:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_01")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._01;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92863:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_11")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._11;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			switch (field.hashCode())
			{
				case 92895:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_22")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._22;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92831:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_00")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._00;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92864:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_12")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._12;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92862:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_10")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._10;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92833:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_02")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._02;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92893:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_20")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._20;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92894:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_21")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._21;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92832:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_01")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._01;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
				case 92863:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					if (field.equals("_11")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
						return this._11;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_22");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_12");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_02");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_21");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_11");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_01");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_20");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_10");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		baseArr.push("_00");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/Matrix3.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

