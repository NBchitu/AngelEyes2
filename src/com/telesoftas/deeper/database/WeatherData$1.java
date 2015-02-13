package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class WeatherData$1
  implements Parcelable.Creator<WeatherData>
{
  public WeatherData a(Parcel paramParcel)
  {
    return new WeatherData(paramParcel, null);
  }
  
  public WeatherData[] a(int paramInt)
  {
    return new WeatherData[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.WeatherData.1
 * JD-Core Version:    0.7.0.1
 */