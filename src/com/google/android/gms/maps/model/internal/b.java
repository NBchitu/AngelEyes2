package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<a>
{
  static void a(a parama, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, parama.a());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, parama.b());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, parama.c(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, parama.d(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
  
  public a a(Parcel paramParcel)
  {
    Bitmap localBitmap = null;
    byte b = 0;
    int i = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    Bundle localBundle = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, k);
        break;
      case 2: 
        b = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, k);
        break;
      case 3: 
        localBundle = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 4: 
        localBitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, k, Bitmap.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new a(j, b, localBundle, localBitmap);
  }
  
  public a[] a(int paramInt)
  {
    return new a[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.b
 * JD-Core Version:    0.7.0.1
 */