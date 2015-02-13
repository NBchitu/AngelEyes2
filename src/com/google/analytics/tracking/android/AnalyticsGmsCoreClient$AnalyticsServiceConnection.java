package com.google.analytics.tracking.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.IAnalyticsService.Stub;

final class AnalyticsGmsCoreClient$AnalyticsServiceConnection
  implements ServiceConnection
{
  AnalyticsGmsCoreClient$AnalyticsServiceConnection(AnalyticsGmsCoreClient paramAnalyticsGmsCoreClient) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Log.c("service connected, binder: " + paramIBinder);
    try
    {
      if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(paramIBinder.getInterfaceDescriptor()))
      {
        Log.c("bound to service");
        AnalyticsGmsCoreClient.a(this.a, IAnalyticsService.Stub.a(paramIBinder));
        AnalyticsGmsCoreClient.a(this.a);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      AnalyticsGmsCoreClient.b(this.a).unbindService(this);
      AnalyticsGmsCoreClient.a(this.a, null);
      AnalyticsGmsCoreClient.c(this.a).a(2, null);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.c("service disconnected: " + paramComponentName);
    AnalyticsGmsCoreClient.a(this.a, null);
    AnalyticsGmsCoreClient.d(this.a).b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.AnalyticsGmsCoreClient.AnalyticsServiceConnection
 * JD-Core Version:    0.7.0.1
 */