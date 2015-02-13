package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.model.internal.g;

public abstract class c$a
  extends Binder
  implements c
{
  public static c a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
    if ((localIInterface != null) && ((localIInterface instanceof c))) {
      return (c)localIInterface;
    }
    return new c.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICreator");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      a(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      IMapFragmentDelegate localIMapFragmentDelegate = b(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (localIMapFragmentDelegate != null) {
        localIBinder6 = localIMapFragmentDelegate.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      d locald2 = d.a.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.CREATOR.a(paramParcel1);; localGoogleMapOptions = null)
      {
        IMapViewDelegate localIMapViewDelegate = a(locald2, localGoogleMapOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (localIMapViewDelegate != null) {
          localIBinder5 = localIMapViewDelegate.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      ICameraUpdateFactoryDelegate localICameraUpdateFactoryDelegate = a();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localICameraUpdateFactoryDelegate != null) {
        localIBinder4 = localICameraUpdateFactoryDelegate.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      g localg = b();
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (localg != null) {
        localIBinder3 = localg.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      a(d.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      d locald1 = d.a.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (StreetViewPanoramaOptions localStreetViewPanoramaOptions = StreetViewPanoramaOptions.CREATOR.a(paramParcel1);; localStreetViewPanoramaOptions = null)
      {
        IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = a(locald1, localStreetViewPanoramaOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (localIStreetViewPanoramaViewDelegate != null) {
          localIBinder2 = localIStreetViewPanoramaViewDelegate.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
    IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = c(d.a.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (localIStreetViewPanoramaFragmentDelegate != null) {
      localIBinder1 = localIStreetViewPanoramaFragmentDelegate.asBinder();
    }
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.c.a
 * JD-Core Version:    0.7.0.1
 */