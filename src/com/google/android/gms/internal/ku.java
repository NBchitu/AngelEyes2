package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ku
  implements Parcelable.Creator<kv.b>
{
  static void a(kv.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramb.a);
    b.a(paramParcel, 2, paramb.b, false);
    b.a(paramParcel, 3, paramb.c, paramInt, false);
    b.a(paramParcel, i);
  }
  
  public kv.b a(Parcel paramParcel)
  {
    kr.a locala = null;
    int i = a.b(paramParcel);
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        str = a.m(paramParcel, k);
        break;
      case 3: 
        locala = (kr.a)a.a(paramParcel, k, kr.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new kv.b(j, str, locala);
  }
  
  public kv.b[] a(int paramInt)
  {
    return new kv.b[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ku
 * JD-Core Version:    0.7.0.1
 */