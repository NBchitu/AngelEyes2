package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

class nf$1
  extends nf.a
{
  nf$1(nf paramnf, GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void a(nk paramnk)
  {
    paramnk.a(this.b, this.c, null);
    a(Status.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nf.1
 * JD-Core Version:    0.7.0.1
 */