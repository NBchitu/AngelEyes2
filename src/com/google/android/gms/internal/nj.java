package com.google.android.gms.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class nj
{
  private final np<ni> a;
  private final Context b;
  private ContentProviderClient c = null;
  private boolean d = false;
  private HashMap<LocationListener, nj.b> e = new HashMap();
  
  public nj(Context paramContext, np<ni> paramnp)
  {
    this.b = paramContext;
    this.a = paramnp;
  }
  
  private nj.b a(LocationListener paramLocationListener, Looper paramLooper)
  {
    if (paramLooper == null) {
      jx.a(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
    }
    synchronized (this.e)
    {
      nj.b localb = (nj.b)this.e.get(paramLocationListener);
      if (localb == null) {
        localb = new nj.b(paramLocationListener, paramLooper);
      }
      this.e.put(paramLocationListener, localb);
      return localb;
    }
  }
  
  public Location a()
  {
    this.a.a();
    try
    {
      Location localLocation = ((ni)this.a.c()).a(this.b.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void a(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    this.a.a();
    nj.b localb = a(paramLocationListener, paramLooper);
    ((ni)this.a.c()).a(paramLocationRequest, localb);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a();
    ((ni)this.a.c()).a(paramBoolean);
    this.d = paramBoolean;
  }
  
  public void b()
  {
    try
    {
      synchronized (this.e)
      {
        Iterator localIterator = this.e.values().iterator();
        while (localIterator.hasNext())
        {
          nj.b localb = (nj.b)localIterator.next();
          if (localb != null) {
            ((ni)this.a.c()).a(localb);
          }
        }
      }
      this.e.clear();
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void c()
  {
    if (this.d) {}
    try
    {
      a(false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nj
 * JD-Core Version:    0.7.0.1
 */