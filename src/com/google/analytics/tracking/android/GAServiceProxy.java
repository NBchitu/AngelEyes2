package com.google.analytics.tracking.android;

import android.content.Context;
import com.google.android.gms.analytics.internal.Command;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

class GAServiceProxy
  implements AnalyticsGmsCoreClient.OnConnectedListener, AnalyticsGmsCoreClient.OnConnectionFailedListener, ServiceProxy
{
  private volatile long a;
  private volatile GAServiceProxy.ConnectState b;
  private volatile AnalyticsClient c;
  private AnalyticsStore d;
  private AnalyticsStore e;
  private final GoogleAnalytics f;
  private final AnalyticsThread g;
  private final Context h;
  private final Queue<GAServiceProxy.HitParams> i = new ConcurrentLinkedQueue();
  private volatile int j;
  private volatile Timer k;
  private volatile Timer l;
  private volatile Timer m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private Clock r;
  private long s = 300000L;
  
  GAServiceProxy(Context paramContext, AnalyticsThread paramAnalyticsThread)
  {
    this(paramContext, paramAnalyticsThread, null, GoogleAnalytics.a(paramContext));
  }
  
  GAServiceProxy(Context paramContext, AnalyticsThread paramAnalyticsThread, AnalyticsStore paramAnalyticsStore, GoogleAnalytics paramGoogleAnalytics)
  {
    this.e = paramAnalyticsStore;
    this.h = paramContext;
    this.g = paramAnalyticsThread;
    this.f = paramGoogleAnalytics;
    this.r = new GAServiceProxy.1(this);
    this.j = 0;
    this.b = GAServiceProxy.ConnectState.g;
  }
  
  private Timer a(Timer paramTimer)
  {
    if (paramTimer != null) {
      paramTimer.cancel();
    }
    return null;
  }
  
  private void g()
  {
    this.k = a(this.k);
    this.l = a(this.l);
    this.m = a(this.m);
  }
  
  private void h()
  {
    for (;;)
    {
      try
      {
        if (!Thread.currentThread().equals(this.g.d()))
        {
          this.g.c().add(new GAServiceProxy.2(this));
          return;
        }
        if (this.o) {
          d();
        }
        switch (GAServiceProxy.3.a[this.b.ordinal()])
        {
        case 1: 
          if (!this.i.isEmpty())
          {
            GAServiceProxy.HitParams localHitParams2 = (GAServiceProxy.HitParams)this.i.poll();
            Log.c("Sending hit to store  " + localHitParams2);
            this.d.a(localHitParams2.a(), localHitParams2.b(), localHitParams2.c(), localHitParams2.d());
            continue;
          }
          if (!this.n) {
            continue;
          }
        }
      }
      finally {}
      i();
      continue;
      if (!this.i.isEmpty())
      {
        GAServiceProxy.HitParams localHitParams1 = (GAServiceProxy.HitParams)this.i.peek();
        Log.c("Sending hit to service   " + localHitParams1);
        if (!this.f.b()) {
          this.c.a(localHitParams1.a(), localHitParams1.b(), localHitParams1.c(), localHitParams1.d());
        }
        for (;;)
        {
          this.i.poll();
          break;
          Log.c("Dry run enabled. Hit not actually sent to service.");
        }
      }
      this.a = this.r.a();
      continue;
      Log.c("Need to reconnect");
      if (!this.i.isEmpty()) {
        k();
      }
    }
  }
  
  private void i()
  {
    this.d.a();
    this.n = false;
  }
  
  private void j()
  {
    for (;;)
    {
      try
      {
        GAServiceProxy.ConnectState localConnectState1 = this.b;
        GAServiceProxy.ConnectState localConnectState2 = GAServiceProxy.ConnectState.c;
        if (localConnectState1 == localConnectState2) {
          return;
        }
        g();
        Log.c("falling back to local store");
        if (this.e != null)
        {
          this.d = this.e;
          this.b = GAServiceProxy.ConnectState.c;
          h();
          continue;
        }
        localGAServiceManager = GAServiceManager.a();
      }
      finally {}
      GAServiceManager localGAServiceManager;
      localGAServiceManager.a(this.h, this.g);
      this.d = localGAServiceManager.b();
    }
  }
  
  private void k()
  {
    for (;;)
    {
      try
      {
        if ((!this.q) && (this.c != null))
        {
          GAServiceProxy.ConnectState localConnectState1 = this.b;
          GAServiceProxy.ConnectState localConnectState2 = GAServiceProxy.ConnectState.c;
          if (localConnectState1 != localConnectState2) {
            try
            {
              this.j = (1 + this.j);
              a(this.l);
              this.b = GAServiceProxy.ConnectState.a;
              this.l = new Timer("Failed Connect");
              this.l.schedule(new GAServiceProxy.FailedConnectTask(this, null), 3000L);
              Log.c("connecting to Analytics service");
              this.c.b();
              return;
            }
            catch (SecurityException localSecurityException)
            {
              Log.d("security exception on connectToService");
              j();
              continue;
            }
          }
        }
        Log.d("client not initialized.");
      }
      finally {}
      j();
    }
  }
  
  private void l()
  {
    try
    {
      if ((this.c != null) && (this.b == GAServiceProxy.ConnectState.b))
      {
        this.b = GAServiceProxy.ConnectState.f;
        this.c.c();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void m()
  {
    this.k = a(this.k);
    this.k = new Timer("Service Reconnect");
    this.k.schedule(new GAServiceProxy.ReconnectTask(this, null), 5000L);
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: aload_0
    //   5: getfield 110	com/google/analytics/tracking/android/GAServiceProxy:l	Ljava/util/Timer;
    //   8: invokespecial 108	com/google/analytics/tracking/android/GAServiceProxy:a	(Ljava/util/Timer;)Ljava/util/Timer;
    //   11: putfield 110	com/google/analytics/tracking/android/GAServiceProxy:l	Ljava/util/Timer;
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 81	com/google/analytics/tracking/android/GAServiceProxy:j	I
    //   19: ldc_w 294
    //   22: invokestatic 184	com/google/analytics/tracking/android/Log:c	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: getstatic 281	com/google/analytics/tracking/android/GAServiceProxy$ConnectState:b	Lcom/google/analytics/tracking/android/GAServiceProxy$ConnectState;
    //   29: putfield 87	com/google/analytics/tracking/android/GAServiceProxy:b	Lcom/google/analytics/tracking/android/GAServiceProxy$ConnectState;
    //   32: aload_0
    //   33: getfield 296	com/google/analytics/tracking/android/GAServiceProxy:p	Z
    //   36: ifeq +15 -> 51
    //   39: aload_0
    //   40: invokespecial 232	com/google/analytics/tracking/android/GAServiceProxy:l	()V
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 296	com/google/analytics/tracking/android/GAServiceProxy:p	Z
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: aload_0
    //   52: invokespecial 95	com/google/analytics/tracking/android/GAServiceProxy:h	()V
    //   55: aload_0
    //   56: aload_0
    //   57: aload_0
    //   58: getfield 112	com/google/analytics/tracking/android/GAServiceProxy:m	Ljava/util/Timer;
    //   61: invokespecial 108	com/google/analytics/tracking/android/GAServiceProxy:a	(Ljava/util/Timer;)Ljava/util/Timer;
    //   64: putfield 112	com/google/analytics/tracking/android/GAServiceProxy:m	Ljava/util/Timer;
    //   67: aload_0
    //   68: new 90	java/util/Timer
    //   71: dup
    //   72: ldc_w 298
    //   75: invokespecial 259	java/util/Timer:<init>	(Ljava/lang/String;)V
    //   78: putfield 112	com/google/analytics/tracking/android/GAServiceProxy:m	Ljava/util/Timer;
    //   81: aload_0
    //   82: getfield 112	com/google/analytics/tracking/android/GAServiceProxy:m	Ljava/util/Timer;
    //   85: new 300	com/google/analytics/tracking/android/GAServiceProxy$DisconnectCheckTask
    //   88: dup
    //   89: aload_0
    //   90: aconst_null
    //   91: invokespecial 301	com/google/analytics/tracking/android/GAServiceProxy$DisconnectCheckTask:<init>	(Lcom/google/analytics/tracking/android/GAServiceProxy;Lcom/google/analytics/tracking/android/GAServiceProxy$1;)V
    //   94: aload_0
    //   95: getfield 64	com/google/analytics/tracking/android/GAServiceProxy:s	J
    //   98: invokevirtual 270	java/util/Timer:schedule	(Ljava/util/TimerTask;J)V
    //   101: goto -53 -> 48
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	GAServiceProxy
    //   104	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	48	104	finally
    //   51	101	104	finally
  }
  
  /* Error */
  public void a(int paramInt, android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getstatic 304	com/google/analytics/tracking/android/GAServiceProxy$ConnectState:e	Lcom/google/analytics/tracking/android/GAServiceProxy$ConnectState;
    //   6: putfield 87	com/google/analytics/tracking/android/GAServiceProxy:b	Lcom/google/analytics/tracking/android/GAServiceProxy$ConnectState;
    //   9: aload_0
    //   10: getfield 81	com/google/analytics/tracking/android/GAServiceProxy:j	I
    //   13: iconst_2
    //   14: if_icmpge +39 -> 53
    //   17: new 165	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   24: ldc_w 306
    //   27: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: iload_1
    //   31: invokevirtual 309	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   34: ldc_w 311
    //   37: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokestatic 278	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: invokespecial 313	com/google/analytics/tracking/android/GAServiceProxy:m	()V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: new 165	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   60: ldc_w 306
    //   63: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: iload_1
    //   67: invokevirtual 309	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   70: ldc_w 315
    //   73: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 278	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   82: aload_0
    //   83: invokespecial 98	com/google/analytics/tracking/android/GAServiceProxy:j	()V
    //   86: goto -36 -> 50
    //   89: astore_3
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_3
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	GAServiceProxy
    //   0	94	1	paramInt	int
    //   0	94	2	paramIntent	android.content.Intent
    //   89	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	50	89	finally
    //   53	86	89	finally
  }
  
  public void a(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList)
  {
    Log.c("putHit called");
    this.i.add(new GAServiceProxy.HitParams(paramMap, paramLong, paramString, paramList));
    h();
  }
  
  public void b()
  {
    for (;;)
    {
      try
      {
        if (this.b == GAServiceProxy.ConnectState.f)
        {
          Log.c("Disconnected from service");
          g();
          this.b = GAServiceProxy.ConnectState.g;
          return;
        }
        Log.c("Unexpected disconnect.");
        this.b = GAServiceProxy.ConnectState.e;
        if (this.j < 2) {
          m();
        } else {
          j();
        }
      }
      finally {}
    }
  }
  
  public void c()
  {
    switch (GAServiceProxy.3.a[this.b.ordinal()])
    {
    default: 
      this.n = true;
    case 2: 
      return;
    }
    i();
  }
  
  public void d()
  {
    Log.c("clearHits called");
    this.i.clear();
    switch (GAServiceProxy.3.a[this.b.ordinal()])
    {
    default: 
      this.o = true;
      return;
    case 1: 
      this.d.a(0L);
      this.o = false;
      return;
    }
    this.c.a();
    this.o = false;
  }
  
  public void e()
  {
    for (;;)
    {
      try
      {
        boolean bool = this.q;
        if (bool) {
          return;
        }
        Log.c("setForceLocalDispatch called.");
        this.q = true;
        switch (GAServiceProxy.3.a[this.b.ordinal()])
        {
        case 1: 
        case 4: 
        case 5: 
        case 6: 
        case 2: 
          l();
          break;
        case 3: 
          this.p = true;
        }
      }
      finally {}
    }
  }
  
  public void f()
  {
    if (this.c != null) {
      return;
    }
    this.c = new AnalyticsGmsCoreClient(this.h, this, this);
    k();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAServiceProxy
 * JD-Core Version:    0.7.0.1
 */