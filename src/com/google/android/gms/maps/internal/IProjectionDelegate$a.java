package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.i;

public abstract class IProjectionDelegate$a
  extends Binder
  implements IProjectionDelegate
{
  public static IProjectionDelegate a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof IProjectionDelegate))) {
      return (IProjectionDelegate)localIInterface;
    }
    return new IProjectionDelegate.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      LatLng localLatLng4 = a(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (localLatLng4 != null)
      {
        paramParcel2.writeInt(1);
        localLatLng4.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng3 = LatLng.CREATOR.a(paramParcel1);; localLatLng3 = null)
      {
        d locald = a(localLatLng3);
        paramParcel2.writeNoException();
        IBinder localIBinder = null;
        if (locald != null) {
          localIBinder = locald.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      VisibleRegion localVisibleRegion = a();
      paramParcel2.writeNoException();
      if (localVisibleRegion != null)
      {
        paramParcel2.writeInt(1);
        localVisibleRegion.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      int j = paramParcel1.readInt();
      y localy2 = null;
      if (j != 0) {
        localy2 = y.CREATOR.a(paramParcel1);
      }
      LatLng localLatLng2 = a(localy2);
      paramParcel2.writeNoException();
      if (localLatLng2 != null)
      {
        paramParcel2.writeInt(1);
        localLatLng2.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
    int i = paramParcel1.readInt();
    LatLng localLatLng1 = null;
    if (i != 0) {
      localLatLng1 = LatLng.CREATOR.a(paramParcel1);
    }
    y localy1 = b(localLatLng1);
    paramParcel2.writeNoException();
    if (localy1 != null)
    {
      paramParcel2.writeInt(1);
      localy1.writeToParcel(paramParcel2, 1);
    }
    for (;;)
    {
      return true;
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IProjectionDelegate.a
 * JD-Core Version:    0.7.0.1
 */