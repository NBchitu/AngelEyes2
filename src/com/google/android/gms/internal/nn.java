package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class nn
  implements SafeParcelable
{
  public static final no CREATOR = new no();
  private final int a;
  private final String b;
  private final long c;
  private final short d;
  private final double e;
  private final double f;
  private final float g;
  private final int h;
  private final int i;
  private final int j;
  
  public nn(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    a(paramString);
    a(paramFloat);
    a(paramDouble1, paramDouble2);
    int k = a(paramInt2);
    this.a = paramInt1;
    this.d = paramShort;
    this.b = paramString;
    this.e = paramDouble1;
    this.f = paramDouble2;
    this.g = paramFloat;
    this.c = paramLong;
    this.h = k;
    this.i = paramInt3;
    this.j = paramInt4;
  }
  
  private static int a(int paramInt)
  {
    int k = paramInt & 0x7;
    if (k == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt);
    }
    return k;
  }
  
  private static void a(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
  }
  
  private static void a(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
  }
  
  private static void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return "CIRCLE";
  }
  
  public int a()
  {
    return this.a;
  }
  
  public short b()
  {
    return this.d;
  }
  
  public double c()
  {
    return this.e;
  }
  
  public double d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    nn localnn;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof nn)) {
        return false;
      }
      localnn = (nn)paramObject;
      if (this.g != localnn.g) {
        return false;
      }
      if (this.e != localnn.e) {
        return false;
      }
      if (this.f != localnn.f) {
        return false;
      }
    } while (this.d == localnn.d);
    return false;
  }
  
  public String f()
  {
    return this.b;
  }
  
  public long g()
  {
    return this.c;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.e);
    int k = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.f);
    return 31 * (31 * (31 * (k * 31 + (int)(l2 ^ l2 >>> 32)) + Float.floatToIntBits(this.g)) + this.d) + this.h;
  }
  
  public int i()
  {
    return this.i;
  }
  
  public int j()
  {
    return this.j;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = b(this.d);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = Integer.valueOf(this.h);
    arrayOfObject[3] = Double.valueOf(this.e);
    arrayOfObject[4] = Double.valueOf(this.f);
    arrayOfObject[5] = Float.valueOf(this.g);
    arrayOfObject[6] = Integer.valueOf(this.i / 1000);
    arrayOfObject[7] = Integer.valueOf(this.j);
    arrayOfObject[8] = Long.valueOf(this.c);
    return String.format(localLocale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    no.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nn
 * JD-Core Version:    0.7.0.1
 */