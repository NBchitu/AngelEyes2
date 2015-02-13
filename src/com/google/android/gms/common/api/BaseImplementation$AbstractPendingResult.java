package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class BaseImplementation$AbstractPendingResult<R extends Result>
  implements PendingResult<R>
{
  protected final BaseImplementation.CallbackHandler<R> a;
  private final Object b = new Object();
  private final CountDownLatch c = new CountDownLatch(1);
  private final ArrayList<PendingResult.a> d = new ArrayList();
  private ResultCallback<R> e;
  private volatile R f;
  private volatile boolean g;
  private boolean h;
  private boolean i;
  private jr j;
  
  protected BaseImplementation$AbstractPendingResult(Looper paramLooper)
  {
    this.a = new BaseImplementation.CallbackHandler(paramLooper);
  }
  
  private void b(R paramR)
  {
    this.f = paramR;
    this.j = null;
    this.c.countDown();
    Status localStatus = this.f.b();
    if (this.e != null)
    {
      this.a.a();
      if (!this.h) {
        this.a.a(this.e, f());
      }
    }
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((PendingResult.a)localIterator.next()).a(localStatus);
    }
    this.d.clear();
  }
  
  private R f()
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if (!this.g)
        {
          bool = true;
          jx.a(bool, "Result has already been consumed.");
          jx.a(a(), "Result is not ready.");
          Result localResult = this.f;
          c();
          return localResult;
        }
      }
      boolean bool = false;
    }
  }
  
  private void g()
  {
    synchronized (this.b)
    {
      if (!a())
      {
        a(a(Status.d));
        this.i = true;
      }
      return;
    }
  }
  
  protected abstract R a(Status paramStatus);
  
  public final void a(R paramR)
  {
    boolean bool1 = true;
    for (;;)
    {
      synchronized (this.b)
      {
        if ((this.i) || (this.h))
        {
          BaseImplementation.a(paramR);
          return;
        }
        if (!a())
        {
          bool2 = bool1;
          jx.a(bool2, "Results have already been set");
          if (this.g) {
            break label81;
          }
          jx.a(bool1, "Result has already been consumed");
          b(paramR);
          return;
        }
      }
      boolean bool2 = false;
      continue;
      label81:
      bool1 = false;
    }
  }
  
  public final boolean a()
  {
    return this.c.getCount() == 0L;
  }
  
  public void b()
  {
    synchronized (this.b)
    {
      if ((this.h) || (this.g)) {
        return;
      }
      jr localjr = this.j;
      if (localjr == null) {}
    }
    try
    {
      this.j.a();
      label42:
      BaseImplementation.a(this.f);
      this.e = null;
      this.h = true;
      b(a(Status.e));
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      break label42;
    }
  }
  
  protected void c()
  {
    this.g = true;
    this.f = null;
    this.e = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult
 * JD-Core Version:    0.7.0.1
 */