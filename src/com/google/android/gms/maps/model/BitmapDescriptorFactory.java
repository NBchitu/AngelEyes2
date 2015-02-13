package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.model.internal.g;

public final class BitmapDescriptorFactory
{
  private static g a;
  
  public static BitmapDescriptor a(Bitmap paramBitmap)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(a().a(paramBitmap));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  private static g a()
  {
    return (g)jx.a(a, "IBitmapDescriptorFactory is not initialized");
  }
  
  public static void a(g paramg)
  {
    if (a != null) {
      return;
    }
    a = (g)jx.a(paramg);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.BitmapDescriptorFactory
 * JD-Core Version:    0.7.0.1
 */