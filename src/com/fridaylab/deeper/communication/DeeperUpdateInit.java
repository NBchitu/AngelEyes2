package com.fridaylab.deeper.communication;

import com.fridaylab.util.Flog;
import com.telesoftas.services.Signal;

public abstract class DeeperUpdateInit
  extends DeeperOperator
{
  public static final byte[] d = { 22, 7, 0, 52, -110 };
  public static final byte[] e = ".RESET".getBytes();
  public static final byte[] f = "*".getBytes();
  private final boolean g;
  private boolean h;
  private boolean i;
  private long j;
  
  public DeeperUpdateInit(DeeperOperator paramDeeperOperator, boolean paramBoolean)
  {
    super(paramDeeperOperator);
    this.g = paramBoolean;
  }
  
  private float f()
  {
    if (!this.i) {
      return 0.0F;
    }
    return 0.07F * Math.min(1.0F, (float)(System.nanoTime() - this.j) / 6.0E+009F);
  }
  
  public void a(Signal paramSignal)
  {
    this.h = true;
    if (paramSignal.a((byte)7, Signal.d, false))
    {
      this.b.a(new DeeperScanner(this, false));
      return;
    }
    if (paramSignal.a((byte)7, e, true))
    {
      this.i = true;
      this.j = System.nanoTime();
      a(DeeperModel.OperationMode.b);
      this.b.a(true, 0.0F);
      return;
    }
    if (paramSignal.a((byte)7, f, true))
    {
      a(DeeperModel.OperationMode.a);
      if (this.g)
      {
        this.b.a(new DeeperUpdateToLatestFirmware(this, f(), 1.0F));
        return;
      }
      this.b.a(new DeeperUpdateBootloader24to26(this, f()));
      return;
    }
    Flog.a("unrecognized signal: " + paramSignal.d());
    this.h = false;
  }
  
  public void c()
  {
    super.c();
    if (!this.h) {
      this.a.b(d);
    }
    if (this.i) {
      this.b.a(true, f());
    }
  }
  
  public int e()
  {
    return 100;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateInit
 * JD-Core Version:    0.7.0.1
 */