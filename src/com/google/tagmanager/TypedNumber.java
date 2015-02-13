package com.google.tagmanager;

class TypedNumber
  extends Number
  implements Comparable<TypedNumber>
{
  private double a;
  private long b;
  private boolean c;
  
  private TypedNumber(double paramDouble)
  {
    this.a = paramDouble;
    this.c = false;
  }
  
  private TypedNumber(long paramLong)
  {
    this.b = paramLong;
    this.c = true;
  }
  
  public static TypedNumber a(long paramLong)
  {
    return new TypedNumber(paramLong);
  }
  
  public static TypedNumber a(Double paramDouble)
  {
    return new TypedNumber(paramDouble.doubleValue());
  }
  
  public static TypedNumber a(String paramString)
  {
    try
    {
      TypedNumber localTypedNumber1 = new TypedNumber(Long.parseLong(paramString));
      return localTypedNumber1;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        TypedNumber localTypedNumber2 = new TypedNumber(Double.parseDouble(paramString));
        return localTypedNumber2;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        throw new NumberFormatException(paramString + " is not a valid TypedNumber");
      }
    }
  }
  
  public int a(TypedNumber paramTypedNumber)
  {
    if ((b()) && (paramTypedNumber.b())) {
      return new Long(this.b).compareTo(Long.valueOf(paramTypedNumber.b));
    }
    return Double.compare(doubleValue(), paramTypedNumber.doubleValue());
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
    return ((paramObject instanceof TypedNumber)) && (a((TypedNumber)paramObject) == 0);
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
 * Qualified Name:     com.google.tagmanager.TypedNumber
 * JD-Core Version:    0.7.0.1
 */