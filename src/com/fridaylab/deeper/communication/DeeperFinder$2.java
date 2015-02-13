package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fridaylab.util.Flog;
import com.telesoftas.services.DeeperDevice;
import java.util.ArrayDeque;

class DeeperFinder$2
  extends BroadcastReceiver
{
  DeeperFinder$2(DeeperFinder paramDeeperFinder) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    Flog.b(paramIntent.getAction());
    if ("android.bluetooth.device.action.FOUND".equals(str))
    {
      localBluetoothDevice = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if ((localBluetoothDevice != null) && (DeeperDevice.a(DeeperFinder.b(this.a), localBluetoothDevice)))
      {
        if (!localBluetoothDevice.getAddress().equals(DeeperFinder.d(this.a))) {
          break label90;
        }
        DeeperFinder.e(this.a).addFirst(localBluetoothDevice);
        DeeperFinder.f(this.a);
      }
    }
    label90:
    while (!"android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(str)) {
      for (;;)
      {
        BluetoothDevice localBluetoothDevice;
        return;
        if (localBluetoothDevice.getBondState() == 12) {
          DeeperFinder.e(this.a).addFirst(localBluetoothDevice);
        }
        while (DeeperFinder.d(this.a) == null)
        {
          DeeperFinder.f(this.a);
          return;
          DeeperFinder.e(this.a).addLast(localBluetoothDevice);
        }
      }
    }
    DeeperFinder.f(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperFinder.2
 * JD-Core Version:    0.7.0.1
 */