// Generated by Haxe 3.4.2
package kha.android;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Video extends kha.Video
{
	public Video(haxe.lang.EmptyObject empty)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public Video(android.content.res.AssetFileDescriptor file)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		kha.android.Video.__hx_ctor_kha_android_Video(this, file);
	}
	
	
	public static void __hx_ctor_kha_android_Video(kha.android.Video __hx_this, android.content.res.AssetFileDescriptor file)
	{
		//line 12 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		kha.Video.__hx_ctor_kha_Video(__hx_this);
		//line 13 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		try 
		{
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			__hx_this.mp = new android.media.MediaPlayer();
			//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			__hx_this.mp.setLooping(false);
			//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			__hx_this.mp.setDataSource(file.getFileDescriptor(), file.getStartOffset(), file.getLength());
			//line 17 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			__hx_this.mp.prepare();
			//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			__hx_this.mp.start();
		}
		catch (java.lang.Exception e)
		{
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			haxe.lang.Exceptions.setException(e);
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			e.printStackTrace();
		}
		
		
	}
	
	
	public android.media.MediaPlayer mp;
	
	@Override public void play(java.lang.Object loop)
	{
		//line 27 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		boolean __temp_loop34 = ( (haxe.lang.Runtime.eq(loop, null)) ? (false) : (haxe.lang.Runtime.toBool(loop)) );
		//line 27 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		this.mp.start();
	}
	
	
	@Override public void stop()
	{
		//line 31 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		this.mp.stop();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		{
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			switch (field.hashCode())
			{
				case 3491:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					if (field.equals("mp")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						this.mp = ((android.media.MediaPlayer) (value) );
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						return value;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		{
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			switch (field.hashCode())
			{
				case 3540994:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					if (field.equals("stop")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					break;
				}
				
				
				case 3491:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					if (field.equals("mp")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						return this.mp;
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					break;
				}
				
				
				case 3443508:
				{
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					if (field.equals("play")) 
					{
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						__temp_executeDef1 = false;
						//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "play")) );
					}
					
					//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		baseArr.push("mp");
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Video.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


