package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ow
  implements Parcelable.Creator<ov>
{
  static void a(ov paramov, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramov.a);
    b.a(paramParcel, 2, paramov.b, false);
    b.a(paramParcel, 3, paramov.c);
    b.a(paramParcel, 4, paramov.d);
    b.a(paramParcel, 5, paramov.e, false);
    b.a(paramParcel, 6, paramov.f, false);
    b.a(paramParcel, 7, paramov.g);
    b.a(paramParcel, 8, paramov.h, false);
    b.a(paramParcel, i);
  }
  
  public ov a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = a.b(paramParcel);
    boolean bool = true;
    String str2 = null;
    String str3 = null;
    int k = 0;
    String str4 = null;
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
        str4 = a.m(paramParcel, n);
        break;
      case 3: 
        k = a.f(paramParcel, n);
        break;
      case 4: 
        i = a.f(paramParcel, n);
        break;
      case 5: 
        str3 = a.m(paramParcel, n);
        break;
      case 6: 
        str2 = a.m(paramParcel, n);
        break;
      case 7: 
        bool = a.c(paramParcel, n);
        break;
      case 8: 
        str1 = a.m(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new ov(m, str4, k, i, str3, str2, bool, str1);
  }
  
  public ov[] a(int paramInt)
  {
    return new ov[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ow
 * JD-Core Version:    0.7.0.1
 */