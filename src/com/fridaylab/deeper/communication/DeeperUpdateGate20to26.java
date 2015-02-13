package com.fridaylab.deeper.communication;

import com.fridaylab.util.Flog;
import com.telesoftas.hardware.HardwareJni;
import com.telesoftas.hardware.NotificationPacket;
import com.telesoftas.services.Signal;

public class DeeperUpdateGate20to26
  extends DeeperOperator
{
  public DeeperUpdateGate20to26(DeeperOperator paramDeeperOperator)
  {
    super(paramDeeperOperator);
  }
  
  public void a()
  {
    super.a();
    this.a.b(Command.b);
  }
  
  public void a(Signal paramSignal)
  {
    if (paramSignal.a((byte)3, Signal.c, false))
    {
      if (HardwareJni.c(((NotificationPacket)paramSignal).b) >= 50)
      {
        this.b.a(new DeeperUpdateBootloader20to26(this));
        return;
      }
      this.b.a(new DeeperScanner(this, false));
      return;
    }
    Flog.a("unrecognized signal: " + paramSignal.d());
  }
  
  public int e()
  {
    return 200;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateGate20to26
 * JD-Core Version:    0.7.0.1
 */