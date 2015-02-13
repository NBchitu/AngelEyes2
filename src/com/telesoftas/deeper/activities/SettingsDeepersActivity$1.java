package com.telesoftas.deeper.activities;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.fridaylab.deeper.communication.CommunicationGateway;
import com.fridaylab.deeper.communication.CommunicationProtocol.ConnectionInfo;
import com.fridaylab.deeper.communication.CommunicationProtocol.ConnectionState;
import com.fridaylab.deeper.communication.DeeperModel;
import com.telesoftas.services.DeeperDevice;

class SettingsDeepersActivity$1
  implements ServiceConnection
{
  SettingsDeepersActivity$1(SettingsDeepersActivity paramSettingsDeepersActivity) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    SettingsDeepersActivity.a(this.a, (CommunicationGateway)paramIBinder);
    CommunicationProtocol.ConnectionInfo localConnectionInfo = SettingsDeepersActivity.a(this.a).c();
    if (localConnectionInfo.b.j())
    {
      this.a.setResult(1);
      SettingsDeepersActivity.b(this.a);
      this.a.finish();
    }
    for (;;)
    {
      this.a.p = true;
      return;
      if (localConnectionInfo.a == CommunicationProtocol.ConnectionState.f)
      {
        DeeperDevice localDeeperDevice = new DeeperDevice(this.a.n.getRemoteDevice(localConnectionInfo.b.c()));
        localDeeperDevice.a(true, localConnectionInfo.b.q());
        SettingsDeepersActivity.a(this.a, localDeeperDevice);
      }
      else
      {
        SettingsDeepersActivity.a(this.a).a();
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    SettingsDeepersActivity.a(this.a, null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity.1
 * JD-Core Version:    0.7.0.1
 */