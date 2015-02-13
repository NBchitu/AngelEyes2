package com.google.android.gms.analytics;

import android.util.Log;

class p
  implements Logger
{
  private int a = 2;
  
  private String c(String paramString)
  {
    return Thread.currentThread().toString() + ": " + paramString;
  }
  
  public void a(String paramString)
  {
    if (this.a <= 0) {
      Log.v("GAV4", c(paramString));
    }
  }
  
  public void b(String paramString)
  {
    if (this.a <= 3) {
      Log.e("GAV4", c(paramString));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.p
 * JD-Core Version:    0.7.0.1
 */