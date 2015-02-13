package com.fridaylab.deeper.communication;

import com.fridaylab.util.Flog;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.hardware.HardwareInfo;
import com.telesoftas.hardware.HardwareJni;
import com.telesoftas.hardware.NotificationPacket;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.ByteUtils;

public class DeeperReception
  extends DeeperOperator
{
  private boolean d;
  private int e;
  private long f;
  private final float g;
  private final boolean h;
  
  public DeeperReception(DeeperOperator.Agent paramAgent, DeeperModel paramDeeperModel, BluetoothConnection paramBluetoothConnection, float paramFloat, boolean paramBoolean)
  {
    super(paramAgent, paramDeeperModel, paramBluetoothConnection);
    this.g = paramFloat;
    this.h = paramBoolean;
  }
  
  public void a()
  {
    super.a();
    this.e = 0;
    this.c.a(false);
  }
  
  public void a(Signal paramSignal)
  {
    boolean bool = true;
    if (paramSignal.a((byte)2, Signal.c, false))
    {
      this.b.a((byte)0);
      NotificationPacket localNotificationPacket = (NotificationPacket)paramSignal;
      String str = ByteUtils.a(localNotificationPacket.b);
      EasyTracker.a(this.b.j()).a(MapBuilder.a("Hardware", "connected_deeper", str, null).a());
      this.d = bool;
      HardwareInfo localHardwareInfo = HardwareJni.a(localNotificationPacket.b);
      if (!localHardwareInfo.parseSuccessful) {
        EasyTracker.a(this.b.j()).a(MapBuilder.a("Hardware", "unrecognized", str, null).a());
      }
      this.c.a(localHardwareInfo.getDisplayVersion());
      this.c.a(localHardwareInfo);
      this.b.i();
      int i = localHardwareInfo.getAction();
      if (!localHardwareInfo.parseSuccessful) {}
      for (;;)
      {
        if (bool) {
          this.b.a(new DeeperScanner(this, this.h));
        }
        return;
        if (i == 2)
        {
          if (localHardwareInfo.isInBootloader)
          {
            this.b.a(new DeeperUpdateToLatestFirmware(this, this.g, 1.0F));
            bool = false;
          }
          else
          {
            this.b.a(new DeeperUpdateGate26(this));
            bool = false;
          }
        }
        else if (i == 5)
        {
          if (localHardwareInfo.isInBootloader)
          {
            this.b.a(new DeeperUpdateBootloader24to26(this, this.g));
            bool = false;
          }
          else
          {
            this.b.a(new DeeperUpdateGate25to26(this));
            bool = false;
          }
        }
        else if (i == 4)
        {
          if (localHardwareInfo.isInBootloader)
          {
            this.b.a(new DeeperUpdateBootloader24to26(this, this.g));
            bool = false;
          }
          else
          {
            this.b.a(new DeeperUpdateGate24to26(this));
            bool = false;
          }
        }
        else if (i == 3)
        {
          this.b.a(new DeeperUpdateGate20to26(this));
          bool = false;
        }
      }
    }
    Flog.a("unrecongnized signal: " + paramSignal.d());
  }
  
  public void c()
  {
    super.c();
    if ((this.e > 0) && (System.nanoTime() - this.f > 5000000000L))
    {
      a(DeeperModel.OperationMode.f);
      this.a.a();
    }
    while (this.d) {
      return;
    }
    this.b.a((byte)2);
    if (this.e == 2) {
      this.a.b(new byte['ú']);
    }
    this.a.b(Command.a);
    if (this.e == 0) {
      this.f = System.nanoTime();
    }
    this.e = (1 + this.e);
  }
  
  public int e()
  {
    return 250;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperReception
 * JD-Core Version:    0.7.0.1
 */