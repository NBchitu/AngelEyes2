package com.google.tagmanager;

import android.content.Context;
import android.os.Handler;

class ServiceManagerImpl
  extends ServiceManager
{
  private static final Object a = new Object();
  private static ServiceManagerImpl n;
  private Context b;
  private HitStore c;
  private volatile HitSendingThread d;
  private int e = 1800;
  private boolean f = true;
  private boolean g = false;
  private boolean h = true;
  private boolean i = true;
  private HitStoreStateListener j = new ServiceManagerImpl.1(this);
  private Handler k;
  private NetworkReceiver l;
  private boolean m = false;
  
  public static ServiceManagerImpl b()
  {
    if (n == null) {
      n = new ServiceManagerImpl();
    }
    return n;
  }
  
  private void f()
  {
    this.l = new NetworkReceiver(this);
    this.l.a(this.b);
  }
  
  private void g()
  {
    this.k = new Handler(this.b.getMainLooper(), new ServiceManagerImpl.2(this));
    if (this.e > 0) {
      this.k.sendMessageDelayed(this.k.obtainMessage(1, a), 1000 * this.e);
    }
  }
  
  void a()
  {
    try
    {
      if ((!this.m) && (this.h) && (this.e > 0))
      {
        this.k.removeMessages(1, a);
        this.k.sendMessage(this.k.obtainMessage(1, a));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  void a(Context paramContext, HitSendingThread paramHitSendingThread)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 79	com/google/tagmanager/ServiceManagerImpl:b	Landroid/content/Context;
    //   6: astore 4
    //   8: aload 4
    //   10: ifnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 117	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   21: putfield 79	com/google/tagmanager/ServiceManagerImpl:b	Landroid/content/Context;
    //   24: aload_0
    //   25: getfield 119	com/google/tagmanager/ServiceManagerImpl:d	Lcom/google/tagmanager/HitSendingThread;
    //   28: ifnonnull -15 -> 13
    //   31: aload_0
    //   32: aload_2
    //   33: putfield 119	com/google/tagmanager/ServiceManagerImpl:d	Lcom/google/tagmanager/HitSendingThread;
    //   36: goto -23 -> 13
    //   39: astore_3
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_3
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	ServiceManagerImpl
    //   0	44	1	paramContext	Context
    //   0	44	2	paramHitSendingThread	HitSendingThread
    //   39	4	3	localObject	Object
    //   6	3	4	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	8	39	finally
    //   16	36	39	finally
  }
  
  void a(boolean paramBoolean)
  {
    try
    {
      a(this.m, paramBoolean);
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
        if (this.m == paramBoolean1)
        {
          boolean bool = this.h;
          if (bool == paramBoolean2) {
            return;
          }
        }
        if (((paramBoolean1) || (!paramBoolean2)) && (this.e > 0)) {
          this.k.removeMessages(1, a);
        }
        if ((!paramBoolean1) && (paramBoolean2) && (this.e > 0)) {
          this.k.sendMessageDelayed(this.k.obtainMessage(1, a), 1000 * this.e);
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
      Log.e(str);
      this.m = paramBoolean1;
      this.h = paramBoolean2;
      continue;
      label150:
      String str = "terminated.";
      continue;
      label157:
      str = "initiated.";
    }
  }
  
  HitStore c()
  {
    try
    {
      if (this.c != null) {
        break label50;
      }
      if (this.b == null) {
        throw new IllegalStateException("Cant get a store unless we have a context");
      }
    }
    finally {}
    this.c = new PersistentHitStore(this.j, this.b);
    label50:
    if (this.k == null) {
      g();
    }
    this.g = true;
    if (this.f)
    {
      d();
      this.f = false;
    }
    if ((this.l == null) && (this.i)) {
      f();
    }
    HitStore localHitStore = this.c;
    return localHitStore;
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/google/tagmanager/ServiceManagerImpl:g	Z
    //   6: ifne +16 -> 22
    //   9: ldc 165
    //   11: invokestatic 141	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 42	com/google/tagmanager/ServiceManagerImpl:f	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 119	com/google/tagmanager/ServiceManagerImpl:d	Lcom/google/tagmanager/HitSendingThread;
    //   26: new 167	com/google/tagmanager/ServiceManagerImpl$3
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 168	com/google/tagmanager/ServiceManagerImpl$3:<init>	(Lcom/google/tagmanager/ServiceManagerImpl;)V
    //   34: invokeinterface 173 2 0
    //   39: goto -20 -> 19
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	ServiceManagerImpl
    //   42	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	42	finally
    //   22	39	42	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ServiceManagerImpl
 * JD-Core Version:    0.7.0.1
 */