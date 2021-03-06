// Generated by Haxe 3.4.2
package kha.audio2.ogg.tools;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Crc32 extends haxe.lang.HxObject
{
	static
	{
		//line 10 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		kha.audio2.ogg.tools.Crc32.POLY = 79764919;
	}
	
	public Crc32(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Crc32()
	{
		//line 8 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		kha.audio2.ogg.tools.Crc32.__hx_ctor_kha_audio2_ogg_tools_Crc32(this);
	}
	
	
	public static void __hx_ctor_kha_audio2_ogg_tools_Crc32(kha.audio2.ogg.tools.Crc32 __hx_this)
	{
	}
	
	
	public static int POLY;
	
	public static int[] table;
	
	public static void init()
	{
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		if (( kha.audio2.ogg.tools.Crc32.table != null )) 
		{
			//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
			return ;
		}
		
		//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		int[] this1 = new int[256];
		//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		kha.audio2.ogg.tools.Crc32.table = ((int[]) (this1) );
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
			int _g = 0;
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
			while (( _g < 256 ))
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
				int i = _g++;
				//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
				int s = ((int) (( ((int) (i) ) << ((int) (24) ) )) );
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
					int _g1 = 0;
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
					while (( _g1 < 8 ))
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						int j = _g1++;
						//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						int s1 = 0;
						//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						int b = ((int) (( ((int) (1) ) << 31 )) );
						//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						boolean aNeg = ( ((int) (s) ) < 0 );
						//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						boolean bNeg = ( ((int) (b) ) < 0 );
						//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						if (( (( aNeg != bNeg )) ? (aNeg) : (( ((int) (s) ) >= ((int) (b) ) )) )) 
						{
							//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
							s1 = 79764919;
						}
						else
						{
							//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
							s1 = 0;
						}
						
						//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
						s = ((int) (( ((int) (( ((int) (s) ) << 1 )) ) ^ ((int) (s1) ) )) );
					}
					
				}
				
				//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
				((int[]) (kha.audio2.ogg.tools.Crc32.table) )[i] = s;
			}
			
		}
		
	}
	
	
	public static int update(int crc, int _byte)
	{
		//line 30 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/tools/Crc32.hx"
		return ( ((int) (( ((int) (crc) ) << 8 )) ) ^ ((int) (((int[]) (kha.audio2.ogg.tools.Crc32.table) )[((int) (( ((int) (_byte) ) ^ ((int) (( ((int) (crc) ) >>> 24 )) ) )) )]) ) );
	}
	
	
}


