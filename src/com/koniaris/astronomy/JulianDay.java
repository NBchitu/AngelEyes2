package com.koniaris.astronomy;

import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class JulianDay
{
  private static final SimpleTimeZone i = new SimpleTimeZone(0, "Z");
  private static final double j = 30.600100000000001D;
  private double a;
  private final int b;
  private final int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private double h;
  
  public JulianDay()
  {
    this(new GregorianCalendar(i));
  }
  
  public JulianDay(double paramDouble)
  {
    if (paramDouble < 0.0D) {
      throw new RuntimeException("We can only handle positive Julian Days.");
    }
    this.a = paramDouble;
    double d1 = paramDouble + 0.5D;
    int k = a(d1);
    double d2 = d1 - k;
    if (k >= 2299161)
    {
      int i5 = a((k - 1867216.25D) / 36524.25D);
      k += i5 + 1 - a(i5 / 4.0D);
    }
    int m = k + 1524;
    int n = a((m - 122.09999999999999D) / 365.25D);
    int i1 = a(365.25D * n);
    int i2 = a((m - i1) / j);
    this.h = (d2 + (m - i1 - Math.floor(j * i2)));
    g();
    int i3;
    if (i2 < 14)
    {
      i3 = 1;
      this.c = (i2 - i3);
      if (this.c <= 2) {
        break label225;
      }
    }
    label225:
    for (int i4 = 4716;; i4 = 4715)
    {
      this.b = (n - i4);
      f();
      return;
      i3 = 13;
      break;
    }
  }
  
  public JulianDay(GregorianCalendar paramGregorianCalendar)
  {
    this.b = paramGregorianCalendar.get(1);
    this.c = (1 + paramGregorianCalendar.get(2));
    this.d = paramGregorianCalendar.get(5);
    this.e = paramGregorianCalendar.get(11);
    this.f = paramGregorianCalendar.get(12);
    this.g = paramGregorianCalendar.get(13);
    e();
    h();
    f();
  }
  
  private int a(double paramDouble)
  {
    if (paramDouble < 0.0D) {
      throw new RuntimeException("Hey, this is negative: " + paramDouble);
    }
    return (int)Math.floor(paramDouble);
  }
  
  private void e()
  {
    this.h = (this.d + (this.g + 60 * (this.f + 60 * this.e)) / 86400.0D);
  }
  
  private void f()
  {
    if ((this.c < 1) || (this.c > 12) || (this.d < 1) || (this.d > 31) || (this.h < 0.0D) || (this.h >= 32.0D) || (this.e < 0) || (this.e > 23) || (this.f < 0) || (this.f > 59) || (this.g < 0) || (this.g > 59)) {
      throw new RuntimeException("Date failed to pass sanity check");
    }
  }
  
  private void g()
  {
    int k = (int)Math.round(86400.0D * this.h);
    this.g = (k % 60);
    int m = (k - this.g) / 60;
    this.f = (m % 60);
    int n = (m - this.f) / 60;
    this.e = (n % 24);
    this.d = ((n - this.e) / 24);
  }
  
  private void h()
  {
    int k = this.b;
    int m = this.c;
    switch (m)
    {
    }
    for (;;)
    {
      boolean bool = d();
      int n = 0;
      if (bool)
      {
        int i1 = a(k / 100.0D);
        n = 2 - i1 + a(i1 / 4.0D);
      }
      this.a = (Math.floor(365.25D * (k + 4716)) + Math.floor(j * (m + 1)) + this.h + n - 1524.5D);
      return;
      k--;
      m += 12;
    }
  }
  
  public double a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public boolean d()
  {
    if (this.b > 1582) {}
    do
    {
      do
      {
        return true;
        if (this.b < 1582) {
          return false;
        }
      } while (this.c > 10);
      if (this.c < 10) {
        return false;
      }
    } while (this.d > 4);
    return this.d >= 4;
  }
  
  public String toString()
  {
    return this.b + "-" + this.c + "-" + this.h + "(" + this.d + ")" + "--" + this.e + ":" + this.f + ":" + this.g + "--" + this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.koniaris.astronomy.JulianDay
 * JD-Core Version:    0.7.0.1
 */