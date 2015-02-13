package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ot
  implements Parcelable.Creator<or>
{
  static void a(or paramor, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramor.a);
    b.a(paramParcel, 2, paramor.b);
    b.a(paramParcel, 3, paramor.c, false);
    b.a(paramParcel, 4, paramor.d, false);
    b.a(paramParcel, 5, paramor.e, false);
    b.a(paramParcel, i);
  }
  
  public or a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    int i = a.b(paramParcel);
    int j = 0;
    long l = 0L;
    byte[] arrayOfByte = null;
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
        l = a.h(paramParcel, k);
        break;
      case 3: 
        str = a.m(paramParcel, k);
        break;
      case 4: 
        arrayOfByte = a.p(paramParcel, k);
        break;
      case 5: 
        localBundle = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new or(j, l, str, arrayOfByte, localBundle);
  }
  
  public or[] a(int paramInt)
  {
    return new or[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ot
 * JD-Core Version:    0.7.0.1
 */