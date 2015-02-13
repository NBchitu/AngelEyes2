package com.telesoftas.utilities.weather;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class WeatherItem$1
  implements Parcelable.Creator<WeatherItem>
{
  public WeatherItem a(Parcel paramParcel)
  {
    return new WeatherItem(paramParcel, null);
  }
  
  public WeatherItem[] a(int paramInt)
  {
    return new WeatherItem[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.weather.WeatherItem.1
 * JD-Core Version:    0.7.0.1
 */