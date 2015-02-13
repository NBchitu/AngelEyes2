package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class Tracker
{
  private final String a;
  private final TrackerHandler b;
  private final Map<String, String> c = new HashMap();
  private long d = 120000L;
  private long e;
  private final ClientIdDefaultProvider f;
  private final ScreenResolutionDefaultProvider g;
  private final AppFieldsDefaultProvider h;
  
  Tracker(String paramString1, String paramString2, TrackerHandler paramTrackerHandler)
  {
    this(paramString1, paramString2, paramTrackerHandler, ClientIdDefaultProvider.a(), ScreenResolutionDefaultProvider.a(), AppFieldsDefaultProvider.a());
  }
  
  Tracker(String paramString1, String paramString2, TrackerHandler paramTrackerHandler, ClientIdDefaultProvider paramClientIdDefaultProvider, ScreenResolutionDefaultProvider paramScreenResolutionDefaultProvider, AppFieldsDefaultProvider paramAppFieldsDefaultProvider)
  {
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("Tracker name cannot be empty.");
    }
    this.a = paramString1;
    this.b = paramTrackerHandler;
    this.c.put("&tid", paramString2);
    this.c.put("useSecure", "1");
    this.f = paramClientIdDefaultProvider;
    this.g = paramScreenResolutionDefaultProvider;
    this.h = paramAppFieldsDefaultProvider;
  }
  
  public void a(String paramString1, String paramString2)
  {
    GAUsage.a().a(GAUsage.Field.k);
    if (paramString2 == null)
    {
      this.c.remove(paramString1);
      return;
    }
    this.c.put(paramString1, paramString2);
  }
  
  public void a(Map<String, String> paramMap)
  {
    GAUsage.a().a(GAUsage.Field.l);
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(this.c);
    if (paramMap != null) {
      localHashMap.putAll(paramMap);
    }
    if (TextUtils.isEmpty((CharSequence)localHashMap.get("&tid"))) {
      Log.d(String.format("Missing tracking id (%s) parameter.", new Object[] { "&tid" }));
    }
    String str = (String)localHashMap.get("&t");
    if (TextUtils.isEmpty(str))
    {
      Log.d(String.format("Missing hit type (%s) parameter.", new Object[] { "&t" }));
      str = "";
    }
    if ((!str.equals("transaction")) && (!str.equals("item")) && (!c()))
    {
      Log.d("Too many hits sent too quickly, rate limiting invoked.");
      return;
    }
    this.b.a(localHashMap);
  }
  
  public String b()
  {
    GAUsage.a().a(GAUsage.Field.ag);
    return this.a;
  }
  
  /* Error */
  boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 163	java/lang/System:currentTimeMillis	()J
    //   5: lstore_2
    //   6: aload_0
    //   7: getfield 52	com/google/analytics/tracking/android/Tracker:d	J
    //   10: ldc2_w 49
    //   13: lcmp
    //   14: ifge +35 -> 49
    //   17: lload_2
    //   18: aload_0
    //   19: getfield 165	com/google/analytics/tracking/android/Tracker:e	J
    //   22: lsub
    //   23: lstore 5
    //   25: lload 5
    //   27: lconst_0
    //   28: lcmp
    //   29: ifle +20 -> 49
    //   32: aload_0
    //   33: ldc2_w 49
    //   36: lload 5
    //   38: aload_0
    //   39: getfield 52	com/google/analytics/tracking/android/Tracker:d	J
    //   42: ladd
    //   43: invokestatic 171	java/lang/Math:min	(JJ)J
    //   46: putfield 52	com/google/analytics/tracking/android/Tracker:d	J
    //   49: aload_0
    //   50: lload_2
    //   51: putfield 165	com/google/analytics/tracking/android/Tracker:e	J
    //   54: aload_0
    //   55: getfield 52	com/google/analytics/tracking/android/Tracker:d	J
    //   58: ldc2_w 172
    //   61: lcmp
    //   62: iflt +23 -> 85
    //   65: aload_0
    //   66: aload_0
    //   67: getfield 52	com/google/analytics/tracking/android/Tracker:d	J
    //   70: ldc2_w 172
    //   73: lsub
    //   74: putfield 52	com/google/analytics/tracking/android/Tracker:d	J
    //   77: iconst_1
    //   78: istore 4
    //   80: aload_0
    //   81: monitorexit
    //   82: iload 4
    //   84: ireturn
    //   85: ldc 175
    //   87: invokestatic 130	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   90: iconst_0
    //   91: istore 4
    //   93: goto -13 -> 80
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	Tracker
    //   96	4	1	localObject	Object
    //   5	46	2	l1	long
    //   78	14	4	bool	boolean
    //   23	14	5	l2	long
    // Exception table:
    //   from	to	target	type
    //   2	25	96	finally
    //   32	49	96	finally
    //   49	77	96	finally
    //   85	90	96	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.Tracker
 * JD-Core Version:    0.7.0.1
 */