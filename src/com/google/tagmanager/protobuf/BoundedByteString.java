package com.google.tagmanager.protobuf;

class BoundedByteString
  extends LiteralByteString
{
  private final int d;
  private final int e;
  
  BoundedByteString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Offset too small: " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("Length too small: " + paramInt1);
    }
    if (paramInt1 + paramInt2 > paramArrayOfByte.length) {
      throw new IllegalArgumentException("Offset+Length too large: " + paramInt1 + "+" + paramInt2);
    }
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public byte a(int paramInt)
  {
    if (paramInt < 0) {
      throw new ArrayIndexOutOfBoundsException("Index too small: " + paramInt);
    }
    if (paramInt >= a()) {
      throw new ArrayIndexOutOfBoundsException("Index too large: " + paramInt + ", " + a());
    }
    return this.c[(paramInt + this.d)];
  }
  
  public int a()
  {
    return this.e;
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.c, paramInt1 + b(), paramArrayOfByte, paramInt2, paramInt3);
  }
  
  protected int b()
  {
    return this.d;
  }
  
  public ByteString.ByteIterator c()
  {
    return new BoundedByteString.BoundedByteIterator(this, null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.BoundedByteString
 * JD-Core Version:    0.7.0.1
 */