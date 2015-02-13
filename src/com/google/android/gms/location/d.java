package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<LocationRequest>
{
  static void a(LocationRequest paramLocationRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramLocationRequest.a);
    b.a(paramParcel, 1000, paramLocationRequest.b());
    b.a(paramParcel, 2, paramLocationRequest.b);
    b.a(paramParcel, 3, paramLocationRequest.c);
    b.a(paramParcel, 4, paramLocationRequest.d);
    b.a(paramParcel, 5, paramLocationRequest.e);
    b.a(paramParcel, 6, paramLocationRequest.f);
    b.a(paramParcel, 7, paramLocationRequest.g);
    b.a(paramParcel, 8, paramLocationRequest.h);
    b.a(paramParcel, i);
  }
  
  public LocationRequest a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    int k = 102;
    long l1 = 3600000L;
    long l2 = 600000L;
    boolean bool = false;
    long l3 = 9223372036854775807L;
    int m = 2147483647;
    float f = 0.0F;
    long l4 = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.f(paramParcel, n);
        break;
      case 1000: 
        j = a.f(paramParcel, n);
        break;
      case 2: 
        l1 = a.h(paramParcel, n);
        break;
      case 3: 
        l2 = a.h(paramParcel, n);
        break;
      case 4: 
        bool = a.c(paramParcel, n);
        break;
      case 5: 
        l3 = a.h(paramParcel, n);
        break;
      case 6: 
        m = a.f(paramParcel, n);
        break;
      case 7: 
        f = a.j(paramParcel, n);
        break;
      case 8: 
        l4 = a.h(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new LocationRequest(j, k, l1, l2, bool, l3, m, f, l4);
  }
  
  public LocationRequest[] a(int paramInt)
  {
    return new LocationRequest[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.d
 * JD-Core Version:    0.7.0.1
 */