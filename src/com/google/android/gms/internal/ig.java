package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ig
  implements Parcelable.Creator<if>
{
  static void a(if paramif, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramif.b);
    b.a(paramParcel, 1000, paramif.a);
    b.a(paramParcel, 2, paramif.c, false);
    b.a(paramParcel, 3, paramif.d, false);
    b.a(paramParcel, i);
  }
  
  public if a(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = 0;
    int j = a.b(paramParcel);
    Bundle localBundle = null;
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
        i = a.f(paramParcel, m);
        break;
      case 1000: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        localBundle = a.o(paramParcel, m);
        break;
      case 3: 
        arrayOfByte = a.p(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new if(k, i, localBundle, arrayOfByte);
  }
  
  public if[] a(int paramInt)
  {
    return new if[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ig
 * JD-Core Version:    0.7.0.1
 */