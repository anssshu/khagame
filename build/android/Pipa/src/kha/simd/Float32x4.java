// Generated by Haxe 3.4.2
package kha.simd;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Float32x4 extends haxe.lang.HxObject
{
	public Float32x4(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Float32x4(double _0, double _1, double _2, double _3)
	{
		//line 63 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		kha.simd.Float32x4.__hx_ctor_kha_simd_Float32x4(this, _0, _1, _2, _3);
	}
	
	
	public static void __hx_ctor_kha_simd_Float32x4(kha.simd.Float32x4 __hx_this, double _0, double _1, double _2, double _3)
	{
		//line 64 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		__hx_this._0 = _0;
		//line 65 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		__hx_this._1 = _1;
		//line 66 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		__hx_this._2 = _2;
		//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		__hx_this._3 = _3;
	}
	
	
	public static kha.simd.Float32x4 create()
	{
		//line 71 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (0) ));
	}
	
	
	public static kha.simd.Float32x4 loadAllFast(double t)
	{
		//line 75 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(t, t, t, t);
	}
	
	
	public static kha.simd.Float32x4 load(double a, double b, double c, double d)
	{
		//line 79 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(a, b, c, d);
	}
	
	
	public static kha.simd.Float32x4 loadFast(double a, double b, double c, double d)
	{
		//line 83 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(a, b, c, d);
	}
	
	
	public static double get(kha.simd.Float32x4 t, int index)
	{
		//line 87 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		double value = ((double) (0) );
		//line 88 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		switch (index)
		{
			case 0:
			{
				//line 90 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				value = t._0;
				//line 90 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				break;
			}
			
			
			case 1:
			{
				//line 92 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				value = t._1;
				//line 92 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				break;
			}
			
			
			case 2:
			{
				//line 94 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				value = t._2;
				//line 94 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				break;
			}
			
			
			case 3:
			{
				//line 96 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				value = t._3;
				//line 96 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				break;
			}
			
			
		}
		
		//line 98 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return value;
	}
	
	
	public static double getFast(kha.simd.Float32x4 t, int index)
	{
		//line 102 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		switch (index)
		{
			case 0:
			{
				//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return t._0;
			}
			
			
			case 1:
			{
				//line 106 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return t._1;
			}
			
			
			case 2:
			{
				//line 108 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return t._2;
			}
			
			
			case 3:
			{
				//line 110 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return t._3;
			}
			
			
		}
		
		//line 112 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return ((double) (0) );
	}
	
	
	public static kha.simd.Float32x4 abs(kha.simd.Float32x4 t)
	{
		//line 116 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(java.lang.Math.abs(t._0), java.lang.Math.abs(t._1), java.lang.Math.abs(t._2), java.lang.Math.abs(t._3));
	}
	
	
	public static kha.simd.Float32x4 add(kha.simd.Float32x4 a, kha.simd.Float32x4 b)
	{
		//line 120 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(( a._0 + b._0 ), ( a._1 + b._1 ), ( a._2 + b._2 ), ( a._3 + b._3 ));
	}
	
	
	public static kha.simd.Float32x4 div(kha.simd.Float32x4 a, kha.simd.Float32x4 b)
	{
		//line 124 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(( a._0 / b._0 ), ( a._1 / b._1 ), ( a._2 / b._2 ), ( a._3 / b._3 ));
	}
	
	
	public static kha.simd.Float32x4 mul(kha.simd.Float32x4 a, kha.simd.Float32x4 b)
	{
		//line 128 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(( a._0 * b._0 ), ( a._1 * b._1 ), ( a._2 * b._2 ), ( a._3 * b._3 ));
	}
	
	
	public static kha.simd.Float32x4 neg(kha.simd.Float32x4 t)
	{
		//line 132 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4( - (t._0) ,  - (t._1) ,  - (t._2) ,  - (t._3) );
	}
	
	
	public static kha.simd.Float32x4 reciprocalApproximation(kha.simd.Float32x4 t)
	{
		//line 136 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (0) ));
	}
	
	
	public static kha.simd.Float32x4 reciprocalSqrtApproximation(kha.simd.Float32x4 t)
	{
		//line 140 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(((double) (0) ), ((double) (0) ), ((double) (0) ), ((double) (0) ));
	}
	
	
	public static kha.simd.Float32x4 sub(kha.simd.Float32x4 a, kha.simd.Float32x4 b)
	{
		//line 144 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(( a._0 - b._0 ), ( a._1 - b._1 ), ( a._2 - b._2 ), ( a._3 - b._3 ));
	}
	
	
	public static kha.simd.Float32x4 sqrt(kha.simd.Float32x4 t)
	{
		//line 148 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		return new kha.simd.Float32x4(java.lang.Math.sqrt(t._0), java.lang.Math.sqrt(t._1), java.lang.Math.sqrt(t._2), java.lang.Math.sqrt(t._3));
	}
	
	
	public double _0;
	
	public double _1;
	
	public double _2;
	
	public double _3;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		{
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			switch (field.hashCode())
			{
				case 2996:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_3")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._3 = ((double) (value) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2993:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_0")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._0 = ((double) (value) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2995:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_2")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._2 = ((double) (value) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2994:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_1")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._1 = ((double) (value) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
			}
			
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		{
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			switch (field.hashCode())
			{
				case 2996:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_3")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._3 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2993:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_0")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._0 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2995:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_2")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._2 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2994:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_1")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						this._1 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return value;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
			}
			
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		{
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			switch (field.hashCode())
			{
				case 2996:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_3")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._3;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2993:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_0")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._0;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2995:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_2")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._2;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2994:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_1")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._1;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
			}
			
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		{
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			switch (field.hashCode())
			{
				case 2996:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_3")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._3;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2993:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_0")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._0;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2995:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_2")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._2;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
				case 2994:
				{
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					if (field.equals("_1")) 
					{
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						__temp_executeDef1 = false;
						//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
						return this._1;
					}
					
					//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
					break;
				}
				
				
			}
			
			//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		baseArr.push("_3");
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		baseArr.push("_2");
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		baseArr.push("_1");
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		baseArr.push("_0");
		//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/simd/Float32x4.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

