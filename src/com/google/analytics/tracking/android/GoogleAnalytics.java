package com.google.analytics.tracking.android;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GoogleAnalytics
  extends TrackerHandler
{
  private static GoogleAnalytics h;
  private boolean a;
  private AnalyticsThread b;
  private Context c;
  private Tracker d;
  private volatile Boolean e = Boolean.valueOf(false);
  private final Map<String, Tracker> f = new HashMap();
  private Logger g;
  
  protected GoogleAnalytics(Context paramContext)
  {
    this(paramContext, GAThread.a(paramContext));
  }
  
  private GoogleAnalytics(Context paramContext, AnalyticsThread paramAnalyticsThread)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context cannot be null");
    }
    this.c = paramContext.getApplicationContext();
    this.b = paramAnalyticsThread;
    AppFieldsDefaultProvider.a(this.c);
    ScreenResolutionDefaultProvider.a(this.c);
    ClientIdDefaultProvider.a(this.c);
    this.g = new DefaultLoggerImpl();
  }
  
  static GoogleAnalytics a()
  {
    try
    {
      GoogleAnalytics localGoogleAnalytics = h;
      return localGoogleAnalytics;
    }
    finally {}
  }
  
  public static GoogleAnalytics a(Context paramContext)
  {
    try
    {
      if (h == null) {
        h = new GoogleAnalytics(paramContext);
      }
      GoogleAnalytics localGoogleAnalytics = h;
      return localGoogleAnalytics;
    }
    finally {}
  }
  
  public Tracker a(String paramString)
  {
    return a(paramString, paramString);
  }
  
  public Tracker a(String paramString1, String paramString2)
  {
    try
    {
      if (TextUtils.isEmpty(paramString1)) {
        throw new IllegalArgumentException("Tracker name cannot be empty");
      }
    }
    finally {}
    Tracker localTracker = (Tracker)this.f.get(paramString1);
    if (localTracker == null)
    {
      localTracker = new Tracker(paramString1, paramString2, this);
      this.f.put(paramString1, localTracker);
      if (this.d == null) {
        this.d = localTracker;
      }
    }
    if (!TextUtils.isEmpty(paramString2)) {
      localTracker.a("&tid", paramString2);
    }
    GAUsage.a().a(GAUsage.Field.N);
    return localTracker;
  }
  
  public void a(Logger paramLogger)
  {
    GAUsage.a().a(GAUsage.Field.ae);
    this.g = paramLogger;
  }
  
  void a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      try
      {
        throw new IllegalArgumentException("hit cannot be null");
      }
      finally {}
    }
    Utils.a(paramMap, "&ul", Utils.a(Locale.getDefault()));
    Utils.a(paramMap, "&sr", ScreenResolutionDefaultProvider.a().a("&sr"));
    paramMap.put("&_u", GAUsage.a().c());
    GAUsage.a().b();
    this.b.a(paramMap);
  }
  
  public void a(boolean paramBoolean)
  {
    GAUsage.a().a(GAUsage.Field.ac);
    this.a = paramBoolean;
  }
  
  public void b(String paramString)
  {
    try
    {
      GAUsage.a().a(GAUsage.Field.ah);
      if ((Tracker)this.f.remove(paramString) == this.d) {
        this.d = null;
      }
      return;
    }
    finally {}
  }
  
  public boolean b()
  {
    GAUsage.a().a(GAUsage.Field.ad);
    return this.a;
  }
  
  public boolean c()
  {
    GAUsage.a().a(GAUsage.Field.R);
    return this.e.booleanValue();
  }
  
  public Logger d()
  {
    return this.g;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GoogleAnalytics
 * JD-Core Version:    0.7.0.1
 */