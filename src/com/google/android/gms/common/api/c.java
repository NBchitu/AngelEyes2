package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jm.b;
import com.google.android.gms.internal.jx;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c
  implements GoogleApiClient
{
  final Queue<c.d<?>> a = new LinkedList();
  final Handler b;
  BroadcastReceiver c;
  final Set<c.d<?>> d = Collections.newSetFromMap(new ConcurrentHashMap());
  private final Lock e = new ReentrantLock();
  private final Condition f = this.e.newCondition();
  private final jm g;
  private final int h;
  private final Context i;
  private final Looper j;
  private ConnectionResult k;
  private int l;
  private volatile int m = 4;
  private volatile boolean n;
  private boolean o = false;
  private int p;
  private long q = 120000L;
  private long r = 5000L;
  private final Bundle s = new Bundle();
  private final Map<Api.c<?>, Api.a> t = new HashMap();
  private final List<String> u;
  private boolean v;
  private final Set<d<?>> w = Collections.newSetFromMap(new WeakHashMap());
  private final c.b x = new c.1(this);
  private final GoogleApiClient.ConnectionCallbacks y = new c.2(this);
  private final jm.b z = new c.3(this);
  
  public c(Context paramContext, Looper paramLooper, jg paramjg, Map<Api<?>, Api.ApiOptions> paramMap, Set<GoogleApiClient.ConnectionCallbacks> paramSet, Set<GoogleApiClient.OnConnectionFailedListener> paramSet1, int paramInt)
  {
    this.i = paramContext;
    this.g = new jm(paramContext, paramLooper, this.z);
    this.j = paramLooper;
    this.b = new c.c(this, paramLooper);
    this.h = paramInt;
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator1.next();
      this.g.a(localConnectionCallbacks);
    }
    Iterator localIterator2 = paramSet1.iterator();
    while (localIterator2.hasNext())
    {
      GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener)localIterator2.next();
      this.g.a(localOnConnectionFailedListener);
    }
    Iterator localIterator3 = paramMap.keySet().iterator();
    while (localIterator3.hasNext())
    {
      Api localApi = (Api)localIterator3.next();
      Api.b localb = localApi.a();
      Object localObject = paramMap.get(localApi);
      this.t.put(localApi.c(), a(localb, localObject, paramContext, paramLooper, paramjg, this.y, new c.4(this, localb)));
    }
    this.u = Collections.unmodifiableList(paramjg.b());
  }
  
  private static <C extends Api.a, O> C a(Api.b<C, O> paramb, Object paramObject, Context paramContext, Looper paramLooper, jg paramjg, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return paramb.a(paramContext, paramLooper, paramjg, paramObject, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private void a(int paramInt)
  {
    this.e.lock();
    try
    {
      if (this.m == 3) {
        break label373;
      }
      if (paramInt != -1) {
        break label236;
      }
      if (e())
      {
        Iterator localIterator4 = this.a.iterator();
        while (localIterator4.hasNext())
        {
          c.d locald = (c.d)localIterator4.next();
          if (locald.e() != 1)
          {
            locald.b();
            localIterator4.remove();
          }
        }
      }
      this.a.clear();
    }
    finally
    {
      this.e.unlock();
    }
    Iterator localIterator1 = this.d.iterator();
    while (localIterator1.hasNext()) {
      ((c.d)localIterator1.next()).b();
    }
    this.d.clear();
    Iterator localIterator2 = this.w.iterator();
    while (localIterator2.hasNext()) {
      ((d)localIterator2.next()).a();
    }
    this.w.clear();
    if ((this.k == null) && (!this.a.isEmpty()))
    {
      this.o = true;
      this.e.unlock();
      return;
    }
    label236:
    boolean bool1 = e();
    boolean bool2 = d();
    this.m = 3;
    if (bool1)
    {
      if (paramInt == -1) {
        this.k = null;
      }
      this.f.signalAll();
    }
    this.v = false;
    Iterator localIterator3 = this.t.values().iterator();
    while (localIterator3.hasNext())
    {
      Api.a locala = (Api.a)localIterator3.next();
      if (locala.c()) {
        locala.b();
      }
    }
    this.v = true;
    this.m = 4;
    if (bool2)
    {
      if (paramInt != -1) {
        this.g.a(paramInt);
      }
      this.v = false;
    }
    label373:
    this.e.unlock();
  }
  
  private <A extends Api.a> void a(c.d<A> paramd)
  {
    this.e.lock();
    try
    {
      if (paramd.d() != null) {}
      for (boolean bool = true;; bool = false)
      {
        jx.b(bool, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        this.d.add(paramd);
        paramd.a(this.x);
        if (!f()) {
          break;
        }
        paramd.b(new Status(8));
        return;
      }
      paramd.a(a(paramd.d()));
      return;
    }
    finally
    {
      this.e.unlock();
    }
  }
  
  private void g()
  {
    this.p = (-1 + this.p);
    if (this.p == 0)
    {
      if (this.k != null)
      {
        this.o = false;
        a(3);
        if ((!f()) || (!GooglePlayServicesUtil.c(this.i, this.k.c())))
        {
          j();
          this.g.a(this.k);
        }
        this.v = false;
      }
    }
    else {
      return;
    }
    this.m = 2;
    j();
    this.f.signalAll();
    h();
    if (this.o)
    {
      this.o = false;
      a(-1);
      return;
    }
    if (this.s.isEmpty()) {}
    for (Bundle localBundle = null;; localBundle = this.s)
    {
      this.g.a(localBundle);
      return;
    }
  }
  
  private void h()
  {
    this.e.lock();
    for (;;)
    {
      boolean bool1;
      try
      {
        if (d()) {
          break label110;
        }
        if (!f()) {
          break label95;
        }
      }
      finally
      {
        boolean bool2;
        this.e.unlock();
      }
      jx.a(bool1, "GoogleApiClient is not connected yet.");
      bool2 = this.a.isEmpty();
      if (!bool2)
      {
        try
        {
          a((c.d)this.a.remove());
        }
        catch (DeadObjectException localDeadObjectException)
        {
          Log.w("GoogleApiClientImpl", "Service died while flushing queue", localDeadObjectException);
        }
        continue;
        label95:
        bool1 = false;
      }
      else
      {
        this.e.unlock();
        return;
        label110:
        bool1 = true;
      }
    }
  }
  
  private void i()
  {
    this.e.lock();
    try
    {
      if (f()) {
        b();
      }
      return;
    }
    finally
    {
      this.e.unlock();
    }
  }
  
  private void j()
  {
    this.e.lock();
    try
    {
      boolean bool = this.n;
      if (!bool) {
        return;
      }
      this.n = false;
      this.b.removeMessages(2);
      this.b.removeMessages(1);
      this.i.unregisterReceiver(this.c);
      return;
    }
    finally
    {
      this.e.unlock();
    }
  }
  
  public Looper a()
  {
    return this.j;
  }
  
  public <C extends Api.a> C a(Api.c<C> paramc)
  {
    Api.a locala = (Api.a)this.t.get(paramc);
    jx.a(locala, "Appropriate Api was not requested.");
    return locala;
  }
  
  public <A extends Api.a, T extends BaseImplementation.a<? extends Result, A>> T a(T paramT)
  {
    if ((d()) || (f())) {}
    for (boolean bool = true;; bool = false)
    {
      jx.a(bool, "GoogleApiClient is not connected yet.");
      h();
      try
      {
        a(paramT);
        return paramT;
      }
      catch (DeadObjectException localDeadObjectException)
      {
        a(1);
      }
    }
    return paramT;
  }
  
  public void a(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.g.a(paramConnectionCallbacks);
  }
  
  public void a(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.g.a(paramOnConnectionFailedListener);
  }
  
  public void b()
  {
    this.e.lock();
    try
    {
      this.o = false;
      if (!d())
      {
        boolean bool = e();
        if (!bool) {}
      }
      else
      {
        return;
      }
      this.v = true;
      this.k = null;
      this.m = 1;
      this.s.clear();
      this.p = this.t.size();
      Iterator localIterator = this.t.values().iterator();
      while (localIterator.hasNext()) {
        ((Api.a)localIterator.next()).a();
      }
    }
    finally
    {
      this.e.unlock();
    }
  }
  
  public void b(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.g.b(paramConnectionCallbacks);
  }
  
  public void b(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.g.b(paramOnConnectionFailedListener);
  }
  
  public void c()
  {
    j();
    a(-1);
  }
  
  public boolean d()
  {
    return this.m == 2;
  }
  
  public boolean e()
  {
    return this.m == 1;
  }
  
  boolean f()
  {
    return this.n;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c
 * JD-Core Version:    0.7.0.1
 */