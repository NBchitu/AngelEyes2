package com.google.analytics.tracking.android;

import com.google.android.gms.analytics.internal.Command;
import java.util.List;
import java.util.Map;

abstract interface AnalyticsClient
{
  public abstract void a();
  
  public abstract void a(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList);
  
  public abstract void b();
  
  public abstract void c();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.AnalyticsClient
 * JD-Core Version:    0.7.0.1
 */