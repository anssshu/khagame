// Generated by Haxe 3.4.2
package kha._Color;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Color_Impl_
{
	static
	{
		//line 13 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Black = ((int) (-16777216) );
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.White = ((int) (-1) );
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Red = ((int) (-65536) );
		//line 16 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Blue = ((int) (-16776961) );
		//line 17 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Green = ((int) (-16711936) );
		//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Magenta = ((int) (-65281) );
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Yellow = ((int) (-256) );
		//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Cyan = ((int) (-16711681) );
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Purple = ((int) (-8388480) );
		//line 22 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Pink = ((int) (-16181) );
		//line 23 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Orange = ((int) (-23296) );
		//line 25 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.Transparent = ((int) (0) );
		//line 27 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		kha._Color.Color_Impl_.invMaxChannelValue = 0.00392156862745098;
	}
	
	public static int Black;
	
	public static int White;
	
	public static int Red;
	
	public static int Blue;
	
	public static int Green;
	
	public static int Magenta;
	
	public static int Yellow;
	
	public static int Cyan;
	
	public static int Purple;
	
	public static int Pink;
	
	public static int Orange;
	
	public static int Transparent;
	
	public static double invMaxChannelValue;
	
	public static int fromValue(int value)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return kha._Color.Color_Impl_._new(value);
	}
	
	
	public static int fromBytes(int r, int g, int b, java.lang.Object a)
	{
		//line 40 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		int __temp_a1 = ( (haxe.lang.Runtime.eq(a, null)) ? (255) : (((int) (haxe.lang.Runtime.toInt(a)) )) );
		//line 40 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return kha._Color.Color_Impl_._new(( ( ( ( __temp_a1 << 24 ) | ( r << 16 ) ) | ( g << 8 ) ) | b ));
	}
	
	
	public static int fromFloats(double r, double g, double b, java.lang.Object a)
	{
		//line 47 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		double __temp_a2 = ( (haxe.lang.Runtime.eq(a, null)) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(a)) )) );
		//line 47 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return kha._Color.Color_Impl_._new(( ( ( ( ((int) (( __temp_a2 * 255 )) ) << 24 ) | ( ((int) (( r * 255 )) ) << 16 ) ) | ( ((int) (( g * 255 )) ) << 8 ) ) | ((int) (( b * 255 )) ) ));
	}
	
	
	public static int fromString(java.lang.String value)
	{
		//line 54 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		if (( (( ( value.length() == 7 ) || ( value.length() == 9 ) )) && ( (( (( 0 < value.length() )) ? (((int) (value.charAt(0)) )) : (-1) )) == 35 ) )) 
		{
			//line 55 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
			java.lang.Object colorValue = haxe.root.Std.parseInt(( "0x" + haxe.lang.StringExt.substr(value, 1, null) ));
			//line 56 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
			if (( value.length() == 7 )) 
			{
				//line 57 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
				colorValue = ((java.lang.Object) (haxe.lang.Runtime.plus(colorValue, -16777216)) );
			}
			
			//line 59 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
			return kha._Color.Color_Impl_._new(((int) (haxe.lang.Runtime.toInt(colorValue)) ));
		}
		else
		{
			//line 62 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
			throw haxe.lang.HaxeException.wrap(( ( "Invalid Color string: \'" + value ) + "\'" ));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int _new(int value)
	{
		//line 99 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		int this1 = value;
		//line 99 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ((int) (this1) );
	}
	
	
	
	
	public static int get_value(int this1)
	{
		//line 109 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return this1;
	}
	
	
	public static int set_value(int this1, int value)
	{
		//line 113 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = value;
		//line 114 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return this1;
	}
	
	
	public static int get_Rb(int this1)
	{
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( (( this1 & 16711680 )) >>> 16 );
	}
	
	
	public static int get_Gb(int this1)
	{
		//line 122 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( (( this1 & 65280 )) >>> 8 );
	}
	
	
	public static int get_Bb(int this1)
	{
		//line 126 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( this1 & 255 );
	}
	
	
	public static int get_Ab(int this1)
	{
		//line 130 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( this1 >>> 24 );
	}
	
	
	public static int set_Rb(int this1, int i)
	{
		//line 134 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ( ((int) (this1) ) >>> 24 ) << 24 ) | ( i << 16 ) ) | ( ( (( ((int) (this1) ) & 65280 )) >>> 8 ) << 8 ) ) | ( ((int) (this1) ) & 255 ) );
		//line 135 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return i;
	}
	
	
	public static int set_Gb(int this1, int i)
	{
		//line 139 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ( ((int) (this1) ) >>> 24 ) << 24 ) | ( ( (( ((int) (this1) ) & 16711680 )) >>> 16 ) << 16 ) ) | ( i << 8 ) ) | ( ((int) (this1) ) & 255 ) );
		//line 140 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return i;
	}
	
	
	public static int set_Bb(int this1, int i)
	{
		//line 144 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ( ((int) (this1) ) >>> 24 ) << 24 ) | ( ( (( ((int) (this1) ) & 16711680 )) >>> 16 ) << 16 ) ) | ( ( (( ((int) (this1) ) & 65280 )) >>> 8 ) << 8 ) ) | i );
		//line 145 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return i;
	}
	
	
	public static int set_Ab(int this1, int i)
	{
		//line 149 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( i << 24 ) | ( ( (( ((int) (this1) ) & 16711680 )) >>> 16 ) << 16 ) ) | ( ( (( ((int) (this1) ) & 65280 )) >>> 8 ) << 8 ) ) | ( ((int) (this1) ) & 255 ) );
		//line 150 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return i;
	}
	
	
	public static double get_R(int this1)
	{
		//line 154 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( (( (( ((int) (this1) ) & 16711680 )) >>> 16 )) * 0.00392156862745098 );
	}
	
	
	public static double get_G(int this1)
	{
		//line 158 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( (( (( ((int) (this1) ) & 65280 )) >>> 8 )) * 0.00392156862745098 );
	}
	
	
	public static double get_B(int this1)
	{
		//line 162 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( (( ((int) (this1) ) & 255 )) * 0.00392156862745098 );
	}
	
	
	public static double get_A(int this1)
	{
		//line 166 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return ( (( ((int) (this1) ) >>> 24 )) * 0.00392156862745098 );
	}
	
	
	public static double set_R(int this1, double f)
	{
		//line 170 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ((int) (( ( (( ((int) (this1) ) >>> 24 )) * 0.00392156862745098 ) * 255 )) ) << 24 ) | ( ((int) (( f * 255 )) ) << 16 ) ) | ( ((int) (( ( (( (( ((int) (this1) ) & 65280 )) >>> 8 )) * 0.00392156862745098 ) * 255 )) ) << 8 ) ) | ((int) (( ( (( ((int) (this1) ) & 255 )) * 0.00392156862745098 ) * 255 )) ) );
		//line 171 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return f;
	}
	
	
	public static double set_G(int this1, double f)
	{
		//line 175 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ((int) (( ( (( ((int) (this1) ) >>> 24 )) * 0.00392156862745098 ) * 255 )) ) << 24 ) | ( ((int) (( ( (( (( ((int) (this1) ) & 16711680 )) >>> 16 )) * 0.00392156862745098 ) * 255 )) ) << 16 ) ) | ( ((int) (( f * 255 )) ) << 8 ) ) | ((int) (( ( (( ((int) (this1) ) & 255 )) * 0.00392156862745098 ) * 255 )) ) );
		//line 176 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return f;
	}
	
	
	public static double set_B(int this1, double f)
	{
		//line 180 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ((int) (( ( (( ((int) (this1) ) >>> 24 )) * 0.00392156862745098 ) * 255 )) ) << 24 ) | ( ((int) (( ( (( (( ((int) (this1) ) & 16711680 )) >>> 16 )) * 0.00392156862745098 ) * 255 )) ) << 16 ) ) | ( ((int) (( ( (( (( ((int) (this1) ) & 65280 )) >>> 8 )) * 0.00392156862745098 ) * 255 )) ) << 8 ) ) | ((int) (( f * 255 )) ) );
		//line 181 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return f;
	}
	
	
	public static double set_A(int this1, double f)
	{
		//line 185 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		this1 = ( ( ( ( ((int) (( f * 255 )) ) << 24 ) | ( ((int) (( ( (( (( ((int) (this1) ) & 16711680 )) >>> 16 )) * 0.00392156862745098 ) * 255 )) ) << 16 ) ) | ( ((int) (( ( (( (( ((int) (this1) ) & 65280 )) >>> 8 )) * 0.00392156862745098 ) * 255 )) ) << 8 ) ) | ((int) (( ( (( ((int) (this1) ) & 255 )) * 0.00392156862745098 ) * 255 )) ) );
		//line 186 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Color.hx"
		return f;
	}
	
	
}


