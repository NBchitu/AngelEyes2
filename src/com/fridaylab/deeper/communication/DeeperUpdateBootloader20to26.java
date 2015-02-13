package com.fridaylab.deeper.communication;

import com.fridaylab.util.Flog;
import com.telesoftas.services.Signal;

public class DeeperUpdateBootloader20to26
  extends DeeperUpdateFirmware
{
  public static final byte[] d = ".RESET".getBytes();
  private long j;
  private boolean k;
  
  public DeeperUpdateBootloader20to26(DeeperOperator paramDeeperOperator)
  {
    super(paramDeeperOperator, 0.0F, 0.3F);
  }
  
  private float i()
  {
    if (!this.k) {
      return 0.0F;
    }
    return 0.4F * Math.min(1.0F, (float)(System.nanoTime() - this.j) / 5.0E+010F);
  }
  
  public void a(Signal paramSignal)
  {
    if (this.k)
    {
      if (paramSignal.a((byte)7, d, true)) {
        this.b.a(new DeeperUpdateToLatestFirmware(this, 0.3F + i(), 1.0F));
      }
      while (paramSignal.a((byte)7, Signal.c, true)) {
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
      this.b.a(true, 0.3F + i());
    }
  }
  
  protected int f()
  {
    return 2131034113;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateBootloader20to26
 * JD-Core Version:    0.7.0.1
 */