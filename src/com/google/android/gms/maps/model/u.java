package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class u
  implements Parcelable.Creator<Tile>
{
  static void a(Tile paramTile, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramTile.a());
    b.a(paramParcel, 2, paramTile.a);
    b.a(paramParcel, 3, paramTile.b);
    b.a(paramParcel, 4, paramTile.c, false);
    b.a(paramParcel, i);
  }
  
  public Tile a(Parcel paramParcel)
  {
    int i = 0;
    int j = a.b(paramParcel);
    byte[] arrayOfByte = null;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        k = a.f(paramParcel, n);
        break;
      case 3: 
        i = a.f(paramParcel, n);
        break;
      case 4: 
        arrayOfByte = a.p(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new Tile(m, k, i, arrayOfByte);
  }
  
  public Tile[] a(int paramInt)
  {
    return new Tile[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.u
 * JD-Core Version:    0.7.0.1
 */