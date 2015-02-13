package com.fridaylab.deeper.communication;

import com.fridaylab.util.Flog;
import com.telesoftas.services.Signal;

public class DeeperUpdateBootloader24to26
  extends DeeperUpdateFirmware
{
  private static final byte[] d = ".RESET".getBytes();
  private long j;
  private boolean k;
  
  public DeeperUpdateBootloader24to26(DeeperOperator paramDeeperOperator, float paramFloat)
  {
    super(paramDeeperOperator, paramFloat, 0.4F);
  }
  
  private float i()
  {
    if (!this.k) {
      return 0.0F;
    }
    return 0.15F * Math.min(1.0F, (float)(System.nanoTime() - this.j) / 1.5E+010F);
  }
  
  public void a(Signal paramSignal)
  {
    if (this.k)
    {
      if (paramSignal.a((byte)7, d, true))
      {
        this.b.a(new DeeperUpdateToLatestFirmware(this, 0.4F + i(), 1.0F));
        return;
      }
      Flog.a("unrecognized signal: " + paramSignal.d());
      return;
    }
    if ((paramSignal.a((byte)7, f, true)) || (paramSignal.a((byte)7, e, true)))
    {
      g();
      return;
    }
    if (paramSignal.a((byte)7, h, true))
    {
      this.k = true;
      this.j = System.nanoTime();
      return;
    }
    Flog.a("unrecognized signal: " + paramSignal.d());
  }
  
  public void c()
  {
    super.c();
    if (this.k) {
      this.b.a(true, 0.4F + i());
    }
  }
  
  protected int f()
  {
    return 2131034114;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateBootloader24to26
 * JD-Core Version:    0.7.0.1
 */