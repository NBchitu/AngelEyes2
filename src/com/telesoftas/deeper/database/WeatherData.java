package com.telesoftas.deeper.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeatherData
  implements Parcelable
{
  public static final Parcelable.Creator<WeatherData> CREATOR = new WeatherData.1();
  private int a;
  private float b;
  private float c;
  private GregorianCalendar d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private int j;
  private GregorianCalendar k;
  private GregorianCalendar l;
  private float m;
  private GregorianCalendar n;
  private GregorianCalendar o;
  private int p;
  private float q;
  
  public WeatherData(int paramInt1, float paramFloat1, float paramFloat2, GregorianCalendar paramGregorianCalendar1, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt2, GregorianCalendar paramGregorianCalendar2, GregorianCalendar paramGregorianCalendar3, float paramFloat8, GregorianCalendar paramGregorianCalendar4, GregorianCalendar paramGregorianCalendar5, int paramInt3, float paramFloat9)
  {
    this.a = paramInt1;
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramGregorianCalendar1;
    this.e = paramFloat3;
    this.f = paramFloat4;
    this.g = paramFloat5;
    this.h = paramFloat6;
    this.i = paramFloat7;
    this.j = paramInt2;
    this.k = paramGregorianCalendar2;
    this.l = paramGregorianCalendar3;
    this.m = paramFloat8;
    this.n = paramGregorianCalendar4;
    this.p = paramInt3;
    this.q = paramFloat9;
    this.o = paramGregorianCalendar5;
  }
  
  private WeatherData(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readFloat();
    this.c = paramParcel.readFloat();
    this.d = new GregorianCalendar();
    this.d.setTimeInMillis(paramParcel.readLong());
    this.e = paramParcel.readFloat();
    this.f = paramParcel.readFloat();
    this.g = paramParcel.readFloat();
    this.h = paramParcel.readFloat();
    this.i = paramParcel.readFloat();
    this.j = paramParcel.readInt();
    this.k = new GregorianCalendar();
    this.k.setTimeInMillis(paramParcel.readLong());
    this.l = new GregorianCalendar();
    this.l.setTimeInMillis(paramParcel.readLong());
    this.m = paramParcel.readFloat();
    this.n = new GregorianCalendar();
    this.n.setTimeInMillis(paramParcel.readLong());
    this.o = new GregorianCalendar();
    this.o.setTimeInMillis(paramParcel.readLong());
    this.p = paramParcel.readInt();
    this.q = paramParcel.readFloat();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public float b()
  {
    return this.b;
  }
  
  public float c()
  {
    return this.c;
  }
  
  public GregorianCalendar d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float e()
  {
    return this.e;
  }
  
  public float f()
  {
    return this.f;
  }
  
  public float g()
  {
    return this.g;
  }
  
  public float h()
  {
    return this.h;
  }
  
  public float i()
  {
    return this.i;
  }
  
  public int j()
  {
    return this.j;
  }
  
  public Calendar k()
  {
    return this.k;
  }
  
  public Calendar l()
  {
    return this.l;
  }
  
  public float m()
  {
    return this.m;
  }
  
  public Calendar n()
  {
    return this.n;
  }
  
  public Calendar o()
  {
    return this.o;
  }
  
  public int p()
  {
    return this.p;
  }
  
  public float q()
  {
    return this.q;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeFloat(this.b);
    paramParcel.writeFloat(this.c);
    paramParcel.writeLong(this.d.getTimeInMillis());
    paramParcel.writeFloat(this.e);
    paramParcel.writeFloat(this.f);
    paramParcel.writeFloat(this.g);
    paramParcel.writeFloat(this.h);
    paramParcel.writeFloat(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeLong(this.k.getTimeInMillis());
    paramParcel.writeLong(this.l.getTimeInMillis());
    paramParcel.writeFloat(this.m);
    paramParcel.writeLong(this.n.getTimeInMillis());
    paramParcel.writeLong(this.o.getTimeInMillis());
    paramParcel.writeInt(this.p);
    paramParcel.writeFloat(this.q);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.WeatherData
 * JD-Core Version:    0.7.0.1
 */