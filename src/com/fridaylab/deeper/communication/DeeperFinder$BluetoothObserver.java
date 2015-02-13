package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.telesoftas.services.DeeperDevice;

public class DeeperFinder$BluetoothObserver
  extends BroadcastReceiver
  implements Runnable
{
  private boolean b;
  private String c;
  
  public DeeperFinder$BluetoothObserver(DeeperFinder paramDeeperFinder) {}
  
  public void a()
  {
    if (!this.b)
    {
      DeeperFinder.b(this.a).registerReceiver(this, BluetoothAgent.a);
      this.b = true;
    }
  }
  
  public void b()
  {
    if (this.b)
    {
      DeeperFinder.b(this.a).unregisterReceiver(this);
      this.b = false;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!paramIntent.getAction().equals("android.bluetooth.device.action.ACL_CONNECTED")) {}
    BluetoothDevice localBluetoothDevice;
    do
    {
      return;
      localBluetoothDevice = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
    } while ((localBluetoothDevice == null) || (!DeeperDevice.a(localBluetoothDevice)) || (this.c != null));
    this.c = localBluetoothDevice.getAddress();
    this.a.c.post(this);
  }
  
  public void run()
  {
    if (this.a.b) {
      return;
    }
    b();
    this.a.c.obtainMessage(501, 6, 0, this.c).sendToTarget();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperFinder.BluetoothObserver
 * JD-Core Version:    0.7.0.1
 */