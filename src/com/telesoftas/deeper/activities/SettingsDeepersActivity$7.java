package com.telesoftas.deeper.activities;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import com.telesoftas.services.DeeperDevice;

class SettingsDeepersActivity$7
  extends BroadcastReceiver
{
  SettingsDeepersActivity$7(SettingsDeepersActivity paramSettingsDeepersActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if ("android.bluetooth.device.action.FOUND".equals(str))
    {
      BluetoothDevice localBluetoothDevice = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if ((localBluetoothDevice != null) && (DeeperDevice.a(localBluetoothDevice))) {
        SettingsDeepersActivity.a(this.a, new DeeperDevice(localBluetoothDevice));
      }
    }
    do
    {
      return;
      if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(str))
      {
        SettingsDeepersActivity.f(this.a).setVisibility(0);
        return;
      }
    } while (!"android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(str));
    if (this.a.p)
    {
      this.a.p = false;
      SettingsDeepersActivity.f(this.a).setVisibility(0);
      new Handler().postDelayed(new SettingsDeepersActivity.7.1(this), 800L);
      return;
    }
    SettingsDeepersActivity.f(this.a).setVisibility(8);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity.7
 * JD-Core Version:    0.7.0.1
 */