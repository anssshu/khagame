// Generated by Haxe 3.4.2
package kha.audio1;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Audio extends haxe.lang.HxObject
{
	static
	{
		//line 9 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		kha.audio1.Audio.spSamples = 0;
		//line 11 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		kha.audio1.Audio.spSamplesMax = 32;
		//line 13 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		kha.audio1.Audio.soundpool = new android.media.SoundPool(kha.audio1.Audio.spSamplesMax, android.media.AudioManager.STREAM_MUSIC, 0);
	}
	
	public Audio(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Audio()
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		kha.audio1.Audio.__hx_ctor_kha_audio1_Audio(this);
	}
	
	
	public static void __hx_ctor_kha_audio1_Audio(kha.audio1.Audio __hx_this)
	{
	}
	
	
	public static int spSamples;
	
	public static int spSamplesMax;
	
	public static android.media.SoundPool soundpool;
	
	public static kha.audio1.AudioChannel play(kha.Sound sound, java.lang.Object loop)
	{
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		boolean __temp_loop35 = ( (haxe.lang.Runtime.eq(loop, null)) ? (false) : (haxe.lang.Runtime.toBool(loop)) );
		//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		kha.android.Sound androidSound = ((kha.android.Sound) (sound) );
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		if (( androidSound.soundId > 0 )) 
		{
			//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
			int loopMode = ( (__temp_loop35) ? (-1) : (0) );
			//line 23 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
			kha.audio1.SoundPoolChannel sc = new kha.audio1.SoundPoolChannel(androidSound, loopMode);
			//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
			return sc;
		}
		else
		{
			//line 27 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
			try 
			{
				//line 28 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
				kha.audio1.MediaPlayerChannel mc = new kha.audio1.MediaPlayerChannel(androidSound, __temp_loop35);
				//line 29 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
				return mc;
			}
			catch (java.lang.Throwable __temp_catchallException1)
			{
				//line 27 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
				haxe.lang.Exceptions.setException(__temp_catchallException1);
				//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
				java.lang.Object __temp_catchall2 = __temp_catchallException1;
				//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
				if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
				{
					//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
					__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
				{
					//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
					java.lang.Object e = __temp_catchall2;
					//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
					haxe.Log.trace.__hx_invoke2_o(0.0, e, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"kha.audio1.Audio", "Audio.hx", "play"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (32) )) )}));
				}
				
			}
			
			
		}
		
		//line 35 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		return null;
	}
	
	
	public static kha.audio1.AudioChannel stream(kha.Sound sound, java.lang.Object loop)
	{
		//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		boolean __temp_loop36 = ( (haxe.lang.Runtime.eq(loop, null)) ? (false) : (haxe.lang.Runtime.toBool(loop)) );
		//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/audio1/Audio.hx"
		return kha.audio1.Audio.play(sound, __temp_loop36);
	}
	
	
}


