package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class kn
  implements Parcelable.Creator<km>
{
  static void a(km paramkm, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramkm.a());
    b.a(paramParcel, 2, paramkm.b(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public km a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    ko localko = null;
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
        localko = (ko)a.a(paramParcel, k, ko.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new km(j, localko);
  }
  
  public km[] a(int paramInt)
  {
    return new km[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kn
 * JD-Core Version:    0.7.0.1
 */