package com.google.tagmanager.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CodedInputStream
{
  private final byte[] a;
  private final boolean b;
  private int c;
  private int d;
  private int e;
  private final InputStream f;
  private int g;
  private boolean h = false;
  private int i;
  private int j = 2147483647;
  private int k;
  private int l = 64;
  private int m = 67108864;
  private CodedInputStream.RefillCallback n = null;
  
  private CodedInputStream(LiteralByteString paramLiteralByteString)
  {
    this.a = paramLiteralByteString.c;
    this.e = paramLiteralByteString.b();
    this.c = (paramLiteralByteString.b() + paramLiteralByteString.a());
    this.i = (-this.e);
    this.f = null;
    this.b = true;
  }
  
  private CodedInputStream(InputStream paramInputStream)
  {
    this.a = new byte[4096];
    this.c = 0;
    this.e = 0;
    this.i = 0;
    this.f = paramInputStream;
    this.b = false;
  }
  
  public static long a(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }
  
  static CodedInputStream a(LiteralByteString paramLiteralByteString)
  {
    CodedInputStream localCodedInputStream = new CodedInputStream(paramLiteralByteString);
    try
    {
      localCodedInputStream.c(paramLiteralByteString.a());
      return localCodedInputStream;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      throw new IllegalArgumentException(localInvalidProtocolBufferException);
    }
  }
  
  public static CodedInputStream a(InputStream paramInputStream)
  {
    return new CodedInputStream(paramInputStream);
  }
  
  private boolean a(boolean paramBoolean)
  {
    if (this.e < this.c) {
      throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    }
    if (this.i + this.c == this.j)
    {
      if (paramBoolean) {
        throw InvalidProtocolBufferException.b();
      }
      return false;
    }
    if (this.n != null) {
      this.n.a();
    }
    this.i += this.c;
    this.e = 0;
    if (this.f == null) {}
    for (int i1 = -1;; i1 = this.f.read(this.a))
    {
      this.c = i1;
      if ((this.c != 0) && (this.c >= -1)) {
        break;
      }
      throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.c + "\nThe InputStream implementation is buggy.");
    }
    if (this.c == -1)
    {
      this.c = 0;
      if (paramBoolean) {
        throw InvalidProtocolBufferException.b();
      }
      return false;
    }
    z();
    int i2 = this.i + this.c + this.d;
    if ((i2 > this.m) || (i2 < 0)) {
      throw InvalidProtocolBufferException.i();
    }
    return true;
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }
  
  private void z()
  {
    this.c += this.d;
    int i1 = this.i + this.c;
    if (i1 > this.j)
    {
      this.d = (i1 - this.j);
      this.c -= this.d;
      return;
    }
    this.d = 0;
  }
  
  public int a()
  {
    if (x())
    {
      this.g = 0;
      return 0;
    }
    this.g = s();
    if (WireFormat.b(this.g) == 0) {
      throw InvalidProtocolBufferException.e();
    }
    return this.g;
  }
  
  public <T extends MessageLite> T a(Parser<T> paramParser, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    int i1 = s();
    if (this.k >= this.l) {
      throw InvalidProtocolBufferException.h();
    }
    int i2 = c(i1);
    this.k = (1 + this.k);
    MessageLite localMessageLite = (MessageLite)paramParser.b(this, paramExtensionRegistryLite);
    a(0);
    this.k = (-1 + this.k);
    d(i2);
    return localMessageLite;
  }
  
  public void a(int paramInt)
  {
    if (this.g != paramInt) {
      throw InvalidProtocolBufferException.f();
    }
  }
  
  public void a(int paramInt, MessageLite.Builder paramBuilder, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    if (this.k >= this.l) {
      throw InvalidProtocolBufferException.h();
    }
    this.k = (1 + this.k);
    paramBuilder.c(this, paramExtensionRegistryLite);
    a(WireFormat.a(paramInt, 4));
    this.k = (-1 + this.k);
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    int i1;
    do
    {
      i1 = a();
    } while ((i1 != 0) && (a(i1, paramCodedOutputStream)));
  }
  
  public void a(MessageLite.Builder paramBuilder, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    int i1 = s();
    if (this.k >= this.l) {
      throw InvalidProtocolBufferException.h();
    }
    int i2 = c(i1);
    this.k = (1 + this.k);
    paramBuilder.c(this, paramExtensionRegistryLite);
    a(0);
    this.k = (-1 + this.k);
    d(i2);
  }
  
  public boolean a(int paramInt, CodedOutputStream paramCodedOutputStream)
  {
    switch (WireFormat.a(paramInt))
    {
    default: 
      throw InvalidProtocolBufferException.g();
    case 0: 
      long l2 = e();
      paramCodedOutputStream.p(paramInt);
      paramCodedOutputStream.a(l2);
      return true;
    case 1: 
      long l1 = v();
      paramCodedOutputStream.p(paramInt);
      paramCodedOutputStream.c(l1);
      return true;
    case 2: 
      ByteString localByteString = l();
      paramCodedOutputStream.p(paramInt);
      paramCodedOutputStream.a(localByteString);
      return true;
    case 3: 
      paramCodedOutputStream.p(paramInt);
      a(paramCodedOutputStream);
      int i2 = WireFormat.a(WireFormat.b(paramInt), 4);
      a(i2);
      paramCodedOutputStream.p(i2);
      return true;
    case 4: 
      return false;
    }
    int i1 = u();
    paramCodedOutputStream.p(paramInt);
    paramCodedOutputStream.c(i1);
    return true;
  }
  
  public double b()
  {
    return Double.longBitsToDouble(v());
  }
  
  public float c()
  {
    return Float.intBitsToFloat(u());
  }
  
  public int c(int paramInt)
  {
    if (paramInt < 0) {
      throw InvalidProtocolBufferException.c();
    }
    int i1 = paramInt + (this.i + this.e);
    int i2 = this.j;
    if (i1 > i2) {
      throw InvalidProtocolBufferException.b();
    }
    this.j = i1;
    z();
    return i2;
  }
  
  public long d()
  {
    return t();
  }
  
  public void d(int paramInt)
  {
    this.j = paramInt;
    z();
  }
  
  public long e()
  {
    return t();
  }
  
  public byte[] e(int paramInt)
  {
    if (paramInt < 0) {
      throw InvalidProtocolBufferException.c();
    }
    if (paramInt + (this.i + this.e) > this.j)
    {
      f(this.j - this.i - this.e);
      throw InvalidProtocolBufferException.b();
    }
    if (paramInt <= this.c - this.e)
    {
      byte[] arrayOfByte5 = new byte[paramInt];
      System.arraycopy(this.a, this.e, arrayOfByte5, 0, paramInt);
      this.e = (paramInt + this.e);
      return arrayOfByte5;
    }
    if (paramInt < 4096)
    {
      byte[] arrayOfByte4 = new byte[paramInt];
      int i10 = this.c - this.e;
      System.arraycopy(this.a, this.e, arrayOfByte4, 0, i10);
      this.e = this.c;
      a(true);
      while (paramInt - i10 > this.c)
      {
        System.arraycopy(this.a, 0, arrayOfByte4, i10, this.c);
        i10 += this.c;
        this.e = this.c;
        a(true);
      }
      System.arraycopy(this.a, 0, arrayOfByte4, i10, paramInt - i10);
      this.e = (paramInt - i10);
      return arrayOfByte4;
    }
    int i1 = this.e;
    int i2 = this.c;
    this.i += this.c;
    this.e = 0;
    this.c = 0;
    int i3 = paramInt - (i2 - i1);
    ArrayList localArrayList = new ArrayList();
    int i8;
    for (int i4 = i3; i4 > 0; i4 = i8)
    {
      byte[] arrayOfByte3 = new byte[Math.min(i4, 4096)];
      int i7 = 0;
      while (i7 < arrayOfByte3.length)
      {
        if (this.f == null) {}
        for (int i9 = -1; i9 == -1; i9 = this.f.read(arrayOfByte3, i7, arrayOfByte3.length - i7)) {
          throw InvalidProtocolBufferException.b();
        }
        this.i = (i9 + this.i);
        i7 += i9;
      }
      i8 = i4 - arrayOfByte3.length;
      localArrayList.add(arrayOfByte3);
    }
    byte[] arrayOfByte1 = new byte[paramInt];
    int i5 = i2 - i1;
    System.arraycopy(this.a, i1, arrayOfByte1, 0, i5);
    Iterator localIterator = localArrayList.iterator();
    int i6 = i5;
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte2 = (byte[])localIterator.next();
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i6, arrayOfByte2.length);
      i6 += arrayOfByte2.length;
    }
    return arrayOfByte1;
  }
  
  public int f()
  {
    return s();
  }
  
  public void f(int paramInt)
  {
    if (paramInt < 0) {
      throw InvalidProtocolBufferException.c();
    }
    if (paramInt + (this.i + this.e) > this.j)
    {
      f(this.j - this.i - this.e);
      throw InvalidProtocolBufferException.b();
    }
    if (paramInt <= this.c - this.e)
    {
      this.e = (paramInt + this.e);
      return;
    }
    int i1 = this.c - this.e;
    this.e = this.c;
    a(true);
    while (paramInt - i1 > this.c)
    {
      i1 += this.c;
      this.e = this.c;
      a(true);
    }
    this.e = (paramInt - i1);
  }
  
  public long g()
  {
    return v();
  }
  
  public int h()
  {
    return u();
  }
  
  public boolean i()
  {
    return s() != 0;
  }
  
  public String j()
  {
    int i1 = s();
    if ((i1 <= this.c - this.e) && (i1 > 0))
    {
      String str = new String(this.a, this.e, i1, "UTF-8");
      this.e = (i1 + this.e);
      return str;
    }
    return new String(e(i1), "UTF-8");
  }
  
  public String k()
  {
    int i1 = s();
    Object localObject;
    if ((i1 <= this.c - this.e) && (i1 > 0))
    {
      localObject = ByteString.a(this.a, this.e, i1);
      this.e = (i1 + this.e);
    }
    while (!((ByteString)localObject).g())
    {
      throw InvalidProtocolBufferException.j();
      localObject = new LiteralByteString(e(i1));
    }
    return ((ByteString)localObject).f();
  }
  
  public ByteString l()
  {
    int i1 = s();
    if (i1 == 0) {
      return ByteString.a;
    }
    if ((i1 <= this.c - this.e) && (i1 > 0))
    {
      if ((this.b) && (this.h)) {}
      for (Object localObject = new BoundedByteString(this.a, this.e, i1);; localObject = ByteString.a(this.a, this.e, i1))
      {
        this.e = (i1 + this.e);
        return localObject;
      }
    }
    return new LiteralByteString(e(i1));
  }
  
  public int m()
  {
    return s();
  }
  
  public int n()
  {
    return s();
  }
  
  public int o()
  {
    return u();
  }
  
  public long p()
  {
    return v();
  }
  
  public int q()
  {
    return b(s());
  }
  
  public long r()
  {
    return a(t());
  }
  
  public int s()
  {
    int i1 = y();
    if (i1 >= 0) {}
    int i9;
    do
    {
      return i1;
      int i2 = i1 & 0x7F;
      int i3 = y();
      if (i3 >= 0) {
        return i2 | i3 << 7;
      }
      int i4 = i2 | (i3 & 0x7F) << 7;
      int i5 = y();
      if (i5 >= 0) {
        return i4 | i5 << 14;
      }
      int i6 = i4 | (i5 & 0x7F) << 14;
      int i7 = y();
      if (i7 >= 0) {
        return i6 | i7 << 21;
      }
      int i8 = i6 | (i7 & 0x7F) << 21;
      i9 = y();
      i1 = i8 | i9 << 28;
    } while (i9 >= 0);
    for (int i10 = 0;; i10++)
    {
      if (i10 >= 5) {
        break label151;
      }
      if (y() >= 0) {
        break;
      }
    }
    label151:
    throw InvalidProtocolBufferException.d();
  }
  
  public long t()
  {
    int i1 = 0;
    long l1 = 0L;
    while (i1 < 64)
    {
      int i2 = y();
      l1 |= (i2 & 0x7F) << i1;
      if ((i2 & 0x80) == 0) {
        return l1;
      }
      i1 += 7;
    }
    throw InvalidProtocolBufferException.d();
  }
  
  public int u()
  {
    int i1 = y();
    int i2 = y();
    int i3 = y();
    int i4 = y();
    return i1 & 0xFF | (i2 & 0xFF) << 8 | (i3 & 0xFF) << 16 | (i4 & 0xFF) << 24;
  }
  
  public long v()
  {
    int i1 = y();
    int i2 = y();
    int i3 = y();
    int i4 = y();
    int i5 = y();
    int i6 = y();
    int i7 = y();
    int i8 = y();
    return 0xFF & i1 | (0xFF & i2) << 8 | (0xFF & i3) << 16 | (0xFF & i4) << 24 | (0xFF & i5) << 32 | (0xFF & i6) << 40 | (0xFF & i7) << 48 | (0xFF & i8) << 56;
  }
  
  public int w()
  {
    if (this.j == 2147483647) {
      return -1;
    }
    int i1 = this.i + this.e;
    return this.j - i1;
  }
  
  public boolean x()
  {
    int i1 = this.e;
    int i2 = this.c;
    boolean bool1 = false;
    if (i1 == i2)
    {
      boolean bool2 = a(false);
      bool1 = false;
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public byte y()
  {
    if (this.e == this.c) {
      a(true);
    }
    byte[] arrayOfByte = this.a;
    int i1 = this.e;
    this.e = (i1 + 1);
    return arrayOfByte[i1];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.CodedInputStream
 * JD-Core Version:    0.7.0.1
 */