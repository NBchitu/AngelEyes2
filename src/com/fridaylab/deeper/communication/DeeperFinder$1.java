package com.fridaylab.deeper.communication;

import android.content.BroadcastReceiver;

class DeeperFinder$1
  implements Runnable
{
  DeeperFinder$1(DeeperFinder paramDeeperFinder) {}
  
  public void run()
  {
    if (DeeperFinder.a(this.a)) {
      DeeperFinder.c(this.a).onReceive(DeeperFinder.b(this.a), DeeperFinder.h());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperFinder.1
 * JD-Core Version:    0.7.0.1
 */