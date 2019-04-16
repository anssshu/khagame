// Generated by Haxe 3.4.2
package components;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class GamepadController extends haxe.lang.HxObject
{
	public GamepadController(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public GamepadController()
	{
		//line 14 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		components.GamepadController.__hx_ctor_components_GamepadController(this);
	}
	
	
	public static void __hx_ctor_components_GamepadController(components.GamepadController __hx_this)
	{
		//line 12 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		__hx_this.a = false;
		//line 11 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		__hx_this.down = false;
		//line 10 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		__hx_this.up = false;
		//line 9 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		__hx_this.right = false;
		//line 8 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		__hx_this.left = false;
		//line 7 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		__hx_this.buttonPressed = true;
		//line 16 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		kha.input.Gamepad.get(0).notify(((haxe.lang.Function) (new haxe.lang.Closure(__hx_this, "onGamepadAxis")) ), ((haxe.lang.Function) (new haxe.lang.Closure(__hx_this, "onGamepadButton")) ));
	}
	
	
	public boolean buttonPressed;
	
	public boolean left;
	
	public boolean right;
	
	public boolean up;
	
	public boolean down;
	
	public boolean a;
	
	public void onGamepadAxis(int axis, double value)
	{
		//line 24 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( axis == 0 )) 
		{
			//line 25 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( value < -0.5 )) 
			{
				//line 26 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "LEFT LEFT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (26) )) )}));
				//line 27 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				this.left = true;
			}
			else
			{
				//line 28 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				if (( value > 0.5 )) 
				{
					//line 29 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					haxe.Log.trace.__hx_invoke2_o(0.0, "RIGHT LEFT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (29) )) )}));
					//line 30 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					this.right = true;
				}
				else
				{
					//line 34 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					this.right = false;
					//line 35 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					this.left = false;
				}
				
			}
			
		}
		
		//line 39 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( axis == 1 )) 
		{
			//line 40 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( value > 0.5 )) 
			{
				//line 41 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				this.up = true;
				//line 42 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "UP LEFT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (42) )) )}));
			}
			else
			{
				//line 43 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				if (( value < -0.5 )) 
				{
					//line 44 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					haxe.Log.trace.__hx_invoke2_o(0.0, "DOWN LEFT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (44) )) )}));
					//line 45 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					this.down = true;
				}
				else
				{
					//line 49 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					this.up = false;
					//line 50 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					this.down = false;
				}
				
			}
			
		}
		
		//line 54 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( axis == 2 )) 
		{
			//line 55 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( value > 0.5 )) 
			{
				//line 56 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "RIGHT RIGHT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (56) )) )}));
			}
			else
			{
				//line 57 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				if (( value < -0.5 )) 
				{
					//line 58 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					haxe.Log.trace.__hx_invoke2_o(0.0, "LEFT RIGHT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (58) )) )}));
				}
				
			}
			
			//line 60 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean tmp = ( value == 0 );
		}
		
		//line 65 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( axis == 3 )) 
		{
			//line 66 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( value < -0.5 )) 
			{
				//line 67 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "DOWN RIGHT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (67) )) )}));
			}
			else
			{
				//line 68 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				if (( value > 0.5 )) 
				{
					//line 69 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					haxe.Log.trace.__hx_invoke2_o(0.0, "UP RIGHT ANALOG", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (69) )) )}));
				}
				
			}
			
			//line 71 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean tmp1 = ( value == 0 );
		}
		
		//line 76 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( axis == 4 )) 
		{
			//line 78 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( value < -0.5 )) 
			{
				//line 79 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "LEFT TRIGGER", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (79) )) )}));
			}
			
			//line 81 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean tmp2 = ( value == 0 );
		}
		
		//line 86 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( axis == 5 )) 
		{
			//line 88 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( value < -0.5 )) 
			{
				//line 89 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "RIGHT TRIGGER", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadAxis"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (89) )) )}));
			}
			
			//line 90 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean tmp3 = ( value == 0 );
		}
		
	}
	
	
	public void onGamepadButton(int button, double value)
	{
		//line 98 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		this.buttonPressed =  ! (this.buttonPressed) ;
		//line 101 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		if (( button == 0 )) 
		{
			//line 102 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			haxe.Log.trace.__hx_invoke2_o(0.0, "A", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (102) )) )}));
			//line 103 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			this.a =  ! (this.a) ;
		}
		else
		{
			//line 105 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (( button == 1 )) 
			{
				//line 106 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "B", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (106) )) )}));
			}
			else
			{
				//line 108 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				if (( button == 2 )) 
				{
					//line 109 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					haxe.Log.trace.__hx_invoke2_o(0.0, "X", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (109) )) )}));
				}
				else
				{
					//line 111 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (( button == 3 )) 
					{
						//line 112 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						haxe.Log.trace.__hx_invoke2_o(0.0, "Y", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (112) )) )}));
					}
					else
					{
						//line 115 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						if (( button == 4 )) 
						{
							//line 116 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
							haxe.Log.trace.__hx_invoke2_o(0.0, "LEFT BUMPER", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (116) )) )}));
						}
						else
						{
							//line 118 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
							if (( button == 5 )) 
							{
								//line 119 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
								haxe.Log.trace.__hx_invoke2_o(0.0, "RIGHT BUMPER", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (119) )) )}));
							}
							else
							{
								//line 122 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
								if (( button == 6 )) 
								{
									//line 123 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
									haxe.Log.trace.__hx_invoke2_o(0.0, "LEFT ANALOG PRESS", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (123) )) )}));
								}
								else
								{
									//line 125 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
									if (( button == 7 )) 
									{
										//line 126 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
										haxe.Log.trace.__hx_invoke2_o(0.0, "RIGHT ANALOG PRESS", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (126) )) )}));
									}
									else
									{
										//line 129 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
										if (( button == 8 )) 
										{
											//line 130 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
											haxe.Log.trace.__hx_invoke2_o(0.0, "START", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (130) )) )}));
										}
										else
										{
											//line 132 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
											if (( button == 9 )) 
											{
												//line 133 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
												haxe.Log.trace.__hx_invoke2_o(0.0, "BACK", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (133) )) )}));
											}
											else
											{
												//line 135 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
												if (( button == 10 )) 
												{
													//line 136 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
													haxe.Log.trace.__hx_invoke2_o(0.0, "HOME", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (136) )) )}));
												}
												else
												{
													//line 139 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
													if (( button == 15 )) 
													{
														//line 141 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
														if (this.buttonPressed) 
														{
															//line 142 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
															haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD right pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (142) )) )}));
														}
														else
														{
															//line 146 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
															haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD right released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (146) )) )}));
														}
														
													}
													else
													{
														//line 150 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
														if (( button == 12 )) 
														{
															//line 152 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
															if (this.buttonPressed) 
															{
																//line 154 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD up pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (154) )) )}));
															}
															
														}
														else
														{
															//line 161 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
															if (( button == 13 )) 
															{
																//line 163 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																if (this.buttonPressed) 
																{
																	//line 164 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																	haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD down pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (164) )) )}));
																}
																else
																{
																	//line 168 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																	haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD down released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (168) )) )}));
																}
																
															}
															else
															{
																//line 172 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																if (( button == 14 )) 
																{
																	//line 174 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																	if (this.buttonPressed) 
																	{
																		//line 175 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																		haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD left pressed", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (175) )) )}));
																	}
																	else
																	{
																		//line 179 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
																		haxe.Log.trace.__hx_invoke2_o(0.0, "DPAD left released", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"components.GamepadController", "GamepadController.hx", "onGamepadButton"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (179) )) )}));
																	}
																	
																}
																
															}
															
														}
														
													}
													
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		{
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			switch (field.hashCode())
			{
				case 97:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("a")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.a = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 938410128:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("buttonPressed")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.buttonPressed = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 3089570:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("down")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.down = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 3317767:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("left")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.left = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 3739:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("up")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.up = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 108511772:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("right")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.right = haxe.lang.Runtime.toBool(value);
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return value;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		{
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			switch (field.hashCode())
			{
				case 904442452:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("onGamepadButton")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onGamepadButton")) );
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 938410128:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("buttonPressed")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return this.buttonPressed;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case -2126458045:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("onGamepadAxis")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onGamepadAxis")) );
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 3317767:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("left")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return this.left;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 97:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("a")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return this.a;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 108511772:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("right")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return this.right;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 3089570:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("down")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return this.down;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case 3739:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("up")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						return this.up;
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		{
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			switch (field.hashCode())
			{
				case 904442452:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("onGamepadButton")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.onGamepadButton(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
				case -2126458045:
				{
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					if (field.equals("onGamepadAxis")) 
					{
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						__temp_executeDef1 = false;
						//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
						this.onGamepadAxis(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
					break;
				}
				
				
			}
			
			//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		baseArr.push("a");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		baseArr.push("down");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		baseArr.push("up");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		baseArr.push("right");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		baseArr.push("left");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		baseArr.push("buttonPressed");
		//line 6 "/Volumes/fukanKhaDev/KhaProjects/game/Sources/components/GamepadController.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


