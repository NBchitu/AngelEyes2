package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class a$a
  extends RuntimeException
{
  public a$a(String paramString, Parcel paramParcel)
  {
    super(paramString + " Parcel: pos=" + paramParcel.dataPosition() + " size=" + paramParcel.dataSize());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.a.a
 * JD-Core Version:    0.7.0.1
 */