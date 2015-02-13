package com.fridaylab.deeper.communication;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.fridaylab.util.Flog;
import com.fridaylab.util.TimeAccumulator;
import com.fridaylab.util.TimeSpan;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.hardware.HardwareJni;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.hardware.NotificationPacket;
import com.telesoftas.services.GlobalBluetoothOutputStream;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;

public class DeeperScanner
  extends DeeperOperator
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  private TimeAccumulator A = new TimeAccumulator();
  private long B;
  private int C;
  private boolean D;
  private final DeeperChannel.SignalObserver d;
  private boolean e;
  private boolean f;
  private String g;
  private int h;
  private long i;
  private long j;
  private long k;
  private long l;
  private long m;
  private long n;
  private int o;
  private int p;
  private final byte[] q;
  private byte[] r;
  private SparseIntArray s = new SparseIntArray(280);
  private BitSet t = null;
  private long u;
  private int v;
  private int w;
  private int x;
  private boolean y;
  private int z;
  
  public DeeperScanner(DeeperOperator paramDeeperOperator, boolean paramBoolean)
  {
    super(paramDeeperOperator);
    if (paramBoolean) {}
    for (byte[] arrayOfByte = Command.p;; arrayOfByte = Command.m)
    {
      this.q = arrayOfByte;
      this.d = ((DeeperApplication)this.b.j().getApplicationContext()).d();
      return;
    }
  }
  
  private boolean a(byte[] paramArrayOfByte)
  {
    String str = HardwareJni.decodeHandshakeResponse(paramArrayOfByte);
    if ((TextUtils.isEmpty(str)) || (TextUtils.isEmpty(this.g))) {
      return false;
    }
    return this.g.equals(str);
  }
  
  private void h()
  {
    int i1 = 2;
    GlobalBluetoothOutputStream.a().a(this.b);
    SharedPreferences localSharedPreferences = SettingsUtils.a(this.b.j());
    int i2 = localSharedPreferences.getInt(SettingsUtils.c, i1);
    int i3;
    if (this.c.g())
    {
      i3 = localSharedPreferences.getInt(SettingsUtils.b, 1);
      if ((!this.c.i()) || (localSharedPreferences.getInt(SettingsUtils.s, 0) != 1)) {
        break label224;
      }
      i3 = 0;
    }
    for (;;)
    {
      DeeperOperator.Agent localAgent1 = this.b;
      byte[] arrayOfByte1;
      label101:
      byte[] arrayOfByte2;
      label127:
      DeeperOperator.Agent localAgent3;
      if (i1 == 1)
      {
        arrayOfByte1 = Command.c;
        localAgent1.a(arrayOfByte1);
        DeeperOperator.Agent localAgent2 = this.b;
        if (i3 != 1) {
          break label208;
        }
        arrayOfByte2 = Command.f;
        localAgent2.a(arrayOfByte2);
        if (this.c.h())
        {
          int i4 = localSharedPreferences.getInt(SettingsUtils.g, 0);
          localAgent3 = this.b;
          if (i4 != 1) {
            break label216;
          }
        }
      }
      label208:
      label216:
      for (byte[] arrayOfByte3 = Command.i;; arrayOfByte3 = Command.j)
      {
        localAgent3.a(arrayOfByte3);
        this.h = 0;
        i();
        return;
        i3 = 1;
        break;
        arrayOfByte1 = Command.d;
        break label101;
        arrayOfByte2 = Command.e;
        break label127;
      }
      label224:
      i1 = i2;
    }
  }
  
  private void i()
  {
    String str = this.g;
    this.g = HardwareJni.createHandshakeChallenge();
    if (this.h > 0) {
      this.b.a(new byte[260]);
    }
    this.b.a(HardwareJni.a((byte)1, this.g.getBytes()));
    if (!TextUtils.equals(this.g, str)) {
      this.h = (1 + this.h);
    }
    this.j = System.nanoTime();
  }
  
  public void a()
  {
    super.a();
    this.o = 0;
    this.e = false;
    this.f = false;
    this.k = (System.nanoTime() - 20000000000L);
    this.m = System.nanoTime();
    this.z = 3;
    if (this.c.s())
    {
      this.b.a(this.q);
      this.i = System.nanoTime();
      this.o = 1;
      this.l = 20000000000L;
      return;
    }
    this.l = 3000000000L;
    this.e = true;
    h();
  }
  
  public void a(double paramDouble)
  {
    if (this.r != null) {}
    for (;;)
    {
      return;
      this.r = new byte[1680];
      ByteBuffer localByteBuffer = ByteBuffer.wrap(this.r).order(ByteOrder.LITTLE_ENDIAN);
      for (short s1 = 0; s1 < 280; s1 = (short)(s1 + 1))
      {
        float f1 = (float)(0.57744D * Math.exp(0.0656822D * paramDouble * s1));
        localByteBuffer.putShort(s1).putFloat(f1);
        int i1 = localByteBuffer.getInt(2 + s1 * 6);
        this.s.append(i1, s1 * 6);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[60];
    if (paramBoolean)
    {
      this.v = -1;
      this.w = -1;
    }
    int i1 = 0;
    if (paramInt1 < paramInt2)
    {
      if (!this.t.get(paramInt1)) {
        break label177;
      }
      HardwareJni.buildPacket((byte)80, this.r, paramInt1 * 6, 6, arrayOfByte, 1 + i1 * 12);
      i2 = i1 + 1;
      if (paramBoolean)
      {
        if (this.v < 0)
        {
          this.v = paramInt1;
          this.w = paramInt1;
        }
      }
      else
      {
        label90:
        this.C = (1 + this.C);
        this.x = paramInt1;
        if (i2 == 5)
        {
          this.a.a(arrayOfByte, arrayOfByte.length, false);
          g();
        }
      }
    }
    label177:
    for (int i2 = 0;; i2 = i1)
    {
      paramInt1++;
      i1 = i2;
      break;
      this.w = paramInt1;
      break label90;
      if (i1 > 0) {
        this.a.a(arrayOfByte, i1 * 12, false);
      }
      this.u = System.nanoTime();
      return;
    }
  }
  
  public void a(Signal paramSignal)
  {
    if (this.D) {
      if (paramSignal.a((byte)100, (byte)0))
      {
        this.D = false;
        this.t = new BitSet(280);
        f();
      }
    }
    label160:
    label371:
    do
    {
      do
      {
        do
        {
          int i4;
          do
          {
            do
            {
              return;
              Flog.a("GOT " + paramSignal.d());
              return;
              if (paramSignal.a((byte)5, (byte)1)) {
                this.z = 0;
              }
              for (;;)
              {
                if (this.t == null) {
                  break label390;
                }
                if (this.z >= 3) {
                  break label160;
                }
                if (TimeSpan.a(System.nanoTime() - this.u) <= 200L) {
                  break;
                }
                f();
                return;
                if (paramSignal.a((byte)5, (byte)0))
                {
                  if (this.z == 2)
                  {
                    this.z = 3;
                    this.t = null;
                    f();
                    return;
                  }
                  this.z = 3;
                }
              }
            } while (!paramSignal.a((byte)80, Signal.c, false));
            this.u = System.nanoTime();
            int i3 = ByteBuffer.wrap(((NotificationPacket)paramSignal).b).order(ByteOrder.LITTLE_ENDIAN).getInt();
            i4 = this.s.indexOfKey(i3);
            if (i4 > this.v) {
              a(this.v, i4, false);
            }
            for (this.v = (i4 + 1);; this.v = (1 + this.v))
            {
              if (this.t.get(i4)) {
                this.t.clear(i4);
              }
              if (!this.t.isEmpty()) {
                break label371;
              }
              this.t = null;
              this.A.a();
              if (this.f) {
                break;
              }
              h();
              return;
            }
            this.b.a(Command.d);
            this.b.a(Command.e);
            if (this.z == 4)
            {
              this.z = 3;
              return;
            }
            this.z = 1;
            this.b.a(Command.h);
            this.u = System.nanoTime();
            return;
          } while (i4 != this.x);
          a(0, 280, true);
          return;
          if (!this.f) {
            break;
          }
          if ((paramSignal instanceof ImagingSignal))
          {
            ((ImagingSignal)paramSignal).a(this.c.f());
            if (this.p > 0)
            {
              a(DeeperModel.OperationMode.a);
              this.p = 0;
            }
          }
          if ((!(paramSignal instanceof ImagingSignal)) || (this.b.g())) {
            this.d.a(paramSignal);
          }
          if (paramSignal.a((byte)3, Signal.c, false))
          {
            this.k = System.nanoTime();
            NotificationPacket localNotificationPacket2 = (NotificationPacket)paramSignal;
            int i1 = HardwareJni.b(localNotificationPacket2.b);
            this.c.b(i1);
            int i2 = HardwareJni.c(localNotificationPacket2.b);
            this.c.a(i2);
            this.b.i();
          }
          for (;;)
          {
            if (!this.c.n()) {
              break label840;
            }
            if (!b(paramSignal)) {
              break;
            }
            a(DeeperModel.OperationMode.a);
            return;
            if (paramSignal.a((byte)21, (byte)11))
            {
              a(DeeperModel.OperationMode.c);
            }
            else if (paramSignal.a((byte)-128, Signal.c, false))
            {
              NotificationPacket localNotificationPacket1 = (NotificationPacket)paramSignal;
              if ((localNotificationPacket1.b.length == 16) && (localNotificationPacket1.b[12] != 0)) {
                a(DeeperModel.OperationMode.e);
              }
            }
            else if (paramSignal.a((byte)12, (byte)2))
            {
              if (this.p >= 10) {
                a(DeeperModel.OperationMode.i);
              } else {
                this.p = (1 + this.p);
              }
            }
            else if (paramSignal.a((byte)-98, (byte)1))
            {
              this.b.a(new DeeperReception(this.b, this.c, this.a, 0.0F, false));
              EasyTracker.a(this.b.j()).a(MapBuilder.a("Hardware", "crash", "processor_restart", null).a());
            }
            else if (paramSignal.a((byte)-98, Signal.c, false))
            {
              this.m = System.nanoTime();
              if ((!this.c.n()) && (paramSignal.a((byte)-98, (byte)6, (byte)7))) {
                a(DeeperModel.OperationMode.d);
              } else if ((this.c.n()) && ((paramSignal.a((byte)-98, (byte)4)) || (paramSignal.a((byte)-98, (byte)2, (byte)3)))) {
                a(DeeperModel.OperationMode.a);
              }
            }
          }
        } while (!paramSignal.a((byte)21, (byte)6));
        a(DeeperModel.OperationMode.d);
        this.p = 0;
        return;
        if (!this.e) {
          break;
        }
      } while (!paramSignal.a((byte)1, Signal.c, false));
      this.f = a(((NotificationPacket)paramSignal).b);
      if (this.f)
      {
        this.b.f();
        this.a.a(Command.k);
        this.b.i();
        this.z = 0;
        return;
      }
      if (this.h < 10L)
      {
        i();
        return;
      }
      a(DeeperModel.OperationMode.g);
      this.a.a();
      return;
    } while ((!paramSignal.a((byte)-99, Signal.c, false)) || (this.e));
    label390:
    label840:
    this.e = true;
    this.z = 3;
    f();
  }
  
  public void b()
  {
    super.b();
    GlobalBluetoothOutputStream.a().a(null);
    if (this.y) {
      SettingsUtils.a(this.b.j()).unregisterOnSharedPreferenceChangeListener(this);
    }
    long l1 = this.A.e();
    if (l1 > 0L) {
      EasyTracker.a(this.b.j()).a(MapBuilder.a("Sonar", "ice_fishing", null, Long.valueOf(l1)).a());
    }
  }
  
  public boolean b(Signal paramSignal)
  {
    return ((paramSignal instanceof ImagingSignal)) || (paramSignal.a((byte)12, (byte)2));
  }
  
  public void c()
  {
    if (this.z == 1) {
      if (TimeSpan.a(System.nanoTime() - this.u) > 120L)
      {
        this.b.a(Command.h);
        this.u = System.nanoTime();
      }
    }
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (this.z == 2)
          {
            if (TimeSpan.a(System.nanoTime() - this.u) > 300L)
            {
              this.b.a(Command.g);
              this.u = System.nanoTime();
            }
          }
          else
          {
            if (this.D)
            {
              f();
              return;
            }
            if ((this.e) && (this.t != null))
            {
              if (this.z == 0)
              {
                f();
                return;
              }
              if (System.nanoTime() - this.u > 333333333L)
              {
                this.a.a(new byte[260], 260, false);
                a(0, 280, true);
              }
            }
            else
            {
              if (!this.f) {
                break;
              }
              if (System.nanoTime() - this.k > this.l) {
                this.a.a(Command.b);
              }
              while ((this.c.n()) && (System.nanoTime() - this.n >= 1000000000L))
              {
                this.a.a(Command.k);
                this.n = System.nanoTime();
                return;
                if ((this.c.s()) && (System.nanoTime() - this.m > 3000000000L)) {
                  this.a.a(Command.l);
                }
              }
            }
          }
        }
        if (!this.e) {
          break;
        }
      } while (System.nanoTime() - this.j <= 1000000000L);
      if (this.h < 10L)
      {
        i();
        return;
      }
      a(DeeperModel.OperationMode.g);
      this.a.a();
      return;
    } while (System.nanoTime() - this.i <= 1000000000L);
    if (this.o < 2)
    {
      this.b.a(this.q);
      this.i = System.nanoTime();
      this.o = (1 + this.o);
      return;
    }
    this.e = true;
    this.z = 3;
    f();
  }
  
  public int e()
  {
    return 300;
  }
  
  public void f()
  {
    int i1;
    if (this.c.i())
    {
      SharedPreferences localSharedPreferences2 = SettingsUtils.a(this.b.j());
      if (!this.y)
      {
        localSharedPreferences2.registerOnSharedPreferenceChangeListener(this);
        this.y = true;
      }
      if (localSharedPreferences2.getInt(SettingsUtils.s, 0) == 0) {
        i1 = 1;
      }
    }
    while (i1 != 0)
    {
      this.A.b();
      this.t = null;
      this.b.a(Command.o);
      if (!this.f)
      {
        h();
        return;
        i1 = 0;
        continue;
        i1 = 1;
      }
      else
      {
        SharedPreferences localSharedPreferences1 = SettingsUtils.a(this.b.j());
        int i4 = localSharedPreferences1.getInt(SettingsUtils.c, 2);
        int i5 = localSharedPreferences1.getInt(SettingsUtils.b, 1);
        DeeperOperator.Agent localAgent1 = this.b;
        byte[] arrayOfByte2;
        DeeperOperator.Agent localAgent2;
        if (i4 == 1)
        {
          arrayOfByte2 = Command.c;
          localAgent1.a(arrayOfByte2);
          localAgent2 = this.b;
          if (i5 != 1) {
            break label211;
          }
        }
        label211:
        for (byte[] arrayOfByte3 = Command.f;; arrayOfByte3 = Command.e)
        {
          localAgent2.a(arrayOfByte3);
          return;
          arrayOfByte2 = Command.d;
          break;
        }
      }
    }
    if (this.z < 3)
    {
      if (this.t == null) {
        this.t = new BitSet(280);
      }
      this.u = System.nanoTime();
      this.z = 2;
      this.b.a(Command.g);
      return;
    }
    if (this.t == null)
    {
      this.D = true;
      this.b.a(Command.e);
      return;
    }
    a(1.1D);
    this.v = 0;
    this.w = 280;
    this.t.set(this.v, this.w);
    this.C = 0;
    this.B = System.nanoTime();
    byte[] arrayOfByte1 = new byte['¨'];
    for (int i2 = 0; i2 < 280; i2++)
    {
      int i3 = i2 % 14;
      HardwareJni.buildPacket((byte)80, this.r, i2 * 6, 6, arrayOfByte1, 1 + i3 * 12);
      if (i3 + 1 == 14)
      {
        this.a.a(arrayOfByte1, arrayOfByte1.length, false);
        g();
      }
    }
    this.x = 279;
    this.u = System.nanoTime();
  }
  
  public void g()
  {
    try
    {
      Thread.sleep(1L);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if ((paramString.equals(SettingsUtils.s)) && (this.c.i())) {
      this.b.h().post(new DeeperScanner.1(this));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperScanner
 * JD-Core Version:    0.7.0.1
 */