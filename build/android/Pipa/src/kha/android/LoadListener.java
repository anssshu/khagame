// Generated by Haxe 3.4.2
package kha.android;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LoadListener extends haxe.lang.HxObject implements android.media.SoundPool.OnLoadCompleteListener
{
	public LoadListener(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LoadListener(java.util.concurrent.locks.ReentrantLock lock, java.util.concurrent.locks.Condition condition)
	{
		//line 24 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		kha.android.LoadListener.__hx_ctor_kha_android_LoadListener(this, lock, condition);
	}
	
	
	public static void __hx_ctor_kha_android_LoadListener(kha.android.LoadListener __hx_this, java.util.concurrent.locks.ReentrantLock lock, java.util.concurrent.locks.Condition condition)
	{
		//line 25 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		__hx_this.lock = lock;
		//line 26 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		__hx_this.condition = condition;
	}
	
	
	public java.util.concurrent.locks.ReentrantLock lock;
	
	public java.util.concurrent.locks.Condition condition;
	
	public int status;
	
	public void onLoadComplete(android.media.SoundPool soundPool, int soundId, int status)
	{
		//line 30 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		this.lock.lock();
		//line 31 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		this.status = status;
		//line 32 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		this.condition.signal();
		//line 33 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		this.lock.unlock();
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			switch (field.hashCode())
			{
				case -892481550:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("status")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						this.status = ((int) (value) );
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return value;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
			}
			
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			switch (field.hashCode())
			{
				case -892481550:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("status")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						this.status = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return value;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
				case 3327275:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("lock")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						this.lock = ((java.util.concurrent.locks.ReentrantLock) (value) );
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return value;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
				case -861311717:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("condition")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						this.condition = ((java.util.concurrent.locks.Condition) (value) );
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return value;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
			}
			
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			switch (field.hashCode())
			{
				case -1643339842:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("onLoadComplete")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onLoadComplete")) );
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
				case 3327275:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("lock")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return this.lock;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
				case -892481550:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("status")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return this.status;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
				case -861311717:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("condition")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return this.condition;
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
			}
			
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			switch (field.hashCode())
			{
				case -892481550:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("status")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						return ((double) (this.status) );
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
			}
			
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		{
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			switch (field.hashCode())
			{
				case -1643339842:
				{
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					if (field.equals("onLoadComplete")) 
					{
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						__temp_executeDef1 = false;
						//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
						this.onLoadComplete(((android.media.SoundPool) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
					break;
				}
				
				
			}
			
			//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		baseArr.push("status");
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		baseArr.push("condition");
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		baseArr.push("lock");
		//line 19 "/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Backends/Android/kha/android/Sound.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


