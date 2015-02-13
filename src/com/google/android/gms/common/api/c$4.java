package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

class c$4
  implements GoogleApiClient.OnConnectionFailedListener
{
  c$4(c paramc, Api.b paramb) {}
  
  public void a(ConnectionResult paramConnectionResult)
  {
    c.a(this.b).lock();
    try
    {
      if ((c.k(this.b) == null) || (this.a.a() < c.l(this.b)))
      {
        c.a(this.b, paramConnectionResult);
        c.b(this.b, this.a.a());
      }
      c.d(this.b);
      return;
    }
    finally
    {
      c.a(this.b).unlock();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c.4
 * JD-Core Version:    0.7.0.1
 */