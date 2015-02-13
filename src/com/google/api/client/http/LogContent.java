package com.google.api.client.http;

import com.google.api.client.util.LoggingByteArrayOutputStream;
import com.google.api.client.util.LoggingOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;

final class LogContent
  implements HttpContent
{
  private final HttpContent a;
  private final String b;
  private final String c;
  private final long d;
  private final int e;
  
  LogContent(HttpContent paramHttpContent, String paramString1, String paramString2, long paramLong, int paramInt)
  {
    this.a = paramHttpContent;
    this.b = paramString1;
    this.d = paramLong;
    this.c = paramString2;
    this.e = paramInt;
  }
  
  public String a()
  {
    return this.c;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    LoggingOutputStream localLoggingOutputStream = new LoggingOutputStream(paramOutputStream, HttpTransport.a, Level.CONFIG, this.e);
    try
    {
      this.a.a(localLoggingOutputStream);
      localLoggingOutputStream.a().close();
      paramOutputStream.flush();
      return;
    }
    finally
    {
      localLoggingOutputStream.a().close();
    }
  }
  
  public long b()
  {
    return this.d;
  }
  
  public String e()
  {
    return this.b;
  }
  
  public boolean g()
  {
    return this.a.g();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.LogContent
 * JD-Core Version:    0.7.0.1
 */