package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q
  implements Parcelable.Creator<StreetViewPanoramaCamera>
{
  static void a(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramStreetViewPanoramaCamera.a());
    b.a(paramParcel, 2, paramStreetViewPanoramaCamera.a);
    b.a(paramParcel, 3, paramStreetViewPanoramaCamera.b);
    b.a(paramParcel, 4, paramStreetViewPanoramaCamera.c);
    b.a(paramParcel, i);
  }
  
  public StreetViewPanoramaCamera a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    int i = a.b(paramParcel);
    float f2 = 0.0F;
    int j = 0;
    float f3 = 0.0F;
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
        f2 = a.j(paramParcel, k);
        break;
      case 3: 
        f3 = a.j(paramParcel, k);
        break;
      case 4: 
        f1 = a.j(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new StreetViewPanoramaCamera(j, f2, f3, f1);
  }
  
  public StreetViewPanoramaCamera[] a(int paramInt)
  {
    return new StreetViewPanoramaCamera[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.q
 * JD-Core Version:    0.7.0.1
 */