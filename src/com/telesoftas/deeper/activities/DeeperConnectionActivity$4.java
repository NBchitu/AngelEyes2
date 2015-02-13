package com.telesoftas.deeper.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class DeeperConnectionActivity$4
  extends BroadcastReceiver
{
  DeeperConnectionActivity$4(DeeperConnectionActivity paramDeeperConnectionActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("exitOnResume")) {
      DeeperConnectionActivity.a(this.a, true);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperConnectionActivity.4
 * JD-Core Version:    0.7.0.1
 */