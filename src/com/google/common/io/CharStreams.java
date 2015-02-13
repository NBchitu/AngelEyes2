package com.google.common.io;

import java.nio.CharBuffer;

public final class CharStreams
{
  public static long a(Readable paramReadable, Appendable paramAppendable)
  {
    CharBuffer localCharBuffer = CharBuffer.allocate(2048);
    long l = 0L;
    while (paramReadable.read(localCharBuffer) != -1)
    {
      localCharBuffer.flip();
      paramAppendable.append(localCharBuffer);
      l += localCharBuffer.remaining();
      localCharBuffer.clear();
    }
    return l;
  }
  
  public static String a(Readable paramReadable)
  {
    return b(paramReadable).toString();
  }
  
  private static StringBuilder b(Readable paramReadable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramReadable, localStringBuilder);
    return localStringBuilder;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.io.CharStreams
 * JD-Core Version:    0.7.0.1
 */