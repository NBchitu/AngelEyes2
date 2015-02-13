package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class km
  implements SafeParcelable
{
  public static final kn CREATOR = new kn();
  private final int a;
  private final ko b;
  
  km(int paramInt, ko paramko)
  {
    this.a = paramInt;
    this.b = paramko;
  }
  
  private km(ko paramko)
  {
    this.a = 1;
    this.b = paramko;
  }
  
  public static km a(kr.b<?, ?> paramb)
  {
    if ((paramb instanceof ko)) {
      return new km((ko)paramb);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  int a()
  {
    return this.a;
  }
  
  ko b()
  {
    return this.b;
  }
  
  public kr.b<?, ?> c()
  {
    if (this.b != null) {
      return this.b;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kn.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.km
 * JD-Core Version:    0.7.0.1
 */