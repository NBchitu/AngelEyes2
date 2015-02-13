package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;

final class jm$a
  extends Handler
{
  public jm$a(jm paramjm, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1) {
      synchronized (jm.a(this.a))
      {
        if ((jm.b(this.a).c_()) && (jm.b(this.a).c()) && (jm.a(this.a).contains(paramMessage.obj)))
        {
          Bundle localBundle = jm.b(this.a).b_();
          ((GoogleApiClient.ConnectionCallbacks)paramMessage.obj).a(localBundle);
        }
        return;
      }
    }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jm.a
 * JD-Core Version:    0.7.0.1
 */