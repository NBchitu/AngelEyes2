package com.telesoftas.deeper.activities;

import android.bluetooth.BluetoothAdapter;
import com.fridaylab.util.AsyncDelegate;

class SettingsDeepersActivity$4
  extends AsyncDelegate
{
  SettingsDeepersActivity$4(SettingsDeepersActivity paramSettingsDeepersActivity) {}
  
  public void d()
  {
    long l = 1L + 5000L / 100L;
    for (int i = 0; (!this.a.n.isEnabled()) && (i < l); i++) {
      Thread.sleep(100L);
    }
    if (!this.a.n.isDiscovering()) {
      this.a.n.startDiscovery();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity.4
 * JD-Core Version:    0.7.0.1
 */