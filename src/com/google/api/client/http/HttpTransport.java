package com.google.api.client.http;

import java.util.Arrays;
import java.util.logging.Logger;

public abstract class HttpTransport
{
  static final Logger a = Logger.getLogger(HttpTransport.class.getName());
  private static final String[] b = { "DELETE", "GET", "POST", "PUT" };
  
  static
  {
    Arrays.sort(b);
  }
  
  public final HttpRequestFactory a()
  {
    return a(null);
  }
  
  public final HttpRequestFactory a(HttpRequestInitializer paramHttpRequestInitializer)
  {
    return new HttpRequestFactory(this, paramHttpRequestInitializer);
  }
  
  protected LowLevelHttpRequest a(String paramString1, String paramString2)
  {
    throw new IllegalArgumentException("HTTP method " + paramString1 + " not supported");
  }
  
  public boolean a(String paramString)
  {
    return Arrays.binarySearch(b, paramString) >= 0;
  }
  
  HttpRequest b()
  {
    return new HttpRequest(this, null);
  }
  
  @Deprecated
  protected LowLevelHttpRequest b(String paramString)
  {
    return a("DELETE", paramString);
  }
  
  @Deprecated
  protected LowLevelHttpRequest c(String paramString)
  {
    return a("GET", paramString);
  }
  
  @Deprecated
  public boolean c()
  {
    return a("HEAD");
  }
  
  @Deprecated
  protected LowLevelHttpRequest d(String paramString)
  {
    return a("HEAD", paramString);
  }
  
  @Deprecated
  public boolean d()
  {
    return a("PATCH");
  }
  
  @Deprecated
  protected LowLevelHttpRequest e(String paramString)
  {
    return a("PATCH", paramString);
  }
  
  @Deprecated
  protected LowLevelHttpRequest f(String paramString)
  {
    return a("POST", paramString);
  }
  
  @Deprecated
  protected LowLevelHttpRequest g(String paramString)
  {
    return a("PUT", paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpTransport
 * JD-Core Version:    0.7.0.1
 */