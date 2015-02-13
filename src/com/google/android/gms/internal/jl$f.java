package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class jl$f
  implements ServiceConnection
{
  public jl$f(jl paramjl) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.b(paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.a.sendMessage(this.a.a.obtainMessage(4, Integer.valueOf(1)));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jl.f
 * JD-Core Version:    0.7.0.1
 */