// Generated by Haxe 3.4.2
package kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FrameTask extends haxe.lang.HxObject
{
	public FrameTask(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FrameTask(haxe.lang.Function task, int priority, int id)
	{
		//line 28 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		kha.FrameTask.__hx_ctor_kha_FrameTask(this, task, priority, id);
	}
	
	
	public static void __hx_ctor_kha_FrameTask(kha.FrameTask __hx_this, haxe.lang.Function task, int priority, int id)
	{
		//line 29 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		__hx_this.task = task;
		//line 30 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		__hx_this.priority = priority;
		//line 31 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		__hx_this.id = id;
		//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		__hx_this.active = true;
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		__hx_this.paused = false;
	}
	
	
	public haxe.lang.Function task;
	
	public int priority;
	
	public int id;
	
	public boolean active;
	
	public boolean paused;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		{
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			boolean __temp_executeDef1 = true;
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			switch (field.hashCode())
			{
				case 3355:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("id")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.id = ((int) (value) );
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case -1165461084:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("priority")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.priority = ((int) (value) );
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
			}
			
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			if (__temp_executeDef1) 
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		{
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			boolean __temp_executeDef1 = true;
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			switch (field.hashCode())
			{
				case -995321554:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("paused")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.paused = haxe.lang.Runtime.toBool(value);
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case 3552645:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("task")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.task = ((haxe.lang.Function) (value) );
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case -1422950650:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("active")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.active = haxe.lang.Runtime.toBool(value);
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case -1165461084:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("priority")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.priority = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case 3355:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("id")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						this.id = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return value;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
			}
			
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			if (__temp_executeDef1) 
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		{
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			boolean __temp_executeDef1 = true;
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			switch (field.hashCode())
			{
				case -995321554:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("paused")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return this.paused;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case 3552645:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("task")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return this.task;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case -1422950650:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("active")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return this.active;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case -1165461084:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("priority")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return this.priority;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case 3355:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("id")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return this.id;
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
			}
			
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			if (__temp_executeDef1) 
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		{
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			boolean __temp_executeDef1 = true;
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			switch (field.hashCode())
			{
				case 3355:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("id")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return ((double) (this.id) );
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
				case -1165461084:
				{
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					if (field.equals("priority")) 
					{
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						__temp_executeDef1 = false;
						//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
						return ((double) (this.priority) );
					}
					
					//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
					break;
				}
				
				
			}
			
			//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
			if (__temp_executeDef1) 
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		baseArr.push("paused");
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		baseArr.push("active");
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		baseArr.push("id");
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		baseArr.push("priority");
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		baseArr.push("task");
		//line 21 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Sources/kha/Scheduler.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


