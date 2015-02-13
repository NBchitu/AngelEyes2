package com.telesoftas.deeper.activities;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.fridaylab.deeper.communication.CommunicationGateway;
import com.fridaylab.deeper.communication.CommunicationProtocol.Recorder;
import com.fridaylab.deeper.communication.CommunicationService;
import com.telesoftas.utilities.deeper.SettingsUtils;

class MainDeeperActivity$5
  implements ServiceConnection
{
  MainDeeperActivity$5(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    MainDeeperActivity.a(this.a, (CommunicationGateway)paramIBinder);
    MainDeeperActivity.h(this.a).a(MainDeeperActivity.d(this.a));
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    MainDeeperActivity.a(this.a, MainDeeperActivity.h(this.a));
    if (MainDeeperActivity.i(this.a))
    {
      MainDeeperActivity.h(this.a).a(SettingsUtils.d(this.a), true);
      this.a.startService(new Intent(this.a, CommunicationService.class));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.5
 * JD-Core Version:    0.7.0.1
 */