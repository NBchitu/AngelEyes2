package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public class StreetViewPanoramaLocation
  implements SafeParcelable
{
  public static final s CREATOR = new s();
  public final StreetViewPanoramaLink[] a;
  public final LatLng b;
  public final String c;
  private final int d;
  
  StreetViewPanoramaLocation(int paramInt, StreetViewPanoramaLink[] paramArrayOfStreetViewPanoramaLink, LatLng paramLatLng, String paramString)
  {
    this.d = paramInt;
    this.a = paramArrayOfStreetViewPanoramaLink;
    this.b = paramLatLng;
    this.c = paramString;
  }
  
  int a()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    StreetViewPanoramaLocation localStreetViewPanoramaLocation;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaLocation)) {
        return false;
      }
      localStreetViewPanoramaLocation = (StreetViewPanoramaLocation)paramObject;
    } while ((this.c.equals(localStreetViewPanoramaLocation.c)) && (this.b.equals(localStreetViewPanoramaLocation.b)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("panoId", this.c).a("position", this.b.toString()).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaLocation
 * JD-Core Version:    0.7.0.1
 */