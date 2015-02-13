package com.fasterxml.jackson.core.util;

public class BufferRecycler
{
  protected final byte[][] a = new byte[BufferRecycler.ByteBufferType.values().length][];
  protected final char[][] b = new char[BufferRecycler.CharBufferType.values().length][];
  
  private final byte[] a(int paramInt)
  {
    return new byte[paramInt];
  }
  
  private final char[] b(int paramInt)
  {
    return new char[paramInt];
  }
  
  public final void a(BufferRecycler.ByteBufferType paramByteBufferType, byte[] paramArrayOfByte)
  {
    this.a[paramByteBufferType.ordinal()] = paramArrayOfByte;
  }
  
  public final void a(BufferRecycler.CharBufferType paramCharBufferType, char[] paramArrayOfChar)
  {
    this.b[paramCharBufferType.ordinal()] = paramArrayOfChar;
  }
  
  public final byte[] a(BufferRecycler.ByteBufferType paramByteBufferType)
  {
    int i = paramByteBufferType.ordinal();
    byte[] arrayOfByte = this.a[i];
    if (arrayOfByte == null) {
      return a(BufferRecycler.ByteBufferType.a(paramByteBufferType));
    }
    this.a[i] = null;
    return arrayOfByte;
  }
  
  public final char[] a(BufferRecycler.CharBufferType paramCharBufferType)
  {
    return a(paramCharBufferType, 0);
  }
  
  public final char[] a(BufferRecycler.CharBufferType paramCharBufferType, int paramInt)
  {
    if (BufferRecycler.CharBufferType.a(paramCharBufferType) > paramInt) {
      paramInt = BufferRecycler.CharBufferType.a(paramCharBufferType);
    }
    int i = paramCharBufferType.ordinal();
    char[] arrayOfChar = this.b[i];
    if ((arrayOfChar == null) || (arrayOfChar.length < paramInt)) {
      return b(paramInt);
    }
    this.b[i] = null;
    return arrayOfChar;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.util.BufferRecycler
 * JD-Core Version:    0.7.0.1
 */