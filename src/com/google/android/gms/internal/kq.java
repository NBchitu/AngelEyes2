package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class kq
  implements Parcelable.Creator<ko.a>
{
  static void a(ko.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, parama.a);
    b.a(paramParcel, 2, parama.b, false);
    b.a(paramParcel, 3, parama.c);
    b.a(paramParcel, i);
  }
  
  public ko.a a(Parcel paramParcel)
  {
    int i = 0;
    int j = a.b(paramParcel);
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        str = a.m(paramParcel, m);
        break;
      case 3: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new ko.a(k, str, i);
  }
  
  public ko.a[] a(int paramInt)
  {
    return new ko.a[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kq
 * JD-Core Version:    0.7.0.1
 */