package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  private final int a;
  private Boolean b;
  private Boolean c;
  private int d = -1;
  private CameraPosition e;
  private Boolean f;
  private Boolean g;
  private Boolean h;
  private Boolean i;
  private Boolean j;
  private Boolean k;
  private Boolean l;
  private Boolean m;
  
  public GoogleMapOptions()
  {
    this.a = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10)
  {
    this.a = paramInt1;
    this.b = com.google.android.gms.maps.internal.a.a(paramByte1);
    this.c = com.google.android.gms.maps.internal.a.a(paramByte2);
    this.d = paramInt2;
    this.e = paramCameraPosition;
    this.f = com.google.android.gms.maps.internal.a.a(paramByte3);
    this.g = com.google.android.gms.maps.internal.a.a(paramByte4);
    this.h = com.google.android.gms.maps.internal.a.a(paramByte5);
    this.i = com.google.android.gms.maps.internal.a.a(paramByte6);
    this.j = com.google.android.gms.maps.internal.a.a(paramByte7);
    this.k = com.google.android.gms.maps.internal.a.a(paramByte8);
    this.l = com.google.android.gms.maps.internal.a.a(paramByte9);
    this.m = com.google.android.gms.maps.internal.a.a(paramByte10);
  }
  
  public static GoogleMapOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.MapAttrs);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(R.styleable.MapAttrs_mapType)) {
      localGoogleMapOptions.a(localTypedArray.getInt(R.styleable.MapAttrs_mapType, -1));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
      localGoogleMapOptions.a(localTypedArray.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
      localGoogleMapOptions.b(localTypedArray.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiCompass)) {
      localGoogleMapOptions.d(localTypedArray.getBoolean(R.styleable.MapAttrs_uiCompass, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
      localGoogleMapOptions.h(localTypedArray.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
      localGoogleMapOptions.e(localTypedArray.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
      localGoogleMapOptions.g(localTypedArray.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
      localGoogleMapOptions.f(localTypedArray.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
      localGoogleMapOptions.c(localTypedArray.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_liteMode)) {
      localGoogleMapOptions.i(localTypedArray.getBoolean(R.styleable.MapAttrs_liteMode, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
      localGoogleMapOptions.j(localTypedArray.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
    }
    localGoogleMapOptions.a(CameraPosition.a(paramContext, paramAttributeSet));
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }
  
  int a()
  {
    return this.a;
  }
  
  public GoogleMapOptions a(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public GoogleMapOptions a(CameraPosition paramCameraPosition)
  {
    this.e = paramCameraPosition;
    return this;
  }
  
  public GoogleMapOptions a(boolean paramBoolean)
  {
    this.b = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte b()
  {
    return com.google.android.gms.maps.internal.a.a(this.b);
  }
  
  public GoogleMapOptions b(boolean paramBoolean)
  {
    this.c = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte c()
  {
    return com.google.android.gms.maps.internal.a.a(this.c);
  }
  
  public GoogleMapOptions c(boolean paramBoolean)
  {
    this.f = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte d()
  {
    return com.google.android.gms.maps.internal.a.a(this.f);
  }
  
  public GoogleMapOptions d(boolean paramBoolean)
  {
    this.g = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  byte e()
  {
    return com.google.android.gms.maps.internal.a.a(this.g);
  }
  
  public GoogleMapOptions e(boolean paramBoolean)
  {
    this.h = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte f()
  {
    return com.google.android.gms.maps.internal.a.a(this.h);
  }
  
  public GoogleMapOptions f(boolean paramBoolean)
  {
    this.i = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte g()
  {
    return com.google.android.gms.maps.internal.a.a(this.i);
  }
  
  public GoogleMapOptions g(boolean paramBoolean)
  {
    this.j = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte h()
  {
    return com.google.android.gms.maps.internal.a.a(this.j);
  }
  
  public GoogleMapOptions h(boolean paramBoolean)
  {
    this.k = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte i()
  {
    return com.google.android.gms.maps.internal.a.a(this.k);
  }
  
  public GoogleMapOptions i(boolean paramBoolean)
  {
    this.l = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte j()
  {
    return com.google.android.gms.maps.internal.a.a(this.l);
  }
  
  public GoogleMapOptions j(boolean paramBoolean)
  {
    this.m = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte k()
  {
    return com.google.android.gms.maps.internal.a.a(this.m);
  }
  
  public int l()
  {
    return this.d;
  }
  
  public CameraPosition m()
  {
    return this.e;
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
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * JD-Core Version:    0.7.0.1
 */