// Generated by Haxe 3.4.2
package kha.audio2.ogg.vorbis._VorbisDecodeState;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FindPageResult extends haxe.lang.ParamEnum
{
	public FindPageResult(int index, java.lang.Object[] params)
	{
		//line 99 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Tools/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Found", "NotFound"};
	
	public static kha.audio2.ogg.vorbis._VorbisDecodeState.FindPageResult Found(int end, boolean last)
	{
		//line 854 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/VorbisDecodeState.hx"
		return new kha.audio2.ogg.vorbis._VorbisDecodeState.FindPageResult(0, new java.lang.Object[]{end, last});
	}
	
	
	public static final kha.audio2.ogg.vorbis._VorbisDecodeState.FindPageResult NotFound = new kha.audio2.ogg.vorbis._VorbisDecodeState.FindPageResult(1, null);
	
	@Override public java.lang.String getTag()
	{
		//line 853 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/audio2/ogg/vorbis/VorbisDecodeState.hx"
		return kha.audio2.ogg.vorbis._VorbisDecodeState.FindPageResult.__hx_constructs[this.index];
	}
	
	
}


