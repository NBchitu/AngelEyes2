package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.math.BigInteger;

public final class UnsignedLongs
{
  private static final long[] a = new long[37];
  private static final int[] b = new int[37];
  private static final int[] c = new int[37];
  
  static
  {
    BigInteger localBigInteger = new BigInteger("10000000000000000", 16);
    for (int i = 2; i <= 36; i++)
    {
      a[i] = b(-1L, i);
      b[i] = ((int)c(-1L, i));
      c[i] = (-1 + localBigInteger.toString(i).length());
    }
  }
  
  public static int a(long paramLong1, long paramLong2)
  {
    return Longs.a(b(paramLong1), b(paramLong2));
  }
  
  public static long a(String paramString, int paramInt)
  {
    Preconditions.a(paramString);
    if (paramString.length() == 0) {
      throw new NumberFormatException("empty string");
    }
    if ((paramInt < 2) || (paramInt > 36)) {
      throw new NumberFormatException("illegal radix: " + paramInt);
    }
    int i = -1 + c[paramInt];
    long l = 0L;
    for (int j = 0; j < paramString.length(); j++)
    {
      int k = Character.digit(paramString.charAt(j), paramInt);
      if (k == -1) {
        throw new NumberFormatException(paramString);
      }
      if ((j > i) && (a(l, k, paramInt))) {
        throw new NumberFormatException("Too large for unsigned long: " + paramString);
      }
      l = l * paramInt + k;
    }
    return l;
  }
  
  public static String a(long paramLong)
  {
    return a(paramLong, 10);
  }
  
  public static String a(long paramLong, int paramInt)
  {
    if ((paramInt >= 2) && (paramInt <= 36)) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      Preconditions.a(bool, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", arrayOfObject);
      if (paramLong != 0L) {
        break;
      }
      return "0";
    }
    char[] arrayOfChar = new char[64];
    int i = arrayOfChar.length;
    int j;
    if (paramLong < 0L)
    {
      long l1 = b(paramLong, paramInt);
      long l2 = paramLong - l1 * paramInt;
      int m = i - 1;
      arrayOfChar[m] = Character.forDigit((int)l2, paramInt);
      j = m;
      paramLong = l1;
    }
    for (;;)
    {
      if (paramLong > 0L)
      {
        int k = j - 1;
        arrayOfChar[k] = Character.forDigit((int)(paramLong % paramInt), paramInt);
        paramLong /= paramInt;
        j = k;
      }
      else
      {
        return new String(arrayOfChar, j, arrayOfChar.length - j);
        j = i;
      }
    }
  }
  
  private static boolean a(long paramLong, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    if (paramLong >= 0L)
    {
      if (paramLong >= a[paramInt2]) {
        break label25;
      }
      bool = false;
    }
    label25:
    while ((paramLong > a[paramInt2]) || (paramInt1 > b[paramInt2])) {
      return bool;
    }
    return false;
  }
  
  private static long b(long paramLong)
  {
    return 0x0 ^ paramLong;
  }
  
  public static long b(long paramLong1, long paramLong2)
  {
    int i = 1;
    if (paramLong2 < 0L)
    {
      if (a(paramLong1, paramLong2) < 0) {
        return 0L;
      }
      return 1L;
    }
    if (paramLong1 >= 0L) {
      return paramLong1 / paramLong2;
    }
    long l = (paramLong1 >>> i) / paramLong2 << i;
    if (a(paramLong1 - l * paramLong2, paramLong2) >= 0) {}
    for (;;)
    {
      return l + i;
      i = 0;
    }
  }
  
  public static long c(long paramLong1, long paramLong2)
  {
    if (paramLong2 < 0L)
    {
      if (a(paramLong1, paramLong2) < 0) {
        return paramLong1;
      }
      return paramLong1 - paramLong2;
    }
    if (paramLong1 >= 0L) {
      return paramLong1 % paramLong2;
    }
    long l = paramLong1 - paramLong2 * ((paramLong1 >>> 1) / paramLong2 << 1);
    if (a(l, paramLong2) >= 0) {}
    for (;;)
    {
      return l - paramLong2;
      paramLong2 = 0L;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.primitives.UnsignedLongs
 * JD-Core Version:    0.7.0.1
 */