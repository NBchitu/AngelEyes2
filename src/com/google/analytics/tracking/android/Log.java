package com.google.analytics.tracking.android;

public class Log
{
  private static GoogleAnalytics a;
  
  public static void a(String paramString)
  {
    Logger localLogger = b();
    if (localLogger != null) {
      localLogger.d(paramString);
    }
  }
  
  public static boolean a()
  {
    if (b() != null) {
      return Logger.LogLevel.a.equals(b().a());
    }
    return false;
  }
  
  private static Logger b()
  {
    if (a == null) {
      a = GoogleAnalytics.a();
    }
    if (a != null) {
      return a.d();
    }
    return null;
  }
  
  public static void b(String paramString)
  {
    Logger localLogger = b();
    if (localLogger != null) {
      localLogger.b(paramString);
    }
  }
  
  public static void c(String paramString)
  {
    Logger localLogger = b();
    if (localLogger != null) {
      localLogger.a(paramString);
    }
  }
  
  public static void d(String paramString)
  {
    Logger localLogger = b();
    if (localLogger != null) {
      localLogger.c(paramString);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.Log
 * JD-Core Version:    0.7.0.1
 */