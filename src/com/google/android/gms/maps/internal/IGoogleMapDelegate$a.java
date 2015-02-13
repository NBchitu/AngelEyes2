package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.d;
import com.google.android.gms.maps.model.internal.f;
import com.google.android.gms.maps.model.internal.h;
import com.google.android.gms.maps.model.internal.i;
import com.google.android.gms.maps.model.internal.j;
import com.google.android.gms.maps.model.internal.l;
import com.google.android.gms.maps.model.internal.n;
import com.google.android.gms.maps.model.internal.p;
import com.google.android.gms.maps.model.internal.q;
import com.google.android.gms.maps.model.k;
import com.google.android.gms.maps.model.o;
import com.google.android.gms.maps.model.w;

public abstract class IGoogleMapDelegate$a
  extends Binder
  implements IGoogleMapDelegate
{
  public static IGoogleMapDelegate a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof IGoogleMapDelegate))) {
      return (IGoogleMapDelegate)localIInterface;
    }
    return new IGoogleMapDelegate.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      CameraPosition localCameraPosition = a();
      paramParcel2.writeNoException();
      if (localCameraPosition != null)
      {
        paramParcel2.writeInt(1);
        localCameraPosition.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      float f2 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f2);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      float f1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(com.google.android.gms.dynamic.d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      b(com.google.android.gms.dynamic.d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(com.google.android.gms.dynamic.d.a.a(paramParcel1.readStrongBinder()), b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(com.google.android.gms.dynamic.d.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      d();
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (PolylineOptions localPolylineOptions = PolylineOptions.CREATOR.a(paramParcel1);; localPolylineOptions = null)
      {
        IPolylineDelegate localIPolylineDelegate = a(localPolylineOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder11 = null;
        if (localIPolylineDelegate != null) {
          localIBinder11 = localIPolylineDelegate.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder11);
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (PolygonOptions localPolygonOptions = PolygonOptions.CREATOR.a(paramParcel1);; localPolygonOptions = null)
      {
        com.google.android.gms.maps.model.internal.m localm = a(localPolygonOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder10 = null;
        if (localm != null) {
          localIBinder10 = localm.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder10);
        return true;
      }
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (MarkerOptions localMarkerOptions2 = MarkerOptions.CREATOR.a(paramParcel1);; localMarkerOptions2 = null)
      {
        l locall2 = a(localMarkerOptions2);
        paramParcel2.writeNoException();
        IBinder localIBinder9 = null;
        if (locall2 != null) {
          localIBinder9 = locall2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder9);
        return true;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (GroundOverlayOptions localGroundOverlayOptions2 = GroundOverlayOptions.CREATOR.a(paramParcel1);; localGroundOverlayOptions2 = null)
      {
        i locali2 = a(localGroundOverlayOptions2);
        paramParcel2.writeNoException();
        IBinder localIBinder8 = null;
        if (locali2 != null) {
          localIBinder8 = locali2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder8);
        return true;
      }
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (TileOverlayOptions localTileOverlayOptions = TileOverlayOptions.CREATOR.a(paramParcel1);; localTileOverlayOptions = null)
      {
        n localn = a(localTileOverlayOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder7 = null;
        if (localn != null) {
          localIBinder7 = localn.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder7);
        return true;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      e();
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i9 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i9);
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool10 = g();
      paramParcel2.writeNoException();
      if (bool10) {}
      for (int i8 = 1;; i8 = 0)
      {
        paramParcel2.writeInt(i8);
        return true;
      }
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i7 = paramParcel1.readInt();
      boolean bool9 = false;
      if (i7 != 0) {
        bool9 = true;
      }
      a(bool9);
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool8 = h();
      paramParcel2.writeNoException();
      int i6 = 0;
      if (bool8) {
        i6 = 1;
      }
      paramParcel2.writeInt(i6);
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool6 = true;; bool6 = false)
      {
        boolean bool7 = b(bool6);
        paramParcel2.writeNoException();
        int i5 = 0;
        if (bool7) {
          i5 = 1;
        }
        paramParcel2.writeInt(i5);
        return true;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool5 = i();
      paramParcel2.writeNoException();
      int i4 = 0;
      if (bool5) {
        i4 = 1;
      }
      paramParcel2.writeInt(i4);
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i3 = paramParcel1.readInt();
      boolean bool4 = false;
      if (i3 != 0) {
        bool4 = true;
      }
      c(bool4);
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      Location localLocation = j();
      paramParcel2.writeNoException();
      if (localLocation != null)
      {
        paramParcel2.writeInt(1);
        localLocation.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(ILocationSourceDelegate.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      IUiSettingsDelegate localIUiSettingsDelegate = k();
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (localIUiSettingsDelegate != null) {
        localIBinder6 = localIUiSettingsDelegate.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      IProjectionDelegate localIProjectionDelegate = l();
      paramParcel2.writeNoException();
      IBinder localIBinder5 = null;
      if (localIProjectionDelegate != null) {
        localIBinder5 = localIProjectionDelegate.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder5);
      return true;
    case 27: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(f.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(j.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 29: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(l.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 30: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(n.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 31: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(o.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 32: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(h.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 33: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 35: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (CircleOptions localCircleOptions = CircleOptions.CREATOR.a(paramParcel1);; localCircleOptions = null)
      {
        h localh = a(localCircleOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder4 = null;
        if (localh != null) {
          localIBinder4 = localh.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
      }
    case 36: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(q.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 37: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(p.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 38: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(v.a.a(paramParcel1.readStrongBinder()), com.google.android.gms.dynamic.d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 39: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 40: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool3 = m();
      paramParcel2.writeNoException();
      int i2 = 0;
      if (bool3) {
        i2 = 1;
      }
      paramParcel2.writeInt(i2);
      return true;
    case 41: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i1 = paramParcel1.readInt();
      boolean bool2 = false;
      if (i1 != 0) {
        bool2 = true;
      }
      d(bool2);
      paramParcel2.writeNoException();
      return true;
    case 42: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(k.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 44: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      j localj = n();
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (localj != null) {
        localIBinder3 = localj.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 45: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(g.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 53: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(m.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 54: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        a(localBundle2);
        paramParcel2.writeNoException();
        return true;
      }
    case 55: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      o();
      paramParcel2.writeNoException();
      return true;
    case 56: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      p();
      paramParcel2.writeNoException();
      return true;
    case 57: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      q();
      paramParcel2.writeNoException();
      return true;
    case 58: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      r();
      paramParcel2.writeNoException();
      return true;
    case 59: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool1 = s();
      paramParcel2.writeNoException();
      int n = 0;
      if (bool1) {
        n = 1;
      }
      paramParcel2.writeInt(n);
      return true;
    case 60: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        b(localBundle1);
        paramParcel2.writeNoException();
        if (localBundle1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 61: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 64: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int m = paramParcel1.readInt();
      com.google.android.gms.maps.model.internal.c localc4 = null;
      if (m != 0) {
        localc4 = com.google.android.gms.maps.model.internal.c.CREATOR.a(paramParcel1);
      }
      a(localc4);
      paramParcel2.writeNoException();
      return true;
    case 65: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int k = paramParcel1.readInt();
      com.google.android.gms.maps.model.internal.c localc3 = null;
      if (k != 0) {
        localc3 = com.google.android.gms.maps.model.internal.c.CREATOR.a(paramParcel1);
      }
      b(localc3);
      paramParcel2.writeNoException();
      return true;
    case 66: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int j = paramParcel1.readInt();
      com.google.android.gms.maps.model.internal.c localc2 = null;
      if (j != 0) {
        localc2 = com.google.android.gms.maps.model.internal.c.CREATOR.a(paramParcel1);
      }
      a(localc2, b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 67: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i = paramParcel1.readInt();
      com.google.android.gms.maps.model.internal.c localc1 = null;
      if (i != 0) {
        localc1 = com.google.android.gms.maps.model.internal.c.CREATOR.a(paramParcel1);
      }
      a(localc1, paramParcel1.readInt(), b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 68: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      MarkerOptions localMarkerOptions1;
      if (paramParcel1.readInt() != 0)
      {
        localMarkerOptions1 = MarkerOptions.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2501;
        }
      }
      for (p localp = p.CREATOR.a(paramParcel1);; localp = null)
      {
        l locall1 = a(localMarkerOptions1, localp);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locall1 != null) {
          localIBinder2 = locall1.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
        localMarkerOptions1 = null;
        break;
      }
    case 69: 
      label2501:
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(e.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
    GroundOverlayOptions localGroundOverlayOptions1;
    if (paramParcel1.readInt() != 0)
    {
      localGroundOverlayOptions1 = GroundOverlayOptions.CREATOR.a(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label2613;
      }
    }
    label2613:
    for (com.google.android.gms.maps.model.internal.e locale = com.google.android.gms.maps.model.internal.e.CREATOR.a(paramParcel1);; locale = null)
    {
      i locali1 = a(localGroundOverlayOptions1, locale);
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locali1 != null) {
        localIBinder1 = locali1.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
      localGroundOverlayOptions1 = null;
      break;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IGoogleMapDelegate.a
 * JD-Core Version:    0.7.0.1
 */