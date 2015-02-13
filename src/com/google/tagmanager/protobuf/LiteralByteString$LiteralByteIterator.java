package com.google.tagmanager.protobuf;

import java.util.NoSuchElementException;

class LiteralByteString$LiteralByteIterator
  implements ByteString.ByteIterator
{
  private int b = 0;
  private final int c;
  
  private LiteralByteString$LiteralByteIterator(LiteralByteString paramLiteralByteString)
  {
    this.c = paramLiteralByteString.a();
  }
  
  public Byte a()
  {
    return Byte.valueOf(b());
  }
  
  public byte b()
  {
    try
    {
      byte[] arrayOfByte = this.a.c;
      int i = this.b;
      this.b = (i + 1);
      byte b1 = arrayOfByte[i];
      return b1;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
    }
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
 * Qualified Name:     com.google.tagmanager.protobuf.LiteralByteString.LiteralByteIterator
 * JD-Core Version:    0.7.0.1
 */