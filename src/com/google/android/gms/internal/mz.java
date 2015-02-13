package com.google.android.gms.internal;

import android.content.Context;

public class mz
{
  private final Context a;
  private final String b;
  private final np<ni> c;
  private final String d;
  private na e;
  
  private mz(Context paramContext, String paramString1, String paramString2, np<ni> paramnp)
  {
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramnp;
    this.e = null;
    this.d = paramString2;
  }
  
  public static mz a(Context paramContext, String paramString1, String paramString2, np<ni> paramnp)
  {
    return new mz(paramContext, paramString1, paramString2, paramnp);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mz
 * JD-Core Version:    0.7.0.1
 */