package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class NoteEntry
  implements Parcelable
{
  public static final Parcelable.Creator<NoteEntry> CREATOR = new NoteEntry.1();
  private NoteData a;
  private LocationData b;
  private List<PhotoData> c = new ArrayList();
  private WeatherData d;
  
  private NoteEntry(Parcel paramParcel)
  {
    this.a = ((NoteData)paramParcel.readParcelable(NoteData.class.getClassLoader()));
    this.b = ((LocationData)paramParcel.readParcelable(LocationData.class.getClassLoader()));
    this.c = new ArrayList();
    paramParcel.readTypedList(this.c, PhotoData.CREATOR);
    this.d = ((WeatherData)paramParcel.readParcelable(WeatherData.class.getClassLoader()));
  }
  
  public NoteEntry(NoteData paramNoteData, LocationData paramLocationData, List<PhotoData> paramList, WeatherData paramWeatherData)
  {
    this.a = paramNoteData;
    this.b = paramLocationData;
    this.c = paramList;
    this.d = paramWeatherData;
  }
  
  public NoteData a()
  {
    return this.a;
  }
  
  public void a(LocationData paramLocationData)
  {
    this.b = paramLocationData;
  }
  
  public void a(NoteData paramNoteData)
  {
    this.a = paramNoteData;
  }
  
  public void a(WeatherData paramWeatherData)
  {
    this.d = paramWeatherData;
  }
  
  public void a(List<PhotoData> paramList)
  {
    this.c = paramList;
  }
  
  public LocationData b()
  {
    return this.b;
  }
  
  public List<PhotoData> c()
  {
    return this.c;
  }
  
  public WeatherData d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeParcelable(this.b, paramInt);
    paramParcel.writeTypedList(this.c);
    paramParcel.writeParcelable(this.d, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.NoteEntry
 * JD-Core Version:    0.7.0.1
 */