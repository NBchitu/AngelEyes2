package com.google.tagmanager;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class ServiceManagerImpl$2
  implements Handler.Callback
{
  ServiceManagerImpl$2(ServiceManagerImpl paramServiceManagerImpl) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (ServiceManagerImpl.e().equals(paramMessage.obj)))
    {
      this.a.d();
      if ((ServiceManagerImpl.b(this.a) > 0) && (!ServiceManagerImpl.c(this.a))) {
        ServiceManagerImpl.d(this.a).sendMessageDelayed(ServiceManagerImpl.d(this.a).obtainMessage(1, ServiceManagerImpl.e()), 1000 * ServiceManagerImpl.b(this.a));
      }
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ServiceManagerImpl.2
 * JD-Core Version:    0.7.0.1
 */