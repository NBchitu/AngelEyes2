package com.google.analytics.tracking.android;

import android.util.Log;

class DefaultLoggerImpl
  implements Logger
{
  private Logger.LogLevel a = Logger.LogLevel.b;
  
  private String e(String paramString)
  {
    return Thread.currentThread().toString() + ": " + paramString;
  }
  
  public Logger.LogLevel a()
  {
    return this.a;
  }
  
  public void a(Logger.LogLevel paramLogLevel)
  {
    this.a = paramLogLevel;
  }
  
  public void a(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.a.ordinal()) {
      Log.v("GAV3", e(paramString));
    }
  }
  
  public void b(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.b.ordinal()) {
      Log.i("GAV3", e(paramString));
    }
  }
  
  public void c(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.c.ordinal()) {
      Log.w("GAV3", e(paramString));
    }
  }
  
  public void d(String paramString)
  {
    if (this.a.ordinal() <= Logger.LogLevel.d.ordinal()) {
      Log.e("GAV3", e(paramString));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.DefaultLoggerImpl
 * JD-Core Version:    0.7.0.1
 */