package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

public final class jm
{
  final ArrayList<GoogleApiClient.ConnectionCallbacks> a = new ArrayList();
  private final jm.b b;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> c = new ArrayList();
  private boolean d = false;
  private final ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> e = new ArrayList();
  private final Handler f;
  
  public jm(Context paramContext, Looper paramLooper, jm.b paramb)
  {
    this.b = paramb;
    this.f = new jm.a(this, paramLooper);
  }
  
  protected void a()
  {
    synchronized (this.c)
    {
      a(this.b.b_());
      return;
    }
  }
  
  public void a(int paramInt)
  {
    this.f.removeMessages(1);
    synchronized (this.c)
    {
      this.d = true;
      Iterator localIterator = new ArrayList(this.c).iterator();
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks;
      do
      {
        if (localIterator.hasNext())
        {
          localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
          if (this.b.c_()) {}
        }
        else
        {
          this.d = false;
          return;
        }
      } while (!this.c.contains(localConnectionCallbacks));
      localConnectionCallbacks.a(paramInt);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool1 = true;
    for (;;)
    {
      synchronized (this.c)
      {
        if (!this.d)
        {
          bool2 = bool1;
          jx.a(bool2);
          this.f.removeMessages(1);
          this.d = true;
          if (this.a.size() != 0) {
            break label164;
          }
          jx.a(bool1);
          Iterator localIterator = new ArrayList(this.c).iterator();
          GoogleApiClient.ConnectionCallbacks localConnectionCallbacks;
          if (localIterator.hasNext())
          {
            localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
            if ((this.b.c_()) && (this.b.c())) {}
          }
          else
          {
            this.a.clear();
            this.d = false;
            return;
          }
          if (this.a.contains(localConnectionCallbacks)) {
            continue;
          }
          localConnectionCallbacks.a(paramBundle);
        }
      }
      boolean bool2 = false;
      continue;
      label164:
      bool1 = false;
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    this.f.removeMessages(1);
    synchronized (this.e)
    {
      Iterator localIterator = new ArrayList(this.e).iterator();
      while (localIterator.hasNext())
      {
        GooglePlayServicesClient.OnConnectionFailedListener localOnConnectionFailedListener = (GooglePlayServicesClient.OnConnectionFailedListener)localIterator.next();
        if (!this.b.c_()) {
          return;
        }
        if (this.e.contains(localOnConnectionFailedListener)) {
          localOnConnectionFailedListener.a(paramConnectionResult);
        }
      }
    }
  }
  
  public void a(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    jx.a(paramOnConnectionFailedListener);
    synchronized (this.e)
    {
      if (this.e.contains(paramOnConnectionFailedListener))
      {
        Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " is already registered");
        return;
      }
      this.e.add(paramOnConnectionFailedListener);
    }
  }
  
  public void a(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    jx.a(paramConnectionCallbacks);
    synchronized (this.c)
    {
      if (this.c.contains(paramConnectionCallbacks))
      {
        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + paramConnectionCallbacks + " is already registered");
        if (this.b.c()) {
          this.f.sendMessage(this.f.obtainMessage(1, paramConnectionCallbacks));
        }
        return;
      }
      this.c.add(paramConnectionCallbacks);
    }
  }
  
  public void b(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    jx.a(paramOnConnectionFailedListener);
    synchronized (this.e)
    {
      if ((this.e != null) && (!this.e.remove(paramOnConnectionFailedListener))) {
        Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " not found");
      }
      return;
    }
  }
  
  public void b(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    jx.a(paramConnectionCallbacks);
    synchronized (this.c)
    {
      if (this.c != null)
      {
        if (this.c.remove(paramConnectionCallbacks)) {
          break label63;
        }
        Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + paramConnectionCallbacks + " not found");
      }
      label63:
      while (!this.d) {
        return;
      }
      this.a.add(paramConnectionCallbacks);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jm
 * JD-Core Version:    0.7.0.1
 */