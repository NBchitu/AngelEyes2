package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;

public class a
  implements Parcelable.Creator<GoogleMapOptions>
{
  static void a(GoogleMapOptions paramGoogleMapOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramGoogleMapOptions.a());
    b.a(paramParcel, 2, paramGoogleMapOptions.b());
    b.a(paramParcel, 3, paramGoogleMapOptions.c());
    b.a(paramParcel, 4, paramGoogleMapOptions.l());
    b.a(paramParcel, 5, paramGoogleMapOptions.m(), paramInt, false);
    b.a(paramParcel, 6, paramGoogleMapOptions.d());
    b.a(paramParcel, 7, paramGoogleMapOptions.e());
    b.a(paramParcel, 8, paramGoogleMapOptions.f());
    b.a(paramParcel, 9, paramGoogleMapOptions.g());
    b.a(paramParcel, 10, paramGoogleMapOptions.h());
    b.a(paramParcel, 11, paramGoogleMapOptions.i());
    b.a(paramParcel, 12, paramGoogleMapOptions.j());
    b.a(paramParcel, 14, paramGoogleMapOptions.k());
    b.a(paramParcel, i);
  }
  
  public GoogleMapOptions a(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int j = 0;
    byte b1 = 0;
    byte b2 = 0;
    int k = 0;
    CameraPosition localCameraPosition = null;
    byte b3 = 0;
    byte b4 = 0;
    byte b5 = 0;
    byte b6 = 0;
    byte b7 = 0;
    byte b8 = 0;
    byte b9 = 0;
    byte b10 = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      case 13: 
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 2: 
        b1 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 3: 
        b2 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 4: 
        k = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 5: 
        localCameraPosition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, CameraPosition.CREATOR);
        break;
      case 6: 
        b3 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 7: 
        b4 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 8: 
        b5 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 9: 
        b6 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 10: 
        b7 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 11: 
        b8 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 12: 
        b9 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
        break;
      case 14: 
        b10 = com.google.android.gms.common.internal.safeparcel.a.d(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new GoogleMapOptions(j, b1, b2, k, localCameraPosition, b3, b4, b5, b6, b7, b8, b9, b10);
  }
  
  public GoogleMapOptions[] a(int paramInt)
  {
    return new GoogleMapOptions[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a
 * JD-Core Version:    0.7.0.1
 */