package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public class StreetViewPanoramaLink
  implements SafeParcelable
{
  public static final r CREATOR = new r();
  public final String a;
  public final float b;
  private final int c;
  
  StreetViewPanoramaLink(int paramInt, String paramString, float paramFloat)
  {
    this.c = paramInt;
    this.a = paramString;
    if (paramFloat <= 0.0D) {
      paramFloat = 360.0F + paramFloat % 360.0F;
    }
    this.b = (paramFloat % 360.0F);
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
    StreetViewPanoramaLink localStreetViewPanoramaLink;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaLink)) {
        return false;
      }
      localStreetViewPanoramaLink = (StreetViewPanoramaLink)paramObject;
    } while ((this.a.equals(localStreetViewPanoramaLink.a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(localStreetViewPanoramaLink.b)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Float.valueOf(this.b);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("panoId", this.a).a("bearing", Float.valueOf(this.b)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaLink
 * JD-Core Version:    0.7.0.1
 */