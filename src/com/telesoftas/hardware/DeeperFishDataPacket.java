package com.telesoftas.hardware;

public class DeeperFishDataPacket
  extends ImagingSignal
{
  public static final String a = DeeperFishDataPacket.class.getSimpleName();
  private float[] b;
  
  public DeeperFishDataPacket(float paramFloat, FishData[] paramArrayOfFishData)
  {
	  // paramFloat为鱼的深度?
	  super(paramFloat, paramArrayOfFishData);
  }
  
  public float a()
  {
    float f = f();
    if (f < 0.0F) {
      f = 2.0F;
    }
    return f;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.b = paramArrayOfFloat;
  }
  
  public float[] b()
  {
    return this.b;
  }
  
  public int c()
  {
    return 2;
  }
  
  public String d()
  {
    return "fish packet";
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("--------------DeeperFishDataPacket---------------\n");
    return localStringBuffer.toString();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.DeeperFishDataPacket
 * JD-Core Version:    0.7.0.1
 */