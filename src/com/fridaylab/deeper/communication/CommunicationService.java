package com.fridaylab.deeper.communication;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;

public class CommunicationService
  extends Service
{
  private CommunicationService.GatewayThread a;
  private CommunicationGateway b;
  
  public static IntentFilter a()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.fridaylab.deeper.SERVICE");
    return localIntentFilter;
  }
  
  private void b()
  {
    if (this.a == null)
    {
      this.a = new CommunicationService.GatewayThread(this);
      this.a.start();
    }
  }
  
  private void c()
  {
    if (this.a != null)
    {
      this.a = null;
      this.b = null;
      stopSelf();
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    if (this.b == null)
    {
      b();
      this.b = new CommunicationGateway(this.a.a());
    }
    return this.b;
  }
  
  public void onCreate()
  {
    super.onCreate();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.a != null)
    {
      this.a.a().obtainMessage(-1).sendToTarget();
      this.a = null;
      this.b = null;
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    b();
    LocalBroadcastManager.a(this).a(new Intent().setAction("com.fridaylab.deeper.SERVICE"));
    return 2;
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    this.a.a().obtainMessage(-1).sendToTarget();
    return super.onUnbind(paramIntent);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.CommunicationService
 * JD-Core Version:    0.7.0.1
 */