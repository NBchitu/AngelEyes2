package com.google.analytics.tracking.android;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class GAServiceManager$2
  implements Handler.Callback
{
  GAServiceManager$2(GAServiceManager paramGAServiceManager) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (GAServiceManager.f().equals(paramMessage.obj)))
    {
      GAUsage.a().a(true);
      this.a.c();
      GAUsage.a().a(false);
      if ((GAServiceManager.b(this.a) > 0) && (!GAServiceManager.c(this.a))) {
        GAServiceManager.d(this.a).sendMessageDelayed(GAServiceManager.d(this.a).obtainMessage(1, GAServiceManager.f()), 1000 * GAServiceManager.b(this.a));
      }
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAServiceManager.2
 * JD-Core Version:    0.7.0.1
 */