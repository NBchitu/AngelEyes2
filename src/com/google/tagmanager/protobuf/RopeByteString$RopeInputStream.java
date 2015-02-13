package com.google.tagmanager.protobuf;

import java.io.InputStream;

class RopeByteString$RopeInputStream
  extends InputStream
{
  private RopeByteString.PieceIterator b;
  private LiteralByteString c;
  private int d;
  private int e;
  private int f;
  private int g;
  
  public RopeByteString$RopeInputStream(RopeByteString paramRopeByteString)
  {
    a();
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    int j = paramInt1;
    while (i > 0)
    {
      b();
      if (this.c == null)
      {
        if (i != paramInt2) {
          break;
        }
        return -1;
      }
      int k = Math.min(this.d - this.e, i);
      if (paramArrayOfByte != null)
      {
        this.c.b(paramArrayOfByte, this.e, j, k);
        j += k;
      }
      this.e = (k + this.e);
      i -= k;
    }
    return paramInt2 - i;
  }
  
  private void a()
  {
    this.b = new RopeByteString.PieceIterator(this.a, null);
    this.c = this.b.a();
    this.d = this.c.a();
    this.e = 0;
    this.f = 0;
  }
  
  private void b()
  {
    if ((this.c != null) && (this.e == this.d))
    {
      this.f += this.d;
      this.e = 0;
      if (this.b.hasNext())
      {
        this.c = this.b.a();
        this.d = this.c.a();
      }
    }
    else
    {
      return;
    }
    this.c = null;
    this.d = 0;
  }
  
  public int available()
  {
    int i = this.f + this.e;
    return this.a.a() - i;
  }
  
  public void mark(int paramInt)
  {
    this.g = (this.f + this.e);
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
  {
    b();
    if (this.c == null) {
      return -1;
    }
    LiteralByteString localLiteralByteString = this.c;
    int i = this.e;
    this.e = (i + 1);
    return 0xFF & localLiteralByteString.a(i);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException();
    }
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1)) {
      throw new IndexOutOfBoundsException();
    }
    return a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void reset()
  {
    try
    {
      a();
      a(null, 0, this.g);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public long skip(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IndexOutOfBoundsException();
    }
    if (paramLong > 2147483647L) {
      paramLong = 2147483647L;
    }
    return a(null, 0, (int)paramLong);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.RopeByteString.RopeInputStream
 * JD-Core Version:    0.7.0.1
 */