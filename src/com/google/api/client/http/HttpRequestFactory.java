package com.google.api.client.http;

public final class HttpRequestFactory
{
  private final HttpTransport a;
  private final HttpRequestInitializer b;
  
  HttpRequestFactory(HttpTransport paramHttpTransport, HttpRequestInitializer paramHttpRequestInitializer)
  {
    this.a = paramHttpTransport;
    this.b = paramHttpRequestInitializer;
  }
  
  public HttpRequest a(GenericUrl paramGenericUrl)
  {
    return a("GET", paramGenericUrl, null);
  }
  
  public HttpRequest a(GenericUrl paramGenericUrl, HttpContent paramHttpContent)
  {
    return a("POST", paramGenericUrl, paramHttpContent);
  }
  
  public HttpRequest a(String paramString, GenericUrl paramGenericUrl, HttpContent paramHttpContent)
  {
    HttpRequest localHttpRequest = this.a.b();
    if (this.b != null) {
      this.b.b(localHttpRequest);
    }
    localHttpRequest.a(paramString);
    if (paramGenericUrl != null) {
      localHttpRequest.a(paramGenericUrl);
    }
    if (paramHttpContent != null) {
      localHttpRequest.a(paramHttpContent);
    }
    return localHttpRequest;
  }
  
  public HttpTransport a()
  {
    return this.a;
  }
  
  public HttpRequest b(GenericUrl paramGenericUrl, HttpContent paramHttpContent)
  {
    return a("PUT", paramGenericUrl, paramHttpContent);
  }
  
  public HttpRequestInitializer b()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpRequestFactory
 * JD-Core Version:    0.7.0.1
 */