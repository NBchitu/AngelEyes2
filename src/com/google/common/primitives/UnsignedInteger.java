package com.google.common.primitives;

import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

public final class UnsignedInteger
  extends Number
  implements Comparable<UnsignedInteger>
{
  public static final UnsignedInteger a = a(0);
  public static final UnsignedInteger b = a(1);
  public static final UnsignedInteger c = a(-1);
  private final int d;
  
  private UnsignedInteger(int paramInt)
  {
    this.d = (paramInt & 0xFFFFFFFF);
  }
  
  public static UnsignedInteger a(int paramInt)
  {
    return new UnsignedInteger(paramInt);
  }
  
  public static UnsignedInteger a(long paramLong)
  {
    if ((0xFFFFFFFF & paramLong) == paramLong) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      Preconditions.a(bool, "value (%s) is outside the range for an unsigned integer value", arrayOfObject);
      return a((int)paramLong);
    }
  }
  
  public static UnsignedInteger a(String paramString)
  {
    return a(paramString, 10);
  }
  
  public static UnsignedInteger a(String paramString, int paramInt)
  {
    return a(UnsignedInts.a(paramString, paramInt));
  }
  
  public int a(UnsignedInteger paramUnsignedInteger)
  {
    Preconditions.a(paramUnsignedInteger);
    return UnsignedInts.a(this.d, paramUnsignedInteger.d);
  }
  
  public String b(int paramInt)
  {
    return UnsignedInts.b(this.d, paramInt);
  }
  
  public double doubleValue()
  {
    return longValue();
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool1 = paramObject instanceof UnsignedInteger;
    boolean bool2 = false;
    if (bool1)
    {
      UnsignedInteger localUnsignedInteger = (UnsignedInteger)paramObject;
      int i = this.d;
      int j = localUnsignedInteger.d;
      bool2 = false;
      if (i == j) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public float floatValue()
  {
    return (float)longValue();
  }
  
  public int hashCode()
  {
    return this.d;
  }
  
  public int intValue()
  {
    return this.d;
  }
  
  public long longValue()
  {
    return UnsignedInts.b(this.d);
  }
  
  public String toString()
  {
    return b(10);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.primitives.UnsignedInteger
 * JD-Core Version:    0.7.0.1
 */