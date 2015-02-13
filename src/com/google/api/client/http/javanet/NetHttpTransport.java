package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpTransport;
import com.google.common.base.Preconditions;
import java.util.Arrays;

public final class NetHttpTransport
  extends HttpTransport
{
  private static final String[] b = { "DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE" };
  
  static
  {
    Arrays.sort(b);
  }
  
  public boolean a(String paramString)
  {
    return Arrays.binarySearch(b, paramString) >= 0;
  }
  
  protected NetHttpRequest b(String paramString1, String paramString2)
  {
    Preconditions.a(a(paramString1), "HTTP method %s not supported", new Object[] { paramString1 });
    return new NetHttpRequest(paramString1, paramString2);
  }
  
  @Deprecated
  public boolean c()
  {
    return true;
  }
  
  @Deprecated
  public NetHttpRequest h(String paramString)
  {
    return b("DELETE", paramString);
  }
  
  @Deprecated
  public NetHttpRequest i(String paramString)
  {
    return b("GET", paramString);
  }
  
  @Deprecated
  public NetHttpRequest j(String paramString)
  {
    return b("HEAD", paramString);
  }
  
  @Deprecated
  public NetHttpRequest k(String paramString)
  {
    return b("POST", paramString);
  }
  
  @Deprecated
  public NetHttpRequest l(String paramString)
  {
    return b("PUT", paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.javanet.NetHttpTransport
 * JD-Core Version:    0.7.0.1
 */