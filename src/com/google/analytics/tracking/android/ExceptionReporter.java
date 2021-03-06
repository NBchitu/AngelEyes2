package com.google.analytics.tracking.android;

import android.content.Context;
import java.util.ArrayList;

public class ExceptionReporter
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final Tracker b;
  private final ServiceManager c;
  private ExceptionParser d;
  
  public ExceptionReporter(Tracker paramTracker, ServiceManager paramServiceManager, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    if (paramTracker == null) {
      throw new NullPointerException("tracker cannot be null");
    }
    if (paramServiceManager == null) {
      throw new NullPointerException("serviceManager cannot be null");
    }
    this.a = paramUncaughtExceptionHandler;
    this.b = paramTracker;
    this.c = paramServiceManager;
    this.d = new StandardExceptionParser(paramContext, new ArrayList());
    StringBuilder localStringBuilder = new StringBuilder().append("ExceptionReporter created, original handler is ");
    if (paramUncaughtExceptionHandler == null) {}
    for (String str = "null";; str = paramUncaughtExceptionHandler.getClass().getName())
    {
      Log.c(str);
      return;
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    String str1 = "UncaughtException";
    if (this.d != null) {
      if (paramThread == null) {
        break label104;
      }
    }
    label104:
    for (String str2 = paramThread.getName();; str2 = null)
    {
      str1 = this.d.a(str2, paramThrowable);
      Log.c("Tracking Exception: " + str1);
      this.b.a(MapBuilder.a(str1, Boolean.valueOf(true)).a());
      this.c.c();
      if (this.a != null)
      {
        Log.c("Passing exception to original handler.");
        this.a.uncaughtException(paramThread, paramThrowable);
      }
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.ExceptionReporter
 * JD-Core Version:    0.7.0.1
 */