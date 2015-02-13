package com.telesoftas.deeper.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fridaylab.deeper.communication.CommunicationService;

class MainDeeperActivity$4
  extends BroadcastReceiver
{
  MainDeeperActivity$4(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.fridaylab.deeper.SERVICE".equals(paramIntent.getAction()))
    {
      this.a.bindService(new Intent(this.a, CommunicationService.class), MainDeeperActivity.g(this.a), 0);
      MainDeeperActivity.a(this.a, true);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.4
 * JD-Core Version:    0.7.0.1
 */