package com.google.api.client.http;

import com.google.api.client.util.LoggingInputStream;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.StringUtils;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

public final class HttpResponse
{
  LowLevelHttpResponse a;
  private InputStream b;
  private final String c;
  private final String d;
  private final HttpMediaType e;
  private final HttpHeaders f;
  private final int g;
  private final String h;
  private final HttpTransport i;
  private final HttpRequest j;
  private int k;
  private boolean l;
  private boolean m;
  
  HttpResponse(HttpRequest paramHttpRequest, LowLevelHttpResponse paramLowLevelHttpResponse)
  {
    this.j = paramHttpRequest;
    this.i = paramHttpRequest.a();
    this.f = paramHttpRequest.i();
    this.k = paramHttpRequest.f();
    this.l = paramHttpRequest.g();
    this.a = paramLowLevelHttpResponse;
    this.c = paramLowLevelHttpResponse.b();
    int n = paramLowLevelHttpResponse.e();
    this.g = n;
    String str1 = paramLowLevelHttpResponse.f();
    this.h = str1;
    Logger localLogger = HttpTransport.a;
    int i1;
    StringBuilder localStringBuilder1;
    if ((this.l) && (localLogger.isLoggable(Level.CONFIG)))
    {
      i1 = 1;
      if (i1 == 0) {
        break label291;
      }
      localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("-------------- RESPONSE --------------").append(StringUtils.a);
      String str2 = paramLowLevelHttpResponse.d();
      if (str2 == null) {
        break label243;
      }
      localStringBuilder1.append(str2);
      label149:
      localStringBuilder1.append(StringUtils.a);
    }
    for (;;)
    {
      HttpHeaders localHttpHeaders = this.f;
      StringBuilder localStringBuilder2;
      label173:
      String str3;
      HttpMediaType localHttpMediaType;
      if (i1 != 0)
      {
        localStringBuilder2 = localStringBuilder1;
        localHttpHeaders.a(paramLowLevelHttpResponse, localStringBuilder2);
        str3 = paramLowLevelHttpResponse.c();
        if (str3 == null) {
          str3 = this.f.c();
        }
        this.d = str3;
        localHttpMediaType = null;
        if (str3 != null) {
          break label277;
        }
      }
      for (;;)
      {
        this.e = localHttpMediaType;
        if (i1 != 0) {
          localLogger.config(localStringBuilder1.toString());
        }
        return;
        i1 = 0;
        break;
        label243:
        localStringBuilder1.append(n);
        if (str1 == null) {
          break label149;
        }
        localStringBuilder1.append(' ').append(str1);
        break label149;
        localStringBuilder2 = null;
        break label173;
        label277:
        localHttpMediaType = new HttpMediaType(str3);
      }
      label291:
      localStringBuilder1 = null;
    }
  }
  
  private boolean m()
  {
    if (f().c().equals("HEAD")) {}
    int n;
    do
    {
      return false;
      n = d();
    } while ((n / 100 == 1) || (n == 204) || (n == 304));
    return true;
  }
  
  public <T> T a(Class<T> paramClass)
  {
    if (!m()) {
      return null;
    }
    ObjectParser localObjectParser = this.j.k();
    if (localObjectParser != null) {
      return localObjectParser.a(g(), l(), paramClass);
    }
    HttpParser localHttpParser = j();
    if (localHttpParser == null)
    {
      h();
      if (this.d != null) {}
      for (boolean bool = true;; bool = false)
      {
        Preconditions.a(bool, "Missing Content-Type header in response");
        throw new IllegalArgumentException("No parser defined for Content-Type: " + this.d);
      }
    }
    return localHttpParser.a(this, paramClass);
  }
  
  public String a()
  {
    return this.d;
  }
  
  public HttpHeaders b()
  {
    return this.f;
  }
  
  public boolean c()
  {
    return HttpStatusCodes.a(this.g);
  }
  
  public int d()
  {
    return this.g;
  }
  
  public String e()
  {
    return this.h;
  }
  
  public HttpRequest f()
  {
    return this.j;
  }
  
  public InputStream g()
  {
    Object localObject1;
    if (!this.m)
    {
      localObject1 = this.a.a();
      if (localObject1 == null) {}
    }
    try
    {
      String str = this.c;
      if ((str != null) && (str.contains("gzip"))) {
        localObject1 = new GZIPInputStream((InputStream)localObject1);
      }
      Logger localLogger = HttpTransport.a;
      if ((this.l) && (localLogger.isLoggable(Level.CONFIG))) {
        localObject1 = new LoggingInputStream((InputStream)localObject1, localLogger, Level.CONFIG, this.k);
      }
      this.b = ((InputStream)localObject1);
      this.m = true;
      return this.b;
    }
    finally
    {
      ((InputStream)localObject1).close();
    }
  }
  
  public void h()
  {
    InputStream localInputStream = g();
    if (localInputStream != null) {
      localInputStream.close();
    }
  }
  
  public void i()
  {
    h();
    this.a.h();
  }
  
  @Deprecated
  public HttpParser j()
  {
    return this.j.b(this.d);
  }
  
  public String k()
  {
    InputStream localInputStream = g();
    if (localInputStream == null) {
      return "";
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    AbstractInputStreamContent.a(localInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toString(l().name());
  }
  
  public Charset l()
  {
    if ((this.e == null) || (this.e.d() == null)) {
      return Charsets.b;
    }
    return this.e.d();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpResponse
 * JD-Core Version:    0.7.0.1
 */