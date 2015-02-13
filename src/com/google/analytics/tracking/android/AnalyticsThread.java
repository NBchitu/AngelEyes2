package com.google.analytics.tracking.android;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

abstract interface AnalyticsThread
{
  public abstract void a();
  
  public abstract void a(Map<String, String> paramMap);
  
  public abstract void b();
  
  public abstract LinkedBlockingQueue<Runnable> c();
  
  public abstract Thread d();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.AnalyticsThread
 * JD-Core Version:    0.7.0.1
 */