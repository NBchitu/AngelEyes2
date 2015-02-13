package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class od
  implements Parcelable.Creator<oc>
{
  static void a(oc paramoc, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramoc.a(), false);
    b.a(paramParcel, 1000, paramoc.a);
    b.a(paramParcel, 2, paramoc.b(), paramInt, false);
    b.a(paramParcel, 3, paramoc.c(), false);
    b.b(paramParcel, 4, paramoc.d(), false);
    b.a(paramParcel, 5, paramoc.e(), false);
    b.a(paramParcel, 6, paramoc.f(), false);
    b.a(paramParcel, i);
  }
  
  public oc a(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.b(paramParcel);
    int j = 0;
    String str2 = null;
    ArrayList localArrayList = null;
    String str3 = null;
    LatLng localLatLng = null;
    String str4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str4 = a.m(paramParcel, k);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        str3 = a.m(paramParcel, k);
        break;
      case 4: 
        localArrayList = a.c(paramParcel, k, oa.CREATOR);
        break;
      case 5: 
        str2 = a.m(paramParcel, k);
        break;
      case 6: 
        str1 = a.m(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new oc(j, str4, localLatLng, str3, localArrayList, str2, str1);
  }
  
  public oc[] a(int paramInt)
  {
    return new oc[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.od
 * JD-Core Version:    0.7.0.1
 */