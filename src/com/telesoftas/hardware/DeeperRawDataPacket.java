package com.telesoftas.hardware;

public class DeeperRawDataPacket
  extends ImagingSignal
{
  private static int a = 0;
  private final byte[] b;
  private final int[] e;
  private final int f;
  
  public DeeperRawDataPacket(float paramFloat, FishData[] paramArrayOfFishData, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    super(paramFloat, paramArrayOfFishData);
    this.b = paramArrayOfByte;
    this.e = paramArrayOfInt;
    this.f = l();
  }
  
  private static int l()
  {
    try
    {
      a = 1 + a;
      int i = a;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int a()
  {
    return this.f;
  }
  
  public byte[] b()
  {
    return this.b;
  }
  
  public int c()
  {
    return 1;
  }
  
  public String d()
  {
    return "raw echo";
  }
  
  public int[] e()
  {
    return this.e;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.DeeperRawDataPacket
 * JD-Core Version:    0.7.0.1
 */