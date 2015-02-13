package com.google.analytics.tracking.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.Command;
import com.google.android.gms.analytics.internal.IAnalyticsService;
import java.util.List;
import java.util.Map;

class AnalyticsGmsCoreClient
  implements AnalyticsClient
{
  private ServiceConnection a;
  private AnalyticsGmsCoreClient.OnConnectedListener b;
  private AnalyticsGmsCoreClient.OnConnectionFailedListener c;
  private Context d;
  private IAnalyticsService e;
  
  public AnalyticsGmsCoreClient(Context paramContext, AnalyticsGmsCoreClient.OnConnectedListener paramOnConnectedListener, AnalyticsGmsCoreClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.d = paramContext;
    if (paramOnConnectedListener == null) {
      throw new IllegalArgumentException("onConnectedListener cannot be null");
    }
    this.b = paramOnConnectedListener;
    if (paramOnConnectionFailedListener == null) {
      throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
    }
    this.c = paramOnConnectionFailedListener;
  }
  
  private IAnalyticsService f()
  {
    d();
    return this.e;
  }
  
  private void g()
  {
    h();
  }
  
  private void h()
  {
    this.b.a();
  }
  
  public void a()
  {
    try
    {
      f().a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.a("clear hits failed: " + localRemoteException);
    }
  }
  
  public void a(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList)
  {
    try
    {
      f().a(paramMap, paramLong, paramString, paramList);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.a("sendHit failed: " + localRemoteException);
    }
  }
  
  public void b()
  {
    Intent localIntent = new Intent("com.google.android.gms.analytics.service.START");
    localIntent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
    localIntent.putExtra("app_package_name", this.d.getPackageName());
    if (this.a != null) {
      Log.a("Calling connect() while still connected, missing disconnect().");
    }
    boolean bool;
    do
    {
      return;
      this.a = new AnalyticsGmsCoreClient.AnalyticsServiceConnection(this);
      bool = this.d.bindService(localIntent, this.a, 129);
      Log.c("connect: bindService returned " + bool + " for " + localIntent);
    } while (bool);
    this.a = null;
    this.c.a(1, null);
  }
  
  public void c()
  {
    this.e = null;
    if (this.a != null) {}
    try
    {
      this.d.unbindService(this.a);
      label23:
      this.a = null;
      this.b.b();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label23;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label23;
    }
  }
  
  protected void d()
  {
    if (!e()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public boolean e()
  {
    return this.e != null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.AnalyticsGmsCoreClient
 * JD-Core Version:    0.7.0.1
 */