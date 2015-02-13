package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.g;

public abstract interface c
  extends IInterface
{
  public abstract ICameraUpdateFactoryDelegate a();
  
  public abstract IMapViewDelegate a(d paramd, GoogleMapOptions paramGoogleMapOptions);
  
  public abstract IStreetViewPanoramaViewDelegate a(d paramd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions);
  
  public abstract void a(d paramd);
  
  public abstract void a(d paramd, int paramInt);
  
  public abstract IMapFragmentDelegate b(d paramd);
  
  public abstract g b();
  
  public abstract IStreetViewPanoramaFragmentDelegate c(d paramd);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.c
 * JD-Core Version:    0.7.0.1
 */