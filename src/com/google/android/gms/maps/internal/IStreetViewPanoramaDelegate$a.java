package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.q;
import com.google.android.gms.maps.model.t;

public abstract class IStreetViewPanoramaDelegate$a
  extends Binder
  implements IStreetViewPanoramaDelegate
{
  public static IStreetViewPanoramaDelegate a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof IStreetViewPanoramaDelegate))) {
      return (IStreetViewPanoramaDelegate)localIInterface;
    }
    return new IStreetViewPanoramaDelegate.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i5 = paramParcel1.readInt();
      boolean bool8 = false;
      if (i5 != 0) {
        bool8 = true;
      }
      a(bool8);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i4 = paramParcel1.readInt();
      boolean bool7 = false;
      if (i4 != 0) {
        bool7 = true;
      }
      b(bool7);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i3 = paramParcel1.readInt();
      boolean bool6 = false;
      if (i3 != 0) {
        bool6 = true;
      }
      c(bool6);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i2 = paramParcel1.readInt();
      boolean bool5 = false;
      if (i2 != 0) {
        bool5 = true;
      }
      d(bool5);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool4 = a();
      paramParcel2.writeNoException();
      int i1 = 0;
      if (bool4) {
        i1 = 1;
      }
      paramParcel2.writeInt(i1);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool3 = b();
      paramParcel2.writeNoException();
      int n = 0;
      if (bool3) {
        n = 1;
      }
      paramParcel2.writeInt(n);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool2 = c();
      paramParcel2.writeNoException();
      int m = 0;
      if (bool2) {
        m = 1;
      }
      paramParcel2.writeInt(m);
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool1 = d();
      paramParcel2.writeNoException();
      int k = 0;
      if (bool1) {
        k = 1;
      }
      paramParcel2.writeInt(k);
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (StreetViewPanoramaCamera localStreetViewPanoramaCamera2 = StreetViewPanoramaCamera.CREATOR.a(paramParcel1);; localStreetViewPanoramaCamera2 = null)
      {
        a(localStreetViewPanoramaCamera2, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      StreetViewPanoramaCamera localStreetViewPanoramaCamera1 = e();
      paramParcel2.writeNoException();
      if (localStreetViewPanoramaCamera1 != null)
      {
        paramParcel2.writeInt(1);
        localStreetViewPanoramaCamera1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int j = paramParcel1.readInt();
      LatLng localLatLng2 = null;
      if (j != 0) {
        localLatLng2 = LatLng.CREATOR.a(paramParcel1);
      }
      a(localLatLng2);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i = paramParcel1.readInt();
      LatLng localLatLng1 = null;
      if (i != 0) {
        localLatLng1 = LatLng.CREATOR.a(paramParcel1);
      }
      a(localLatLng1, paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      StreetViewPanoramaLocation localStreetViewPanoramaLocation = f();
      paramParcel2.writeNoException();
      if (localStreetViewPanoramaLocation != null)
      {
        paramParcel2.writeInt(1);
        localStreetViewPanoramaLocation.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      a(s.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      a(r.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      a(t.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      StreetViewPanoramaOrientation localStreetViewPanoramaOrientation2 = a(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (localStreetViewPanoramaOrientation2 != null)
      {
        paramParcel2.writeInt(1);
        localStreetViewPanoramaOrientation2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    if (paramParcel1.readInt() != 0) {}
    for (StreetViewPanoramaOrientation localStreetViewPanoramaOrientation1 = StreetViewPanoramaOrientation.CREATOR.a(paramParcel1);; localStreetViewPanoramaOrientation1 = null)
    {
      d locald = a(localStreetViewPanoramaOrientation1);
      paramParcel2.writeNoException();
      IBinder localIBinder = null;
      if (locald != null) {
        localIBinder = locald.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.a
 * JD-Core Version:    0.7.0.1
 */