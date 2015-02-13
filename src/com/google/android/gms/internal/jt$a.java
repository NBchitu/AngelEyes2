package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class jt$a
  extends Binder
  implements jt
{
  public static jt a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    if ((localIInterface != null) && ((localIInterface instanceof jt))) {
      return (jt)localIInterface;
    }
    return new jt.a.a(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs26 = js.a.a(paramParcel1.readStrongBinder());
      int i41 = paramParcel1.readInt();
      String str30 = paramParcel1.readString();
      String str31 = paramParcel1.readString();
      String[] arrayOfString4 = paramParcel1.createStringArray();
      String str32 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle25 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle25 = null)
      {
        a(localjs26, i41, str30, str31, arrayOfString4, str32, localBundle25);
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs25 = js.a.a(paramParcel1.readStrongBinder());
      int i39 = paramParcel1.readInt();
      String str29 = paramParcel1.readString();
      int i40 = paramParcel1.readInt();
      Bundle localBundle24 = null;
      if (i40 != 0) {
        localBundle24 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localjs25, i39, str29, localBundle24);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs24 = js.a.a(paramParcel1.readStrongBinder());
      int i37 = paramParcel1.readInt();
      String str28 = paramParcel1.readString();
      int i38 = paramParcel1.readInt();
      Bundle localBundle23 = null;
      if (i38 != 0) {
        localBundle23 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b(localjs24, i37, str28, localBundle23);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs23 = js.a.a(paramParcel1.readStrongBinder());
      int i35 = paramParcel1.readInt();
      String str27 = paramParcel1.readString();
      int i36 = paramParcel1.readInt();
      Bundle localBundle22 = null;
      if (i36 != 0) {
        localBundle22 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      c(localjs23, i35, str27, localBundle22);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs22 = js.a.a(paramParcel1.readStrongBinder());
      int i33 = paramParcel1.readInt();
      String str26 = paramParcel1.readString();
      int i34 = paramParcel1.readInt();
      Bundle localBundle21 = null;
      if (i34 != 0) {
        localBundle21 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      d(localjs22, i33, str26, localBundle21);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs21 = js.a.a(paramParcel1.readStrongBinder());
      int i31 = paramParcel1.readInt();
      String str25 = paramParcel1.readString();
      int i32 = paramParcel1.readInt();
      Bundle localBundle20 = null;
      if (i32 != 0) {
        localBundle20 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      e(localjs21, i31, str25, localBundle20);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs20 = js.a.a(paramParcel1.readStrongBinder());
      int i30 = paramParcel1.readInt();
      String str21 = paramParcel1.readString();
      String str22 = paramParcel1.readString();
      String[] arrayOfString3 = paramParcel1.createStringArray();
      String str23 = paramParcel1.readString();
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      String str24 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle19 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle19 = null)
      {
        a(localjs20, i30, str21, str22, arrayOfString3, str23, localIBinder2, str24, localBundle19);
        paramParcel2.writeNoException();
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs19 = js.a.a(paramParcel1.readStrongBinder());
      int i28 = paramParcel1.readInt();
      String str20 = paramParcel1.readString();
      int i29 = paramParcel1.readInt();
      Bundle localBundle18 = null;
      if (i29 != 0) {
        localBundle18 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      f(localjs19, i28, str20, localBundle18);
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs18 = js.a.a(paramParcel1.readStrongBinder());
      int i26 = paramParcel1.readInt();
      String str19 = paramParcel1.readString();
      int i27 = paramParcel1.readInt();
      Bundle localBundle17 = null;
      if (i27 != 0) {
        localBundle17 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      g(localjs18, i26, str19, localBundle17);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs17 = js.a.a(paramParcel1.readStrongBinder());
      int i24 = paramParcel1.readInt();
      String str18 = paramParcel1.readString();
      int i25 = paramParcel1.readInt();
      Bundle localBundle16 = null;
      if (i25 != 0) {
        localBundle16 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      h(localjs17, i24, str18, localBundle16);
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs16 = js.a.a(paramParcel1.readStrongBinder());
      int i22 = paramParcel1.readInt();
      String str17 = paramParcel1.readString();
      int i23 = paramParcel1.readInt();
      Bundle localBundle15 = null;
      if (i23 != 0) {
        localBundle15 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      i(localjs16, i22, str17, localBundle15);
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs15 = js.a.a(paramParcel1.readStrongBinder());
      int i20 = paramParcel1.readInt();
      String str16 = paramParcel1.readString();
      int i21 = paramParcel1.readInt();
      Bundle localBundle14 = null;
      if (i21 != 0) {
        localBundle14 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      j(localjs15, i20, str16, localBundle14);
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs14 = js.a.a(paramParcel1.readStrongBinder());
      int i18 = paramParcel1.readInt();
      String str15 = paramParcel1.readString();
      int i19 = paramParcel1.readInt();
      Bundle localBundle13 = null;
      if (i19 != 0) {
        localBundle13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      k(localjs14, i18, str15, localBundle13);
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs13 = js.a.a(paramParcel1.readStrongBinder());
      int i16 = paramParcel1.readInt();
      String str14 = paramParcel1.readString();
      int i17 = paramParcel1.readInt();
      Bundle localBundle12 = null;
      if (i17 != 0) {
        localBundle12 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      l(localjs13, i16, str14, localBundle12);
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs12 = js.a.a(paramParcel1.readStrongBinder());
      int i14 = paramParcel1.readInt();
      String str13 = paramParcel1.readString();
      int i15 = paramParcel1.readInt();
      Bundle localBundle11 = null;
      if (i15 != 0) {
        localBundle11 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      m(localjs12, i14, str13, localBundle11);
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs11 = js.a.a(paramParcel1.readStrongBinder());
      int i13 = paramParcel1.readInt();
      String str12 = paramParcel1.readString();
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle10 = null)
      {
        a(localjs11, i13, str12, localIBinder1, localBundle10);
        paramParcel2.writeNoException();
        return true;
      }
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs10 = js.a.a(paramParcel1.readStrongBinder());
      int i12 = paramParcel1.readInt();
      String str10 = paramParcel1.readString();
      String[] arrayOfString2 = paramParcel1.createStringArray();
      String str11 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle9 = null)
      {
        a(localjs10, i12, str10, arrayOfString2, str11, localBundle9);
        paramParcel2.writeNoException();
        return true;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      b(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      c(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs9 = js.a.a(paramParcel1.readStrongBinder());
      int i10 = paramParcel1.readInt();
      String str9 = paramParcel1.readString();
      int i11 = paramParcel1.readInt();
      Bundle localBundle8 = null;
      if (i11 != 0) {
        localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      n(localjs9, i10, str9, localBundle8);
      paramParcel2.writeNoException();
      return true;
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      d(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs8 = js.a.a(paramParcel1.readStrongBinder());
      int i8 = paramParcel1.readInt();
      String str8 = paramParcel1.readString();
      int i9 = paramParcel1.readInt();
      Bundle localBundle7 = null;
      if (i9 != 0) {
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      o(localjs8, i8, str8, localBundle7);
      paramParcel2.writeNoException();
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      e(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 27: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs7 = js.a.a(paramParcel1.readStrongBinder());
      int i6 = paramParcel1.readInt();
      String str7 = paramParcel1.readString();
      int i7 = paramParcel1.readInt();
      Bundle localBundle6 = null;
      if (i7 != 0) {
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      p(localjs7, i6, str7, localBundle6);
      paramParcel2.writeNoException();
      return true;
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      b(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 30: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs6 = js.a.a(paramParcel1.readStrongBinder());
      int i5 = paramParcel1.readInt();
      String str5 = paramParcel1.readString();
      String str6 = paramParcel1.readString();
      String[] arrayOfString1 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
      {
        a(localjs6, i5, str5, str6, arrayOfString1, localBundle5);
        paramParcel2.writeNoException();
        return true;
      }
    case 31: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      f(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 32: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      g(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 33: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 34: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 35: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      h(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 36: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      i(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 37: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs5 = js.a.a(paramParcel1.readStrongBinder());
      int i3 = paramParcel1.readInt();
      String str4 = paramParcel1.readString();
      int i4 = paramParcel1.readInt();
      Bundle localBundle4 = null;
      if (i4 != 0) {
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      q(localjs5, i3, str4, localBundle4);
      paramParcel2.writeNoException();
      return true;
    case 38: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs4 = js.a.a(paramParcel1.readStrongBinder());
      int i1 = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (i2 != 0) {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      r(localjs4, i1, str3, localBundle3);
      paramParcel2.writeNoException();
      return true;
    case 40: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      j(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 41: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs3 = js.a.a(paramParcel1.readStrongBinder());
      int m = paramParcel1.readInt();
      String str2 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (n != 0) {
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      s(localjs3, m, str2, localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 42: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      k(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 43: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      js localjs2 = js.a.a(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (k != 0) {
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      t(localjs2, j, str1, localBundle1);
      paramParcel2.writeNoException();
      return true;
    case 44: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      l(js.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    js localjs1 = js.a.a(paramParcel1.readStrongBinder());
    int i = paramParcel1.readInt();
    jj localjj = null;
    if (i != 0) {
      localjj = (jj)jj.CREATOR.createFromParcel(paramParcel1);
    }
    a(localjs1, localjj);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jt.a
 * JD-Core Version:    0.7.0.1
 */