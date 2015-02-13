package com.google.common.primitives;

import com.google.common.base.Preconditions;

public final class UnsignedInts
{
  static int a(int paramInt)
  {
    return 0x80000000 ^ paramInt;
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return Ints.a(a(paramInt1), a(paramInt2));
  }
  
  public static int a(String paramString, int paramInt)
  {
    Preconditions.a(paramString);
    long l = Long.parseLong(paramString, paramInt);
    if ((0xFFFFFFFF & l) != l) {
      throw new NumberFormatException("Input " + paramString + " in base " + paramInt + " is not in the range of an unsigned integer");
    }
    return (int)l;
  }
  
  public static long b(int paramInt)
  {
    return 0xFFFFFFFF & paramInt;
  }
  
  public static String b(int paramInt1, int paramInt2)
  {
    return Long.toString(0xFFFFFFFF & paramInt1, paramInt2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.primitives.UnsignedInts
 * JD-Core Version:    0.7.0.1
 */