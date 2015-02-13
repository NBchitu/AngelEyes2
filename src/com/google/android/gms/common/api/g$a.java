package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.google.android.gms.common.ConnectionResult;

class g$a
  extends Loader<ConnectionResult>
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final GoogleApiClient a;
  private boolean b;
  private ConnectionResult c;
  
  public g$a(Context paramContext, GoogleApiClient paramGoogleApiClient)
  {
    super(paramContext);
    this.a = paramGoogleApiClient;
  }
  
  private void b(ConnectionResult paramConnectionResult)
  {
    this.c = paramConnectionResult;
    if ((l()) && (!m())) {
      b(paramConnectionResult);
    }
  }
  
  public void a(int paramInt) {}
  
  public void a(Bundle paramBundle)
  {
    this.b = false;
    b(ConnectionResult.a);
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    this.b = true;
    b(paramConnectionResult);
  }
  
  public void b()
  {
    if (this.b)
    {
      this.b = false;
      if ((l()) && (!m())) {
        this.a.b();
      }
    }
  }
  
  protected void g()
  {
    super.g();
    this.a.a(this);
    this.a.a(this);
    if (this.c != null) {
      b(this.c);
    }
    if ((!this.a.d()) && (!this.a.e()) && (!this.b)) {
      this.a.b();
    }
  }
  
  protected void h()
  {
    this.a.c();
  }
  
  protected void i()
  {
    this.c = null;
    this.b = false;
    this.a.b(this);
    this.a.b(this);
    this.a.c();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.g.a
 * JD-Core Version:    0.7.0.1
 */