package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class kt
  implements Parcelable.Creator<kr.a>
{
  static void a(kr.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, parama.a());
    b.a(paramParcel, 2, parama.b());
    b.a(paramParcel, 3, parama.c());
    b.a(paramParcel, 4, parama.d());
    b.a(paramParcel, 5, parama.e());
    b.a(paramParcel, 6, parama.f(), false);
    b.a(paramParcel, 7, parama.g());
    b.a(paramParcel, 8, parama.i(), false);
    b.a(paramParcel, 9, parama.k(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public kr.a a(Parcel paramParcel)
  {
    km localkm = null;
    int i = 0;
    int j = a.b(paramParcel);
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        n = a.f(paramParcel, i1);
        break;
      case 2: 
        m = a.f(paramParcel, i1);
        break;
      case 3: 
        bool2 = a.c(paramParcel, i1);
        break;
      case 4: 
        k = a.f(paramParcel, i1);
        break;
      case 5: 
        bool1 = a.c(paramParcel, i1);
        break;
      case 6: 
        str2 = a.m(paramParcel, i1);
        break;
      case 7: 
        i = a.f(paramParcel, i1);
        break;
      case 8: 
        str1 = a.m(paramParcel, i1);
        break;
      case 9: 
        localkm = (km)a.a(paramParcel, i1, km.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new kr.a(n, m, bool2, k, bool1, str2, i, str1, localkm);
  }
  
  public kr.a[] a(int paramInt)
  {
    return new kr.a[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kt
 * JD-Core Version:    0.7.0.1
 */