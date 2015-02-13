package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;

class TrackerProvider
{
  private GoogleAnalytics a;
  private Context b;
  
  TrackerProvider(Context paramContext)
  {
    this.b = paramContext;
  }
  
  private void a()
  {
    try
    {
      if (this.a == null)
      {
        this.a = GoogleAnalytics.a(this.b);
        this.a.a(new TrackerProvider.LoggerImpl());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public Tracker a(String paramString)
  {
    a();
    return this.a.a(paramString);
  }
  
  public void a(Tracker paramTracker)
  {
    this.a.b(paramTracker.b());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.TrackerProvider
 * JD-Core Version:    0.7.0.1
 */