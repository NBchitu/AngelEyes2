package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;

public final class LatLng
  implements SafeParcelable
{
  public static final i CREATOR = new i();
  public final double a;
  public final double b;
  private final int c;
  
  public LatLng(double paramDouble1, double paramDouble2)
  {
    this(1, paramDouble1, paramDouble2);
  }
  
  LatLng(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.c = paramInt;
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D)) {}
    for (this.b = paramDouble2;; this.b = ((360.0D + (paramDouble2 - 180.0D) % 360.0D) % 360.0D - 180.0D))
    {
      this.a = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      return;
    }
  }
  
  int a()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LatLng localLatLng;
    do
    {
      return true;
      if (!(paramObject instanceof LatLng)) {
        return false;
      }
      localLatLng = (LatLng)paramObject;
    } while ((Double.doubleToLongBits(this.a) == Double.doubleToLongBits(localLatLng.a)) && (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(localLatLng.b)));
    return false;
  }
  
  public int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.a);
    int i = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.b);
    return i * 31 + (int)(l2 ^ l2 >>> 32);
  }
  
  public String toString()
  {
    return "lat/lng: (" + this.a + "," + this.b + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (aa.a())
    {
      j.a(this, paramParcel, paramInt);
      return;
    }
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLng
 * JD-Core Version:    0.7.0.1
 */