package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

public final class LocationRequest
  implements SafeParcelable
{
  public static final d CREATOR = new d();
  int a;
  long b;
  long c;
  boolean d;
  long e;
  int f;
  float g;
  long h;
  private final int i;
  
  public LocationRequest()
  {
    this.i = 1;
    this.a = 102;
    this.b = 3600000L;
    this.c = 600000L;
    this.d = false;
    this.e = 9223372036854775807L;
    this.f = 2147483647;
    this.g = 0.0F;
    this.h = 0L;
  }
  
  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat, long paramLong4)
  {
    this.i = paramInt1;
    this.a = paramInt2;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramBoolean;
    this.e = paramLong3;
    this.f = paramInt3;
    this.g = paramFloat;
    this.h = paramLong4;
  }
  
  public static LocationRequest a()
  {
    return new LocationRequest();
  }
  
  public static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      return "???";
    case 100: 
      return "PRIORITY_HIGH_ACCURACY";
    case 102: 
      return "PRIORITY_BALANCED_POWER_ACCURACY";
    case 104: 
      return "PRIORITY_LOW_POWER";
    }
    return "PRIORITY_NO_POWER";
  }
  
  private static void c(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      throw new IllegalArgumentException("invalid quality: " + paramInt);
    }
  }
  
  private static void c(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("invalid interval: " + paramLong);
    }
  }
  
  public LocationRequest a(int paramInt)
  {
    c(paramInt);
    this.a = paramInt;
    return this;
  }
  
  public LocationRequest a(long paramLong)
  {
    c(paramLong);
    this.b = paramLong;
    if (!this.d) {
      this.c = ((this.b / 6.0D));
    }
    return this;
  }
  
  int b()
  {
    return this.i;
  }
  
  public LocationRequest b(long paramLong)
  {
    c(paramLong);
    this.d = true;
    this.c = paramLong;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LocationRequest localLocationRequest;
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest)) {
        return false;
      }
      localLocationRequest = (LocationRequest)paramObject;
    } while ((this.a == localLocationRequest.a) && (this.b == localLocationRequest.b) && (this.c == localLocationRequest.c) && (this.d == localLocationRequest.d) && (this.e == localLocationRequest.e) && (this.f == localLocationRequest.f) && (this.g == localLocationRequest.g));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = Long.valueOf(this.c);
    arrayOfObject[3] = Boolean.valueOf(this.d);
    arrayOfObject[4] = Long.valueOf(this.e);
    arrayOfObject[5] = Integer.valueOf(this.f);
    arrayOfObject[6] = Float.valueOf(this.g);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Request[").append(b(this.a));
    if (this.a != 105)
    {
      localStringBuilder.append(" requested=");
      localStringBuilder.append(this.b + "ms");
    }
    localStringBuilder.append(" fastest=");
    localStringBuilder.append(this.c + "ms");
    if (this.e != 9223372036854775807L)
    {
      long l = this.e - SystemClock.elapsedRealtime();
      localStringBuilder.append(" expireIn=");
      localStringBuilder.append(l + "ms");
    }
    if (this.f != 2147483647) {
      localStringBuilder.append(" num=").append(this.f);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * JD-Core Version:    0.7.0.1
 */