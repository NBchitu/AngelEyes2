package com.fridaylab.deeper.communication;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.fridaylab.util.Flog;
import com.telesoftas.services.Signal;

public class DeeperUpdateGate24to26
  extends DeeperOperator
{
  private SharedPreferences d;
  private long e;
  private boolean f;
  private boolean g;
  private long h;
  
  public DeeperUpdateGate24to26(DeeperOperator paramDeeperOperator)
  {
    super(paramDeeperOperator);
  }
  
  private void f()
  {
    this.e = System.nanoTime();
    this.a.b(DeeperUpdateInit.d);
  }
  
  private float g()
  {
    if (!this.g) {
      return 0.0F;
    }
    return 0.07F * Math.min(1.0F, (float)(System.nanoTime() - this.h) / 6.0E+009F);
  }
  
  public void a()
  {
    super.a();
    f();
    this.d = this.b.j().getSharedPreferences("delayed-24", 0);
  }
  
  public void a(Signal paramSignal)
  {
    int i;
    if (paramSignal.a((byte)7, Signal.d, false))
    {
      if (this.f) {
        break label267;
      }
      long l1 = System.currentTimeMillis();
      long l2 = this.d.getLong(this.c.c(), -1L);
      if ((l2 == -1L) || (l1 - l2 > 14400000L))
      {
        i = 1;
        if (i == 0)
        {
          this.c.a(false);
          this.b.a(new DeeperScanner(this, false));
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        this.f = true;
        this.c.a(true);
        this.b.i();
      }
      return;
      i = 0;
      break;
      if (paramSignal.a((byte)7, DeeperUpdateInit.e, true))
      {
        this.g = true;
        this.h = System.nanoTime();
        this.f = false;
        this.c.a(false);
        a(DeeperModel.OperationMode.b);
        this.b.a(true, 0.0F);
        return;
      }
      if (paramSignal.a((byte)7, DeeperUpdateInit.f, true))
      {
        a(DeeperModel.OperationMode.a);
        this.f = false;
        this.c.a(false);
        this.b.a(new DeeperUpdateBootloader24to26(this, g()));
        return;
      }
      Flog.a("unrecognized signal: " + paramSignal.d());
      return;
      label267:
      i = 0;
    }
  }
  
  public void c()
  {
    super.c();
    if ((this.f) && (!this.c.k()))
    {
      this.d.edit().putLong(this.c.c(), System.currentTimeMillis()).commit();
      this.b.a(new DeeperScanner(this, false));
    }
    do
    {
      return;
      if (System.nanoTime() - this.e > 2000000000L)
      {
        f();
        return;
      }
    } while (!this.g);
    this.b.a(true, g());
  }
  
  public int e()
  {
    return 200;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperUpdateGate24to26
 * JD-Core Version:    0.7.0.1
 */