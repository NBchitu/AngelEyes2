package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class LimitInputStream
  extends FilterInputStream
{
  private long a;
  private long b = -1L;
  
  public LimitInputStream(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    Preconditions.a(paramInputStream);
    if (paramLong >= 0L) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool, "limit must be non-negative");
      this.a = paramLong;
      return;
    }
  }
  
  public int available()
  {
    return (int)Math.min(this.in.available(), this.a);
  }
  
  public void mark(int paramInt)
  {
    try
    {
      this.in.mark(paramInt);
      this.b = this.a;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int read()
  {
    if (this.a == 0L) {
      return -1;
    }
    int i = this.in.read();
    if (i != -1) {
      this.a -= 1L;
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.a == 0L) {
      return -1;
    }
    int i = (int)Math.min(paramInt2, this.a);
    int j = this.in.read(paramArrayOfByte, paramInt1, i);
    if (j != -1) {
      this.a -= j;
    }
    return j;
  }
  
  public void reset()
  {
    try
    {
      if (!this.in.markSupported()) {
        throw new IOException("Mark not supported");
      }
    }
    finally {}
    if (this.b == -1L) {
      throw new IOException("Mark not set");
    }
    this.in.reset();
    this.a = this.b;
  }
  
  public long skip(long paramLong)
  {
    long l1 = Math.min(paramLong, this.a);
    long l2 = this.in.skip(l1);
    this.a -= l2;
    return l2;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.io.LimitInputStream
 * JD-Core Version:    0.7.0.1
 */