package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;
import com.google.android.gms.internal.jx;

public class StreetViewPanoramaCamera
  implements SafeParcelable
{
  public static final q CREATOR = new q();
  public final float a;
  public final float b;
  public final float c;
  private final int d;
  private StreetViewPanoramaOrientation e;
  
  StreetViewPanoramaCamera(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool;
    if ((-90.0F <= paramFloat2) && (paramFloat2 <= 90.0F))
    {
      bool = true;
      jx.b(bool, "Tilt needs to be between -90 and 90 inclusive");
      this.d = paramInt;
      if (paramFloat1 <= 0.0D) {
        paramFloat1 = 0.0F;
      }
      this.a = paramFloat1;
      this.b = (paramFloat2 + 0.0F);
      if (paramFloat3 > 0.0D) {
        break label111;
      }
    }
    label111:
    for (float f = 360.0F + paramFloat3 % 360.0F;; f = paramFloat3)
    {
      this.c = (f % 360.0F);
      this.e = new StreetViewPanoramaOrientation.Builder().a(paramFloat2).b(paramFloat3).a();
      return;
      bool = false;
      break;
    }
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
    StreetViewPanoramaCamera localStreetViewPanoramaCamera;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaCamera)) {
        return false;
      }
      localStreetViewPanoramaCamera = (StreetViewPanoramaCamera)paramObject;
    } while ((Float.floatToIntBits(this.a) == Float.floatToIntBits(localStreetViewPanoramaCamera.a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(localStreetViewPanoramaCamera.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localStreetViewPanoramaCamera.c)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Float.valueOf(this.a);
    arrayOfObject[1] = Float.valueOf(this.b);
    arrayOfObject[2] = Float.valueOf(this.c);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("zoom", Float.valueOf(this.a)).a("tilt", Float.valueOf(this.b)).a("bearing", Float.valueOf(this.c)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    q.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaCamera
 * JD-Core Version:    0.7.0.1
 */