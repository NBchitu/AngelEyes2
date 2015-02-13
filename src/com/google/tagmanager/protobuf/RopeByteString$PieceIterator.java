package com.google.tagmanager.protobuf;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

class RopeByteString$PieceIterator
  implements Iterator<LiteralByteString>
{
  private final Deque<RopeByteString> a = new ArrayDeque(RopeByteString.b().length);
  private LiteralByteString b = a(paramByteString);
  
  private RopeByteString$PieceIterator(ByteString paramByteString) {}
  
  private LiteralByteString a(ByteString paramByteString)
  {
    RopeByteString localRopeByteString;
    for (ByteString localByteString = paramByteString; (localByteString instanceof RopeByteString); localByteString = RopeByteString.a(localRopeByteString))
    {
      localRopeByteString = (RopeByteString)localByteString;
      this.a.push(localRopeByteString);
    }
    return (LiteralByteString)localByteString;
  }
  
  private LiteralByteString b()
  {
    LiteralByteString localLiteralByteString;
    do
    {
      if (this.a.isEmpty()) {
        return null;
      }
      localLiteralByteString = a(RopeByteString.b((RopeByteString)this.a.pop()));
    } while (localLiteralByteString.d());
    return localLiteralByteString;
  }
  
  public LiteralByteString a()
  {
    if (this.b == null) {
      throw new NoSuchElementException();
    }
    LiteralByteString localLiteralByteString = this.b;
    this.b = b();
    return localLiteralByteString;
  }
  
  public boolean hasNext()
  {
    return this.b != null;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.RopeByteString.PieceIterator
 * JD-Core Version:    0.7.0.1
 */