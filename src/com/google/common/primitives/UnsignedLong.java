package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Nullable;

public final class UnsignedLong
  extends Number
  implements Serializable, Comparable<UnsignedLong>
{
  public static final UnsignedLong a = new UnsignedLong(0L);
  public static final UnsignedLong b = new UnsignedLong(1L);
  public static final UnsignedLong c = new UnsignedLong(-1L);
  private final long d;
  
  private UnsignedLong(long paramLong)
  {
    this.d = paramLong;
  }
  
  public static UnsignedLong a(long paramLong)
  {
    return new UnsignedLong(paramLong);
  }
  
  public static UnsignedLong a(String paramString)
  {
    return a(paramString, 10);
  }
  
  public static UnsignedLong a(String paramString, int paramInt)
  {
    return a(UnsignedLongs.a(paramString, paramInt));
  }
  
  public static UnsignedLong a(BigInteger paramBigInteger)
  {
    Preconditions.a(paramBigInteger);
    if ((paramBigInteger.signum() >= 0) && (paramBigInteger.bitLength() <= 64)) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool, "value (%s) is outside the range for an unsigned long value", new Object[] { paramBigInteger });
      return a(paramBigInteger.longValue());
    }
  }
  
  public int a(UnsignedLong paramUnsignedLong)
  {
    Preconditions.a(paramUnsignedLong);
    return UnsignedLongs.a(this.d, paramUnsignedLong.d);
  }
  
  public BigInteger a()
  {
    BigInteger localBigInteger = BigInteger.valueOf(0xFFFFFFFF & this.d);
    if (this.d < 0L) {
      localBigInteger = localBigInteger.setBit(63);
    }
    return localBigInteger;
  }
  
  public double doubleValue()
  {
    double d1 = 0xFFFFFFFF & this.d;
    if (this.d < 0L) {
      d1 += 9.223372036854776E+018D;
    }
    return d1;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool1 = paramObject instanceof UnsignedLong;
    boolean bool2 = false;
    if (bool1)
    {
      UnsignedLong localUnsignedLong = (UnsignedLong)paramObject;
      boolean bool3 = this.d < localUnsignedLong.d;
      bool2 = false;
      if (!bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public float floatValue()
  {
    float f = (float)(0xFFFFFFFF & this.d);
    if (this.d < 0L) {
      f += 9.223372E+018F;
    }
    return f;
  }
  
  public int hashCode()
  {
    return Longs.a(this.d);
  }
  
  public int intValue()
  {
    return (int)this.d;
  }
  
  public long longValue()
  {
    return this.d;
  }
  
  public String toString()
  {
    return UnsignedLongs.a(this.d);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.primitives.UnsignedLong
 * JD-Core Version:    0.7.0.1
 */