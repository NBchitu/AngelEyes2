package com.telesoftas.utilities.location;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LocationHelperSingleton
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener
{
  private static final LocationRequest c = LocationRequest.a().a(5000L).b(16L).a(100);
  private static LocationHelperSingleton d = null;
  private GoogleApiClient a;
  private boolean b;
  private final Context e;
  private CopyOnWriteArrayList<LocationListenerInterface> f = null;
  
  private LocationHelperSingleton(Context paramContext)
  {
    this.e = paramContext;
  }
  
  public static LocationHelperSingleton a(Context paramContext)
  {
    if (d == null) {
      d = new LocationHelperSingleton(paramContext);
    }
    return d;
  }
  
  private void a()
  {
    if (this.a == null)
    {
      this.b = false;
      this.a = new GoogleApiClient.Builder(this.e).a(LocationServices.a).a(this).a(this).b();
    }
  }
  
  private void b()
  {
    if (!this.a.d()) {}
    do
    {
      return;
      Location localLocation = LocationServices.b.a(this.a);
      if (b(localLocation)) {
        c(localLocation);
      }
    } while ((!this.b) || (Looper.myLooper() != Looper.getMainLooper()));
    LocationServices.b.a(this.a, c, this);
  }
  
  private boolean b(Location paramLocation)
  {
    if (paramLocation == null) {}
    long l1;
    long l2;
    do
    {
      return false;
      l1 = System.currentTimeMillis();
      l2 = paramLocation.getTime();
      if (l2 > l1) {
        l2 -= 86400000L;
      }
    } while (l1 - l2 >= 1800000L);
    return true;
  }
  
  private void c(Location paramLocation)
  {
    if (this.f != null)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext()) {
        ((LocationListenerInterface)localIterator.next()).a(paramLocation);
      }
    }
  }
  
  public void a(int paramInt) {}
  
  public void a(Location paramLocation)
  {
    c(paramLocation);
  }
  
  public void a(Bundle paramBundle)
  {
    this.b = true;
    b();
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(LocationListenerInterface paramLocationListenerInterface)
  {
    if (this.f == null) {
      this.f = new CopyOnWriteArrayList();
    }
    this.f.add(paramLocationListenerInterface);
    if (this.f.size() == 1)
    {
      a();
      this.a.b();
    }
    if (!this.a.d()) {}
    Location localLocation;
    do
    {
      return;
      localLocation = LocationServices.b.a(this.a);
    } while (!b(localLocation));
    paramLocationListenerInterface.a(localLocation);
  }
  
  public void b(LocationListenerInterface paramLocationListenerInterface)
  {
    if (this.f != null)
    {
      this.f.remove(paramLocationListenerInterface);
      if ((this.f.size() == 0) && (this.a != null))
      {
        this.b = false;
        this.a.c();
        this.a = null;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.location.LocationHelperSingleton
 * JD-Core Version:    0.7.0.1
 */