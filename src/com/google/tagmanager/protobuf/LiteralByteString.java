package com.google.tagmanager.protobuf;

import java.io.OutputStream;

class LiteralByteString
  extends ByteString
{
  protected final byte[] c;
  private int d = 0;
  
  LiteralByteString(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  public byte a(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public int a()
  {
    return this.c.length;
  }
  
  protected int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 + b();
    return Utf8.a(paramInt1, this.c, i, i + paramInt3);
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.c, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  boolean a(LiteralByteString paramLiteralByteString, int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramLiteralByteString.a()) {
      throw new IllegalArgumentException("Length too large: " + paramInt2 + a());
    }
    if (paramInt1 + paramInt2 > paramLiteralByteString.a()) {
      throw new IllegalArgumentException("Ran off end of other: " + paramInt1 + ", " + paramInt2 + ", " + paramLiteralByteString.a());
    }
    byte[] arrayOfByte1 = this.c;
    byte[] arrayOfByte2 = paramLiteralByteString.c;
    int i = paramInt2 + b();
    int j = b();
    for (int k = paramInt1 + paramLiteralByteString.b(); j < i; k++)
    {
      if (arrayOfByte1[j] != arrayOfByte2[k]) {
        return false;
      }
      j++;
    }
    return true;
  }
  
  protected int b()
  {
    return 0;
  }
  
  protected int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, this.c, paramInt2 + b(), paramInt3);
  }
  
  public String b(String paramString)
  {
    return new String(this.c, b(), a(), paramString);
  }
  
  void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    paramOutputStream.write(this.c, paramInt1 + b(), paramInt2);
  }
  
  public ByteString.ByteIterator c()
  {
    return new LiteralByteString.LiteralByteIterator(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ByteString)) {
      return false;
    }
    if (a() != ((ByteString)paramObject).a()) {
      return false;
    }
    if (a() == 0) {
      return true;
    }
    if ((paramObject instanceof LiteralByteString)) {
      return a((LiteralByteString)paramObject, 0, a());
    }
    if ((paramObject instanceof RopeByteString)) {
      return paramObject.equals(this);
    }
    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + paramObject.getClass());
  }
  
  public boolean g()
  {
    int i = b();
    return Utf8.a(this.c, i, i + a());
  }
  
  public CodedInputStream h()
  {
    return CodedInputStream.a(this);
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i == 0)
    {
      int j = a();
      i = b(j, 0, j);
      if (i == 0) {
        i = 1;
      }
      this.d = i;
    }
    return i;
  }
  
  protected int j()
  {
    return 0;
  }
  
  protected boolean k()
  {
    return true;
  }
  
  protected int l()
  {
    return this.d;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.LiteralByteString
 * JD-Core Version:    0.7.0.1
 */