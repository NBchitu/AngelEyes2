package com.telesoftas.hardware;

public class FishData
{
  private float fishDepth;
  private FishData$FishSizeTypes fishRealSize;
  private float fishSize;
  
  public static FishData.FishSizeTypes getFishSizeTypeFromFloatValue(float paramFloat)
  {
    if (paramFloat <= 2.0F) {
      return FishData.FishSizeTypes.a;
    }
    if (paramFloat <= 4.0F) {
      return FishData.FishSizeTypes.b;
    }
    return FishData.FishSizeTypes.c;
  }
  
  public float getFishDepth()
  {
    return this.fishDepth;
  }
  
  public FishData$FishSizeTypes getFishRealSize()
  {
    return this.fishRealSize;
  }
  
  public float getFishSize()
  {
    return this.fishSize;
  }
  
  public void setFishDepth(float paramFloat)
  {
    this.fishDepth = paramFloat;
  }
  
  public void setFishRealSize(FishData$FishSizeTypes paramFishSizeTypes)
  {
    this.fishRealSize = paramFishSizeTypes;
  }
  
  public void setFishSize(float paramFloat)
  {
    this.fishSize = paramFloat;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.FishData
 * JD-Core Version:    0.7.0.1
 */