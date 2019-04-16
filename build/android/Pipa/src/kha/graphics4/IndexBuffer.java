// Generated by Haxe 3.4.2
package kha.graphics4;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IndexBuffer extends haxe.lang.HxObject
{
	public IndexBuffer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public IndexBuffer(int indexCount, kha.graphics4.Usage usage, java.lang.Object canRead)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		kha.graphics4.IndexBuffer.__hx_ctor_kha_graphics4_IndexBuffer(this, indexCount, usage, canRead);
	}
	
	
	public static void __hx_ctor_kha_graphics4_IndexBuffer(kha.graphics4.IndexBuffer __hx_this, int indexCount, kha.graphics4.Usage usage, java.lang.Object canRead)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		boolean __temp_canRead54 = ( (haxe.lang.Runtime.eq(canRead, null)) ? (false) : (haxe.lang.Runtime.toBool(canRead)) );
		//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		__hx_this.usage = usage;
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		__hx_this.mySize = indexCount;
		//line 23 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		java.nio.IntBuffer this1 = java.nio.ByteBuffer.allocateDirect(((int) (( indexCount * 4 )) )).order(((java.nio.ByteOrder) (java.nio.ByteOrder.nativeOrder()) )).asIntBuffer();
		//line 23 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		__hx_this.lockedData = ((java.nio.IntBuffer) (this1) );
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		__hx_this.data = java.nio.ByteBuffer.allocateDirect(((int) (( indexCount * 2 )) )).order(((java.nio.ByteOrder) (java.nio.ByteOrder.nativeOrder()) )).asShortBuffer();
	}
	
	
	public static int createBuffer()
	{
		//line 28 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		int[] buffers = new int[1];
		//line 29 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		android.opengl.GLES20.glGenBuffers(1, buffers, 0);
		//line 30 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		return buffers[0];
	}
	
	
	public java.nio.IntBuffer lockedData;
	
	public java.nio.ShortBuffer data;
	
	public int mySize;
	
	public kha.graphics4.Usage usage;
	
	public java.nio.IntBuffer lock()
	{
		//line 34 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		return this.lockedData;
	}
	
	
	public void unlock()
	{
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		int _g1 = 0;
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		int _g = this.mySize;
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		while (( _g1 < _g ))
		{
			//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			int i = _g1++;
			//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			this.data.put(((int) (i) ), ((short) (((java.nio.IntBuffer) (this.lockedData) ).get(((int) (i) ))) ));
		}
		
	}
	
	
	public void set()
	{
	}
	
	
	public int count()
	{
		//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		return this.mySize;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		{
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			switch (field.hashCode())
			{
				case -1060066355:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("mySize")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.mySize = ((int) (value) );
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return value;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		{
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			switch (field.hashCode())
			{
				case 111574433:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("usage")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.usage = ((kha.graphics4.Usage) (value) );
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return value;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 1391591892:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("lockedData")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.lockedData = ((java.nio.IntBuffer) (value) );
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return value;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case -1060066355:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("mySize")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.mySize = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return value;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 3076010:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("data")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.data = ((java.nio.ShortBuffer) (value) );
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return value;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		{
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			switch (field.hashCode())
			{
				case 94851343:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("count")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "count")) );
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 1391591892:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("lockedData")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return this.lockedData;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("set")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 3076010:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("data")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return this.data;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case -840442044:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("unlock")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unlock")) );
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case -1060066355:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("mySize")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return this.mySize;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 3327275:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("lock")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lock")) );
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 111574433:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("usage")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return this.usage;
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		{
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			switch (field.hashCode())
			{
				case -1060066355:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("mySize")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return ((double) (this.mySize) );
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		{
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			switch (field.hashCode())
			{
				case 94851343:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("count")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return this.count();
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 3327275:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("lock")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						return this.lock();
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("set")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.set();
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
				case -840442044:
				{
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					if (field.equals("unlock")) 
					{
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						__temp_executeDef1 = false;
						//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
						this.unlock();
					}
					
					//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		baseArr.push("usage");
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		baseArr.push("mySize");
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		baseArr.push("data");
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		baseArr.push("lockedData");
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/graphics4/IndexBuffer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


