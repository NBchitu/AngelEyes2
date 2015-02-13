package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.aa;

public final class CameraPosition
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  public final LatLng a;
  public final float b;
  public final float c;
  public final float d;
  private final int e;
  
  CameraPosition(int paramInt, LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    jx.a(paramLatLng, "null camera target");
    if ((0.0F <= paramFloat2) && (paramFloat2 <= 90.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      jx.b(bool, "Tilt needs to be between 0 and 90 inclusive");
      this.e = paramInt;
      this.a = paramLatLng;
      this.b = paramFloat1;
      this.c = (paramFloat2 + 0.0F);
      if (paramFloat3 <= 0.0D) {
        paramFloat3 = 360.0F + paramFloat3 % 360.0F;
      }
      this.d = (paramFloat3 % 360.0F);
      return;
    }
  }
  
  public CameraPosition(LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramLatLng, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static CameraPosition a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.MapAttrs);
    if (localTypedArray.hasValue(R.styleable.MapAttrs_cameraTargetLat)) {}
    for (float f1 = localTypedArray.getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0F);; f1 = 0.0F)
    {
      if (localTypedArray.hasValue(R.styleable.MapAttrs_cameraTargetLng)) {}
      for (float f2 = localTypedArray.getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0F);; f2 = 0.0F)
      {
        LatLng localLatLng = new LatLng(f1, f2);
        CameraPosition.Builder localBuilder = b();
        localBuilder.a(localLatLng);
        if (localTypedArray.hasValue(R.styleable.MapAttrs_cameraZoom)) {
          localBuilder.a(localTypedArray.getFloat(R.styleable.MapAttrs_cameraZoom, 0.0F));
        }
        if (localTypedArray.hasValue(R.styleable.MapAttrs_cameraBearing)) {
          localBuilder.c(localTypedArray.getFloat(R.styleable.MapAttrs_cameraBearing, 0.0F));
        }
        if (localTypedArray.hasValue(R.styleable.MapAttrs_cameraTilt)) {
          localBuilder.b(localTypedArray.getFloat(R.styleable.MapAttrs_cameraTilt, 0.0F));
        }
        return localBuilder.a();
      }
    }
  }
  
  public static CameraPosition.Builder b()
  {
    return new CameraPosition.Builder();
  }
  
  int a()
  {
    return this.e;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    CameraPosition localCameraPosition;
    do
    {
      return true;
      if (!(paramObject instanceof CameraPosition)) {
        return false;
      }
      localCameraPosition = (CameraPosition)paramObject;
    } while ((this.a.equals(localCameraPosition.a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(localCameraPosition.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localCameraPosition.c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(localCameraPosition.d)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Float.valueOf(this.b);
    arrayOfObject[2] = Float.valueOf(this.c);
    arrayOfObject[3] = Float.valueOf(this.d);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("target", this.a).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (aa.a())
    {
      b.a(this, paramParcel, paramInt);
      return;
    }
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition
 * JD-Core Version:    0.7.0.1
 */