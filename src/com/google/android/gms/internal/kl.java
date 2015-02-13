package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class kl
  implements Parcelable.Creator<kk>
{
  static void a(kk paramkk, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramkk.a);
    b.a(paramParcel, 2, paramkk.b, false);
    b.a(paramParcel, 3, paramkk.c);
    b.a(paramParcel, i);
  }
  
  public kk a(Parcel paramParcel)
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
    return new kk(k, str, i);
  }
  
  public kk[] a(int paramInt)
  {
    return new kk[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kl
 * JD-Core Version:    0.7.0.1
 */