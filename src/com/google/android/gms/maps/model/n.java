package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class n
{
  static void a(PolygonOptions paramPolygonOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramPolygonOptions.a());
    b.b(paramParcel, 2, paramPolygonOptions.c(), false);
    b.c(paramParcel, 3, paramPolygonOptions.b(), false);
    b.a(paramParcel, 4, paramPolygonOptions.d());
    b.a(paramParcel, 5, paramPolygonOptions.e());
    b.a(paramParcel, 6, paramPolygonOptions.f());
    b.a(paramParcel, 7, paramPolygonOptions.g());
    b.a(paramParcel, 8, paramPolygonOptions.h());
    b.a(paramParcel, 9, paramPolygonOptions.i());
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.n
 * JD-Core Version:    0.7.0.1
 */