package com.google.api.client.http;

import java.io.OutputStream;

public class EmptyContent
  implements HttpContent
{
  public String a()
  {
    return null;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    paramOutputStream.flush();
  }
  
  public long b()
  {
    return 0L;
  }
  
  public String e()
  {
    return null;
  }
  
  public boolean g()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.EmptyContent
 * JD-Core Version:    0.7.0.1
 */