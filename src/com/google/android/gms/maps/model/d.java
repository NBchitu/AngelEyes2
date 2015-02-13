package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
{
  static void a(CircleOptions paramCircleOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramCircleOptions.a());
    b.a(paramParcel, 2, paramCircleOptions.b(), paramInt, false);
    b.a(paramParcel, 3, paramCircleOptions.c());
    b.a(paramParcel, 4, paramCircleOptions.d());
    b.a(paramParcel, 5, paramCircleOptions.e());
    b.a(paramParcel, 6, paramCircleOptions.f());
    b.a(paramParcel, 7, paramCircleOptions.g());
    b.a(paramParcel, 8, paramCircleOptions.h());
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.d
 * JD-Core Version:    0.7.0.1
 */