package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public final class qp
{
  private final byte[] a;
  private final int b;
  private int c;
  
  private qp(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.c = paramInt1;
    this.b = (paramInt1 + paramInt2);
  }
  
  public static qp a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static qp a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new qp(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int b(int paramInt)
  {
    if (paramInt >= 0) {
      return f(paramInt);
    }
    return 10;
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return d(paramInt1) + b(paramInt2);
  }
  
  public static int b(int paramInt, long paramLong)
  {
    return d(paramInt) + b(paramLong);
  }
  
  public static int b(int paramInt, qw paramqw)
  {
    return 2 * d(paramInt) + c(paramqw);
  }
  
  public static int b(int paramInt, String paramString)
  {
    return d(paramInt) + b(paramString);
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return d(paramInt) + b(paramBoolean);
  }
  
  public static int b(long paramLong)
  {
    return d(paramLong);
  }
  
  public static int b(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      int i = f(arrayOfByte.length);
      int j = arrayOfByte.length;
      return j + i;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported.");
    }
  }
  
  public static int b(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int c(int paramInt, qw paramqw)
  {
    return d(paramInt) + d(paramqw);
  }
  
  public static int c(qw paramqw)
  {
    return paramqw.f();
  }
  
  public static int d(int paramInt)
  {
    return f(qz.a(paramInt, 0));
  }
  
  public static int d(long paramLong)
  {
    if ((0xFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0x0 & paramLong) == 0L) {
      return 5;
    }
    if ((0x0 & paramLong) == 0L) {
      return 6;
    }
    if ((0x0 & paramLong) == 0L) {
      return 7;
    }
    if ((0x0 & paramLong) == 0L) {
      return 8;
    }
    if ((0x0 & paramLong) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public static int d(qw paramqw)
  {
    int i = paramqw.f();
    return i + f(i);
  }
  
  public static int f(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xFFFFC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public void a(byte paramByte)
  {
    if (this.c == this.b) {
      throw new qp.a(this.c, this.b);
    }
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = paramByte;
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= 0)
    {
      e(paramInt);
      return;
    }
    c(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    c(paramInt1, 0);
    a(paramInt2);
  }
  
  public void a(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    a(paramLong);
  }
  
  public void a(int paramInt, qw paramqw)
  {
    c(paramInt, 2);
    b(paramqw);
  }
  
  public void a(int paramInt, String paramString)
  {
    c(paramInt, 2);
    a(paramString);
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    c(paramInt, 0);
    a(paramBoolean);
  }
  
  public void a(long paramLong)
  {
    c(paramLong);
  }
  
  public void a(qw paramqw)
  {
    paramqw.a(this);
  }
  
  public void a(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    e(arrayOfByte.length);
    b(arrayOfByte);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      c(i);
      return;
    }
  }
  
  public void b(qw paramqw)
  {
    e(paramqw.e());
    paramqw.a(this);
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.b - this.c >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.c, paramInt2);
      this.c = (paramInt2 + this.c);
      return;
    }
    throw new qp.a(this.c, this.b);
  }
  
  public void c(int paramInt)
  {
    a((byte)paramInt);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    e(qz.a(paramInt1, paramInt2));
  }
  
  public void c(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        c((int)paramLong);
        return;
      }
      c(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
  
  public void e(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        c(paramInt);
        return;
      }
      c(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qp
 * JD-Core Version:    0.7.0.1
 */