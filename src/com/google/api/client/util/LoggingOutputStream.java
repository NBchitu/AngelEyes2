package com.google.api.client.util;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingOutputStream
  extends FilterOutputStream
{
  private final LoggingByteArrayOutputStream a;
  
  public LoggingOutputStream(OutputStream paramOutputStream, Logger paramLogger, Level paramLevel, int paramInt)
  {
    super(paramOutputStream);
    this.a = new LoggingByteArrayOutputStream(paramLogger, paramLevel, paramInt);
  }
  
  public final LoggingByteArrayOutputStream a()
  {
    return this.a;
  }
  
  public void close()
  {
    this.a.close();
    super.close();
  }
  
  public void write(int paramInt)
  {
    this.out.write(paramInt);
    this.a.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.LoggingOutputStream
 * JD-Core Version:    0.7.0.1
 */