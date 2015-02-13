package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class no
  implements Parcelable.Creator<nn>
{
  static void a(nn paramnn, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramnn.f(), false);
    b.a(paramParcel, 1000, paramnn.a());
    b.a(paramParcel, 2, paramnn.g());
    b.a(paramParcel, 3, paramnn.b());
    b.a(paramParcel, 4, paramnn.c());
    b.a(paramParcel, 5, paramnn.d());
    b.a(paramParcel, 6, paramnn.e());
    b.a(paramParcel, 7, paramnn.h());
    b.a(paramParcel, 8, paramnn.i());
    b.a(paramParcel, 9, paramnn.j());
    b.a(paramParcel, i);
  }
  
  public nn a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    String str = null;
    int k = 0;
    short s = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    float f = 0.0F;
    long l = 0L;
    int m = 0;
    int n = -1;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        str = a.m(paramParcel, i1);
        break;
      case 1000: 
        j = a.f(paramParcel, i1);
        break;
      case 2: 
        l = a.h(paramParcel, i1);
        break;
      case 3: 
        s = a.e(paramParcel, i1);
        break;
      case 4: 
        d1 = a.k(paramParcel, i1);
        break;
      case 5: 
        d2 = a.k(paramParcel, i1);
        break;
      case 6: 
        f = a.j(paramParcel, i1);
        break;
      case 7: 
        k = a.f(paramParcel, i1);
        break;
      case 8: 
        m = a.f(paramParcel, i1);
        break;
      case 9: 
        n = a.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new nn(j, str, k, s, d1, d2, f, l, m, n);
  }
  
  public nn[] a(int paramInt)
  {
    return new nn[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.no
 * JD-Core Version:    0.7.0.1
 */