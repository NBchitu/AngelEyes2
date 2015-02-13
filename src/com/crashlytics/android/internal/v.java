package com.crashlytics.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class v
  extends p
{
  private b a = new B(m.a);
  private AtomicReference<q> b = new AtomicReference();
  private boolean c;
  private File d;
  private Application e;
  private WeakReference<Activity> f;
  private String g;
  private int h = 4;
  private ConcurrentHashMap<Class<? extends u>, u> i = new ConcurrentHashMap();
  
  public static v a()
  {
    return y.a();
  }
  
  private v a(Activity paramActivity)
  {
    this.f = new WeakReference(paramActivity);
    return this;
  }
  
  public static void a(Context paramContext, u... paramVarArgs)
  {
    for (;;)
    {
      try
      {
        boolean bool = y.a().x();
        if (bool) {
          return;
        }
        v localv1 = y.a();
        localv1.e = r.b(paramContext);
        v localv2 = localv1.a(r.a(paramContext));
        int j = paramVarArgs.length;
        int k = 0;
        if (k < j)
        {
          u localu = paramVarArgs[k];
          if (!localv2.i.containsKey(paramVarArgs)) {
            localv2.i.putIfAbsent(localu.getClass(), localu);
          }
        }
        else
        {
          localv2.b(paramContext);
          continue;
        }
        k++;
      }
      finally {}
    }
  }
  
  public final <T extends u> T a(Class<T> paramClass)
  {
    return (u)this.i.get(paramClass);
  }
  
  public final void a(q paramq)
  {
    this.b.set(paramq);
  }
  
  public final q b()
  {
    Object localObject = (q)this.b.get();
    if (localObject == null)
    {
      localObject = new r();
      if (!this.b.compareAndSet(null, localObject)) {
        localObject = (q)this.b.get();
      }
    }
    return localObject;
  }
  
  public final Application c()
  {
    return this.e;
  }
  
  public final Activity d()
  {
    if (this.f != null) {
      return (Activity)this.f.get();
    }
    return null;
  }
  
  protected final void e()
  {
    Context localContext = w();
    this.d = new File(localContext.getFilesDir(), "com.crashlytics.sdk.android");
    if (!this.d.exists()) {
      this.d.mkdirs();
    }
    if (Build.VERSION.SDK_INT >= 14) {
      w.a(new w(this, (byte)0), this.e);
    }
    if ((this.c) && (Log.isLoggable("CrashlyticsInternal", 3)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator2 = this.i.values().iterator();
      while (localIterator2.hasNext())
      {
        p localp = (p)localIterator2.next();
        long l = System.nanoTime();
        localp.b(localContext);
        localStringBuilder.append("sdkPerfStart.").append(localp.getClass().getName()).append('=').append(System.nanoTime() - l).append('\n');
      }
      Log.d("CrashlyticsInternal", localStringBuilder.toString());
    }
    for (;;)
    {
      return;
      Iterator localIterator1 = this.i.values().iterator();
      while (localIterator1.hasNext()) {
        ((p)localIterator1.next()).b(localContext);
      }
    }
  }
  
  public final String f()
  {
    return "1.1.13.29";
  }
  
  public final boolean g()
  {
    return this.c;
  }
  
  public final int h()
  {
    return this.h;
  }
  
  public final File i()
  {
    return this.d;
  }
  
  public final String j()
  {
    return this.g;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.v
 * JD-Core Version:    0.7.0.1
 */