package com.telesoftas.hardware;

import com.telesoftas.services.Signal;

public abstract class ImagingSignal
  extends Signal
{
  private final long a;
  private final float b;	// ”„µƒ…Ó∂»?
  private int e;
  private final FishData[] f;
  
  ImagingSignal(float paramFloat, FishData[] paramArrayOfFishData)
  {
    this.b = paramFloat;
    this.a = System.currentTimeMillis();
    this.f = paramArrayOfFishData;
    for (FishData localFishData : this.f) {
      localFishData.setFishRealSize(FishData.getFishSizeTypeFromFloatValue(localFishData.getFishSize()));
    }
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public float f()
  {
    return this.b;
  }
  
  public float g()
  {
    if (this.b < 0.0F) {
      return 41.439999F;
    }
    return 41.439999F * this.b;
  }
  
  public long h()
  {
    return this.a;
  }
  
  public int i()
  {
    return this.e;
  }
  
  public FishData[] j()
  {
    return this.f;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.ImagingSignal
 * JD-Core Version:    0.7.0.1
 */