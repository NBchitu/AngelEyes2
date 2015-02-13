package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

class ParameterLoaderImpl
  implements ParameterLoader
{
  private final Context a;
  private String b;
  
  public ParameterLoaderImpl(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException("Context cannot be null");
    }
    this.a = paramContext.getApplicationContext();
  }
  
  private int a(String paramString1, String paramString2)
  {
    if (this.a == null) {
      return 0;
    }
    if (this.b != null) {}
    for (String str = this.b;; str = this.a.getPackageName()) {
      return this.a.getResources().getIdentifier(paramString1, paramString2, str);
    }
  }
  
  public int a(String paramString, int paramInt)
  {
    int i = a(paramString, "integer");
    if (i == 0) {
      return paramInt;
    }
    try
    {
      int j = Integer.parseInt(this.a.getString(i));
      return j;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Log.d("NumberFormatException parsing " + this.a.getString(i));
    }
    return paramInt;
  }
  
  public String a(String paramString)
  {
    int i = a(paramString, "string");
    if (i == 0) {
      return null;
    }
    return this.a.getString(i);
  }
  
  public Double b(String paramString)
  {
    String str = a(paramString);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    try
    {
      Double localDouble = Double.valueOf(Double.parseDouble(str));
      return localDouble;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Log.d("NumberFormatException parsing " + str);
    }
    return null;
  }
  
  public boolean c(String paramString)
  {
    int i = a(paramString, "bool");
    if (i == 0) {
      return false;
    }
    return "true".equalsIgnoreCase(this.a.getString(i));
  }
  
  public void d(String paramString)
  {
    this.b = paramString;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.ParameterLoaderImpl
 * JD-Core Version:    0.7.0.1
 */