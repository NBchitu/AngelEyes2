package com.google.tagmanager.protobuf;

import java.util.NoSuchElementException;

class BoundedByteString$BoundedByteIterator
  implements ByteString.ByteIterator
{
  private int b;
  private final int c;
  
  private BoundedByteString$BoundedByteIterator(BoundedByteString paramBoundedByteString)
  {
    this.b = paramBoundedByteString.b();
    this.c = (this.b + paramBoundedByteString.a());
  }
  
  public Byte a()
  {
    return Byte.valueOf(b());
  }
  
  public byte b()
  {
    if (this.b >= this.c) {
      throw new NoSuchElementException();
    }
    byte[] arrayOfByte = this.a.c;
    int i = this.b;
    this.b = (i + 1);
    return arrayOfByte[i];
  }
  
  public boolean hasNext()
  {
    return this.b < this.c;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.BoundedByteString.BoundedByteIterator
 * JD-Core Version:    0.7.0.1
 */