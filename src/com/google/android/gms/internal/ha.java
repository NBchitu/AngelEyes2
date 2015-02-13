package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ha
  implements Parcelable
{
  @Deprecated
  public static final Parcelable.Creator<ha> CREATOR = new ha.1();
  private String a;
  private String b;
  private String c;
  
  @Deprecated
  public ha() {}
  
  @Deprecated
  ha(Parcel paramParcel)
  {
    a(paramParcel);
  }
  
  @Deprecated
  private void a(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  @Deprecated
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ha
 * JD-Core Version:    0.7.0.1
 */