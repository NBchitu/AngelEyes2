package com.google.analytics.tracking.android;

import android.content.Context;
import android.os.Handler;

public class GAServiceManager
  extends ServiceManager
{
  private static final Object a = new Object();
  private static GAServiceManager o;
  private Context b;
  private AnalyticsStore c;
  private volatile AnalyticsThread d;
  private int e = 1800;
  private boolean f = true;
  private boolean g;
  private String h;
  private boolean i = true;
  private boolean j = true;
  private AnalyticsStoreStateListener k = new GAServiceManager.1(this);
  private Handler l;
  private GANetworkReceiver m;
  private boolean n = false;
  
  public static GAServiceManager a()
  {
    if (o == null) {
      o = new GAServiceManager();
    }
    return o;
  }
  
  private void g()
  {
    this.m = new GANetworkReceiver(this);
    this.m.a(this.b);
  }
  
  private void h()
  {
    this.l = new Handler(this.b.getMainLooper(), new GAServiceManager.2(this));
    if (this.e > 0) {
      this.l.sendMessageDelayed(this.l.obtainMessage(1, a), 1000 * this.e);
    }
  }
  
  /* Error */
  @Deprecated
  public void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 66	com/google/analytics/tracking/android/GAServiceManager:l	Landroid/os/Handler;
    //   6: ifnonnull +16 -> 22
    //   9: ldc 105
    //   11: invokestatic 110	com/google/analytics/tracking/android/Log:c	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: iload_1
    //   16: putfield 42	com/google/analytics/tracking/android/GAServiceManager:e	I
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: invokestatic 115	com/google/analytics/tracking/android/GAUsage:a	()Lcom/google/analytics/tracking/android/GAUsage;
    //   25: getstatic 121	com/google/analytics/tracking/android/GAUsage$Field:T	Lcom/google/analytics/tracking/android/GAUsage$Field;
    //   28: invokevirtual 124	com/google/analytics/tracking/android/GAUsage:a	(Lcom/google/analytics/tracking/android/GAUsage$Field;)V
    //   31: aload_0
    //   32: getfield 57	com/google/analytics/tracking/android/GAServiceManager:n	Z
    //   35: ifne +28 -> 63
    //   38: aload_0
    //   39: getfield 46	com/google/analytics/tracking/android/GAServiceManager:i	Z
    //   42: ifeq +21 -> 63
    //   45: aload_0
    //   46: getfield 42	com/google/analytics/tracking/android/GAServiceManager:e	I
    //   49: ifle +14 -> 63
    //   52: aload_0
    //   53: getfield 66	com/google/analytics/tracking/android/GAServiceManager:l	Landroid/os/Handler;
    //   56: iconst_1
    //   57: getstatic 39	com/google/analytics/tracking/android/GAServiceManager:a	Ljava/lang/Object;
    //   60: invokevirtual 128	android/os/Handler:removeMessages	(ILjava/lang/Object;)V
    //   63: aload_0
    //   64: iload_1
    //   65: putfield 42	com/google/analytics/tracking/android/GAServiceManager:e	I
    //   68: iload_1
    //   69: ifle -50 -> 19
    //   72: aload_0
    //   73: getfield 57	com/google/analytics/tracking/android/GAServiceManager:n	Z
    //   76: ifne -57 -> 19
    //   79: aload_0
    //   80: getfield 46	com/google/analytics/tracking/android/GAServiceManager:i	Z
    //   83: ifeq -64 -> 19
    //   86: aload_0
    //   87: getfield 66	com/google/analytics/tracking/android/GAServiceManager:l	Landroid/os/Handler;
    //   90: aload_0
    //   91: getfield 66	com/google/analytics/tracking/android/GAServiceManager:l	Landroid/os/Handler;
    //   94: iconst_1
    //   95: getstatic 39	com/google/analytics/tracking/android/GAServiceManager:a	Ljava/lang/Object;
    //   98: invokevirtual 97	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   101: iload_1
    //   102: sipush 1000
    //   105: imul
    //   106: i2l
    //   107: invokevirtual 101	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
    //   110: pop
    //   111: goto -92 -> 19
    //   114: astore_2
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_2
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	GAServiceManager
    //   0	119	1	paramInt	int
    //   114	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	114	finally
    //   22	63	114	finally
    //   63	68	114	finally
    //   72	111	114	finally
  }
  
  /* Error */
  void a(Context paramContext, AnalyticsThread paramAnalyticsThread)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 76	com/google/analytics/tracking/android/GAServiceManager:b	Landroid/content/Context;
    //   6: astore 4
    //   8: aload 4
    //   10: ifnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 133	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   21: putfield 76	com/google/analytics/tracking/android/GAServiceManager:b	Landroid/content/Context;
    //   24: aload_0
    //   25: getfield 135	com/google/analytics/tracking/android/GAServiceManager:d	Lcom/google/analytics/tracking/android/AnalyticsThread;
    //   28: ifnonnull -15 -> 13
    //   31: aload_0
    //   32: aload_2
    //   33: putfield 135	com/google/analytics/tracking/android/GAServiceManager:d	Lcom/google/analytics/tracking/android/AnalyticsThread;
    //   36: aload_0
    //   37: getfield 44	com/google/analytics/tracking/android/GAServiceManager:f	Z
    //   40: ifeq +12 -> 52
    //   43: aload_0
    //   44: invokevirtual 137	com/google/analytics/tracking/android/GAServiceManager:c	()V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 44	com/google/analytics/tracking/android/GAServiceManager:f	Z
    //   52: aload_0
    //   53: getfield 139	com/google/analytics/tracking/android/GAServiceManager:g	Z
    //   56: ifeq -43 -> 13
    //   59: aload_0
    //   60: invokevirtual 141	com/google/analytics/tracking/android/GAServiceManager:d	()V
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 139	com/google/analytics/tracking/android/GAServiceManager:g	Z
    //   68: goto -55 -> 13
    //   71: astore_3
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_3
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	GAServiceManager
    //   0	76	1	paramContext	Context
    //   0	76	2	paramAnalyticsThread	AnalyticsThread
    //   71	4	3	localObject	Object
    //   6	3	4	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	8	71	finally
    //   16	52	71	finally
    //   52	68	71	finally
  }
  
  void a(boolean paramBoolean)
  {
    try
    {
      a(this.n, paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      StringBuilder localStringBuilder;
      try
      {
        if (this.n == paramBoolean1)
        {
          boolean bool = this.i;
          if (bool == paramBoolean2) {
            return;
          }
        }
        if (((paramBoolean1) || (!paramBoolean2)) && (this.e > 0)) {
          this.l.removeMessages(1, a);
        }
        if ((!paramBoolean1) && (paramBoolean2) && (this.e > 0)) {
          this.l.sendMessageDelayed(this.l.obtainMessage(1, a), 1000 * this.e);
        }
        localStringBuilder = new StringBuilder().append("PowerSaveMode ");
        if (paramBoolean1) {
          break label157;
        }
        if (paramBoolean2) {
          break label150;
        }
      }
      finally {}
      Log.c(str);
      this.n = paramBoolean1;
      this.i = paramBoolean2;
      continue;
      label150:
      String str = "terminated.";
      continue;
      label157:
      str = "initiated.";
    }
  }
  
  AnalyticsStore b()
  {
    try
    {
      if (this.c != null) {
        break label80;
      }
      if (this.b == null) {
        throw new IllegalStateException("Cant get a store unless we have a context");
      }
    }
    finally {}
    this.c = new PersistentAnalyticsStore(this.k, this.b);
    if (this.h != null)
    {
      this.c.b().a(this.h);
      this.h = null;
    }
    label80:
    if (this.l == null) {
      h();
    }
    if ((this.m == null) && (this.j)) {
      g();
    }
    AnalyticsStore localAnalyticsStore = this.c;
    return localAnalyticsStore;
  }
  
  /* Error */
  @Deprecated
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 135	com/google/analytics/tracking/android/GAServiceManager:d	Lcom/google/analytics/tracking/android/AnalyticsThread;
    //   6: ifnonnull +16 -> 22
    //   9: ldc 193
    //   11: invokestatic 110	com/google/analytics/tracking/android/Log:c	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 44	com/google/analytics/tracking/android/GAServiceManager:f	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: invokestatic 115	com/google/analytics/tracking/android/GAUsage:a	()Lcom/google/analytics/tracking/android/GAUsage;
    //   25: getstatic 196	com/google/analytics/tracking/android/GAUsage$Field:S	Lcom/google/analytics/tracking/android/GAUsage$Field;
    //   28: invokevirtual 124	com/google/analytics/tracking/android/GAUsage:a	(Lcom/google/analytics/tracking/android/GAUsage$Field;)V
    //   31: aload_0
    //   32: getfield 135	com/google/analytics/tracking/android/GAServiceManager:d	Lcom/google/analytics/tracking/android/AnalyticsThread;
    //   35: invokeinterface 200 1 0
    //   40: goto -21 -> 19
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	GAServiceManager
    //   43	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	43	finally
    //   22	40	43	finally
  }
  
  @Deprecated
  public void d()
  {
    if (this.d == null)
    {
      Log.c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
      this.g = true;
      return;
    }
    GAUsage.a().a(GAUsage.Field.af);
    this.d.b();
  }
  
  void e()
  {
    try
    {
      if ((!this.n) && (this.i) && (this.e > 0))
      {
        this.l.removeMessages(1, a);
        this.l.sendMessage(this.l.obtainMessage(1, a));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAServiceManager
 * JD-Core Version:    0.7.0.1
 */