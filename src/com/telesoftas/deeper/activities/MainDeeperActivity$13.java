package com.telesoftas.deeper.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.fridaylab.deeper.communication.CommunicationProtocol;
import com.fridaylab.deeper.communication.CommunicationProtocol.ConnectionInfo;
import com.fridaylab.deeper.communication.DeeperModel;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.deeper.animation.SceneView;
import com.telesoftas.deeper.ui.views.Panel;
import com.telesoftas.services.DeeperDeviceManager;

class MainDeeperActivity$13
  extends BroadcastReceiver
{
  MainDeeperActivity$13(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if (str.equals("com.fridaylab.deeper.STATE_CHANGED")) {
      this.a.t.post(new MainDeeperActivity.13.1(this));
    }
    while (!str.equals("BROADCAST_NEW_ECHO_AVAILABLE")) {
      return;
    }
    int i;
    SceneView localSceneView;
    if (this.a.I.d().b() != null)
    {
      i = this.a.I.d().c();
      localSceneView = MainDeeperActivity.b(this.a);
      if (MainDeeperActivity.f(this.a).a()) {
        break label147;
      }
    }
    label147:
    for (boolean bool = true;; bool = false)
    {
      localSceneView.a(bool, true);
      MainDeeperActivity.c(this.a);
      MainDeeperActivity.a(this.a, i);
      return;
      i = MainDeeperActivity.d(this.a).c().b.f();
      break;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.13
 * JD-Core Version:    0.7.0.1
 */