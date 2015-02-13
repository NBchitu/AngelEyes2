package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class BluetoothACLReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.bluetooth.device.action.ACL_CONNECTED".equals(paramIntent.getAction()))
    {
      BluetoothDevice localBluetoothDevice = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if (localBluetoothDevice != null) {
        paramContext.getSharedPreferences("btmonitoring", 0).edit().putLong(localBluetoothDevice.getAddress(), System.currentTimeMillis()).apply();
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.BluetoothACLReceiver
 * JD-Core Version:    0.7.0.1
 */