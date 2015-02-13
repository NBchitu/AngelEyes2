package com.google.analytics.tracking.android;

public final class Fields
{
  public static String a(int paramInt)
  {
    return a("&cd", paramInt);
  }
  
  private static String a(String paramString, int paramInt)
  {
    if (paramInt < 1)
    {
      Log.a("index out of range for " + paramString + " (" + paramInt + ")");
      return "";
    }
    return paramString + paramInt;
  }
  
  public static String b(int paramInt)
  {
    return a("&cm", paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.Fields
 * JD-Core Version:    0.7.0.1
 */