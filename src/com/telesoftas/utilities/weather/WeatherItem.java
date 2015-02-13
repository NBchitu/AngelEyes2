package com.telesoftas.utilities.weather;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WeatherItem
  implements Parcelable
{
  public static final Parcelable.Creator<WeatherItem> CREATOR = new WeatherItem.1();
  private int a;
  private String b;
  private String c;
  private double d;
  private double e;
  private double f;
  private double g;
  private double h;
  private double i;
  private double j;
  private double k;
  private int l;
  private String m;
  private int n;
  private double o;
  private double p;
  
  public WeatherItem(int paramInt1, String paramString1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int paramInt2, String paramString2, int paramInt3, double paramDouble7, double paramDouble8)
  {
    this.a = paramInt1;
    this.c = " ";
    this.b = paramString1;
    this.d = paramDouble1;
    this.f = paramDouble3;
    this.e = paramDouble2;
    this.g = paramDouble4;
    this.j = paramDouble5;
    this.k = paramDouble6;
    this.l = paramInt2;
    this.m = paramString2;
    this.n = paramInt3;
    this.o = paramDouble7;
    this.p = paramDouble8;
    this.h = 0.0D;
    this.i = 0.0D;
  }
  
  public WeatherItem(int paramInt1, String paramString1, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, String paramString2, int paramInt3, double paramDouble5, double paramDouble6)
  {
    this.a = paramInt1;
    this.b = " ";
    this.c = paramString1;
    this.h = paramDouble1;
    this.i = paramDouble2;
    this.j = paramDouble3;
    this.k = paramDouble4;
    this.l = paramInt2;
    this.m = paramString2;
    this.n = paramInt3;
    this.o = paramDouble5;
    this.p = paramDouble6;
    this.d = 0.0D;
    this.f = 0.0D;
    this.e = 0.0D;
    this.g = 0.0D;
  }
  
  private WeatherItem(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readDouble();
    this.e = paramParcel.readDouble();
    this.f = paramParcel.readDouble();
    this.g = paramParcel.readDouble();
    this.h = paramParcel.readDouble();
    this.h = paramParcel.readDouble();
    this.j = paramParcel.readDouble();
    this.k = paramParcel.readDouble();
    this.l = paramParcel.readInt();
    this.m = paramParcel.readString();
    this.n = paramParcel.readInt();
    this.o = paramParcel.readDouble();
    this.p = paramParcel.readDouble();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public double b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return this.d;
    case 1: 
      return this.f;
    case 2: 
      return this.f;
    }
    return this.d;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public double c()
  {
    return this.j;
  }
  
  public double c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return this.e;
    case 1: 
      return this.g;
    case 2: 
      return this.g;
    }
    return this.e;
  }
  
  public double d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return this.h;
    case 1: 
      return this.i;
    case 2: 
      return this.i;
    }
    return this.h;
  }
  
  public String d()
  {
    return this.m;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int e()
  {
    return this.n;
  }
  
  public double f()
  {
    return this.p;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeDouble(this.d);
    paramParcel.writeDouble(this.e);
    paramParcel.writeDouble(this.f);
    paramParcel.writeDouble(this.g);
    paramParcel.writeDouble(this.h);
    paramParcel.writeDouble(this.i);
    paramParcel.writeDouble(this.j);
    paramParcel.writeDouble(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeString(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeDouble(this.o);
    paramParcel.writeDouble(this.p);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.weather.WeatherItem
 * JD-Core Version:    0.7.0.1
 */