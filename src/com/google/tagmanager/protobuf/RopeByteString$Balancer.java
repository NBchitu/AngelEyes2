package com.google.tagmanager.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class RopeByteString$Balancer
{
  private final Deque<ByteString> a = new ArrayDeque(RopeByteString.b().length);
  
  private int a(int paramInt)
  {
    int i = Arrays.binarySearch(RopeByteString.b(), paramInt);
    if (i < 0) {
      i = -1 + -(i + 1);
    }
    return i;
  }
  
  private ByteString a(ByteString paramByteString1, ByteString paramByteString2)
  {
    a(paramByteString1);
    a(paramByteString2);
    for (Object localObject = (ByteString)this.a.pop(); !this.a.isEmpty(); localObject = new RopeByteString((ByteString)this.a.pop(), (ByteString)localObject, null)) {}
    return localObject;
  }
  
  private void a(ByteString paramByteString)
  {
    if (paramByteString.k())
    {
      b(paramByteString);
      return;
    }
    if ((paramByteString instanceof RopeByteString))
    {
      RopeByteString localRopeByteString = (RopeByteString)paramByteString;
      a(RopeByteString.a(localRopeByteString));
      a(RopeByteString.b(localRopeByteString));
      return;
    }
    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + paramByteString.getClass());
  }
  
  private void b(ByteString paramByteString)
  {
    int i = a(paramByteString.a());
    int j = RopeByteString.b()[(i + 1)];
    if ((this.a.isEmpty()) || (((ByteString)this.a.peek()).a() >= j))
    {
      this.a.push(paramByteString);
      return;
    }
    int k = RopeByteString.b()[i];
    for (Object localObject = (ByteString)this.a.pop(); (!this.a.isEmpty()) && (((ByteString)this.a.peek()).a() < k); localObject = new RopeByteString((ByteString)this.a.pop(), (ByteString)localObject, null)) {}
    for (RopeByteString localRopeByteString = new RopeByteString((ByteString)localObject, paramByteString, null); !this.a.isEmpty(); localRopeByteString = new RopeByteString((ByteString)this.a.pop(), localRopeByteString, null))
    {
      int m = a(localRopeByteString.a());
      int n = RopeByteString.b()[(m + 1)];
      if (((ByteString)this.a.peek()).a() >= n) {
        break;
      }
    }
    this.a.push(localRopeByteString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.RopeByteString.Balancer
 * JD-Core Version:    0.7.0.1
 */