package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.d.a;

public abstract class i$a
  extends Binder
  implements i
{
  public static i a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
    if ((localIInterface != null) && ((localIInterface instanceof i))) {
      return (i)localIInterface;
    }
    return new i.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      a(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
    if (paramParcel1.readInt() != 0) {}
    for (Location localLocation = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localLocation = null)
    {
      a(localLocation);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.i.a
 * JD-Core Version:    0.7.0.1
 */