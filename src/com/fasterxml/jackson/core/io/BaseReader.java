package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

abstract class BaseReader
  extends Reader
{
  protected final IOContext a;
  protected InputStream b;
  protected byte[] c;
  protected int d;
  protected int e;
  protected char[] f = null;
  
  protected BaseReader(IOContext paramIOContext, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramIOContext;
    this.b = paramInputStream;
    this.c = paramArrayOfByte;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final void a()
  {
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null)
    {
      this.c = null;
      this.a.a(arrayOfByte);
    }
  }
  
  protected void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    throw new ArrayIndexOutOfBoundsException("read(buf," + paramInt1 + "," + paramInt2 + "), cbuf[" + paramArrayOfChar.length + "]");
  }
  
  protected void b()
  {
    throw new IOException("Strange I/O stream, returned 0 bytes on read");
  }
  
  public void close()
  {
    InputStream localInputStream = this.b;
    if (localInputStream != null)
    {
      this.b = null;
      a();
      localInputStream.close();
    }
  }
  
  public int read()
  {
    if (this.f == null) {
      this.f = new char[1];
    }
    if (read(this.f, 0, 1) < 1) {
      return -1;
    }
    return this.f[0];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.io.BaseReader
 * JD-Core Version:    0.7.0.1
 */