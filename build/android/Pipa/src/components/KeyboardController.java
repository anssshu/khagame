// Generated by Haxe 3.4.2
package components;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class KeyboardController extends haxe.lang.HxObject
{
	public KeyboardController(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public KeyboardController()
	{
		//line 12 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		components.KeyboardController.__hx_ctor_components_KeyboardController(this);
	}
	
	
	public static void __hx_ctor_components_KeyboardController(components.KeyboardController __hx_this)
	{
		//line 10 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		__hx_this.down = false;
		//line 9 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		__hx_this.up = false;
		//line 8 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		__hx_this.right = false;
		//line 7 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		__hx_this.left = false;
		//line 13 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		kha.input.Keyboard.get(null).notify(((haxe.lang.Function) (new haxe.lang.Closure(__hx_this, "onKeyDown")) ), ((haxe.lang.Function) (new haxe.lang.Closure(__hx_this, "onKeyUp")) ), null);
	}
	
	
	public boolean left;
	
	public boolean right;
	
	public boolean up;
	
	public boolean down;
	
	public void onKeyDown(int key)
	{
		//line 18 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		switch (key)
		{
			case 65:
			{
				//line 20 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "left pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyDown"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (20) )) )}));
				//line 21 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.left = true;
				//line 19 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			case 68:
			{
				//line 24 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "right pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyDown"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
				//line 25 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.right = true;
				//line 23 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			case 83:
			{
				//line 32 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "down pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyDown"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (32) )) )}));
				//line 33 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.down = true;
				//line 31 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			case 87:
			{
				//line 28 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "up pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyDown"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (28) )) )}));
				//line 29 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.up = true;
				//line 27 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			default:
			{
				//line 35 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				return ;
			}
			
		}
		
	}
	
	
	public void onKeyUp(int key)
	{
		//line 42 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		switch (key)
		{
			case 65:
			{
				//line 44 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "left  released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyUp"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (44) )) )}));
				//line 45 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.left = false;
				//line 43 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			case 68:
			{
				//line 48 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "right  released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyUp"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (48) )) )}));
				//line 49 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.right = false;
				//line 47 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			case 83:
			{
				//line 56 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "down released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyUp"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (56) )) )}));
				//line 57 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.down = false;
				//line 55 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			case 87:
			{
				//line 52 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "up  released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.KeyboardController", "KeyboardController.hx", "onKeyUp"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (52) )) )}));
				//line 53 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				this.up = false;
				//line 51 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				break;
			}
			
			
			default:
			{
				//line 59 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				return ;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		{
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			switch (field.hashCode())
			{
				case 3089570:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("down")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						this.down = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 3317767:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("left")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						this.left = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 3739:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("up")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						this.up = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 108511772:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("right")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						this.right = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		{
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			switch (field.hashCode())
			{
				case -1344707909:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("onKeyUp")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onKeyUp")) );
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 3317767:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("left")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return this.left;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 520351938:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("onKeyDown")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onKeyDown")) );
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 108511772:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("right")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return this.right;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 3089570:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("down")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return this.down;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 3739:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("up")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						return this.up;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		{
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			switch (field.hashCode())
			{
				case -1344707909:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("onKeyUp")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						this.onKeyUp(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
				case 520351938:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					if (field.equals("onKeyDown")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
						this.onKeyDown(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		baseArr.push("down");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		baseArr.push("up");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		baseArr.push("right");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		baseArr.push("left");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/KeyboardController.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

