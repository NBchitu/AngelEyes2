package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class DeeperLink$BluetoothObserver
  extends BroadcastReceiver
  implements Runnable
{
  private boolean b;
  
  public DeeperLink$BluetoothObserver(DeeperLink paramDeeperLink) {}
  
  public void a()
  {
    if (!this.b)
    {
      DeeperLink.g(this.a).registerReceiver(this, BluetoothAgent.a);
      this.b = true;
    }
  }
  
  public void b()
  {
    if (this.b)
    {
      DeeperLink.g(this.a).unregisterReceiver(this);
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
    } while ((localBluetoothDevice == null) || (!TextUtils.equals(localBluetoothDevice.getAddress(), DeeperLink.h(this.a))));
    this.a.c.post(this);
  }
  
  public void run()
  {
    if (this.a.b) {}
    while (!DeeperLink.l(this.a)) {
      return;
    }
    DeeperLink.a(this.a, true);
    b();
    if (DeeperLink.m(this.a) != null)
    {
      DeeperLink.m(this.a).b();
      return;
    }
    DeeperLink.a(this.a, 3);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperLink.BluetoothObserver
 * JD-Core Version:    0.7.0.1
 */