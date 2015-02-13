package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
  implements Parcelable.Creator<MarkerOptions>
{
  static void a(MarkerOptions paramMarkerOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramMarkerOptions.a());
    b.a(paramParcel, 2, paramMarkerOptions.c(), paramInt, false);
    b.a(paramParcel, 3, paramMarkerOptions.d(), false);
    b.a(paramParcel, 4, paramMarkerOptions.e(), false);
    b.a(paramParcel, 5, paramMarkerOptions.b(), false);
    b.a(paramParcel, 6, paramMarkerOptions.g());
    b.a(paramParcel, 7, paramMarkerOptions.h());
    b.a(paramParcel, 8, paramMarkerOptions.i());
    b.a(paramParcel, 9, paramMarkerOptions.j());
    b.a(paramParcel, 10, paramMarkerOptions.k());
    b.a(paramParcel, 11, paramMarkerOptions.l());
    b.a(paramParcel, 12, paramMarkerOptions.m());
    b.a(paramParcel, 13, paramMarkerOptions.n());
    b.a(paramParcel, 14, paramMarkerOptions.o());
    b.a(paramParcel, i);
  }
  
  public MarkerOptions a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    LatLng localLatLng = null;
    String str1 = null;
    String str2 = null;
    IBinder localIBinder = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    float f3 = 0.0F;
    float f4 = 0.5F;
    float f5 = 0.0F;
    float f6 = 1.0F;
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
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        str1 = a.m(paramParcel, k);
        break;
      case 4: 
        str2 = a.m(paramParcel, k);
        break;
      case 5: 
        localIBinder = a.n(paramParcel, k);
        break;
      case 6: 
        f1 = a.j(paramParcel, k);
        break;
      case 7: 
        f2 = a.j(paramParcel, k);
        break;
      case 8: 
        bool1 = a.c(paramParcel, k);
        break;
      case 9: 
        bool2 = a.c(paramParcel, k);
        break;
      case 10: 
        bool3 = a.c(paramParcel, k);
        break;
      case 11: 
        f3 = a.j(paramParcel, k);
        break;
      case 12: 
        f4 = a.j(paramParcel, k);
        break;
      case 13: 
        f5 = a.j(paramParcel, k);
        break;
      case 14: 
        f6 = a.j(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new MarkerOptions(j, localLatLng, str1, str2, localIBinder, f1, f2, bool1, bool2, bool3, f3, f4, f5, f6);
  }
  
  public MarkerOptions[] a(int paramInt)
  {
    return new MarkerOptions[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.k
 * JD-Core Version:    0.7.0.1
 */