package com.google.tagmanager.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStream
{
  private final byte[] a;
  private final int b;
  private int c;
  private int d = 0;
  private final OutputStream e;
  
  private CodedOutputStream(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    this.e = paramOutputStream;
    this.a = paramArrayOfByte;
    this.c = 0;
    this.b = paramArrayOfByte.length;
  }
  
  private CodedOutputStream(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.e = null;
    this.a = paramArrayOfByte;
    this.c = paramInt1;
    this.b = (paramInt1 + paramInt2);
  }
  
  static int a(int paramInt)
  {
    if (paramInt > 4096) {
      paramInt = 4096;
    }
    return paramInt;
  }
  
  public static int a(LazyField paramLazyField)
  {
    int i = paramLazyField.b();
    return i + q(i);
  }
  
  public static CodedOutputStream a(OutputStream paramOutputStream)
  {
    return a(paramOutputStream, 4096);
  }
  
  public static CodedOutputStream a(OutputStream paramOutputStream, int paramInt)
  {
    return new CodedOutputStream(paramOutputStream, new byte[paramInt]);
  }
  
  public static CodedOutputStream a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static CodedOutputStream a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new CodedOutputStream(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int b(double paramDouble)
  {
    return 8;
  }
  
  public static int b(float paramFloat)
  {
    return 4;
  }
  
  public static int b(int paramInt, float paramFloat)
  {
    return o(paramInt) + b(paramFloat);
  }
  
  public static int b(int paramInt, long paramLong)
  {
    return o(paramInt) + g(paramLong);
  }
  
  public static int b(int paramInt, ByteString paramByteString)
  {
    return o(paramInt) + b(paramByteString);
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return o(paramInt) + b(paramBoolean);
  }
  
  public static int b(ByteString paramByteString)
  {
    return q(paramByteString.a()) + paramByteString.a();
  }
  
  public static int b(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      int i = q(arrayOfByte.length);
      int j = arrayOfByte.length;
      return j + i;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported.", localUnsupportedEncodingException);
    }
  }
  
  public static int b(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int c(MessageLite paramMessageLite)
  {
    return paramMessageLite.k();
  }
  
  public static int c(byte[] paramArrayOfByte)
  {
    return q(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    return o(paramInt1) + h(paramInt2);
  }
  
  public static int d(int paramInt, MessageLite paramMessageLite)
  {
    return o(paramInt) + d(paramMessageLite);
  }
  
  public static int d(MessageLite paramMessageLite)
  {
    int i = paramMessageLite.k();
    return i + q(i);
  }
  
  private void d()
  {
    if (this.e == null) {
      throw new CodedOutputStream.OutOfSpaceException();
    }
    this.e.write(this.a, 0, this.c);
    this.c = 0;
  }
  
  public static int e(int paramInt1, int paramInt2)
  {
    return o(paramInt1) + k(paramInt2);
  }
  
  public static int f(long paramLong)
  {
    return l(paramLong);
  }
  
  public static int g(long paramLong)
  {
    return l(paramLong);
  }
  
  public static int h(int paramInt)
  {
    if (paramInt >= 0) {
      return q(paramInt);
    }
    return 10;
  }
  
  public static int h(long paramLong)
  {
    return 8;
  }
  
  public static int i(int paramInt)
  {
    return 4;
  }
  
  public static int i(long paramLong)
  {
    return 8;
  }
  
  public static int j(int paramInt)
  {
    return q(paramInt);
  }
  
  public static int j(long paramLong)
  {
    return l(n(paramLong));
  }
  
  public static int k(int paramInt)
  {
    return h(paramInt);
  }
  
  public static int l(int paramInt)
  {
    return 4;
  }
  
  public static int l(long paramLong)
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
  
  public static int m(int paramInt)
  {
    return q(s(paramInt));
  }
  
  public static long n(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }
  
  public static int o(int paramInt)
  {
    return q(WireFormat.a(paramInt, 0));
  }
  
  public static int q(int paramInt)
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
  
  public static int s(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }
  
  public void a()
  {
    if (this.e != null) {
      d();
    }
  }
  
  public void a(byte paramByte)
  {
    if (this.c == this.b) {
      d();
    }
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = paramByte;
    this.d = (1 + this.d);
  }
  
  public void a(double paramDouble)
  {
    m(Double.doubleToRawLongBits(paramDouble));
  }
  
  public void a(float paramFloat)
  {
    r(Float.floatToRawIntBits(paramFloat));
  }
  
  public void a(int paramInt, float paramFloat)
  {
    f(paramInt, 5);
    a(paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    f(paramInt1, 0);
    b(paramInt2);
  }
  
  public void a(int paramInt, long paramLong)
  {
    f(paramInt, 0);
    b(paramLong);
  }
  
  public void a(int paramInt, ByteString paramByteString)
  {
    f(paramInt, 2);
    a(paramByteString);
  }
  
  public void a(int paramInt, MessageLite paramMessageLite)
  {
    f(paramInt, 3);
    a(paramMessageLite);
    f(paramInt, 4);
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    f(paramInt, 0);
    a(paramBoolean);
  }
  
  public void a(long paramLong)
  {
    k(paramLong);
  }
  
  public void a(ByteString paramByteString)
  {
    p(paramByteString.a());
    c(paramByteString);
  }
  
  public void a(ByteString paramByteString, int paramInt1, int paramInt2)
  {
    if (this.b - this.c >= paramInt2)
    {
      paramByteString.b(this.a, paramInt1, this.c, paramInt2);
      this.c = (paramInt2 + this.c);
      this.d = (paramInt2 + this.d);
      return;
    }
    int i = this.b - this.c;
    paramByteString.b(this.a, paramInt1, this.c, i);
    int j = paramInt1 + i;
    int k = paramInt2 - i;
    this.c = this.b;
    this.d = (i + this.d);
    d();
    if (k <= this.b)
    {
      paramByteString.b(this.a, j, 0, k);
      this.c = k;
    }
    for (;;)
    {
      this.d = (k + this.d);
      return;
      paramByteString.a(this.e, j, k);
    }
  }
  
  public void a(MessageLite paramMessageLite)
  {
    paramMessageLite.a(this);
  }
  
  public void a(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    p(arrayOfByte.length);
    d(arrayOfByte);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      n(i);
      return;
    }
  }
  
  public int b()
  {
    if (this.e == null) {
      return this.b - this.c;
    }
    throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
  }
  
  public void b(int paramInt)
  {
    if (paramInt >= 0)
    {
      p(paramInt);
      return;
    }
    k(paramInt);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    f(paramInt1, 0);
    d(paramInt2);
  }
  
  public void b(int paramInt, MessageLite paramMessageLite)
  {
    f(paramInt, 2);
    b(paramMessageLite);
  }
  
  public void b(long paramLong)
  {
    k(paramLong);
  }
  
  public void b(MessageLite paramMessageLite)
  {
    p(paramMessageLite.k());
    paramMessageLite.a(this);
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    p(paramArrayOfByte.length);
    d(paramArrayOfByte);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.b - this.c >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.c, paramInt2);
      this.c = (paramInt2 + this.c);
      this.d = (paramInt2 + this.d);
      return;
    }
    int i = this.b - this.c;
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.c, i);
    int j = paramInt1 + i;
    int k = paramInt2 - i;
    this.c = this.b;
    this.d = (i + this.d);
    d();
    if (k <= this.b)
    {
      System.arraycopy(paramArrayOfByte, j, this.a, 0, k);
      this.c = k;
    }
    for (;;)
    {
      this.d = (k + this.d);
      return;
      this.e.write(paramArrayOfByte, j, k);
    }
  }
  
  public void c()
  {
    if (b() != 0) {
      throw new IllegalStateException("Did not write as much data as expected.");
    }
  }
  
  public void c(int paramInt)
  {
    r(paramInt);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    f(paramInt1, 0);
    e(paramInt2);
  }
  
  public void c(int paramInt, MessageLite paramMessageLite)
  {
    f(1, 3);
    b(2, paramInt);
    b(3, paramMessageLite);
    f(1, 4);
  }
  
  public void c(long paramLong)
  {
    m(paramLong);
  }
  
  public void c(ByteString paramByteString)
  {
    a(paramByteString, 0, paramByteString.a());
  }
  
  public void d(int paramInt)
  {
    p(paramInt);
  }
  
  public void d(long paramLong)
  {
    m(paramLong);
  }
  
  public void d(byte[] paramArrayOfByte)
  {
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void e(int paramInt)
  {
    b(paramInt);
  }
  
  public void e(long paramLong)
  {
    k(n(paramLong));
  }
  
  public void f(int paramInt)
  {
    r(paramInt);
  }
  
  public void f(int paramInt1, int paramInt2)
  {
    p(WireFormat.a(paramInt1, paramInt2));
  }
  
  public void g(int paramInt)
  {
    p(s(paramInt));
  }
  
  public void k(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        n((int)paramLong);
        return;
      }
      n(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
  
  public void m(long paramLong)
  {
    n(0xFF & (int)paramLong);
    n(0xFF & (int)(paramLong >> 8));
    n(0xFF & (int)(paramLong >> 16));
    n(0xFF & (int)(paramLong >> 24));
    n(0xFF & (int)(paramLong >> 32));
    n(0xFF & (int)(paramLong >> 40));
    n(0xFF & (int)(paramLong >> 48));
    n(0xFF & (int)(paramLong >> 56));
  }
  
  public void n(int paramInt)
  {
    a((byte)paramInt);
  }
  
  public void p(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        n(paramInt);
        return;
      }
      n(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
  
  public void r(int paramInt)
  {
    n(paramInt & 0xFF);
    n(0xFF & paramInt >> 8);
    n(0xFF & paramInt >> 16);
    n(0xFF & paramInt >> 24);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.CodedOutputStream
 * JD-Core Version:    0.7.0.1
 */