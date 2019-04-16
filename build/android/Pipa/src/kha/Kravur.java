// Generated by Haxe 3.4.2
package kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Kravur extends haxe.lang.HxObject implements kha.Font
{
	public Kravur(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Kravur(kha.internal.BytesBlob blob)
	{
		//line 122 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		kha.Kravur.__hx_ctor_kha_Kravur(this, blob);
	}
	
	
	public static void __hx_ctor_kha_Kravur(kha.Kravur __hx_this, kha.internal.BytesBlob blob)
	{
		//line 120 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		__hx_this.images = new haxe.ds.IntMap<kha.KravurImage>();
		//line 123 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		__hx_this.blob = blob;
	}
	
	
	public kha.internal.BytesBlob blob;
	
	public haxe.ds.IntMap<kha.KravurImage> images;
	
	public kha.KravurImage _get(int fontSize, haxe.root.Array<java.lang.Object> glyphs)
	{
		//line 127 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		if ( ! (((haxe.ds.IntMap<kha.KravurImage>) (((haxe.IMap<java.lang.Object, kha.KravurImage>) (this.images) )) ).exists(fontSize)) ) 
		{
			//line 128 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			if (( glyphs == null )) 
			{
				//line 129 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				glyphs = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
				//line 130 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				{
					//line 130 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					int _g = 32;
					//line 130 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					while (( _g < 256 ))
					{
						//line 130 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						int i = _g++;
						//line 131 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						glyphs.push(i);
					}
					
				}
				
			}
			
			//line 135 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			int width = 64;
			//line 136 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			int height = 32;
			//line 137 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.graphics2.truetype.Stbtt_bakedchar[] this1 = new kha.graphics2.truetype.Stbtt_bakedchar[glyphs.length];
			//line 137 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.graphics2.truetype.Stbtt_bakedchar[] baked = ((kha.graphics2.truetype.Stbtt_bakedchar[]) (this1) );
			//line 138 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			{
				//line 138 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				int _g1 = 0;
				//line 138 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				int _g2 = ((kha.graphics2.truetype.Stbtt_bakedchar[]) (baked) ).length;
				//line 138 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				while (( _g1 < _g2 ))
				{
					//line 138 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					int i1 = _g1++;
					//line 139 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					((kha.graphics2.truetype.Stbtt_bakedchar[]) (baked) )[i1] = new kha.graphics2.truetype.Stbtt_bakedchar();
				}
				
			}
			
			//line 142 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.internal.BytesBlob pixels = null;
			//line 144 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			int status = -1;
			//line 145 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			while (( status < 0 ))
			{
				//line 146 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				if (( height < width )) 
				{
					//line 146 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					height *= 2;
				}
				else
				{
					//line 147 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					width *= 2;
				}
				
				//line 148 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				pixels = kha.internal.BytesBlob.alloc(( width * height ));
				//line 149 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				status = kha.graphics2.truetype.StbTruetype.stbtt_BakeFontBitmap(this.blob, 0, ((double) (fontSize) ), pixels, width, height, glyphs, baked);
			}
			
			//line 154 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.graphics2.truetype.Stbtt_fontinfo info = new kha.graphics2.truetype.Stbtt_fontinfo();
			//line 155 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.graphics2.truetype.StbTruetype.stbtt_InitFont(info, this.blob, 0);
			//line 157 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.graphics2.truetype.Stbtt_temp_font_v_metrics metrics = kha.graphics2.truetype.StbTruetype.stbtt_GetFontVMetrics(info);
			//line 158 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			double scale = kha.graphics2.truetype.StbTruetype.stbtt_ScaleForPixelHeight(info, ((double) (fontSize) ));
			//line 159 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			int ascent = ((int) (java.lang.Math.round(( metrics.ascent * scale ))) );
			//line 160 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			int descent = ((int) (java.lang.Math.round(( metrics.descent * scale ))) );
			//line 161 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			int lineGap = ((int) (java.lang.Math.round(( metrics.lineGap * scale ))) );
			//line 163 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			kha.KravurImage image = new kha.KravurImage(((int) (((double) (fontSize) )) ), ascent, descent, lineGap, width, height, baked, pixels);
			//line 164 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			((haxe.ds.IntMap<kha.KravurImage>) (((haxe.IMap<java.lang.Object, kha.KravurImage>) (this.images) )) ).set(fontSize, image);
			//line 165 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			return image;
		}
		
		//line 167 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		return ((kha.KravurImage) (((haxe.ds.IntMap<kha.KravurImage>) (((haxe.IMap<java.lang.Object, kha.KravurImage>) (this.images) )) ).get(fontSize)) );
	}
	
	
	public double height(int fontSize)
	{
		//line 171 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		return this._get(fontSize, null).getHeight();
	}
	
	
	public double width(int fontSize, java.lang.String str)
	{
		//line 175 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		return this._get(fontSize, null).stringWidth(str);
	}
	
	
	public double widthOfCharacters(int fontSize, haxe.root.Array<java.lang.Object> characters, int start, int length)
	{
		//line 179 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		return this._get(fontSize, null).charactersWidth(characters, start, length);
	}
	
	
	public double baseline(int fontSize)
	{
		//line 183 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		return this._get(fontSize, null).getBaselinePosition();
	}
	
	
	public void unload()
	{
		//line 187 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		this.blob = null;
		//line 188 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		this.images = null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		{
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			boolean __temp_executeDef1 = true;
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			switch (field.hashCode())
			{
				case -1185250696:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("images")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						this.images = ((haxe.ds.IntMap<kha.KravurImage>) (value) );
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return value;
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case 3026845:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("blob")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						this.blob = ((kha.internal.BytesBlob) (value) );
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return value;
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
			}
			
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			if (__temp_executeDef1) 
			{
				//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		{
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			boolean __temp_executeDef1 = true;
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			switch (field.hashCode())
			{
				case -840442113:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("unload")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unload")) );
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case 3026845:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("blob")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this.blob;
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -1720785339:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("baseline")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "baseline")) );
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -1185250696:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("images")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this.images;
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -818381689:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("widthOfCharacters")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "widthOfCharacters")) );
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case 2932375:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("_get")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "_get")) );
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("width")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "width")) );
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("height")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "height")) );
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
			}
			
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			if (__temp_executeDef1) 
			{
				//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		{
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			boolean __temp_executeDef1 = true;
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			switch (field.hashCode())
			{
				case -840442113:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("unload")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						this.unload();
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case 2932375:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("_get")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this._get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((haxe.root.Array<java.lang.Object>) (dynargs.__get(1)) ));
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -1720785339:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("baseline")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this.baseline(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("height")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this.height(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case -818381689:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("widthOfCharacters")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this.widthOfCharacters(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((haxe.root.Array<java.lang.Object>) (dynargs.__get(1)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(3))) ));
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					if (field.equals("width")) 
					{
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						__temp_executeDef1 = false;
						//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
						return this.width(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
					break;
				}
				
				
			}
			
			//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
			if (__temp_executeDef1) 
			{
				//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		baseArr.push("images");
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		baseArr.push("blob");
		//line 118 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Kravur.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


