package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingInputStream
  extends FilterInputStream
{
  private final LoggingByteArrayOutputStream a;
  
  public LoggingInputStream(InputStream paramInputStream, Logger paramLogger, Level paramLevel, int paramInt)
  {
    super(paramInputStream);
    this.a = new LoggingByteArrayOutputStream(paramLogger, paramLevel, paramInt);
  }
  
  public void close()
  {
    this.a.close();
    super.close();
  }
  
  public int read()
  {
    int i = super.read();
    this.a.write(i);
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i > 0) {
      this.a.write(paramArrayOfByte, paramInt1, i);
    }
    return i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.LoggingInputStream
 * JD-Core Version:    0.7.0.1
 */