package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

public class z
{
  static void a(VisibleRegion paramVisibleRegion, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramVisibleRegion.a());
    b.a(paramParcel, 2, paramVisibleRegion.a, paramInt, false);
    b.a(paramParcel, 3, paramVisibleRegion.b, paramInt, false);
    b.a(paramParcel, 4, paramVisibleRegion.c, paramInt, false);
    b.a(paramParcel, 5, paramVisibleRegion.d, paramInt, false);
    b.a(paramParcel, 6, paramVisibleRegion.e, paramInt, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.z
 * JD-Core Version:    0.7.0.1
 */