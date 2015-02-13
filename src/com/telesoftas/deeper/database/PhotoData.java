package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PhotoData
  implements Parcelable
{
  public static final Parcelable.Creator<PhotoData> CREATOR = new PhotoData.1();
  private String a;
  
  private PhotoData(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }
  
  public PhotoData(String paramString)
  {
    this.a = paramString;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.PhotoData
 * JD-Core Version:    0.7.0.1
 */