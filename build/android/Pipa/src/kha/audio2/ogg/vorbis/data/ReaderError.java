// Generated by Haxe 3.4.2
package kha.audio2.ogg.vorbis.data;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ReaderError extends haxe.lang.HxObject
{
	public ReaderError(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ReaderError(kha.audio2.ogg.vorbis.data.ReaderErrorType type, java.lang.String message, java.lang.Object posInfos)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		kha.audio2.ogg.vorbis.data.ReaderError.__hx_ctor_kha_audio2_ogg_vorbis_data_ReaderError(this, type, message, posInfos);
	}
	
	
	public static void __hx_ctor_kha_audio2_ogg_vorbis_data_ReaderError(kha.audio2.ogg.vorbis.data.ReaderError __hx_this, kha.audio2.ogg.vorbis.data.ReaderErrorType type, java.lang.String message, java.lang.Object posInfos)
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		if (( message == null )) 
		{
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			message = "";
		}
		
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		__hx_this.type = type;
		//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		__hx_this.message = message;
		//line 17 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		__hx_this.posInfos = posInfos;
	}
	
	
	public kha.audio2.ogg.vorbis.data.ReaderErrorType type;
	
	public java.lang.String message;
	
	public java.lang.Object posInfos;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		{
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			switch (field.hashCode())
			{
				case 718070673:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("posInfos")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						this.posInfos = ((java.lang.Object) (value) );
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return value;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		{
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			switch (field.hashCode())
			{
				case 718070673:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("posInfos")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						this.posInfos = ((java.lang.Object) (value) );
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return value;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("type")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						this.type = ((kha.audio2.ogg.vorbis.data.ReaderErrorType) (value) );
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return value;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
				case 954925063:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("message")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						this.message = haxe.lang.Runtime.toString(value);
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return value;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		{
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			switch (field.hashCode())
			{
				case 718070673:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("posInfos")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return this.posInfos;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("type")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return this.type;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
				case 954925063:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("message")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return this.message;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		{
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			switch (field.hashCode())
			{
				case 718070673:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					if (field.equals("posInfos")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.posInfos)) );
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		baseArr.push("posInfos");
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		baseArr.push("message");
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		baseArr.push("type");
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/data/ReaderError.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


