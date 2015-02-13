package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract interface ICameraUpdateFactoryDelegate
  extends IInterface
{
  public abstract d a();
  
  public abstract d a(float paramFloat);
  
  public abstract d a(float paramFloat1, float paramFloat2);
  
  public abstract d a(float paramFloat, int paramInt1, int paramInt2);
  
  public abstract d a(CameraPosition paramCameraPosition);
  
  public abstract d a(LatLng paramLatLng);
  
  public abstract d a(LatLng paramLatLng, float paramFloat);
  
  public abstract d a(LatLngBounds paramLatLngBounds, int paramInt);
  
  public abstract d a(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract d b();
  
  public abstract d b(float paramFloat);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
 * JD-Core Version:    0.7.0.1
 */