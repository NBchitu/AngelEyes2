package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jk
  implements Parcelable.Creator<jj>
{
  static void a(jj paramjj, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramjj.a);
    b.a(paramParcel, 2, paramjj.b);
    b.a(paramParcel, 3, paramjj.c);
    b.a(paramParcel, 4, paramjj.d, false);
    b.a(paramParcel, 5, paramjj.e, false);
    b.a(paramParcel, 6, paramjj.f, paramInt, false);
    b.a(paramParcel, 7, paramjj.g, false);
    b.a(paramParcel, i);
  }
  
  public jj a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = a.b(paramParcel);
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
    String str = null;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        k = a.f(paramParcel, n);
        break;
      case 3: 
        i = a.f(paramParcel, n);
        break;
      case 4: 
        str = a.m(paramParcel, n);
        break;
      case 5: 
        localIBinder = a.n(paramParcel, n);
        break;
      case 6: 
        arrayOfScope = (Scope[])a.b(paramParcel, n, Scope.CREATOR);
        break;
      case 7: 
        localBundle = a.o(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new jj(m, k, i, str, localIBinder, arrayOfScope, localBundle);
  }
  
  public jj[] a(int paramInt)
  {
    return new jj[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jk
 * JD-Core Version:    0.7.0.1
 */