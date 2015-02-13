package com.google.analytics.tracking.android;

import java.util.TimerTask;

class EasyTracker$NotInForegroundTimerTask
  extends TimerTask
{
  private EasyTracker$NotInForegroundTimerTask(EasyTracker paramEasyTracker) {}
  
  public void run()
  {
    EasyTracker.a(this.a, false);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.EasyTracker.NotInForegroundTimerTask
 * JD-Core Version:    0.7.0.1
 */