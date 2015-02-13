package com.telesoftas.deeper.database;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LocationData
  implements Parcelable
{
  public static final Parcelable.Creator<LocationData> CREATOR = new LocationData.1();
  private String a;
  private String b;
  private double c;
  private int d;
  private double e;
  private int f;
  
  public LocationData(int paramInt1, String paramString1, String paramString2, double paramDouble1, int paramInt2, double paramDouble2)
  {
    a(paramString1);
    this.b = paramString2;
    this.c = paramDouble1;
    this.d = paramInt2;
    this.e = paramDouble2;
    this.f = paramInt1;
  }
  
  private LocationData(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readDouble();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readDouble();
    this.f = paramParcel.readInt();
  }
  
  public LocationData(String paramString1, String paramString2, double paramDouble1, int paramInt, double paramDouble2)
  {
    a(paramString1);
    this.b = paramString2;
    this.c = paramDouble1;
    this.d = paramInt;
    this.e = paramDouble2;
    this.f = -1;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public double c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public double e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public Location g()
  {
    Location localLocation = new Location("Forecast");
    localLocation.setLatitude(this.c);
    localLocation.setLongitude(this.e);
    return localLocation;
  }
  
  public int hashCode()
  {
    return (this.a + this.b + this.c + this.d + this.e).hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeDouble(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeDouble(this.e);
    paramParcel.writeInt(this.f);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.LocationData
 * JD-Core Version:    0.7.0.1
 */