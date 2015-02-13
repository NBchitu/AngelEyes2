package com.google.analytics.tracking.android;

import java.util.TimerTask;

class GAServiceProxy$FailedConnectTask
  extends TimerTask
{
  private GAServiceProxy$FailedConnectTask(GAServiceProxy paramGAServiceProxy) {}
  
  public void run()
  {
    if (GAServiceProxy.b(this.a) == GAServiceProxy.ConnectState.a) {
      GAServiceProxy.c(this.a);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAServiceProxy.FailedConnectTask
 * JD-Core Version:    0.7.0.1
 */