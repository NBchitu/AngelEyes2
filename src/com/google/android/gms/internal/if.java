package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class if
  implements SafeParcelable
{
  public static final ig CREATOR = new ig();
  final int a;
  final int b;
  final Bundle c;
  final byte[] d;
  
  public if(int paramInt1, int paramInt2, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBundle;
    this.d = paramArrayOfByte;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ig.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.if
 * JD-Core Version:    0.7.0.1
 */