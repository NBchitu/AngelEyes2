package com.google.android.gms.analytics;

public class ae
{
  private static GoogleAnalytics a;
  private static volatile boolean b = false;
  private static Logger c;
  
  static Logger a()
  {
    try
    {
      if (b)
      {
        if (c == null) {
          c = new p();
        }
        Logger localLogger2 = c;
        return localLogger2;
      }
      if (a == null) {
        a = GoogleAnalytics.a();
      }
      if (a != null)
      {
        Logger localLogger1 = a.b();
        return localLogger1;
      }
    }
    finally {}
    return null;
  }
  
  public static void a(String paramString)
  {
    Logger localLogger = a();
    if (localLogger != null) {
      localLogger.b(paramString);
    }
  }
  
  public static void b(String paramString)
  {
    Logger localLogger = a();
    if (localLogger != null) {
      localLogger.a(paramString);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.ae
 * JD-Core Version:    0.7.0.1
 */