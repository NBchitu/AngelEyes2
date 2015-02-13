package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.nf;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.nk;

public class LocationServices
{
  public static final Api<Api.ApiOptions.NoOptions> a = new Api(e, d, new Scope[0]);
  public static FusedLocationProviderApi b = new nf();
  public static GeofencingApi c = new ng();
  private static final Api.c<nk> d = new Api.c();
  private static final Api.b<nk, Api.ApiOptions.NoOptions> e = new LocationServices.1();
  
  public static nk a(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    nk localnk;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      jx.b(bool2, "GoogleApiClient parameter is required.");
      localnk = (nk)paramGoogleApiClient.a(d);
      if (localnk == null) {
        break label44;
      }
    }
    for (;;)
    {
      jx.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return localnk;
      bool2 = false;
      break;
      label44:
      bool1 = false;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationServices
 * JD-Core Version:    0.7.0.1
 */