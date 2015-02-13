package com.crashlytics.android;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.crashlytics.android.internal.A;
import com.crashlytics.android.internal.D;
import com.crashlytics.android.internal.aM;
import com.crashlytics.android.internal.aP;
import com.crashlytics.android.internal.aR;
import com.crashlytics.android.internal.aS;
import com.crashlytics.android.internal.aX;
import com.crashlytics.android.internal.ab;
import com.crashlytics.android.internal.af;
import com.crashlytics.android.internal.ag;
import com.crashlytics.android.internal.ai;
import com.crashlytics.android.internal.ao;
import com.crashlytics.android.internal.av;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.r;
import com.crashlytics.android.internal.u;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Crashlytics
  extends u
{
  private static ContextWrapper j;
  private static String k;
  private static String l;
  private static String m;
  private static String n;
  private static String o;
  private static String p;
  private static String q;
  private static boolean r = false;
  private static PinningInfoProvider s = null;
  private static av t;
  private static float u;
  private static Crashlytics v;
  private final long a = System.currentTimeMillis();
  private final ConcurrentHashMap<String, String> b = new ConcurrentHashMap();
  private CrashlyticsListener c;
  private v d;
  private ao e = null;
  private String f = null;
  private String g = null;
  private String h = null;
  private String i;
  
  /* Error */
  public static Crashlytics a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   6: ldc 2
    //   8: invokevirtual 79	com/crashlytics/android/internal/v:a	(Ljava/lang/Class;)Lcom/crashlytics/android/internal/u;
    //   11: checkcast 2	com/crashlytics/android/Crashlytics
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull +8 -> 24
    //   19: ldc 2
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: getstatic 81	com/crashlytics/android/Crashlytics:v	Lcom/crashlytics/android/Crashlytics;
    //   27: ifnonnull +13 -> 40
    //   30: new 2	com/crashlytics/android/Crashlytics
    //   33: dup
    //   34: invokespecial 82	com/crashlytics/android/Crashlytics:<init>	()V
    //   37: putstatic 81	com/crashlytics/android/Crashlytics:v	Lcom/crashlytics/android/Crashlytics;
    //   40: getstatic 81	com/crashlytics/android/Crashlytics:v	Lcom/crashlytics/android/Crashlytics;
    //   43: astore_1
    //   44: goto -25 -> 19
    //   47: astore_0
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_0
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   47	5	0	localObject	java.lang.Object
    //   14	30	1	localCrashlytics	Crashlytics
    // Exception table:
    //   from	to	target	type
    //   3	15	47	finally
    //   24	40	47	finally
    //   40	44	47	finally
  }
  
  private b a(Y paramY)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.i;
    String str = ab.a(arrayOfString);
    int i1 = ai.a(l).a();
    return new b(p, k, o, n, str, m, i1, q, "0", paramY);
  }
  
  public static void a(Context paramContext)
  {
    a(paramContext, 1.0F);
  }
  
  public static void a(Context paramContext, float paramFloat)
  {
    u = paramFloat;
    if (!ab.d(paramContext)) {
      com.crashlytics.android.internal.v.a().a(new A());
    }
    u[] arrayOfu = new u[2];
    arrayOfu[0] = a();
    arrayOfu[1] = new D();
    com.crashlytics.android.internal.v.a(paramContext, arrayOfu);
  }
  
  static void a(String paramString)
  {
    D localD = (D)com.crashlytics.android.internal.v.a().a(D.class);
    if (localD != null) {
      localD.a(new ag(paramString));
    }
  }
  
  public static void a(String paramString, int paramInt)
  {
    a(paramString, Integer.toString(paramInt));
  }
  
  public static void a(String paramString, long paramLong)
  {
    a(paramString, Long.toString(paramLong));
  }
  
  /* Error */
  private void a(String paramString, Context paramContext, float paramFloat)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: getstatic 178	com/crashlytics/android/Crashlytics:j	Landroid/content/ContextWrapper;
    //   8: ifnull +21 -> 29
    //   11: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   14: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   17: ldc 183
    //   19: ldc 185
    //   21: invokeinterface 188 3 0
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_1
    //   30: putstatic 106	com/crashlytics/android/Crashlytics:p	Ljava/lang/String;
    //   33: new 190	android/content/ContextWrapper
    //   36: dup
    //   37: aload_2
    //   38: invokevirtual 196	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   41: invokespecial 198	android/content/ContextWrapper:<init>	(Landroid/content/Context;)V
    //   44: putstatic 178	com/crashlytics/android/Crashlytics:j	Landroid/content/ContextWrapper;
    //   47: new 200	com/crashlytics/android/internal/av
    //   50: dup
    //   51: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   54: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   57: invokespecial 202	com/crashlytics/android/internal/av:<init>	(Lcom/crashlytics/android/internal/q;)V
    //   60: putstatic 204	com/crashlytics/android/Crashlytics:t	Lcom/crashlytics/android/internal/av;
    //   63: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   66: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   69: ldc 183
    //   71: new 206	java/lang/StringBuilder
    //   74: dup
    //   75: ldc 208
    //   77: invokespecial 209	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: invokestatic 212	com/crashlytics/android/Crashlytics:c	()Ljava/lang/String;
    //   83: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokeinterface 220 3 0
    //   94: getstatic 178	com/crashlytics/android/Crashlytics:j	Landroid/content/ContextWrapper;
    //   97: invokevirtual 223	android/content/ContextWrapper:getPackageName	()Ljava/lang/String;
    //   100: putstatic 108	com/crashlytics/android/Crashlytics:k	Ljava/lang/String;
    //   103: getstatic 178	com/crashlytics/android/Crashlytics:j	Landroid/content/ContextWrapper;
    //   106: invokevirtual 227	android/content/ContextWrapper:getPackageManager	()Landroid/content/pm/PackageManager;
    //   109: astore 11
    //   111: aload 11
    //   113: getstatic 108	com/crashlytics/android/Crashlytics:k	Ljava/lang/String;
    //   116: invokevirtual 233	android/content/pm/PackageManager:getInstallerPackageName	(Ljava/lang/String;)Ljava/lang/String;
    //   119: putstatic 94	com/crashlytics/android/Crashlytics:l	Ljava/lang/String;
    //   122: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   125: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   128: ldc 183
    //   130: new 206	java/lang/StringBuilder
    //   133: dup
    //   134: ldc 235
    //   136: invokespecial 209	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: getstatic 94	com/crashlytics/android/Crashlytics:l	Ljava/lang/String;
    //   142: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: invokeinterface 188 3 0
    //   153: aload 11
    //   155: getstatic 108	com/crashlytics/android/Crashlytics:k	Ljava/lang/String;
    //   158: iconst_0
    //   159: invokevirtual 239	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   162: astore 12
    //   164: aload 12
    //   166: getfield 245	android/content/pm/PackageInfo:versionCode	I
    //   169: invokestatic 162	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   172: putstatic 112	com/crashlytics/android/Crashlytics:n	Ljava/lang/String;
    //   175: aload 12
    //   177: getfield 248	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   180: ifnonnull +312 -> 492
    //   183: ldc 250
    //   185: astore 13
    //   187: aload 13
    //   189: putstatic 110	com/crashlytics/android/Crashlytics:o	Ljava/lang/String;
    //   192: aload_2
    //   193: invokevirtual 251	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   196: aload_2
    //   197: invokevirtual 255	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   200: invokevirtual 259	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   203: invokeinterface 262 1 0
    //   208: putstatic 114	com/crashlytics/android/Crashlytics:m	Ljava/lang/String;
    //   211: aload_2
    //   212: invokevirtual 255	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   215: getfield 267	android/content/pm/ApplicationInfo:targetSdkVersion	I
    //   218: invokestatic 162	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   221: putstatic 116	com/crashlytics/android/Crashlytics:q	Ljava/lang/String;
    //   224: aload_0
    //   225: aload_2
    //   226: invokestatic 270	com/crashlytics/android/internal/ab:i	(Landroid/content/Context;)Ljava/lang/String;
    //   229: putfield 87	com/crashlytics/android/Crashlytics:i	Ljava/lang/String;
    //   232: aload_0
    //   233: new 272	com/crashlytics/android/internal/ao
    //   236: dup
    //   237: getstatic 178	com/crashlytics/android/Crashlytics:j	Landroid/content/ContextWrapper;
    //   240: invokespecial 273	com/crashlytics/android/internal/ao:<init>	(Landroid/content/Context;)V
    //   243: putfield 50	com/crashlytics/android/Crashlytics:e	Lcom/crashlytics/android/internal/ao;
    //   246: aload_0
    //   247: getfield 50	com/crashlytics/android/Crashlytics:e	Lcom/crashlytics/android/internal/ao;
    //   250: invokevirtual 275	com/crashlytics/android/internal/ao:h	()Ljava/lang/String;
    //   253: pop
    //   254: new 277	com/crashlytics/android/c
    //   257: dup
    //   258: aload_0
    //   259: getfield 87	com/crashlytics/android/Crashlytics:i	Ljava/lang/String;
    //   262: getstatic 178	com/crashlytics/android/Crashlytics:j	Landroid/content/ContextWrapper;
    //   265: ldc_w 279
    //   268: iconst_1
    //   269: invokestatic 282	com/crashlytics/android/internal/ab:a	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   272: invokespecial 285	com/crashlytics/android/c:<init>	(Ljava/lang/String;Z)V
    //   275: aload_1
    //   276: getstatic 108	com/crashlytics/android/Crashlytics:k	Ljava/lang/String;
    //   279: invokevirtual 286	com/crashlytics/android/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   285: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   288: ldc 183
    //   290: ldc_w 288
    //   293: invokeinterface 188 3 0
    //   298: aload_0
    //   299: new 290	com/crashlytics/android/v
    //   302: dup
    //   303: invokestatic 296	java/lang/Thread:getDefaultUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   306: aload_0
    //   307: getfield 298	com/crashlytics/android/Crashlytics:c	Lcom/crashlytics/android/CrashlyticsListener;
    //   310: aload_0
    //   311: getfield 87	com/crashlytics/android/Crashlytics:i	Ljava/lang/String;
    //   314: invokespecial 301	com/crashlytics/android/v:<init>	(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/crashlytics/android/CrashlyticsListener;Ljava/lang/String;)V
    //   317: putfield 124	com/crashlytics/android/Crashlytics:d	Lcom/crashlytics/android/v;
    //   320: aload_0
    //   321: getfield 124	com/crashlytics/android/Crashlytics:d	Lcom/crashlytics/android/v;
    //   324: invokevirtual 304	com/crashlytics/android/v:f	()Z
    //   327: istore 4
    //   329: aload_0
    //   330: getfield 124	com/crashlytics/android/Crashlytics:d	Lcom/crashlytics/android/v;
    //   333: invokevirtual 306	com/crashlytics/android/v:d	()V
    //   336: aload_0
    //   337: getfield 124	com/crashlytics/android/Crashlytics:d	Lcom/crashlytics/android/v;
    //   340: invokevirtual 308	com/crashlytics/android/v:c	()V
    //   343: aload_0
    //   344: getfield 124	com/crashlytics/android/Crashlytics:d	Lcom/crashlytics/android/v;
    //   347: invokevirtual 310	com/crashlytics/android/v:h	()V
    //   350: aload_0
    //   351: getfield 124	com/crashlytics/android/Crashlytics:d	Lcom/crashlytics/android/v;
    //   354: invokestatic 314	java/lang/Thread:setDefaultUncaughtExceptionHandler	(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //   357: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   360: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   363: ldc 183
    //   365: ldc_w 316
    //   368: invokeinterface 188 3 0
    //   373: new 318	java/util/concurrent/CountDownLatch
    //   376: dup
    //   377: iconst_1
    //   378: invokespecial 321	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   381: astore 9
    //   383: new 292	java/lang/Thread
    //   386: dup
    //   387: new 323	com/crashlytics/android/t
    //   390: dup
    //   391: aload_0
    //   392: aload_2
    //   393: fload_3
    //   394: aload 9
    //   396: invokespecial 326	com/crashlytics/android/t:<init>	(Lcom/crashlytics/android/Crashlytics;Landroid/content/Context;FLjava/util/concurrent/CountDownLatch;)V
    //   399: ldc_w 328
    //   402: invokespecial 331	java/lang/Thread:<init>	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   405: invokevirtual 334	java/lang/Thread:start	()V
    //   408: iload 4
    //   410: ifeq -384 -> 26
    //   413: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   416: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   419: ldc 183
    //   421: ldc_w 336
    //   424: invokeinterface 188 3 0
    //   429: aload 9
    //   431: ldc2_w 337
    //   434: getstatic 344	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   437: invokevirtual 348	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   440: ifne -414 -> 26
    //   443: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   446: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   449: ldc 183
    //   451: ldc_w 350
    //   454: invokeinterface 352 3 0
    //   459: goto -433 -> 26
    //   462: astore 10
    //   464: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   467: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   470: ldc 183
    //   472: ldc_w 354
    //   475: aload 10
    //   477: invokeinterface 357 4 0
    //   482: goto -456 -> 26
    //   485: astore 5
    //   487: aload_0
    //   488: monitorexit
    //   489: aload 5
    //   491: athrow
    //   492: aload 12
    //   494: getfield 248	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   497: astore 13
    //   499: goto -312 -> 187
    //   502: astore 6
    //   504: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   507: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   510: ldc 183
    //   512: ldc_w 359
    //   515: aload 6
    //   517: invokeinterface 357 4 0
    //   522: goto -290 -> 232
    //   525: astore 8
    //   527: invokestatic 76	com/crashlytics/android/internal/v:a	()Lcom/crashlytics/android/internal/v;
    //   530: invokevirtual 181	com/crashlytics/android/internal/v:b	()Lcom/crashlytics/android/internal/q;
    //   533: ldc 183
    //   535: ldc_w 361
    //   538: aload 8
    //   540: invokeinterface 357 4 0
    //   545: goto -172 -> 373
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	548	0	this	Crashlytics
    //   0	548	1	paramString	String
    //   0	548	2	paramContext	Context
    //   0	548	3	paramFloat	float
    //   1	408	4	bool	boolean
    //   485	5	5	localObject	java.lang.Object
    //   502	14	6	localException1	Exception
    //   525	14	8	localException2	Exception
    //   381	49	9	localCountDownLatch	java.util.concurrent.CountDownLatch
    //   462	14	10	localInterruptedException	java.lang.InterruptedException
    //   109	45	11	localPackageManager	android.content.pm.PackageManager
    //   162	331	12	localPackageInfo	android.content.pm.PackageInfo
    //   185	313	13	str	String
    // Exception table:
    //   from	to	target	type
    //   429	459	462	java/lang/InterruptedException
    //   5	26	485	finally
    //   29	94	485	finally
    //   94	183	485	finally
    //   187	232	485	finally
    //   232	282	485	finally
    //   282	373	485	finally
    //   373	408	485	finally
    //   413	429	485	finally
    //   429	459	485	finally
    //   464	482	485	finally
    //   492	499	485	finally
    //   504	522	485	finally
    //   527	545	485	finally
    //   94	183	502	java/lang/Exception
    //   187	232	502	java/lang/Exception
    //   492	499	502	java/lang/Exception
    //   282	373	525	java/lang/Exception
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      if ((j != null) && (ab.f(j))) {
        throw new IllegalArgumentException("Custom attribute key cannot be null.");
      }
      com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
      return;
    }
    String str1 = c(paramString1);
    if ((a().b.size() < 64) || (a().b.containsKey(str1)))
    {
      if (paramString2 == null) {}
      for (String str2 = "";; str2 = c(paramString2))
      {
        a().b.put(str1, str2);
        return;
      }
    }
    com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Exceeded maximum number of custom attributes (64)");
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    a(paramString, Boolean.toString(paramBoolean));
  }
  
  public static void a(Throwable paramThrowable)
  {
    Crashlytics localCrashlytics = a();
    if ((localCrashlytics == null) || (localCrashlytics.d == null))
    {
      com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging exceptions.", null);
      return;
    }
    if (paramThrowable == null)
    {
      com.crashlytics.android.internal.v.a().b().a(5, "Crashlytics", "Crashlytics is ignoring a request to log a null exception.");
      return;
    }
    localCrashlytics.d.a(Thread.currentThread(), paramThrowable);
  }
  
  static void a(boolean paramBoolean)
  {
    ab.a().edit().putBoolean("always_send_reports_opt_in", true).commit();
  }
  
  static void b(String paramString)
  {
    D localD = (D)com.crashlytics.android.internal.v.a().a(D.class);
    if (localD != null) {
      localD.a(new af(paramString));
    }
  }
  
  private boolean b(Context paramContext, float paramFloat)
  {
    bool1 = true;
    str = ab.g(w());
    try
    {
      aS.a().a(paramContext, t, n, o, l()).c();
      aX localaX2 = aS.a().b();
      localaX1 = localaX2;
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        try
        {
          localaM = localaX1.a;
          if ("new".equals(localaM.a))
          {
            b localb2 = a(Y.a(w(), str));
            if (new T(l(), localaM.b, t).a(localb2))
            {
              boolean bool5 = aS.a().d();
              bool4 = bool5;
              bool3 = bool4;
            }
          }
        }
        catch (Exception localException3)
        {
          try
          {
            aX localaX1;
            aM localaM;
            boolean bool4;
            bool2 = localaX1.d.b;
            if ((bool3) && (bool2))
            {
              try
              {
                bool1 = true & this.d.b();
                V localV = t();
                i1 = 0;
                if (localV != null) {
                  new aa(localV).a(paramFloat);
                }
              }
              catch (Exception localException2)
              {
                b localb1;
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error sending crash report", localException2);
                i1 = 0;
                continue;
              }
              if (i1 != 0) {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crash reporting disabled.");
              }
              return bool1;
              localException1 = localException1;
              com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error dealing with settings", localException1);
              localaX1 = null;
              continue;
              com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Failed to create app with Crashlytics service.", null);
              bool4 = false;
              continue;
              if ("configured".equals(localaM.a))
              {
                bool4 = aS.a().d();
                continue;
              }
              if (localaM.d)
              {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Server says an update is required - forcing a full App update.");
                localb1 = a(Y.a(w(), str));
                new ad(l(), localaM.b, t).a(localb1);
              }
              bool4 = bool1;
              continue;
              localException3 = localException3;
              com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error performing auto configuration.", localException3);
              bool3 = false;
              continue;
            }
          }
          catch (Exception localException4)
          {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error getting collect reports setting.", localException4);
            bool2 = false;
            continue;
            int i1 = bool1;
            continue;
          }
        }
        boolean bool2 = false;
        boolean bool3 = false;
      }
    }
    if (localaX1 == null) {}
  }
  
  @Deprecated
  public static String c()
  {
    return a().f();
  }
  
  private static String c(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.trim();
      if (paramString.length() > 1024) {
        paramString = paramString.substring(0, 1024);
      }
    }
    return paramString;
  }
  
  static String g()
  {
    return k;
  }
  
  static String h()
  {
    return l;
  }
  
  static String i()
  {
    return o;
  }
  
  static String j()
  {
    return n;
  }
  
  static String k()
  {
    return m;
  }
  
  static String l()
  {
    return ab.a(j, "com.crashlytics.ApiEndpoint");
  }
  
  static boolean n()
  {
    return ab.a().getBoolean("always_send_reports_opt_in", false);
  }
  
  final Map<String, String> b()
  {
    return Collections.unmodifiableMap(this.b);
  }
  
  final ao d()
  {
    return this.e;
  }
  
  protected final void e()
  {
    Context localContext = super.w();
    String str = r.a(localContext, false);
    if (str == null) {
      return;
    }
    try
    {
      a(str, localContext, u);
      return;
    }
    catch (CrashlyticsMissingDependencyException localCrashlyticsMissingDependencyException)
    {
      throw localCrashlyticsMissingDependencyException;
    }
    catch (Exception localException)
    {
      com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics was not started due to an exception during initialization", localException);
    }
  }
  
  public final String f()
  {
    return com.crashlytics.android.internal.v.a().f();
  }
  
  final boolean m()
  {
    return ((Boolean)aS.a().a(new l(this), Boolean.valueOf(false))).booleanValue();
  }
  
  final v o()
  {
    return this.d;
  }
  
  final String p()
  {
    if (this.e.a()) {
      return this.f;
    }
    return null;
  }
  
  final String q()
  {
    if (this.e.a()) {
      return this.g;
    }
    return null;
  }
  
  final String r()
  {
    if (this.e.a()) {
      return this.h;
    }
    return null;
  }
  
  final boolean s()
  {
    return ((Boolean)aS.a().a(new m(this), Boolean.valueOf(true))).booleanValue();
  }
  
  final V t()
  {
    return (V)aS.a().a(new n(this), null);
  }
  
  final aR u()
  {
    return (aR)aS.a().a(new o(this), null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.Crashlytics
 * JD-Core Version:    0.7.0.1
 */