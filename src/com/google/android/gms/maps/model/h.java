package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
{
  static void a(LatLngBounds paramLatLngBounds, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramLatLngBounds.a());
    b.a(paramParcel, 2, paramLatLngBounds.a, paramInt, false);
    b.a(paramParcel, 3, paramLatLngBounds.b, paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.h
 * JD-Core Version:    0.7.0.1
 */