package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract interface IProjectionDelegate
  extends IInterface
{
  public abstract d a(LatLng paramLatLng);
  
  public abstract LatLng a(d paramd);
  
  public abstract LatLng a(y paramy);
  
  public abstract VisibleRegion a();
  
  public abstract y b(LatLng paramLatLng);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IProjectionDelegate
 * JD-Core Version:    0.7.0.1
 */