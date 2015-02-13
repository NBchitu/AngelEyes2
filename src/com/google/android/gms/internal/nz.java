package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class nz
  implements Parcelable.Creator<ny>
{
  static void a(ny paramny, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1000, paramny.b);
    b.a(paramParcel, 2, paramny.a(), paramInt, false);
    b.a(paramParcel, 3, paramny.b());
    b.a(paramParcel, 4, paramny.c());
    b.a(paramParcel, i);
  }
  
  public ny a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    nu localnu = null;
    long l = ny.a;
    int k = 102;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
        break;
      case 2: 
        localnu = (nu)a.a(paramParcel, m, nu.CREATOR);
        break;
      case 3: 
        l = a.h(paramParcel, m);
        break;
      case 4: 
        k = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new ny(j, localnu, l, k);
  }
  
  public ny[] a(int paramInt)
  {
    return new ny[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz
 * JD-Core Version:    0.7.0.1
 */