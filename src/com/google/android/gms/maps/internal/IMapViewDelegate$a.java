package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.d;

public abstract class IMapViewDelegate$a
  extends Binder
  implements IMapViewDelegate
{
  public static IMapViewDelegate a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof IMapViewDelegate))) {
      return (IMapViewDelegate)localIInterface;
    }
    return new IMapViewDelegate.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      IGoogleMapDelegate localIGoogleMapDelegate = a();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localIGoogleMapDelegate != null) {
        localIBinder2 = localIGoogleMapDelegate.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      int j = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (j != 0) {
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      b();
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      c();
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      d();
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      e();
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      int i = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (i != 0) {
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b(localBundle1);
      paramParcel2.writeNoException();
      if (localBundle1 != null)
      {
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
      d locald = f();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locald != null) {
        localIBinder1 = locald.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
    a(m.a.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IMapViewDelegate.a
 * JD-Core Version:    0.7.0.1
 */