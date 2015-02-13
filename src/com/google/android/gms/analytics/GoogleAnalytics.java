package com.google.android.gms.analytics;

public class GoogleAnalytics
  extends TrackerHandler
{
  private static GoogleAnalytics b;
  private Logger a;
  
  static GoogleAnalytics a()
  {
    try
    {
      GoogleAnalytics localGoogleAnalytics = b;
      return localGoogleAnalytics;
    }
    finally {}
  }
  
  public Logger b()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.GoogleAnalytics
 * JD-Core Version:    0.7.0.1
 */