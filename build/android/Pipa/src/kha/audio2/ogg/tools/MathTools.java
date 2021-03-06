// Generated by Haxe 3.4.2
package kha.audio2.ogg.tools;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class MathTools extends haxe.lang.HxObject
{
	public MathTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public MathTools()
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
		kha.audio2.ogg.tools.MathTools.__hx_ctor_kha_audio2_ogg_tools_MathTools(this);
	}
	
	
	public static void __hx_ctor_kha_audio2_ogg_tools_MathTools(kha.audio2.ogg.tools.MathTools __hx_this)
	{
	}
	
	
	public static int ilog(int n)
	{
		//line 11 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
		haxe.root.Array<java.lang.Object> log2_4 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4});
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
		if (( n < 16384 )) 
		{
			//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
			if (( n < 16 )) 
			{
				//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
				return ((int) (haxe.lang.Runtime.toInt(log2_4.__get(n))) );
			}
			else
			{
				//line 17 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
				if (( n < 512 )) 
				{
					//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
					return ( 5 + ((int) (haxe.lang.Runtime.toInt(log2_4.__get(( n >> 5 )))) ) );
				}
				else
				{
					//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
					return ( 10 + ((int) (haxe.lang.Runtime.toInt(log2_4.__get(( n >> 10 )))) ) );
				}
				
			}
			
		}
		else
		{
			//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
			if (( n < 16777216 )) 
			{
				//line 23 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
				if (( n < 524288 )) 
				{
					//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
					return ( 15 + ((int) (haxe.lang.Runtime.toInt(log2_4.__get(( n >> 15 )))) ) );
				}
				else
				{
					//line 26 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
					return ( 20 + ((int) (haxe.lang.Runtime.toInt(log2_4.__get(( n >> 20 )))) ) );
				}
				
			}
			else
			{
				//line 28 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
				if (( n < 536870912 )) 
				{
					//line 29 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
					return ( 25 + ((int) (haxe.lang.Runtime.toInt(log2_4.__get(( n >> 25 )))) ) );
				}
				else
				{
					//line 30 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
					if (( n < -2147483648 )) 
					{
						//line 31 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
						return ( 30 + ((int) (haxe.lang.Runtime.toInt(log2_4.__get(( n >> 30 )))) ) );
					}
					else
					{
						//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/MathTools.hx"
						return 0;
					}
					
				}
				
			}
			
		}
		
	}
	
	
}


