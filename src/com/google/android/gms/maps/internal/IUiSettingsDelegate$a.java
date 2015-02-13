package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IUiSettingsDelegate$a
  extends Binder
  implements IUiSettingsDelegate
{
  public static IUiSettingsDelegate a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof IUiSettingsDelegate))) {
      return (IUiSettingsDelegate)localIInterface;
    }
    return new IUiSettingsDelegate.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i14 = paramParcel1.readInt();
      boolean bool19 = false;
      if (i14 != 0) {
        bool19 = true;
      }
      a(bool19);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i13 = paramParcel1.readInt();
      boolean bool18 = false;
      if (i13 != 0) {
        bool18 = true;
      }
      b(bool18);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i12 = paramParcel1.readInt();
      boolean bool17 = false;
      if (i12 != 0) {
        bool17 = true;
      }
      c(bool17);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i11 = paramParcel1.readInt();
      boolean bool16 = false;
      if (i11 != 0) {
        bool16 = true;
      }
      d(bool16);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i10 = paramParcel1.readInt();
      boolean bool15 = false;
      if (i10 != 0) {
        bool15 = true;
      }
      e(bool15);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i9 = paramParcel1.readInt();
      boolean bool14 = false;
      if (i9 != 0) {
        bool14 = true;
      }
      f(bool14);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i8 = paramParcel1.readInt();
      boolean bool13 = false;
      if (i8 != 0) {
        bool13 = true;
      }
      g(bool13);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int i7 = paramParcel1.readInt();
      boolean bool12 = false;
      if (i7 != 0) {
        bool12 = true;
      }
      h(bool12);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool11 = a();
      paramParcel2.writeNoException();
      int i6 = 0;
      if (bool11) {
        i6 = 1;
      }
      paramParcel2.writeInt(i6);
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool10 = b();
      paramParcel2.writeNoException();
      int i5 = 0;
      if (bool10) {
        i5 = 1;
      }
      paramParcel2.writeInt(i5);
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool9 = c();
      paramParcel2.writeNoException();
      int i4 = 0;
      if (bool9) {
        i4 = 1;
      }
      paramParcel2.writeInt(i4);
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool8 = d();
      paramParcel2.writeNoException();
      int i3 = 0;
      if (bool8) {
        i3 = 1;
      }
      paramParcel2.writeInt(i3);
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool7 = e();
      paramParcel2.writeNoException();
      int i2 = 0;
      if (bool7) {
        i2 = 1;
      }
      paramParcel2.writeInt(i2);
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool6 = f();
      paramParcel2.writeNoException();
      int i1 = 0;
      if (bool6) {
        i1 = 1;
      }
      paramParcel2.writeInt(i1);
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool5 = g();
      paramParcel2.writeNoException();
      int n = 0;
      if (bool5) {
        n = 1;
      }
      paramParcel2.writeInt(n);
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int m = paramParcel1.readInt();
      boolean bool4 = false;
      if (m != 0) {
        bool4 = true;
      }
      i(bool4);
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      boolean bool3 = h();
      paramParcel2.writeNoException();
      int k = 0;
      if (bool3) {
        k = 1;
      }
      paramParcel2.writeInt(k);
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
      int j = paramParcel1.readInt();
      boolean bool2 = false;
      if (j != 0) {
        bool2 = true;
      }
      j(bool2);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
    boolean bool1 = i();
    paramParcel2.writeNoException();
    int i = 0;
    if (bool1) {
      i = 1;
    }
    paramParcel2.writeInt(i);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IUiSettingsDelegate.a
 * JD-Core Version:    0.7.0.1
 */