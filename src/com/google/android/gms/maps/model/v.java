package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class v
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
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.v
 * JD-Core Version:    0.7.0.1
 */