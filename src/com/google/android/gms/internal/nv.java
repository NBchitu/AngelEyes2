package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class nv
  implements Parcelable.Creator<nu>
{
  static void a(nu paramnu, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.b(paramParcel, 1, paramnu.b, false);
    b.a(paramParcel, 1000, paramnu.a);
    b.a(paramParcel, 2, paramnu.a(), false);
    b.a(paramParcel, 3, paramnu.b());
    b.b(paramParcel, 4, paramnu.c, false);
    b.a(paramParcel, 6, paramnu.d, false);
    b.a(paramParcel, i);
  }
  
  public nu a(Parcel paramParcel)
  {
    boolean bool = false;
    ArrayList localArrayList1 = null;
    int i = a.b(paramParcel);
    ArrayList localArrayList2 = null;
    String str = null;
    ArrayList localArrayList3 = null;
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
        localArrayList3 = a.c(paramParcel, k, oa.CREATOR);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        str = a.m(paramParcel, k);
        break;
      case 3: 
        bool = a.c(paramParcel, k);
        break;
      case 4: 
        localArrayList2 = a.c(paramParcel, k, oe.CREATOR);
        break;
      case 6: 
        localArrayList1 = a.y(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new nu(j, localArrayList3, str, bool, localArrayList2, localArrayList1);
  }
  
  public nu[] a(int paramInt)
  {
    return new nu[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nv
 * JD-Core Version:    0.7.0.1
 */