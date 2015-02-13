package com.google.api.client.http;

import com.google.common.base.Charsets;
import java.nio.charset.Charset;

public abstract class AbstractHttpContent
  implements HttpContent
{
  private HttpMediaType a;
  private long b = -1L;
  
  protected AbstractHttpContent(HttpMediaType paramHttpMediaType)
  {
    this.a = paramHttpMediaType;
  }
  
  protected AbstractHttpContent(String paramString) {}
  
  public String a()
  {
    return null;
  }
  
  public long b()
  {
    if (this.b == -1L) {
      this.b = f();
    }
    return this.b;
  }
  
  public final HttpMediaType c()
  {
    return this.a;
  }
  
  protected final Charset d()
  {
    if ((this.a == null) || (this.a.d() == null)) {
      return Charsets.c;
    }
    return this.a.d();
  }
  
  public String e()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.c();
  }
  
  protected long f()
  {
    if (!g()) {
      return -1L;
    }
    ByteCountingOutputStream localByteCountingOutputStream = new ByteCountingOutputStream();
    try
    {
      a(localByteCountingOutputStream);
      return localByteCountingOutputStream.a;
    }
    finally
    {
      localByteCountingOutputStream.close();
    }
  }
  
  public boolean g()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.AbstractHttpContent
 * JD-Core Version:    0.7.0.1
 */