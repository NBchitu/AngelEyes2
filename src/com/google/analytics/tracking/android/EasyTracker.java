package com.google.analytics.tracking.android;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class EasyTracker
  extends Tracker
{
  private static EasyTracker a;
  private static String b;
  private final GoogleAnalytics c;
  private boolean d;
  private boolean e;
  private int f;
  private long g;
  private long h;
  private Context i;
  private final Map<String, String> j;
  private ParameterLoader k;
  private ServiceManager l;
  private Clock m;
  private Timer n;
  private TimerTask o;
  private boolean p;
  private boolean q;
  
  private EasyTracker(Context paramContext)
  {
    this(paramContext, new ParameterLoaderImpl(paramContext), GoogleAnalytics.a(paramContext), GAServiceManager.a(), null);
  }
  
  private EasyTracker(Context paramContext, ParameterLoader paramParameterLoader, GoogleAnalytics paramGoogleAnalytics, ServiceManager paramServiceManager, TrackerHandler paramTrackerHandler) {}
  
  public static EasyTracker a(Context paramContext)
  {
    if (a == null) {
      a = new EasyTracker(paramContext);
    }
    return a;
  }
  
  private Logger.LogLevel a(String paramString)
  {
    try
    {
      Logger.LogLevel localLogLevel = Logger.LogLevel.valueOf(paramString.toUpperCase());
      return localLogLevel;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
    return null;
  }
  
  private void a(Context paramContext, ParameterLoader paramParameterLoader, ServiceManager paramServiceManager)
  {
    if (paramContext == null) {
      Log.a("Context cannot be null");
    }
    this.i = paramContext.getApplicationContext();
    this.l = paramServiceManager;
    this.k = paramParameterLoader;
    d();
  }
  
  private String c(Activity paramActivity)
  {
    String str1 = paramActivity.getClass().getCanonicalName();
    if (this.j.containsKey(str1)) {
      return (String)this.j.get(str1);
    }
    String str2 = this.k.a(str1);
    if (str2 == null) {
      str2 = str1;
    }
    this.j.put(str1, str2);
    return str2;
  }
  
  private void d()
  {
    Log.c("Starting EasyTracker.");
    String str1 = this.k.a("ga_trackingId");
    if (TextUtils.isEmpty(str1)) {
      str1 = this.k.a("ga_api_key");
    }
    a("&tid", str1);
    Log.c("[EasyTracker] trackingId loaded: " + str1);
    String str2 = this.k.a("ga_appName");
    if (!TextUtils.isEmpty(str2))
    {
      Log.c("[EasyTracker] app name loaded: " + str2);
      a("&an", str2);
    }
    String str3 = this.k.a("ga_appVersion");
    if (str3 != null)
    {
      Log.c("[EasyTracker] app version loaded: " + str3);
      a("&av", str3);
    }
    String str4 = this.k.a("ga_logLevel");
    if (str4 != null)
    {
      Logger.LogLevel localLogLevel = a(str4);
      if (localLogLevel != null)
      {
        Log.c("[EasyTracker] log level loaded: " + localLogLevel);
        this.c.d().a(localLogLevel);
      }
    }
    Double localDouble = this.k.b("ga_sampleFrequency");
    if (localDouble == null) {
      localDouble = new Double(this.k.a("ga_sampleRate", 100));
    }
    if (localDouble.doubleValue() != 100.0D) {
      a("&sf", Double.toString(localDouble.doubleValue()));
    }
    Log.c("[EasyTracker] sample rate loaded: " + localDouble);
    int i1 = this.k.a("ga_dispatchPeriod", 1800);
    Log.c("[EasyTracker] dispatch period loaded: " + i1);
    this.l.a(i1);
    this.g = (1000 * this.k.a("ga_sessionTimeout", 30));
    Log.c("[EasyTracker] session timeout loaded: " + this.g);
    if ((this.k.c("ga_autoActivityTracking")) || (this.k.c("ga_auto_activity_tracking"))) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.e = bool1;
      Log.c("[EasyTracker] auto activity tracking loaded: " + this.e);
      boolean bool2 = this.k.c("ga_anonymizeIp");
      if (bool2)
      {
        a("&aip", "1");
        Log.c("[EasyTracker] anonymize ip loaded: " + bool2);
      }
      this.d = this.k.c("ga_reportUncaughtExceptions");
      if (this.d)
      {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionReporter(this, this.l, Thread.getDefaultUncaughtExceptionHandler(), this.i));
        Log.c("[EasyTracker] report uncaught exceptions loaded: " + this.d);
      }
      boolean bool3 = this.k.c("ga_dryRun");
      this.c.a(bool3);
      return;
    }
  }
  
  private void e()
  {
    try
    {
      if (this.n != null)
      {
        this.n.cancel();
        this.n = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(Activity paramActivity)
  {
    GAUsage.a().a(GAUsage.Field.ai);
    e();
    if ((!this.p) && (this.f == 0) && (a())) {
      this.q = true;
    }
    this.p = true;
    this.f = (1 + this.f);
    if (this.e)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("&t", "appview");
      GAUsage.a().a(true);
      a("&cd", c(paramActivity));
      a(localHashMap);
      GAUsage.a().a(false);
    }
  }
  
  public void a(Map<String, String> paramMap)
  {
    if (this.q)
    {
      paramMap.put("&sc", "start");
      this.q = false;
    }
    super.a(paramMap);
  }
  
  boolean a()
  {
    return (this.g == 0L) || ((this.g > 0L) && (this.m.a() > this.h + this.g));
  }
  
  public void b(Activity paramActivity)
  {
    GAUsage.a().a(GAUsage.Field.aj);
    this.f = (-1 + this.f);
    this.f = Math.max(0, this.f);
    this.h = this.m.a();
    if (this.f == 0)
    {
      e();
      this.o = new EasyTracker.NotInForegroundTimerTask(this, null);
      this.n = new Timer("waitForActivityStart");
      this.n.schedule(this.o, 1000L);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.EasyTracker
 * JD-Core Version:    0.7.0.1
 */