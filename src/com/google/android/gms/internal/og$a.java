package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract class og$a
  extends Binder
  implements og
{
  public static og a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof og))) {
      return (og)localIInterface;
    }
    return new og.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      int k = paramParcel1.readInt();
      DataHolder localDataHolder3 = null;
      if (k != 0) {
        localDataHolder3 = DataHolder.CREATOR.a(paramParcel1);
      }
      a(localDataHolder3);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      int j = paramParcel1.readInt();
      DataHolder localDataHolder2 = null;
      if (j != 0) {
        localDataHolder2 = DataHolder.CREATOR.a(paramParcel1);
      }
      b(localDataHolder2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    int i = paramParcel1.readInt();
    DataHolder localDataHolder1 = null;
    if (i != 0) {
      localDataHolder1 = DataHolder.CREATOR.a(paramParcel1);
    }
    c(localDataHolder1);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.og.a
 * JD-Core Version:    0.7.0.1
 */