package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

public class jn$a$a
  implements ServiceConnection
{
  public jn$a$a(jn.a parama) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (jn.a(this.a.a))
    {
      jn.a.a(this.a, paramIBinder);
      jn.a.a(this.a, paramComponentName);
      Iterator localIterator = jn.a.a(this.a).iterator();
      if (localIterator.hasNext()) {
        ((jl.f)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    jn.a.a(this.a, 1);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (jn.a(this.a.a))
    {
      jn.a.a(this.a, null);
      jn.a.a(this.a, paramComponentName);
      Iterator localIterator = jn.a.a(this.a).iterator();
      if (localIterator.hasNext()) {
        ((jl.f)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    jn.a.a(this.a, 2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jn.a.a
 * JD-Core Version:    0.7.0.1
 */