package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class nm
  implements Parcelable.Creator<nl>
{
  static void a(nl paramnl, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramnl.b, paramInt, false);
    b.a(paramParcel, 1000, paramnl.a());
    b.a(paramParcel, 2, paramnl.c);
    b.a(paramParcel, 3, paramnl.d);
    b.a(paramParcel, 4, paramnl.e);
    b.b(paramParcel, 5, paramnl.f, false);
    b.a(paramParcel, 6, paramnl.g, false);
    b.a(paramParcel, i);
  }
  
  public nl a(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = true;
    boolean bool2 = false;
    int i = a.b(paramParcel);
    Object localObject = nl.a;
    boolean bool3 = bool1;
    LocationRequest localLocationRequest = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localLocationRequest = (LocationRequest)a.a(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        bool2 = a.c(paramParcel, k);
        break;
      case 3: 
        bool3 = a.c(paramParcel, k);
        break;
      case 4: 
        bool1 = a.c(paramParcel, k);
        break;
      case 5: 
        localObject = a.c(paramParcel, k, nd.CREATOR);
        break;
      case 6: 
        str = a.m(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new nl(j, localLocationRequest, bool2, bool3, bool1, (List)localObject, str);
  }
  
  public nl[] a(int paramInt)
  {
    return new nl[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nm
 * JD-Core Version:    0.7.0.1
 */