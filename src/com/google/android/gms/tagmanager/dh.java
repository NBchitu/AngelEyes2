package com.google.android.gms.tagmanager;

class dh
  extends Number
  implements Comparable<dh>
{
  private double a;
  private long b;
  private boolean c;
  
  private dh(long paramLong)
  {
    this.b = paramLong;
    this.c = true;
  }
  
  public static dh a(long paramLong)
  {
    return new dh(paramLong);
  }
  
  public int a(dh paramdh)
  {
    if ((b()) && (paramdh.b())) {
      return new Long(this.b).compareTo(Long.valueOf(paramdh.b));
    }
    return Double.compare(doubleValue(), paramdh.doubleValue());
  }
  
  public boolean a()
  {
    return !b();
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public long c()
  {
    if (b()) {
      return this.b;
    }
    return this.a;
  }
  
  public int d()
  {
    return (int)longValue();
  }
  
  public double doubleValue()
  {
    if (b()) {
      return this.b;
    }
    return this.a;
  }
  
  public short e()
  {
    return (short)(int)longValue();
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof dh)) && (a((dh)paramObject) == 0);
  }
  
  public float floatValue()
  {
    return (float)doubleValue();
  }
  
  public int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public int intValue()
  {
    return d();
  }
  
  public long longValue()
  {
    return c();
  }
  
  public short shortValue()
  {
    return e();
  }
  
  public String toString()
  {
    if (b()) {
      return Long.toString(this.b);
    }
    return Double.toString(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.dh
 * JD-Core Version:    0.7.0.1
 */