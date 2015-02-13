package com.google.android.gms.maps.model;

public final class CameraPosition$Builder
{
  private LatLng a;
  private float b;
  private float c;
  private float d;
  
  public Builder a(float paramFloat)
  {
    this.b = paramFloat;
    return this;
  }
  
  public Builder a(LatLng paramLatLng)
  {
    this.a = paramLatLng;
    return this;
  }
  
  public CameraPosition a()
  {
    return new CameraPosition(this.a, this.b, this.c, this.d);
  }
  
  public Builder b(float paramFloat)
  {
    this.c = paramFloat;
    return this;
  }
  
  public Builder c(float paramFloat)
  {
    this.d = paramFloat;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition.Builder
 * JD-Core Version:    0.7.0.1
 */