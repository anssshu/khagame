// Generated by Haxe 3.4.2
package kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Video extends haxe.lang.HxObject implements kha.Resource
{
	public Video(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Video()
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		kha.Video.__hx_ctor_kha_Video(this);
	}
	
	
	public static void __hx_ctor_kha_Video(kha.Video __hx_this)
	{
	}
	
	
	public int width()
	{
		//line 11 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return 100;
	}
	
	
	public int height()
	{
		//line 18 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return 100;
	}
	
	
	public void play(java.lang.Object loop)
	{
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		boolean __temp_loop24 = ( (haxe.lang.Runtime.eq(loop, null)) ? (false) : (haxe.lang.Runtime.toBool(loop)) );
	}
	
	
	public void pause()
	{
	}
	
	
	public void stop()
	{
	}
	
	
	public int getLength()
	{
		//line 55 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return 0;
	}
	
	
	public int getCurrentPos()
	{
		//line 63 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return 0;
	}
	
	
	
	
	public int get_position()
	{
		//line 69 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return 0;
	}
	
	
	public int set_position(int value)
	{
		//line 73 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return 0;
	}
	
	
	public double getVolume()
	{
		//line 80 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return ((double) (1) );
	}
	
	
	public void setVolume(double volume)
	{
	}
	
	
	public boolean isFinished()
	{
		//line 96 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return ( this.getCurrentPos() >= this.getLength() );
	}
	
	
	public void unload()
	{
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		{
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.set_position(((int) (value) ));
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return value;
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		{
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.set_position(((int) (haxe.lang.Runtime.toInt(value)) ));
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return value;
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		{
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			switch (field.hashCode())
			{
				case -840442113:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("unload")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unload")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("width")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "width")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1466931268:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("isFinished")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFinished")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("height")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "height")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 670514716:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("setVolume")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setVolume")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 3443508:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("play")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "play")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 885131792:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("getVolume")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getVolume")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 106440182:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("pause")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pause")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 373742694:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("set_position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_position")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("stop")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1175249934:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("get_position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_position")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 589651420:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("getLength")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLength")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 747804969:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.get_position();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1386736111:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("getCurrentPos")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getCurrentPos")) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		{
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			switch (field.hashCode())
			{
				case 747804969:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return ((double) (this.get_position()) );
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		{
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			switch (field.hashCode())
			{
				case -840442113:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("unload")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.unload();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("width")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.width();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1466931268:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("isFinished")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.isFinished();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("height")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.height();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 670514716:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("setVolume")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.setVolume(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 3443508:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("play")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.play(dynargs.__get(0));
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 885131792:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("getVolume")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.getVolume();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 106440182:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("pause")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.pause();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 373742694:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("set_position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.set_position(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("stop")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						this.stop();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1175249934:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("get_position")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.get_position();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case 589651420:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("getLength")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.getLength();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
				case -1386736111:
				{
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					if (field.equals("getCurrentPos")) 
					{
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						__temp_executeDef1 = false;
						//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
						return this.getCurrentPos();
					}
					
					//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		baseArr.push("position");
		//line 6 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Video.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


