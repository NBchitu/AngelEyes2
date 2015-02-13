package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.LinkedList;

public final class ByteArrayBuilder
  extends OutputStream
{
  private static final byte[] a = new byte[0];
  private final LinkedList<byte[]> b;
  private int c;
  private byte[] d;
  private int e;
  
  private void a()
  {
    int i = 262144;
    this.c += this.d.length;
    int j = Math.max(this.c >> 1, 1000);
    if (j > i) {}
    for (;;)
    {
      this.b.add(this.d);
      this.d = new byte[i];
      this.e = 0;
      return;
      i = j;
    }
  }
  
  public void a(int paramInt)
  {
    if (this.e >= this.d.length) {
      a();
    }
    byte[] arrayOfByte = this.d;
    int i = this.e;
    this.e = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
  }
  
  public void close() {}
  
  public void flush() {}
  
  public void write(int paramInt)
  {
    a(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int i = Math.min(this.d.length - this.e, paramInt2);
      if (i > 0)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, this.d, this.e, i);
        paramInt1 += i;
        this.e = (i + this.e);
        paramInt2 -= i;
      }
      if (paramInt2 <= 0) {
        return;
      }
      a();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.util.ByteArrayBuilder
 * JD-Core Version:    0.7.0.1
 */