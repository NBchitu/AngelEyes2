package com.google.android.gms.common.api;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import java.util.concurrent.locks.Lock;

class c$2
  implements GoogleApiClient.ConnectionCallbacks
{
  c$2(c paramc) {}
  
  public void a(int paramInt)
  {
    c.a(this.a).lock();
    switch (paramInt)
    {
    }
    for (;;)
    {
      c.a(this.a).unlock();
      return;
      try
      {
        c.a(this.a, paramInt);
        this.a.b();
        continue;
      }
      finally
      {
        c.a(this.a).unlock();
      }
      boolean bool = this.a.f();
      if (bool)
      {
        c.a(this.a).unlock();
        return;
      }
      c.a(this.a, true);
      this.a.c = new c.a(this.a);
      IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
      localIntentFilter.addDataScheme("package");
      c.e(this.a).registerReceiver(this.a.c, localIntentFilter);
      this.a.b.sendMessageDelayed(this.a.b.obtainMessage(1), c.f(this.a));
      this.a.b.sendMessageDelayed(this.a.b.obtainMessage(2), c.g(this.a));
      c.a(this.a, paramInt);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    c.a(this.a).lock();
    try
    {
      if (c.b(this.a) == 1)
      {
        if (paramBundle != null) {
          c.c(this.a).putAll(paramBundle);
        }
        c.d(this.a);
      }
      return;
    }
    finally
    {
      c.a(this.a).unlock();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c.2
 * JD-Core Version:    0.7.0.1
 */