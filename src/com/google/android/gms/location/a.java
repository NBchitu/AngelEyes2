package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.nn;
import java.util.ArrayList;

public class a
  implements Parcelable.Creator<GeofencingRequest>
{
  static void a(GeofencingRequest paramGeofencingRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.b(paramParcel, 1, paramGeofencingRequest.b(), false);
    b.a(paramParcel, 1000, paramGeofencingRequest.a());
    b.a(paramParcel, 2, paramGeofencingRequest.c());
    b.a(paramParcel, i);
  }
  
  public GeofencingRequest a(Parcel paramParcel)
  {
    int i = 0;
    int j = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    ArrayList localArrayList = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, nn.CREATOR);
        break;
      case 1000: 
        k = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 2: 
        i = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new GeofencingRequest(k, localArrayList, i);
  }
  
  public GeofencingRequest[] a(int paramInt)
  {
    return new GeofencingRequest[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.a
 * JD-Core Version:    0.7.0.1
 */