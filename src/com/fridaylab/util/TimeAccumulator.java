package com.fridaylab.util;

import android.os.SystemClock;

public final class TimeAccumulator
{
  private long a;
  private long b;
  private boolean c;
  
  public final void a()
  {
    if (this.c) {
      return;
    }
    this.c = true;
    this.b = SystemClock.elapsedRealtime();
  }
  
  public final void b()
  {
    if (!this.c) {
      return;
    }
    this.c = false;
    this.a += SystemClock.elapsedRealtime() - this.b;
  }
  
  public final void c()
  {
    this.c = false;
    this.a = 0L;
  }
  
  public final boolean d()
  {
    return this.c;
  }
  
  public final long e()
  {
    return f() / 1000L;
  }
  
  public final long f()
  {
    long l = 0L;
    if (this.c) {
      l = SystemClock.elapsedRealtime() - this.b;
    }
    return l + this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.TimeAccumulator
 * JD-Core Version:    0.7.0.1
 */