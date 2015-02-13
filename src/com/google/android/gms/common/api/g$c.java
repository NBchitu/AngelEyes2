package com.google.android.gms.common.api;

import android.content.IntentSender.SendIntentException;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

class g$c
  implements Runnable
{
  private final int b;
  private final ConnectionResult c;
  
  public g$c(g paramg, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.b = paramInt;
    this.c = paramConnectionResult;
  }
  
  public void run()
  {
    if (this.c.a()) {
      try
      {
        int i = 1 + (1 + this.a.i().f().d().indexOf(this.a) << 16);
        this.c.a(this.a.i(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        g.a(this.a);
        return;
      }
    }
    if (GooglePlayServicesUtil.b(this.c.c()))
    {
      GooglePlayServicesUtil.a(this.c.c(), this.a.i(), this.a, 2, this.a);
      return;
    }
    g.a(this.a, this.b, this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.g.c
 * JD-Core Version:    0.7.0.1
 */