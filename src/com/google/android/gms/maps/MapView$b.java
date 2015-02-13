package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MapView$b
  extends a<MapView.a>
{
  protected f<MapView.a> a;
  private final ViewGroup b;
  private final Context c;
  private final GoogleMapOptions d;
  private final List<OnMapReadyCallback> e = new ArrayList();
  
  MapView$b(ViewGroup paramViewGroup, Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    this.b = paramViewGroup;
    this.c = paramContext;
    this.d = paramGoogleMapOptions;
  }
  
  protected void a(f<MapView.a> paramf)
  {
    this.a = paramf;
    g();
  }
  
  public void g()
  {
    if ((this.a != null) && (a() == null)) {}
    try
    {
      IMapViewDelegate localIMapViewDelegate = x.a(this.c).a(e.a(this.c), this.d);
      this.a.a(new MapView.a(this.b, localIMapViewDelegate));
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        OnMapReadyCallback localOnMapReadyCallback = (OnMapReadyCallback)localIterator.next();
        ((MapView.a)a()).a(localOnMapReadyCallback);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
      this.e.clear();
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapView.b
 * JD-Core Version:    0.7.0.1
 */