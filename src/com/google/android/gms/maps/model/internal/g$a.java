package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.d;

public abstract class g$a
  extends Binder
  implements g
{
  public static g a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof g))) {
      return (g)localIInterface;
    }
    return new g.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      d locald7 = a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (locald7 != null) {}
      for (IBinder localIBinder7 = locald7.asBinder();; localIBinder7 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder7);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      d locald6 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (locald6 != null) {
        localIBinder6 = locald6.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      d locald5 = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder5 = null;
      if (locald5 != null) {
        localIBinder5 = locald5.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder5);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      d locald4 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (locald4 != null) {
        localIBinder4 = locald4.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      d locald3 = a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (locald3 != null) {
        localIBinder3 = locald3.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (Bitmap localBitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; localBitmap = null)
      {
        d locald2 = a(localBitmap);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locald2 != null) {
          localIBinder2 = locald2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    d locald1 = c(paramParcel1.readString());
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (locald1 != null) {
      localIBinder1 = locald1.asBinder();
    }
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.g.a
 * JD-Core Version:    0.7.0.1
 */