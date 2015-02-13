package com.google.api.client.http;

import com.google.common.base.Preconditions;

public class ExponentialBackOffPolicy
  implements BackOffPolicy
{
  long a;
  private int b;
  private final int c;
  private final double d;
  private final double e;
  private final int f;
  private final int g;
  
  public ExponentialBackOffPolicy()
  {
    this(500, 0.5D, 1.5D, 60000, 900000);
  }
  
  ExponentialBackOffPolicy(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3)
  {
    boolean bool2;
    boolean bool3;
    label36:
    boolean bool4;
    label52:
    boolean bool5;
    if (paramInt1 > 0)
    {
      bool2 = bool1;
      Preconditions.a(bool2);
      if ((0.0D > paramDouble1) || (paramDouble1 >= 1.0D)) {
        break label121;
      }
      bool3 = bool1;
      Preconditions.a(bool3);
      if (paramDouble2 < 1.0D) {
        break label127;
      }
      bool4 = bool1;
      Preconditions.a(bool4);
      if (paramInt2 < paramInt1) {
        break label133;
      }
      bool5 = bool1;
      label67:
      Preconditions.a(bool5);
      if (paramInt3 <= 0) {
        break label139;
      }
    }
    for (;;)
    {
      Preconditions.a(bool1);
      this.c = paramInt1;
      this.d = paramDouble1;
      this.e = paramDouble2;
      this.f = paramInt2;
      this.g = paramInt3;
      b();
      return;
      bool2 = false;
      break;
      label121:
      bool3 = false;
      break label36;
      label127:
      bool4 = false;
      break label52;
      label133:
      bool5 = false;
      break label67;
      label139:
      bool1 = false;
    }
  }
  
  static int a(double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = paramDouble1 * paramInt;
    double d2 = paramInt - d1;
    return (int)(d2 + paramDouble2 * (1.0D + (d1 + paramInt - d2)));
  }
  
  private void d()
  {
    if (this.b >= this.f / this.e)
    {
      this.b = this.f;
      return;
    }
    this.b = ((int)(this.b * this.e));
  }
  
  public long a()
  {
    if (c() > this.g) {
      return -1L;
    }
    int i = a(this.d, Math.random(), this.b);
    d();
    return i;
  }
  
  public boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 501: 
    case 502: 
    default: 
      return false;
    }
    return true;
  }
  
  public final void b()
  {
    this.b = this.c;
    this.a = System.nanoTime();
  }
  
  public final long c()
  {
    return (System.nanoTime() - this.a) / 1000000L;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.ExponentialBackOffPolicy
 * JD-Core Version:    0.7.0.1
 */