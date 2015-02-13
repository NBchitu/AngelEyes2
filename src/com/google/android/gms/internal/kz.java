package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class kz
  implements Parcelable.Creator<ky>
{
  static void a(ky paramky, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramky.d());
    b.a(paramParcel, 2, paramky.e(), false);
    b.a(paramParcel, 3, paramky.f(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public ky a(Parcel paramParcel)
  {
    kv localkv = null;
    int i = a.b(paramParcel);
    int j = 0;
    Parcel localParcel = null;
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
        localParcel = a.z(paramParcel, k);
        break;
      case 3: 
        localkv = (kv)a.a(paramParcel, k, kv.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new ky(j, localParcel, localkv);
  }
  
  public ky[] a(int paramInt)
  {
    return new ky[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kz
 * JD-Core Version:    0.7.0.1
 */