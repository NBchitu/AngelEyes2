package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

public final class jl$h
  extends jl<T>.b<Boolean>
{
  public final int b;
  public final Bundle c;
  public final IBinder d;
  
  public jl$h(jl paramjl, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramjl, Boolean.valueOf(true));
    this.b = paramInt;
    this.d = paramIBinder;
    this.c = paramBundle;
  }
  
  protected void a() {}
  
  protected void a(Boolean paramBoolean)
  {
    if (paramBoolean == null)
    {
      jl.a(this.e, 1, null);
      return;
    }
    switch (this.b)
    {
    default: 
      if (this.c == null) {
        break;
      }
    }
    for (PendingIntent localPendingIntent = (PendingIntent)this.c.getParcelable("pendingIntent");; localPendingIntent = null)
    {
      if (jl.c(this.e) != null)
      {
        jn.a(jl.d(this.e)).b(this.e.d(), jl.c(this.e));
        jl.a(this.e, null);
      }
      jl.a(this.e, 1, null);
      jl.a(this.e).a(new ConnectionResult(this.b, localPendingIntent));
      return;
      try
      {
        String str = this.d.getInterfaceDescriptor();
        if (this.e.e().equals(str))
        {
          IInterface localIInterface = this.e.a(this.d);
          if (localIInterface != null)
          {
            jl.a(this.e, 3, localIInterface);
            jl.a(this.e).a();
            return;
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        jn.a(jl.d(this.e)).b(this.e.d(), jl.c(this.e));
        jl.a(this.e, null);
        jl.a(this.e, 1, null);
        jl.a(this.e).a(new ConnectionResult(8, null));
        return;
      }
      jl.a(this.e, 1, null);
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jl.h
 * JD-Core Version:    0.7.0.1
 */