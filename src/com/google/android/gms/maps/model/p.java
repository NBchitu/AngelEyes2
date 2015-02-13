package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class p
{
  static void a(PolylineOptions paramPolylineOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramPolylineOptions.a());
    b.b(paramParcel, 2, paramPolylineOptions.b(), false);
    b.a(paramParcel, 3, paramPolylineOptions.c());
    b.a(paramParcel, 4, paramPolylineOptions.d());
    b.a(paramParcel, 5, paramPolylineOptions.e());
    b.a(paramParcel, 6, paramPolylineOptions.f());
    b.a(paramParcel, 7, paramPolylineOptions.g());
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.p
 * JD-Core Version:    0.7.0.1
 */