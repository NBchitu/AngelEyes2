package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
{
  static void a(GroundOverlayOptions paramGroundOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramGroundOverlayOptions.b());
    b.a(paramParcel, 2, paramGroundOverlayOptions.a(), false);
    b.a(paramParcel, 3, paramGroundOverlayOptions.c(), paramInt, false);
    b.a(paramParcel, 4, paramGroundOverlayOptions.d());
    b.a(paramParcel, 5, paramGroundOverlayOptions.e());
    b.a(paramParcel, 6, paramGroundOverlayOptions.f(), paramInt, false);
    b.a(paramParcel, 7, paramGroundOverlayOptions.g());
    b.a(paramParcel, 8, paramGroundOverlayOptions.h());
    b.a(paramParcel, 9, paramGroundOverlayOptions.l());
    b.a(paramParcel, 10, paramGroundOverlayOptions.i());
    b.a(paramParcel, 11, paramGroundOverlayOptions.j());
    b.a(paramParcel, 12, paramGroundOverlayOptions.k());
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.f
 * JD-Core Version:    0.7.0.1
 */