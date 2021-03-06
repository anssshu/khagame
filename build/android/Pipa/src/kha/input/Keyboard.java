// Generated by Haxe 3.4.2
package kha.input;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Keyboard extends kha.network.Controller
{
	static
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		{
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			java.lang.Object __temp_odecl4 = null;
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			{
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				java.lang.Object __temp_odecl1 = new haxe.lang.DynamicObject(new java.lang.String[]{"input"}, new java.lang.Object[]{null}, new java.lang.String[]{}, new double[]{});
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				java.lang.Object __temp_odecl2 = new haxe.lang.DynamicObject(new java.lang.String[]{"input"}, new java.lang.Object[]{null}, new java.lang.String[]{}, new double[]{});
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				java.lang.Object __temp_odecl3 = new haxe.lang.DynamicObject(new java.lang.String[]{"input"}, new java.lang.Object[]{null}, new java.lang.String[]{}, new double[]{});
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				__temp_odecl4 = new haxe.lang.DynamicObject(new java.lang.String[]{"sendDownEvent", "sendPressEvent", "sendUpEvent"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl3, __temp_odecl2}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			kha.input.Keyboard.__meta__ = new haxe.lang.DynamicObject(new java.lang.String[]{"fields"}, new java.lang.Object[]{__temp_odecl4}, new java.lang.String[]{}, new double[]{});
		}
		
	}
	
	public Keyboard(haxe.lang.EmptyObject empty)
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Keyboard()
	{
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		kha.input.Keyboard.__hx_ctor_kha_input_Keyboard(this);
	}
	
	
	public static void __hx_ctor_kha_input_Keyboard(kha.input.Keyboard __hx_this)
	{
		//line 38 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		kha.network.Controller.__hx_ctor_kha_network_Controller(__hx_this);
		//line 39 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		__hx_this.downListeners = new haxe.root.Array<haxe.lang.Function>(new haxe.lang.Function[]{});
		//line 40 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		__hx_this.upListeners = new haxe.root.Array<haxe.lang.Function>(new haxe.lang.Function[]{});
		//line 41 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		__hx_this.pressListeners = new haxe.root.Array<haxe.lang.Function>(new haxe.lang.Function[]{});
		//line 42 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		kha.input.Keyboard.instance = __hx_this;
	}
	
	
	public static java.lang.Object __meta__;
	
	public static kha.input.Keyboard get(java.lang.Object num)
	{
		//line 9 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		int __temp_num33 = ( (haxe.lang.Runtime.eq(num, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(num)) )) );
		//line 9 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		return kha.SystemImpl.getKeyboard(__temp_num33);
	}
	
	
	public static kha.input.Keyboard instance;
	
	public void notify(haxe.lang.Function downListener, haxe.lang.Function upListener, haxe.lang.Function pressListener)
	{
		//line 13 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		if (( downListener != null )) 
		{
			//line 13 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			this.downListeners.push(downListener);
		}
		
		//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		if (( upListener != null )) 
		{
			//line 14 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			this.upListeners.push(upListener);
		}
		
		//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		if (( pressListener != null )) 
		{
			//line 15 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			this.pressListeners.push(pressListener);
		}
		
	}
	
	
	public void remove(haxe.lang.Function downListener, haxe.lang.Function upListener, haxe.lang.Function pressListener)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		if (( downListener != null )) 
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			this.downListeners.remove(downListener);
		}
		
		//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		if (( upListener != null )) 
		{
			//line 20 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			this.upListeners.remove(upListener);
		}
		
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		if (( pressListener != null )) 
		{
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			this.pressListeners.remove(pressListener);
		}
		
	}
	
	
	public void show()
	{
	}
	
	
	public void hide()
	{
	}
	
	
	public haxe.root.Array<haxe.lang.Function> downListeners;
	
	public haxe.root.Array<haxe.lang.Function> upListeners;
	
	public haxe.root.Array<haxe.lang.Function> pressListeners;
	
	public void sendDownEvent(int code)
	{
		//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		int _g = 0;
		//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		haxe.root.Array<haxe.lang.Function> _g1 = this.downListeners;
		//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		while (( _g < _g1.length ))
		{
			//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			haxe.lang.Function listener = _g1.__get(_g);
			//line 50 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			 ++ _g;
			//line 51 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			listener.__hx_invoke1_o(((double) (code) ), haxe.lang.Runtime.undefined);
		}
		
	}
	
	
	public void sendUpEvent(int code)
	{
		//line 60 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		int _g = 0;
		//line 60 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		haxe.root.Array<haxe.lang.Function> _g1 = this.upListeners;
		//line 60 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		while (( _g < _g1.length ))
		{
			//line 60 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			haxe.lang.Function listener = _g1.__get(_g);
			//line 60 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			 ++ _g;
			//line 61 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			listener.__hx_invoke1_o(((double) (code) ), haxe.lang.Runtime.undefined);
		}
		
	}
	
	
	public void sendPressEvent(java.lang.String _char)
	{
		//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		int _g = 0;
		//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		haxe.root.Array<haxe.lang.Function> _g1 = this.pressListeners;
		//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		while (( _g < _g1.length ))
		{
			//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			haxe.lang.Function listener = _g1.__get(_g);
			//line 67 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			 ++ _g;
			//line 68 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			listener.__hx_invoke1_o(0.0, _char);
		}
		
	}
	
	
	@Override public void _receive(haxe.io.Bytes bytes)
	{
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		{
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			switch (field.hashCode())
			{
				case -553686724:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("pressListeners")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.pressListeners = ((haxe.root.Array<haxe.lang.Function>) (value) );
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return value;
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -572464195:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("downListeners")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.downListeners = ((haxe.root.Array<haxe.lang.Function>) (value) );
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return value;
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 460661220:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("upListeners")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.upListeners = ((haxe.root.Array<haxe.lang.Function>) (value) );
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return value;
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		{
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			switch (field.hashCode())
			{
				case -854451804:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("_receive")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "_receive")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -1039689911:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("notify")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "notify")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -319884865:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("sendPressEvent")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sendPressEvent")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("remove")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -525919209:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("sendUpEvent")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sendUpEvent")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 3529469:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("show")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "show")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 1484078192:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("sendDownEvent")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sendDownEvent")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 3202370:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("hide")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hide")) );
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -553686724:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("pressListeners")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return this.pressListeners;
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -572464195:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("downListeners")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return this.downListeners;
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 460661220:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("upListeners")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return this.upListeners;
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		{
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			switch (field.hashCode())
			{
				case -854451804:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("_receive")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -1039689911:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("notify")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.notify(((haxe.lang.Function) (dynargs.__get(0)) ), ((haxe.lang.Function) (dynargs.__get(1)) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -319884865:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("sendPressEvent")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.sendPressEvent(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("remove")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.remove(((haxe.lang.Function) (dynargs.__get(0)) ), ((haxe.lang.Function) (dynargs.__get(1)) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case -525919209:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("sendUpEvent")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.sendUpEvent(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 3529469:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("show")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.show();
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 1484078192:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("sendDownEvent")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.sendDownEvent(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
				case 3202370:
				{
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					if (field.equals("hide")) 
					{
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						__temp_executeDef1 = false;
						//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
						this.hide();
					}
					
					//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		baseArr.push("pressListeners");
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		baseArr.push("upListeners");
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		baseArr.push("downListeners");
		//line 7 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/input/Keyboard.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


