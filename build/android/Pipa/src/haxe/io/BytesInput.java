// Generated by Haxe 3.4.2
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BytesInput extends haxe.io.Input
{
	public BytesInput(haxe.lang.EmptyObject empty)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public BytesInput(haxe.io.Bytes b, java.lang.Object pos, java.lang.Object len)
	{
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		haxe.io.BytesInput.__hx_ctor_haxe_io_BytesInput(this, b, pos, len);
	}
	
	
	public static void __hx_ctor_haxe_io_BytesInput(haxe.io.BytesInput __hx_this, haxe.io.Bytes b, java.lang.Object pos, java.lang.Object len)
	{
		//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (haxe.lang.Runtime.eq(pos, null)) 
		{
			//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			pos = 0;
		}
		
		//line 40 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (haxe.lang.Runtime.eq(len, null)) 
		{
			//line 40 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			len = ( ((int) (b.length) ) - ((int) (haxe.lang.Runtime.toInt(pos)) ) );
		}
		
		//line 41 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (( ( ( haxe.lang.Runtime.compare(pos, 0) < 0 ) || ( haxe.lang.Runtime.compare(len, 0) < 0 ) ) || ( ( ((int) (haxe.lang.Runtime.toInt(pos)) ) + ((int) (haxe.lang.Runtime.toInt(len)) ) ) > b.length ) )) 
		{
			//line 41 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 53 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		__hx_this.b = b.b;
		//line 54 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		__hx_this.pos = ((int) (haxe.lang.Runtime.toInt(pos)) );
		//line 55 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		__hx_this.len = ((int) (haxe.lang.Runtime.toInt(len)) );
		//line 56 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		__hx_this.totlen = ((int) (haxe.lang.Runtime.toInt(len)) );
	}
	
	
	public byte[] b;
	
	public int pos;
	
	public int len;
	
	public int totlen;
	
	
	
	
	
	public int set_position(int p)
	{
		//line 80 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (( p < 0 )) 
		{
			//line 80 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			p = 0;
		}
		else
		{
			//line 81 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			if (( p > this.totlen )) 
			{
				//line 81 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				p = this.totlen;
			}
			
		}
		
		//line 85 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		this.len = ( this.totlen - p );
		//line 86 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		return this.pos = p;
	}
	
	
	@Override public int readByte()
	{
		//line 94 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (( this.len == 0 )) 
		{
			//line 95 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 96 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		this.len--;
		//line 104 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		return ( this.b[this.pos++] & 255 );
	}
	
	
	@Override public int readBytes(haxe.io.Bytes buf, int pos, int len)
	{
		//line 113 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > buf.length ) )) 
		{
			//line 114 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 121 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		int avail = this.len;
		//line 122 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (( len > avail )) 
		{
			//line 122 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			len = avail;
		}
		
		//line 123 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		if (( len == 0 )) 
		{
			//line 124 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 125 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		java.lang.System.arraycopy(((java.lang.Object) (this.b) ), ((int) (this.pos) ), ((java.lang.Object) (buf.b) ), ((int) (pos) ), ((int) (len) ));
		//line 126 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		this.pos += len;
		//line 127 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		this.len -= len;
		//line 156 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		return len;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("position")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.set_position(((int) (value) ));
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.pos = ((int) (value) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case -867912164:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.totlen = ((int) (value) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.len = ((int) (value) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("position")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.set_position(((int) (haxe.lang.Runtime.toInt(value)) ));
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("b")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.b = ((byte[]) (value) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case -867912164:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.totlen = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.pos = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						this.len = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return value;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case -1140063115:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("readBytes")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("b")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return this.b;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("readByte")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return this.pos;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 373742694:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("set_position")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_position")) );
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return this.len;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case -867912164:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return this.totlen;
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			switch (field.hashCode())
			{
				case -867912164:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("totlen")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return ((double) (this.totlen) );
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("pos")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return ((double) (this.pos) );
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("len")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return ((double) (this.len) );
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		{
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			int __temp_hash2 = field.hashCode();
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			switch (__temp_hash2)
			{
				case -1140063115:
				case -868060226:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (( (( ( __temp_hash2 == -1140063115 ) && field.equals("readBytes") )) || field.equals("readByte") )) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
				case 373742694:
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					if (field.equals("set_position")) 
					{
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						__temp_executeDef1 = false;
						//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
						return this.set_position(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
					break;
				}
				
				
			}
			
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("length");
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("position");
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("totlen");
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("len");
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("pos");
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		baseArr.push("b");
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/haxe/io/BytesInput.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


