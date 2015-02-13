package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class x
{
  static void a(TileOverlayOptions paramTileOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramTileOverlayOptions.a());
    b.a(paramParcel, 2, paramTileOverlayOptions.b(), false);
    b.a(paramParcel, 3, paramTileOverlayOptions.d());
    b.a(paramParcel, 4, paramTileOverlayOptions.c());
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.x
 * JD-Core Version:    0.7.0.1
 */