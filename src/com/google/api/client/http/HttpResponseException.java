package com.google.api.client.http;

import com.google.api.client.util.StringUtils;
import java.io.IOException;

public class HttpResponseException
  extends IOException
{
  private final int a;
  private final String b;
  private final transient HttpHeaders c;
  
  public HttpResponseException(HttpResponse paramHttpResponse)
  {
    this(paramHttpResponse, b(paramHttpResponse));
  }
  
  public HttpResponseException(HttpResponse paramHttpResponse, String paramString)
  {
    super(paramString);
    this.a = paramHttpResponse.d();
    this.b = paramHttpResponse.e();
    this.c = paramHttpResponse.b();
  }
  
  public static StringBuilder a(HttpResponse paramHttpResponse)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramHttpResponse.d();
    if (i != 0) {
      localStringBuilder.append(i);
    }
    String str = paramHttpResponse.e();
    if (str != null)
    {
      if (i != 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder;
  }
  
  private static String b(HttpResponse paramHttpResponse)
  {
    StringBuilder localStringBuilder = a(paramHttpResponse);
    Object localObject = "";
    try
    {
      String str = paramHttpResponse.k();
      localObject = str;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
    if (((String)localObject).length() != 0) {
      localStringBuilder.append(StringUtils.a).append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  public final int b()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpResponseException
 * JD-Core Version:    0.7.0.1
 */