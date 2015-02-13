package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fridaylab.util.ByteLogger;
import com.fridaylab.util.Flog;
import com.fridaylab.util.TimeAccumulator;
import com.fridaylab.util.TimeSpan;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Fields;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.Analytics;
import com.telesoftas.hardware.HardwareInfo;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.ByteUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.UUID;

public class DeeperLink
  extends BluetoothAgent
  implements BluetoothConnection.Listener, DeeperChannel.SignalObserver, DeeperOperator.Agent, Runnable
{
  private static final UUID d = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
  private final DeeperLink.BluetoothObserver A;
  private final Runnable B;
  private final Runnable C;
  private final Runnable D;
  private final Context e;
  private final BluetoothAdapter f;
  private final String g;
  private final int h;
  private DeeperLink.Connector i;
  private BluetoothConnection j;
  private boolean k;
  private boolean l;
  private long m;
  private final TimeAccumulator n = new TimeAccumulator();
  private final TimeAccumulator o = new TimeAccumulator();
  private final TimeAccumulator p = new TimeAccumulator();
  private final TimeAccumulator q = new TimeAccumulator();
  private final TimeAccumulator r = new TimeAccumulator();
  private DeeperOperator s;
  private final TransmissionAssistant t = new TransmissionAssistant("frequency", Command.c, Command.d);
  private final TransmissionAssistant u = new TransmissionAssistant("imaging", Command.f, Command.e);
  private final TransmissionAssistant v = new TransmissionAssistant("night_fishing", Command.i, Command.j);
  private final TransmissionAssistant[] w;
  private float x;
  private final DeeperChannel y;
  private final ArrayDeque<byte[]> z;
  
  public DeeperLink(Context paramContext, CommunicationHandler paramCommunicationHandler, String paramString, int paramInt)
  {
    super(paramCommunicationHandler);
    TransmissionAssistant[] arrayOfTransmissionAssistant = new TransmissionAssistant[3];
    arrayOfTransmissionAssistant[0] = this.t;
    arrayOfTransmissionAssistant[1] = this.u;
    arrayOfTransmissionAssistant[2] = this.v;
    this.w = arrayOfTransmissionAssistant;
    this.y = new DeeperChannel();
    this.z = new ArrayDeque(8);
    this.A = new DeeperLink.BluetoothObserver(this);
    this.B = new DeeperLink.6(this);
    this.C = new DeeperLink.7(this);
    this.D = new DeeperLink.8(this);
    this.e = paramContext;
    this.f = BluetoothAdapter.getDefaultAdapter();
    this.g = paramString;
    this.h = paramInt;
    this.l = false;
  }
  
  private void a(int paramInt)
  {
    if ((this.i == null) && (this.j == null))
    {
      a(CommunicationProtocol.ConnectionState.e, DeeperModel.b(this.g));
      this.i = new DeeperLink.Connector(this, paramInt, false);
      this.m = System.nanoTime();
      new Handler(Looper.getMainLooper()).post(this.i);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.s == null) {
      return;
    }
    this.c.removeCallbacks(this.B);
    this.s.b();
    if (paramBoolean)
    {
      this.s.d().a(false);
      this.s.d().a(-1.0F);
    }
    this.s = null;
  }
  
  private void l()
  {
    this.s.c();
    this.c.postDelayed(this.B, this.s.e());
    TransmissionAssistant[] arrayOfTransmissionAssistant = this.w;
    int i1 = arrayOfTransmissionAssistant.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      byte[] arrayOfByte = arrayOfTransmissionAssistant[i2].a();
      if (arrayOfByte != null) {
        this.j.a(arrayOfByte);
      }
    }
    if (this.j != null) {
      this.j.a(7000000000L);
    }
  }
  
  private void m()
  {
    this.j = null;
    TransmissionAssistant[] arrayOfTransmissionAssistant = this.w;
    int i1 = arrayOfTransmissionAssistant.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfTransmissionAssistant[i2].c();
    }
    EasyTracker localEasyTracker = EasyTracker.a(this.e);
    int i4;
    if (this.n.d())
    {
      this.n.b();
      this.r.b();
      this.q.b();
      this.o.b();
      this.p.b();
      String str2 = Long.toString(this.n.e());
      localEasyTracker.a(Fields.b(2), str2);
      localEasyTracker.a(MapBuilder.a("Sonar", "end_session", null, Long.valueOf(this.n.e())).a());
      localEasyTracker.a(Fields.b(2), null);
      if ((this.s == null) || (this.s.d().p())) {
        break label408;
      }
      i4 = 1;
      if ((i4 != 0) && (this.n.e() > 20L))
      {
        localEasyTracker.a(MapBuilder.a("Session", "frequency-90", Analytics.a(this.r.f(), this.q.f()), Long.valueOf(this.r.e())).a());
        localEasyTracker.a(MapBuilder.a("Session", "frequency-290", Analytics.a(this.q.f(), this.r.f()), Long.valueOf(this.q.e())).a());
        localEasyTracker.a(MapBuilder.a("Session", "imaging-raw", Analytics.a(this.o.f(), this.p.f()), Long.valueOf(this.o.e())).a());
        localEasyTracker.a(MapBuilder.a("Session", "imaging-processed", Analytics.a(this.p.f(), this.o.f()), Long.valueOf(this.p.e())).a());
      }
    }
    CommunicationProtocol.ConnectionState localConnectionState1 = CommunicationProtocol.ConnectionState.g;
    Object localObject;
    int i3;
    if (!a_()) {
      if (this.s == null)
      {
        localObject = localConnectionState1;
        i3 = 0;
      }
    }
    for (;;)
    {
      if (a_())
      {
        a(true);
        d();
      }
      label408:
      do
      {
        return;
        i4 = 0;
        break;
        String str1;
        CommunicationProtocol.ConnectionState localConnectionState2;
        switch (DeeperLink.9.a[this.s.d().d().ordinal()])
        {
        default: 
          str1 = "Programming mistake";
          localConnectionState2 = localConnectionState1;
          i3 = 0;
        }
        for (;;)
        {
          if (!this.s.d().s()) {
            localConnectionState2 = CommunicationProtocol.ConnectionState.g;
          }
          if (str1 != null) {
            localEasyTracker.a(MapBuilder.a("Hardware", "disconnect", str1, null).a());
          }
          localObject = localConnectionState2;
          break;
          str1 = "Unauthenticated";
          localConnectionState2 = CommunicationProtocol.ConnectionState.h;
          i3 = 0;
          continue;
          str1 = "Deeper was not responding";
          localConnectionState2 = localConnectionState1;
          i3 = 0;
          continue;
          str1 = "Deeper became unresponsive";
          localConnectionState2 = CommunicationProtocol.ConnectionState.h;
          i3 = 0;
          continue;
          str1 = "Battery empty";
          localConnectionState2 = localConnectionState1;
          i3 = 0;
          continue;
          str1 = "Out of water";
          localConnectionState2 = CommunicationProtocol.ConnectionState.i;
          i3 = 0;
          continue;
          str1 = "Charger disconnected";
          localConnectionState2 = CommunicationProtocol.ConnectionState.i;
          i3 = 0;
          continue;
          if (!this.f.isEnabled())
          {
            str1 = "Disabled bluetooth";
            localConnectionState2 = localConnectionState1;
            i3 = 0;
          }
          else if (this.s.d().e() <= 2)
          {
            str1 = "Battery empty";
            this.s.d().a(DeeperModel.OperationMode.c);
            i();
            localConnectionState2 = localConnectionState1;
            i3 = 0;
          }
          else
          {
            str1 = "Lost connection";
            localConnectionState2 = CommunicationProtocol.ConnectionState.h;
            i3 = 0;
            continue;
            localConnectionState2 = localConnectionState1;
            i3 = 1;
            str1 = null;
          }
        }
        if (!this.k)
        {
          a(true);
          return;
        }
        if (i3 != 0)
        {
          a(false);
          a(3);
          return;
        }
        if ((localObject != CommunicationProtocol.ConnectionState.h) && (localObject != CommunicationProtocol.ConnectionState.i)) {
          break label849;
        }
        a(true);
        a((CommunicationProtocol.ConnectionState)localObject, null);
        this.A.a();
      } while (localObject != CommunicationProtocol.ConnectionState.h);
      this.i = new DeeperLink.Connector(this, 10, true);
      this.m = System.nanoTime();
      new Handler(Looper.getMainLooper()).post(this.i);
      return;
      label849:
      a(true);
      d();
      return;
      localObject = localConnectionState1;
      i3 = 0;
    }
  }
  
  private void n()
  {
    this.j = this.i.a();
    int i1 = this.i.e();
    int i2;
    DeeperModel localDeeperModel;
    String str;
    if ((this.i != null) && (this.i.c()))
    {
      i2 = 1;
      this.i = null;
      localDeeperModel = DeeperModel.b(this.g);
      localDeeperModel.a(DeeperModel.OperationMode.a);
      long l1 = System.nanoTime() - this.m;
      EasyTracker localEasyTracker = EasyTracker.a(this.e);
      Long localLong = Long.valueOf(TimeSpan.a(l1));
      if (this.j == null) {
        break label283;
      }
      str = "established";
      label99:
      localEasyTracker.a(MapBuilder.a("bluetooth", localLong, str, Integer.toString(i1)).a());
      if ((!this.k) || (a_())) {
        break label313;
      }
      if (this.j == null) {
        break label291;
      }
      if (this.s == null) {
        localDeeperModel.a(200);
      }
      a(CommunicationProtocol.ConnectionState.e, localDeeperModel);
      label164:
      if (this.j == null) {
        break label341;
      }
      a(new DeeperReception(this, localDeeperModel, this.j, this.x, this.l));
      this.c.obtainMessage(803).sendToTarget();
      this.n.c();
      this.r.c();
      this.q.c();
      this.p.c();
      this.o.c();
      this.t.c();
      this.u.c();
      this.v.c();
      this.n.a();
    }
    for (;;)
    {
      this.l = false;
      return;
      i2 = 0;
      break;
      label283:
      str = "rejected";
      break label99;
      label291:
      if (i2 != 0)
      {
        a(CommunicationProtocol.ConnectionState.i, localDeeperModel);
        break label164;
      }
      d();
      break label164;
      label313:
      if (this.j == null) {
        break label164;
      }
      Flog.a("Closing connection because it is no longer needed");
      this.j.a();
      this.j = null;
      break label164;
      label341:
      if (a_()) {
        d();
      } else {
        this.c.obtainMessage(804).sendToTarget();
      }
    }
  }
  
  public void a()
  {
    this.k = false;
    a(true);
    if (this.f.isEnabled()) {}
    for (CommunicationProtocol.ConnectionState localConnectionState = CommunicationProtocol.ConnectionState.g;; localConnectionState = CommunicationProtocol.ConnectionState.a)
    {
      a(localConnectionState, null);
      this.c.removeCallbacks(this);
      this.A.b();
      if (this.j != null)
      {
        this.j.a();
        this.j = null;
      }
      if (this.i != null) {
        this.i.cancel(false);
      }
      return;
    }
  }
  
  public void a(byte paramByte)
  {
    this.y.a(paramByte);
  }
  
  public void a(DeeperOperator paramDeeperOperator)
  {
    a(false);
    this.s = paramDeeperOperator;
    this.s.a();
    if ((this.s instanceof DeeperScanner)) {
      this.x = 0.0F;
    }
    l();
  }
  
  public void a(Signal paramSignal)
  {
    DeeperOperator localDeeperOperator = this.s;
    if (localDeeperOperator != null) {
      this.c.post(new DeeperLink.SignalDispatcher(this.e, paramSignal, localDeeperOperator, this.w));
    }
  }
  
  public void a(boolean paramBoolean, float paramFloat)
  {
    if ((paramBoolean) && (paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {}
    for (;;)
    {
      DeeperModel localDeeperModel = DeeperModel.b(this.g);
      localDeeperModel.a(paramFloat);
      a(CommunicationProtocol.ConnectionState.f, localDeeperModel);
      this.x = Math.max(paramFloat, 0.0F);
      return;
      paramFloat = -1.0F;
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (this.j == null) {
      return;
    }
    if (paramArrayOfByte == Command.c)
    {
      this.q.b();
      this.r.a();
      this.c.post(new DeeperLink.1(this, paramArrayOfByte));
    }
    for (;;)
    {
      this.j.a(paramArrayOfByte, paramArrayOfByte.length, true);
      return;
      if (paramArrayOfByte == Command.d)
      {
        this.r.b();
        this.q.a();
        this.c.post(new DeeperLink.2(this, paramArrayOfByte));
      }
      else if (paramArrayOfByte == Command.e)
      {
        if (DeeperModel.b(this.g).g())
        {
          this.p.b();
          this.o.a();
          this.c.post(new DeeperLink.3(this, paramArrayOfByte));
        }
      }
      else if (paramArrayOfByte == Command.f)
      {
        this.o.b();
        this.p.a();
        this.c.post(new DeeperLink.4(this, paramArrayOfByte));
      }
      else if ((paramArrayOfByte == Command.i) || (paramArrayOfByte == Command.j))
      {
        this.c.post(new DeeperLink.5(this, paramArrayOfByte));
      }
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.s != null)
    {
      for (;;)
      {
        byte[] arrayOfByte = (byte[])this.z.pollFirst();
        if (arrayOfByte == null) {
          break;
        }
        this.y.a(arrayOfByte, arrayOfByte.length, this);
      }
      this.y.a(paramArrayOfByte, paramInt, this);
      if (ByteLogger.a) {
        ByteLogger.a(this.e, paramArrayOfByte, 0, paramInt);
      }
      return;
    }
    this.z.add(Arrays.copyOf(paramArrayOfByte, paramInt));
  }
  
  public void b()
  {
    super.b();
    if (this.j != null)
    {
      this.j.a();
      this.j = null;
      return;
    }
    if (this.i != null)
    {
      this.i.cancel(false);
      return;
    }
    d();
  }
  
  public void c()
  {
    if (ByteLogger.a) {
      ByteLogger.a();
    }
    this.c.post(this.C);
  }
  
  public void e()
  {
    this.k = true;
    if ((this.f.isEnabled()) || (this.f.enable()))
    {
      a(CommunicationProtocol.ConnectionState.e, DeeperModel.b(this.g));
      run();
      return;
    }
    d();
  }
  
  public void f()
  {
    SettingsUtils.a(this.e, this.g);
    EasyTracker localEasyTracker = EasyTracker.a(this.e);
    localEasyTracker.a(Fields.a(1), "y");
    HardwareInfo localHardwareInfo = this.s.d().r();
    String str = localHardwareInfo.getDisplayVersion();
    SettingsUtils.a(this.e).edit().putString("deeper_version", str).apply();
    localEasyTracker.a(Fields.a(2), str);
    localEasyTracker.a(MapBuilder.a("Hardware", "firmware", ByteUtils.a(localHardwareInfo.firmware), null).a());
    localEasyTracker.a(MapBuilder.a("Hardware", "bootloader", ByteUtils.a(localHardwareInfo.bootloader), null).a());
    localEasyTracker.a(MapBuilder.a("Hardware", "hardware", ByteUtils.a(localHardwareInfo.hardware), null).a());
  }
  
  public boolean g()
  {
    return (this.t.b()) && (this.u.b());
  }
  
  public CommunicationHandler h()
  {
    return this.c;
  }
  
  public void i()
  {
    if (this.s != null) {
      a(CommunicationProtocol.ConnectionState.f, this.s.d());
    }
  }
  
  public Context j()
  {
    return this.e;
  }
  
  public void run()
  {
    if (this.f.isEnabled())
    {
      a(this.h);
      return;
    }
    this.c.postDelayed(this, 75L);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperLink
 * JD-Core Version:    0.7.0.1
 */