package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;

public abstract class ICameraUpdateFactoryDelegate$a
  extends Binder
  implements ICameraUpdateFactoryDelegate
{
  public static ICameraUpdateFactoryDelegate a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof ICameraUpdateFactoryDelegate))) {
      return (ICameraUpdateFactoryDelegate)localIInterface;
    }
    return new ICameraUpdateFactoryDelegate.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      d locald11 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder11 = null;
      if (locald11 != null) {
        localIBinder11 = locald11.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder11);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      d locald10 = b();
      paramParcel2.writeNoException();
      IBinder localIBinder10 = null;
      if (locald10 != null) {
        localIBinder10 = locald10.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder10);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      d locald9 = a(paramParcel1.readFloat(), paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder9 = null;
      if (locald9 != null) {
        localIBinder9 = locald9.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder9);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      d locald8 = a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder8 = null;
      if (locald8 != null) {
        localIBinder8 = locald8.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder8);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      d locald7 = b(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder7 = null;
      if (locald7 != null) {
        localIBinder7 = locald7.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder7);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      d locald6 = a(paramParcel1.readFloat(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (locald6 != null) {
        localIBinder6 = locald6.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (CameraPosition localCameraPosition = CameraPosition.CREATOR.a(paramParcel1);; localCameraPosition = null)
      {
        d locald5 = a(localCameraPosition);
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (locald5 != null) {
          localIBinder5 = locald5.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng2 = LatLng.CREATOR.a(paramParcel1);; localLatLng2 = null)
      {
        d locald4 = a(localLatLng2);
        paramParcel2.writeNoException();
        IBinder localIBinder4 = null;
        if (locald4 != null) {
          localIBinder4 = locald4.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng1 = LatLng.CREATOR.a(paramParcel1);; localLatLng1 = null)
      {
        d locald3 = a(localLatLng1, paramParcel1.readFloat());
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (locald3 != null) {
          localIBinder3 = locald3.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLngBounds localLatLngBounds2 = LatLngBounds.CREATOR.a(paramParcel1);; localLatLngBounds2 = null)
      {
        d locald2 = a(localLatLngBounds2, paramParcel1.readInt());
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locald2 != null) {
          localIBinder2 = locald2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if (paramParcel1.readInt() != 0) {}
    for (LatLngBounds localLatLngBounds1 = LatLngBounds.CREATOR.a(paramParcel1);; localLatLngBounds1 = null)
    {
      d locald1 = a(localLatLngBounds1, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locald1 != null) {
        localIBinder1 = locald1.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.a
 * JD-Core Version:    0.7.0.1
 */