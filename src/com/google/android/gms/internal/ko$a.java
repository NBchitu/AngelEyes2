package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ko$a
  implements SafeParcelable
{
  public static final kq CREATOR = new kq();
  final int a;
  final String b;
  final int c;
  
  ko$a(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  ko$a(String paramString, int paramInt)
  {
    this.a = 1;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kq.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ko.a
 * JD-Core Version:    0.7.0.1
 */