package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class jl$e
  extends js.a
{
  private jl a;
  
  public jl$e(jl paramjl)
  {
    this.a = paramjl;
  }
  
  public void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    jx.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
    this.a.a(paramInt, paramIBinder, paramBundle);
    this.a = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jl.e
 * JD-Core Version:    0.7.0.1
 */