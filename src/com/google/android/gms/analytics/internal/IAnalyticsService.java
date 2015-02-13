package com.google.android.gms.analytics.internal;

import android.os.IInterface;
import java.util.List;
import java.util.Map;

public abstract interface IAnalyticsService
  extends IInterface
{
  public abstract void a();
  
  public abstract void a(Map paramMap, long paramLong, String paramString, List<Command> paramList);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.IAnalyticsService
 * JD-Core Version:    0.7.0.1
 */