package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b.a;
import com.google.android.gms.location.d;
import com.google.android.gms.location.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;

public abstract class ni$a
  extends Binder
  implements ni
{
  public static ni a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    if ((localIInterface != null) && ((localIInterface instanceof ni))) {
      return (ni)localIInterface;
    }
    return new ni.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ArrayList localArrayList3 = paramParcel1.createTypedArrayList(nn.CREATOR);
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent12 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent12 = null)
      {
        a(localArrayList3, localPendingIntent12, nh.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 57: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      GeofencingRequest localGeofencingRequest;
      if (paramParcel1.readInt() != 0)
      {
        localGeofencingRequest = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label476;
        }
      }
      for (PendingIntent localPendingIntent11 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent11 = null)
      {
        a(localGeofencingRequest, localPendingIntent11, nh.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localGeofencingRequest = null;
        break;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent10 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent10 = null)
      {
        a(localPendingIntent10, nh.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(paramParcel1.createStringArray(), nh.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(nh.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      long l = paramParcel1.readLong();
      boolean bool2;
      if (paramParcel1.readInt() != 0)
      {
        bool2 = true;
        if (paramParcel1.readInt() == 0) {
          break label661;
        }
      }
      for (PendingIntent localPendingIntent9 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent9 = null)
      {
        a(l, bool2, localPendingIntent9);
        paramParcel2.writeNoException();
        return true;
        bool2 = false;
        break;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent8 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent8 = null)
      {
        a(localPendingIntent8);
        paramParcel2.writeNoException();
        return true;
      }
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      Location localLocation4 = a();
      paramParcel2.writeNoException();
      if (localLocation4 != null)
      {
        paramParcel2.writeInt(1);
        localLocation4.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i9 = paramParcel1.readInt();
      LocationRequest localLocationRequest3 = null;
      if (i9 != 0) {
        localLocationRequest3 = LocationRequest.CREATOR.a(paramParcel1);
      }
      a(localLocationRequest3, b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i8 = paramParcel1.readInt();
      LocationRequest localLocationRequest2 = null;
      if (i8 != 0) {
        localLocationRequest2 = LocationRequest.CREATOR.a(paramParcel1);
      }
      a(localLocationRequest2, b.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LocationRequest localLocationRequest1;
      if (paramParcel1.readInt() != 0)
      {
        localLocationRequest1 = LocationRequest.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label917;
        }
      }
      for (PendingIntent localPendingIntent7 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent7 = null)
      {
        a(localLocationRequest1, localPendingIntent7);
        paramParcel2.writeNoException();
        return true;
        localLocationRequest1 = null;
        break;
      }
    case 52: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i7 = paramParcel1.readInt();
      nl localnl2 = null;
      if (i7 != 0) {
        localnl2 = nl.CREATOR.a(paramParcel1);
      }
      a(localnl2, b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 53: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      nl localnl1;
      if (paramParcel1.readInt() != 0)
      {
        localnl1 = nl.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1034;
        }
      }
      for (PendingIntent localPendingIntent6 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent6 = null)
      {
        a(localnl1, localPendingIntent6);
        paramParcel2.writeNoException();
        return true;
        localnl1 = null;
        break;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(b.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent5 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent5 = null)
      {
        b(localPendingIntent5);
        paramParcel2.writeNoException();
        return true;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i6 = paramParcel1.readInt();
      boolean bool1 = false;
      if (i6 != 0) {
        bool1 = true;
      }
      a(bool1);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (Location localLocation3 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localLocation3 = null)
      {
        a(localLocation3);
        paramParcel2.writeNoException();
        return true;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LatLngBounds localLatLngBounds4;
      int i5;
      nu localnu4;
      if (paramParcel1.readInt() != 0)
      {
        localLatLngBounds4 = LatLngBounds.CREATOR.a(paramParcel1);
        i5 = paramParcel1.readInt();
        if (paramParcel1.readInt() == 0) {
          break label1279;
        }
        localnu4 = nu.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1285;
        }
      }
      for (oh localoh15 = oh.CREATOR.a(paramParcel1);; localoh15 = null)
      {
        a(localLatLngBounds4, i5, localnu4, localoh15, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLngBounds4 = null;
        break;
        localnu4 = null;
        break label1232;
      }
    case 47: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LatLngBounds localLatLngBounds3;
      int i3;
      String str4;
      if (paramParcel1.readInt() != 0)
      {
        localLatLngBounds3 = LatLngBounds.CREATOR.a(paramParcel1);
        i3 = paramParcel1.readInt();
        str4 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label1397;
        }
      }
      for (nu localnu3 = nu.CREATOR.a(paramParcel1);; localnu3 = null)
      {
        int i4 = paramParcel1.readInt();
        oh localoh14 = null;
        if (i4 != 0) {
          localoh14 = oh.CREATOR.a(paramParcel1);
        }
        a(localLatLngBounds3, i3, str4, localnu3, localoh14, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLngBounds3 = null;
        break;
      }
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str3 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      oh localoh13 = null;
      if (i2 != 0) {
        localoh13 = oh.CREATOR.a(paramParcel1);
      }
      a(str3, localoh13, og.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LatLng localLatLng;
      if (paramParcel1.readInt() != 0)
      {
        localLatLng = LatLng.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1549;
        }
      }
      for (nu localnu2 = nu.CREATOR.a(paramParcel1);; localnu2 = null)
      {
        int i1 = paramParcel1.readInt();
        oh localoh12 = null;
        if (i1 != 0) {
          localoh12 = oh.CREATOR.a(paramParcel1);
        }
        a(localLatLng, localnu2, localoh12, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLng = null;
        break;
      }
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (nu localnu1 = nu.CREATOR.a(paramParcel1);; localnu1 = null)
      {
        int n = paramParcel1.readInt();
        oh localoh11 = null;
        if (n != 0) {
          localoh11 = oh.CREATOR.a(paramParcel1);
        }
        a(localnu1, localoh11, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 42: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str2 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      oh localoh10 = null;
      if (m != 0) {
        localoh10 = oh.CREATOR.a(paramParcel1);
      }
      b(str2, localoh10, og.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 58: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ArrayList localArrayList2 = paramParcel1.createStringArrayList();
      int k = paramParcel1.readInt();
      oh localoh9 = null;
      if (k != 0) {
        localoh9 = oh.CREATOR.a(paramParcel1);
      }
      a(localArrayList2, localoh9, og.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 50: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      oe localoe;
      LatLngBounds localLatLngBounds2;
      ArrayList localArrayList1;
      if (paramParcel1.readInt() != 0)
      {
        localoe = oe.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1830;
        }
        localLatLngBounds2 = LatLngBounds.CREATOR.a(paramParcel1);
        localArrayList1 = paramParcel1.createStringArrayList();
        if (paramParcel1.readInt() == 0) {
          break label1836;
        }
      }
      for (oh localoh8 = oh.CREATOR.a(paramParcel1);; localoh8 = null)
      {
        a(localoe, localLatLngBounds2, localArrayList1, localoh8, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localoe = null;
        break;
        localLatLngBounds2 = null;
        break label1777;
      }
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ny localny;
      oh localoh7;
      if (paramParcel1.readInt() != 0)
      {
        localny = ny.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1923;
        }
        localoh7 = oh.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1929;
        }
      }
      for (PendingIntent localPendingIntent4 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent4 = null)
      {
        a(localny, localoh7, localPendingIntent4);
        paramParcel2.writeNoException();
        return true;
        localny = null;
        break;
        localoh7 = null;
        break label1880;
      }
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      oh localoh6;
      if (paramParcel1.readInt() != 0)
      {
        localoh6 = oh.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1998;
        }
      }
      for (PendingIntent localPendingIntent3 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent3 = null)
      {
        a(localoh6, localPendingIntent3);
        paramParcel2.writeNoException();
        return true;
        localoh6 = null;
        break;
      }
    case 48: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ns localns;
      oh localoh5;
      if (paramParcel1.readInt() != 0)
      {
        localns = ns.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2085;
        }
        localoh5 = oh.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2091;
        }
      }
      for (PendingIntent localPendingIntent2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent2 = null)
      {
        a(localns, localoh5, localPendingIntent2);
        paramParcel2.writeNoException();
        return true;
        localns = null;
        break;
        localoh5 = null;
        break label2042;
      }
    case 49: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      oh localoh4;
      if (paramParcel1.readInt() != 0)
      {
        localoh4 = oh.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2160;
        }
      }
      for (PendingIntent localPendingIntent1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent1 = null)
      {
        b(localoh4, localPendingIntent1);
        paramParcel2.writeNoException();
        return true;
        localoh4 = null;
        break;
      }
    case 55: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str1 = paramParcel1.readString();
      LatLngBounds localLatLngBounds1;
      nq localnq;
      if (paramParcel1.readInt() != 0)
      {
        localLatLngBounds1 = LatLngBounds.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2257;
        }
        localnq = nq.CREATOR.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2263;
        }
      }
      for (oh localoh3 = oh.CREATOR.a(paramParcel1);; localoh3 = null)
      {
        a(str1, localLatLngBounds1, localnq, localoh3, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLngBounds1 = null;
        break;
        localnq = null;
        break label2210;
      }
    case 46: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (oc localoc = (oc)oc.CREATOR.createFromParcel(paramParcel1);; localoc = null)
      {
        int j = paramParcel1.readInt();
        oh localoh2 = null;
        if (j != 0) {
          localoh2 = oh.CREATOR.a(paramParcel1);
        }
        a(localoc, localoh2, og.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      Location localLocation2 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localLocation2 != null)
      {
        paramParcel2.writeInt(1);
        localLocation2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (nw localnw = nw.CREATOR.a(paramParcel1);; localnw = null)
      {
        int i = paramParcel1.readInt();
        oh localoh1 = null;
        if (i != 0) {
          localoh1 = oh.CREATOR.a(paramParcel1);
        }
        a(localnw, localoh1);
        return true;
      }
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (Location localLocation1 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localLocation1 = null)
      {
        a(localLocation1, paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 34: 
      label1923:
      label2085:
      label2091:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      label2210:
      e locale = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (locale != null)
      {
        paramParcel2.writeInt(1);
        locale.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 51: 
      label476:
      label1279:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      label661:
      label1232:
      label1397:
      label2042:
      IBinder localIBinder2 = b();
      label917:
      label1777:
      paramParcel2.writeNoException();
      label1034:
      label1549:
      label1830:
      label1836:
      label1880:
      label2160:
      paramParcel2.writeStrongBinder(localIBinder2);
      label1285:
      label1929:
      label1998:
      label2257:
      label2263:
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    IBinder localIBinder1 = c();
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ni.a
 * JD-Core Version:    0.7.0.1
 */