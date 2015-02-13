package com.google.analytics.tracking.android;

import com.google.android.gms.analytics.internal.Command;
import java.util.List;
import java.util.Map;

abstract interface ServiceProxy
{
  public abstract void a(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList);
  
  public abstract void c();
  
  public abstract void e();
  
  public abstract void f();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.ServiceProxy
 * JD-Core Version:    0.7.0.1
 */