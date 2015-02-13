package com.google.tagmanager.protobuf;

class RopeByteString$RopeByteIterator
  implements ByteString.ByteIterator
{
  int a;
  private final RopeByteString.PieceIterator c;
  private ByteString.ByteIterator d;
  
  private RopeByteString$RopeByteIterator(RopeByteString paramRopeByteString)
  {
    this.c = new RopeByteString.PieceIterator(paramRopeByteString, null);
    this.d = this.c.a().c();
    this.a = paramRopeByteString.a();
  }
  
  public Byte a()
  {
    return Byte.valueOf(b());
  }
  
  public byte b()
  {
    if (!this.d.hasNext()) {
      this.d = this.c.a().c();
    }
    this.a = (-1 + this.a);
    return this.d.b();
  }
  
  public boolean hasNext()
  {
    return this.a > 0;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.RopeByteString.RopeByteIterator
 * JD-Core Version:    0.7.0.1
 */