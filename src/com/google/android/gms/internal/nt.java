package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class nt
  implements Parcelable.Creator<ns>
{
  static void a(ns paramns, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramns.b());
    b.a(paramParcel, 1000, paramns.a());
    b.a(paramParcel, 2, paramns.c());
    b.a(paramParcel, 3, paramns.d(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public ns a(Parcel paramParcel)
  {
    int i = 0;
    int j = a.b(paramParcel);
    int k = -1;
    nu localnu = null;
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
        i = a.f(paramParcel, n);
        break;
      case 1000: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        k = a.f(paramParcel, n);
        break;
      case 3: 
        localnu = (nu)a.a(paramParcel, n, nu.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new ns(m, i, k, localnu);
  }
  
  public ns[] a(int paramInt)
  {
    return new ns[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nt
 * JD-Core Version:    0.7.0.1
 */