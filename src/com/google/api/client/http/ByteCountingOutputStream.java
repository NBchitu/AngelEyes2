package com.google.api.client.http;

import java.io.OutputStream;

final class ByteCountingOutputStream
  extends OutputStream
{
  long a;
  
  public void write(int paramInt)
  {
    this.a = (1L + this.a);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a += paramInt2;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.ByteCountingOutputStream
 * JD-Core Version:    0.7.0.1
 */