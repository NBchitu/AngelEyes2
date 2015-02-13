package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;
import com.google.android.gms.internal.jx;

public class StreetViewPanoramaOrientation
  implements SafeParcelable
{
  public static final t CREATOR = new t();
  public final float a;
  public final float b;
  private final int c;
  
  public StreetViewPanoramaOrientation(float paramFloat1, float paramFloat2)
  {
    this(1, paramFloat1, paramFloat2);
  }
  
  StreetViewPanoramaOrientation(int paramInt, float paramFloat1, float paramFloat2)
  {
    if ((-90.0F <= paramFloat1) && (paramFloat1 <= 90.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      jx.b(bool, "Tilt needs to be between -90 and 90 inclusive");
      this.c = paramInt;
      this.a = (0.0F + paramFloat1);
      if (paramFloat2 <= 0.0D) {
        paramFloat2 = 360.0F + paramFloat2 % 360.0F;
      }
      this.b = (paramFloat2 % 360.0F);
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
    StreetViewPanoramaOrientation localStreetViewPanoramaOrientation;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaOrientation)) {
        return false;
      }
      localStreetViewPanoramaOrientation = (StreetViewPanoramaOrientation)paramObject;
    } while ((Float.floatToIntBits(this.a) == Float.floatToIntBits(localStreetViewPanoramaOrientation.a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(localStreetViewPanoramaOrientation.b)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Float.valueOf(this.a);
    arrayOfObject[1] = Float.valueOf(this.b);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("tilt", Float.valueOf(this.a)).a("bearing", Float.valueOf(this.b)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaOrientation
 * JD-Core Version:    0.7.0.1
 */