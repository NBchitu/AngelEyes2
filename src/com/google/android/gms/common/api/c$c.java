package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

class c$c
  extends Handler
{
  c$c(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.w("GoogleApiClientImpl", "Unknown message id: " + paramMessage.what);
      return;
    case 1: 
      c.i(this.a);
      return;
    }
    c.j(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c.c
 * JD-Core Version:    0.7.0.1
 */