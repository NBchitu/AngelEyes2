package com.telesoftas.deeper.activities;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import pl.mg6.android.maps.extensions.GoogleMap;

class DeeperMapActivity$2
  implements GoogleApiClient.ConnectionCallbacks
{
  DeeperMapActivity$2(DeeperMapActivity paramDeeperMapActivity) {}
  
  public void a(int paramInt)
  {
    DeeperMapActivity.a(this.a).b(this);
  }
  
  public void a(Bundle paramBundle)
  {
    DeeperMapActivity.a(this.a).b(this);
    Location localLocation = LocationServices.b.a(DeeperMapActivity.a(this.a));
    if (localLocation == null) {
      return;
    }
    DeeperMapActivity.b(this.a).a(CameraUpdateFactory.a(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()), 16.0F));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperMapActivity.2
 * JD-Core Version:    0.7.0.1
 */