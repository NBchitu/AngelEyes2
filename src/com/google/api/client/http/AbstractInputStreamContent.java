package com.google.api.client.http;

import com.google.common.io.ByteStreams;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractInputStreamContent
  implements HttpContent
{
  private String a;
  private String b;
  private boolean c = true;
  
  public AbstractInputStreamContent(String paramString)
  {
    a(paramString);
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    a(paramInputStream, paramOutputStream, true);
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
  {
    try
    {
      ByteStreams.a(paramInputStream, paramOutputStream);
      return;
    }
    finally
    {
      if (paramBoolean) {
        paramInputStream.close();
      }
    }
  }
  
  public AbstractInputStreamContent a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public AbstractInputStreamContent a(boolean paramBoolean)
  {
    this.c = paramBoolean;
    return this;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    a(c(), paramOutputStream, this.c);
    paramOutputStream.flush();
  }
  
  public abstract InputStream c();
  
  public String e()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.AbstractInputStreamContent
 * JD-Core Version:    0.7.0.1
 */