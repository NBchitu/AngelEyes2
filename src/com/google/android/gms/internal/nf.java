package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class nf
  implements FusedLocationProviderApi
{
  public Location a(GoogleApiClient paramGoogleApiClient)
  {
    nk localnk = LocationServices.a(paramGoogleApiClient);
    try
    {
      Location localLocation = localnk.j();
      return localLocation;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.a(new nf.1(this, paramGoogleApiClient, paramLocationRequest, paramLocationListener));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nf
 * JD-Core Version:    0.7.0.1
 */