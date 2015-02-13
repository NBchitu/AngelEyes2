package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class CameraUpdateFactory
{
  private static ICameraUpdateFactoryDelegate a;
  
  public static CameraUpdate a(float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(a().a(paramFloat));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public static CameraUpdate a(LatLng paramLatLng, float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(a().a(paramLatLng, paramFloat));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  private static ICameraUpdateFactoryDelegate a()
  {
    return (ICameraUpdateFactoryDelegate)jx.a(a, "CameraUpdateFactory is not initialized");
  }
  
  public static void a(ICameraUpdateFactoryDelegate paramICameraUpdateFactoryDelegate)
  {
    a = (ICameraUpdateFactoryDelegate)jx.a(paramICameraUpdateFactoryDelegate);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.CameraUpdateFactory
 * JD-Core Version:    0.7.0.1
 */