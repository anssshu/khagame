// Generated by Haxe 3.4.2
package kha.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FastVector3 extends haxe.lang.HxObject
{
	public FastVector3(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FastVector3(java.lang.Object x, java.lang.Object y, java.lang.Object z)
	{
		//line 4 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		kha.math.FastVector3.__hx_ctor_kha_math_FastVector3(this, x, y, z);
	}
	
	
	public static void __hx_ctor_kha_math_FastVector3(kha.math.FastVector3 __hx_this, java.lang.Object x, java.lang.Object y, java.lang.Object z)
	{
		//line 4 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		double __temp_z64 = ( (haxe.lang.Runtime.eq(z, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(z)) )) );
		//line 4 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		double __temp_y63 = ( (haxe.lang.Runtime.eq(y, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y)) )) );
		//line 4 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		double __temp_x62 = ( (haxe.lang.Runtime.eq(x, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x)) )) );
		//line 5 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		__hx_this.x = __temp_x62;
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		__hx_this.y = __temp_y63;
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		__hx_this.z = __temp_z64;
	}
	
	
	public static kha.math.FastVector3 fromVector3(kha.math.Vector3 v)
	{
		//line 11 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		return new kha.math.FastVector3(v.x, v.y, v.z);
	}
	
	
	public double x;
	
	public double y;
	
	public double z;
	
	
	
	public double get_length()
	{
		//line 26 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		return java.lang.Math.sqrt(( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ));
	}
	
	
	public double set_length(double length)
	{
		//line 30 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		double currentLength = this.get_length();
		//line 31 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		if (( currentLength == 0 )) 
		{
			//line 31 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			return ((double) (0) );
		}
		
		//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		double mul = ( length / currentLength );
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		this.x *= mul;
		//line 34 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		this.y *= mul;
		//line 35 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		this.z *= mul;
		//line 36 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		return length;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		return ( ( ( ( ( ( "FastVector3(" + haxe.lang.Runtime.toString(this.x) ) + ", " ) + haxe.lang.Runtime.toString(this.y) ) + ", " ) + haxe.lang.Runtime.toString(this.z) ) + ")" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.set_length(value);
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("x")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.x = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("z")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.z = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("y")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.y = ((double) (value) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.set_length(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("x")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("z")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.z = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("y")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return value;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("toString")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("x")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.x;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case -1383847581:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("set_length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_length")) );
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("y")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.y;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("get_length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_length")) );
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("z")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.z;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.get_length();
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.get_length();
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("x")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.x;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("z")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.z;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("y")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.y;
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		{
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("toString")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.toString();
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("get_length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.get_length();
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
				case -1383847581:
				{
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					if (field.equals("set_length")) 
					{
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						__temp_executeDef1 = false;
						//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
						return this.set_length(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		baseArr.push("length");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		baseArr.push("z");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		baseArr.push("y");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		baseArr.push("x");
		//line 3 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/math/FastVector3.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


