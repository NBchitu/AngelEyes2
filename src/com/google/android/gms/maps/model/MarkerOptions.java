package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.internal.aa;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final k CREATOR = new k();
  private final int a;
  private LatLng b;
  private String c;
  private String d;
  private BitmapDescriptor e;
  private float f = 0.5F;
  private float g = 1.0F;
  private boolean h;
  private boolean i = true;
  private boolean j = false;
  private float k = 0.0F;
  private float l = 0.5F;
  private float m = 0.0F;
  private float n = 1.0F;
  
  public MarkerOptions()
  {
    this.a = 1;
  }
  
  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.a = paramInt;
    this.b = paramLatLng;
    this.c = paramString1;
    this.d = paramString2;
    if (paramIBinder == null) {}
    for (BitmapDescriptor localBitmapDescriptor = null;; localBitmapDescriptor = new BitmapDescriptor(d.a.a(paramIBinder)))
    {
      this.e = localBitmapDescriptor;
      this.f = paramFloat1;
      this.g = paramFloat2;
      this.h = paramBoolean1;
      this.i = paramBoolean2;
      this.j = paramBoolean3;
      this.k = paramFloat3;
      this.l = paramFloat4;
      this.m = paramFloat5;
      this.n = paramFloat6;
      return;
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  public MarkerOptions a(float paramFloat1, float paramFloat2)
  {
    this.f = paramFloat1;
    this.g = paramFloat2;
    return this;
  }
  
  public MarkerOptions a(BitmapDescriptor paramBitmapDescriptor)
  {
    this.e = paramBitmapDescriptor;
    return this;
  }
  
  public MarkerOptions a(LatLng paramLatLng)
  {
    this.b = paramLatLng;
    return this;
  }
  
  public MarkerOptions a(String paramString)
  {
    this.c = paramString;
    return this;
  }
  
  public MarkerOptions a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }
  
  IBinder b()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.a().asBinder();
  }
  
  public MarkerOptions b(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public MarkerOptions b(boolean paramBoolean)
  {
    this.i = paramBoolean;
    return this;
  }
  
  public LatLng c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public BitmapDescriptor f()
  {
    return this.e;
  }
  
  public float g()
  {
    return this.f;
  }
  
  public float h()
  {
    return this.g;
  }
  
  public boolean i()
  {
    return this.h;
  }
  
  public boolean j()
  {
    return this.i;
  }
  
  public boolean k()
  {
    return this.j;
  }
  
  public float l()
  {
    return this.k;
  }
  
  public float m()
  {
    return this.l;
  }
  
  public float n()
  {
    return this.m;
  }
  
  public float o()
  {
    return this.n;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (aa.a())
    {
      l.a(this, paramParcel, paramInt);
      return;
    }
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * JD-Core Version:    0.7.0.1
 */