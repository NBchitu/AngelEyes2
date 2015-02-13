package com.google.analytics.tracking.android;

import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

class GAServiceProxy$DisconnectCheckTask
  extends TimerTask
{
  private GAServiceProxy$DisconnectCheckTask(GAServiceProxy paramGAServiceProxy) {}
  
  public void run()
  {
    if ((GAServiceProxy.b(this.a) == GAServiceProxy.ConnectState.b) && (GAServiceProxy.e(this.a).isEmpty()) && (GAServiceProxy.f(this.a) + GAServiceProxy.g(this.a) < GAServiceProxy.h(this.a).a()))
    {
      Log.c("Disconnecting due to inactivity");
      GAServiceProxy.i(this.a);
      return;
    }
    GAServiceProxy.j(this.a).schedule(new DisconnectCheckTask(this.a), GAServiceProxy.g(this.a));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAServiceProxy.DisconnectCheckTask
 * JD-Core Version:    0.7.0.1
 */