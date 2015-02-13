package com.google.tagmanager;

import android.util.Log;

class DefaultLogger
  implements Logger
{
  private Logger.LogLevel a = Logger.LogLevel.d;
  
  public Logger.LogLevel a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.e.ordinal()) {
      Log.e("GoogleTagManager", paramString);
    }
  }
  
  public void a(String paramString, Throwable paramThrowable)
  {
    if (this.a.ordinal() <= Logger.LogLevel.e.ordinal()) {
      Log.e("GoogleTagManager", paramString, paramThrowable);
    }
  }
  
  public void b(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.d.ordinal()) {
      Log.w("GoogleTagManager", paramString);
    }
  }
  
  public void b(String paramString, Throwable paramThrowable)
  {
    if (this.a.ordinal() <= Logger.LogLevel.d.ordinal()) {
      Log.w("GoogleTagManager", paramString, paramThrowable);
    }
  }
  
  public void c(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.c.ordinal()) {
      Log.i("GoogleTagManager", paramString);
    }
  }
  
  public void d(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.b.ordinal()) {
      Log.d("GoogleTagManager", paramString);
    }
  }
  
  public void e(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.a.ordinal()) {
      Log.v("GoogleTagManager", paramString);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.DefaultLogger
 * JD-Core Version:    0.7.0.1
 */