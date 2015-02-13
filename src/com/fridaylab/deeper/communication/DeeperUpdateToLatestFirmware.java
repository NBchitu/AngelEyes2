package com.fridaylab.deeper.communication;

import android.widget.Toast;
import com.fridaylab.util.Flog;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.services.Signal;

public class DeeperUpdateToLatestFirmware
  extends DeeperUpdateFirmware
{
  public static final byte[] d = ".LOAD_APP".getBytes();
  private boolean j;
  private long k;
  
  public DeeperUpdateToLatestFirmware(DeeperOperator paramDeeperOperator, float paramFloat1, float paramFloat2)
  {
    super(paramDeeperOperator, paramFloat1, paramFloat2);
  }
  
  public void a(Signal paramSignal)
  {
    if ((paramSignal.a((byte)7, f, true)) || (paramSignal.a((byte)7, e, true))) {
      g();
    }
    while (paramSignal.a((byte)7, h, true)) {
      return;
    }
    if (paramSignal.a((byte)7, d, true))
    {
      this.b.a(false, 0.0F);
      this.j = true;
      this.k = System.nanoTime();
      Toast.makeText(this.b.j(), 2131427402, 0).show();
      EasyTracker.a(this.b.j()).a(MapBuilder.a("Hardware", "update_finished", "02.022.000.26", null).a());
      return;
    }
    Flog.a("unrecognized signal: " + paramSignal.d());
  }
  
  public void c()
  {
    super.c();
    if ((this.j) && (System.nanoTime() - this.k >= 1000000000L)) {
      this.b.a(new DeeperReception(this.b, this.c, this.a, 0.0F, false));
    }
  }
  
  protected int f()
  {
    return 2131034112;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateToLatestFirmware
 * JD-Core Version:    0.7.0.1
 */