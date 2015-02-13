package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api.a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;

public abstract class jl<T extends IInterface>
  implements Api.a, jm.b
{
  public static final String[] c = { "service_esmobile", "service_googleme" };
  final Handler a;
  boolean b = false;
  private final Context d;
  private final Looper e;
  private final Object f = new Object();
  private T g;
  private final ArrayList<jl<T>.b<?>> h = new ArrayList();
  private jl<T>.f i;
  private int j = 1;
  private final String[] k;
  private final jm l;
  
  protected jl(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String... paramVarArgs)
  {
    this.d = ((Context)jx.a(paramContext));
    this.e = ((Looper)jx.a(paramLooper, "Looper must not be null"));
    this.l = new jm(paramContext, paramLooper, this);
    this.a = new jl.a(this, paramLooper);
    a(paramVarArgs);
    this.k = paramVarArgs;
    a((GoogleApiClient.ConnectionCallbacks)jx.a(paramConnectionCallbacks));
    a((GoogleApiClient.OnConnectionFailedListener)jx.a(paramOnConnectionFailedListener));
  }
  
  private void a(int paramInt, T paramT)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (paramInt == 3)
    {
      bool2 = bool1;
      if (paramT == null) {
        break label65;
      }
      bool3 = bool1;
      label17:
      if (bool2 != bool3) {
        break label71;
      }
    }
    for (;;)
    {
      jx.b(bool1);
      synchronized (this.f)
      {
        this.j = paramInt;
        this.g = paramT;
        return;
      }
      bool2 = false;
      break;
      label65:
      bool3 = false;
      break label17;
      label71:
      bool1 = false;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.f)
    {
      if (this.j != paramInt1) {
        return false;
      }
      a(paramInt2, paramT);
      return true;
    }
  }
  
  protected abstract T a(IBinder paramIBinder);
  
  public void a()
  {
    this.b = true;
    a(2, null);
    int m = GooglePlayServicesUtil.a(this.d);
    if (m != 0)
    {
      a(1, null);
      this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(m)));
    }
    do
    {
      return;
      if (this.i != null)
      {
        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + d());
        jn.a(this.d).b(d(), this.i);
      }
      this.i = new jl.f(this);
    } while (jn.a(this.d).a(d(), this.i));
    Log.e("GmsClient", "unable to connect to service: " + d());
    this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(9)));
  }
  
  public void a(int paramInt)
  {
    this.a.sendMessage(this.a.obtainMessage(4, Integer.valueOf(paramInt)));
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    this.a.sendMessage(this.a.obtainMessage(1, new jl.h(this, paramInt, paramIBinder, paramBundle)));
  }
  
  public void a(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.l.a(paramConnectionCallbacks);
  }
  
  public void a(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.l.a(paramOnConnectionFailedListener);
  }
  
  protected abstract void a(jt paramjt, jl.e parame);
  
  protected void a(String... paramVarArgs) {}
  
  public void b()
  {
    this.b = false;
    synchronized (this.h)
    {
      int m = this.h.size();
      for (int n = 0; n < m; n++) {
        ((jl.b)this.h.get(n)).d();
      }
      this.h.clear();
      a(1, null);
      if (this.i != null)
      {
        jn.a(this.d).b(d(), this.i);
        this.i = null;
      }
      return;
    }
  }
  
  protected final void b(IBinder paramIBinder)
  {
    try
    {
      a(jt.a.a(paramIBinder), new jl.e(this));
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      Log.w("GmsClient", "service died");
      a(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("GmsClient", "Remote exception occurred", localRemoteException);
    }
  }
  
  public Bundle b_()
  {
    return null;
  }
  
  public boolean c()
  {
    for (;;)
    {
      synchronized (this.f)
      {
        if (this.j == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean c_()
  {
    return this.b;
  }
  
  protected abstract String d();
  
  protected abstract String e();
  
  public boolean f()
  {
    for (;;)
    {
      synchronized (this.f)
      {
        if (this.j == 2)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final Context g()
  {
    return this.d;
  }
  
  protected final void h()
  {
    if (!c()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public final T i()
  {
    synchronized (this.f)
    {
      if (this.j == 4) {
        throw new DeadObjectException();
      }
    }
    h();
    if (this.g != null) {}
    for (boolean bool = true;; bool = false)
    {
      jx.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.g;
      return localIInterface;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jl
 * JD-Core Version:    0.7.0.1
 */