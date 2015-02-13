package com.telesoftas.services;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.DeeperRawDataPacket;
import com.telesoftas.hardware.ImagingSignal;

public class DeeperDataManager
{
  private static DeeperDataManager a = null;
  private final SignalStream b = new SignalStream();
  private DeeperFishDataPacket c;
  private ImagingSignal d;
  private int e;
  private float f;
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = (float)((1.0D - Math.cos(3.141592653589793D * paramFloat3)) / 2.0D);
    return paramFloat1 * (1.0F - f1) + f1 * paramFloat2;
  }
  
  public static DeeperDataManager a()
  {
    if (a == null) {
      a = new DeeperDataManager();
    }
    return a;
  }
  
  private float[] a(float paramFloat, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = paramArrayOfFloat[(-1 + paramArrayOfFloat.length)];
    float f2 = 1.0F / paramInt;
    int i = 0;
    for (float f3 = 0.0F; f3 < 1.0D; f3 += f2)
    {
      paramArrayOfFloat[i] = a(paramFloat, f1, f3);
      i++;
    }
    return paramArrayOfFloat;
  }
  
  public ImmutableList<Signal> a(Context paramContext, float paramFloat)
  {
    return this.b.a(paramContext, paramFloat);
  }
  
  public void a(float paramFloat)
  {
    this.f = paramFloat;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(DeeperFishDataPacket paramDeeperFishDataPacket)
  {
    if (this.c != null) {}
    for (float f1 = this.c.a();; f1 = paramDeeperFishDataPacket.a())
    {
      paramDeeperFishDataPacket.a(a(f1, paramDeeperFishDataPacket.b(), this.e));
      this.b.a(paramDeeperFishDataPacket, this.f);
      this.c = paramDeeperFishDataPacket;
      this.d = paramDeeperFishDataPacket;
      return;
    }
  }
  
  public void a(DeeperRawDataPacket paramDeeperRawDataPacket)
  {
    this.b.a(paramDeeperRawDataPacket, this.f);
    this.c = null;
    this.d = paramDeeperRawDataPacket;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public boolean c()
  {
    return this.b.a();
  }
  
  public ImagingSignal d()
  {
    return this.d;
  }
  
  public void e()
  {
    this.b.b();
    this.c = null;
    this.d = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.DeeperDataManager
 * JD-Core Version:    0.7.0.1
 */