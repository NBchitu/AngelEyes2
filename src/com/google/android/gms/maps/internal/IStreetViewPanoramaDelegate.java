package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public abstract interface IStreetViewPanoramaDelegate
  extends IInterface
{
  public abstract d a(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation);
  
  public abstract StreetViewPanoramaOrientation a(d paramd);
  
  public abstract void a(r paramr);
  
  public abstract void a(s params);
  
  public abstract void a(t paramt);
  
  public abstract void a(LatLng paramLatLng);
  
  public abstract void a(LatLng paramLatLng, int paramInt);
  
  public abstract void a(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, long paramLong);
  
  public abstract void a(String paramString);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract boolean a();
  
  public abstract void b(boolean paramBoolean);
  
  public abstract boolean b();
  
  public abstract void c(boolean paramBoolean);
  
  public abstract boolean c();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract boolean d();
  
  public abstract StreetViewPanoramaCamera e();
  
  public abstract StreetViewPanoramaLocation f();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
 * JD-Core Version:    0.7.0.1
 */