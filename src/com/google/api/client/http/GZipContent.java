package com.google.api.client.http;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

final class GZipContent
  extends AbstractHttpContent
{
  private final HttpContent a;
  
  GZipContent(HttpContent paramHttpContent, String paramString)
  {
    super(paramString);
    this.a = paramHttpContent;
  }
  
  public String a()
  {
    return "gzip";
  }
  
  public void a(OutputStream paramOutputStream)
  {
    GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(paramOutputStream);
    this.a.a(localGZIPOutputStream);
    localGZIPOutputStream.close();
  }
  
  public boolean g()
  {
    return this.a.g();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.GZipContent
 * JD-Core Version:    0.7.0.1
 */