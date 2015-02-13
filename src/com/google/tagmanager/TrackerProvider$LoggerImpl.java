package com.google.tagmanager;

import com.google.analytics.tracking.android.Logger;

class TrackerProvider$LoggerImpl
  implements Logger
{
  private static com.google.analytics.tracking.android.Logger.LogLevel a(Logger.LogLevel paramLogLevel)
  {
    switch (TrackerProvider.1.a[paramLogLevel.ordinal()])
    {
    default: 
      return com.google.analytics.tracking.android.Logger.LogLevel.d;
    case 1: 
    case 2: 
      return com.google.analytics.tracking.android.Logger.LogLevel.d;
    case 3: 
      return com.google.analytics.tracking.android.Logger.LogLevel.c;
    case 4: 
    case 5: 
      return com.google.analytics.tracking.android.Logger.LogLevel.b;
    }
    return com.google.analytics.tracking.android.Logger.LogLevel.a;
  }
  
  public com.google.analytics.tracking.android.Logger.LogLevel a()
  {
    Logger.LogLevel localLogLevel = Log.a();
    if (localLogLevel == null) {
      return com.google.analytics.tracking.android.Logger.LogLevel.d;
    }
    return a(localLogLevel);
  }
  
  public void a(com.google.analytics.tracking.android.Logger.LogLevel paramLogLevel)
  {
    Log.b("GA uses GTM logger. Please use TagManager.getLogger().setLogLevel(LogLevel) instead.");
  }
  
  public void a(String paramString)
  {
    Log.e(paramString);
  }
  
  public void b(String paramString)
  {
    Log.c(paramString);
  }
  
  public void c(String paramString)
  {
    Log.b(paramString);
  }
  
  public void d(String paramString)
  {
    Log.a(paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.TrackerProvider.LoggerImpl
 * JD-Core Version:    0.7.0.1
 */