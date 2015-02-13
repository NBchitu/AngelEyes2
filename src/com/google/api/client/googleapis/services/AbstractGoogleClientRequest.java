package com.google.api.client.googleapis.services;

import com.google.api.client.googleapis.GoogleHeaders;
import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.UriTemplate;
import com.google.api.client.util.GenericData;
import com.google.common.base.Preconditions;
import java.io.IOException;

public abstract class AbstractGoogleClientRequest<T>
  extends GenericData
{
  private final AbstractGoogleClient a;
  private final String b;
  private final String c;
  private final HttpContent d;
  private HttpHeaders e = new HttpHeaders();
  private HttpHeaders f;
  private int g = -1;
  private String h;
  private boolean i;
  private Class<T> j;
  private MediaHttpUploader k;
  
  protected AbstractGoogleClientRequest(AbstractGoogleClient paramAbstractGoogleClient, String paramString1, String paramString2, HttpContent paramHttpContent, Class<T> paramClass)
  {
    this.j = ((Class)Preconditions.a(paramClass));
    this.a = ((AbstractGoogleClient)Preconditions.a(paramAbstractGoogleClient));
    this.b = ((String)Preconditions.a(paramString1));
    this.c = ((String)Preconditions.a(paramString2));
    this.d = paramHttpContent;
    String str = paramAbstractGoogleClient.c();
    if (str != null) {
      this.e.d(str);
    }
  }
  
  private HttpRequest a(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label34:
    String str;
    label47:
    HttpRequest localHttpRequest;
    if (this.k == null)
    {
      bool2 = bool1;
      Preconditions.a(bool2);
      if ((paramBoolean) && (!this.b.equals("GET"))) {
        break label184;
      }
      bool3 = bool1;
      Preconditions.a(bool3);
      if (!paramBoolean) {
        break label190;
      }
      str = "HEAD";
      localHttpRequest = a().d().a(str, b(), this.d);
      new MethodOverride().a(localHttpRequest);
      localHttpRequest.a(a().f());
      if ((this.d == null) && ((this.b.equals("POST")) || (this.b.equals("PUT")) || (this.b.equals("PATCH")))) {
        localHttpRequest.a(new EmptyContent());
      }
      localHttpRequest.h().putAll(this.e);
      if (this.i) {
        break label199;
      }
    }
    for (;;)
    {
      localHttpRequest.a(bool1);
      return localHttpRequest;
      bool2 = false;
      break;
      label184:
      bool3 = false;
      break label34;
      label190:
      str = this.b;
      break label47;
      label199:
      bool1 = false;
    }
  }
  
  private HttpResponse b(boolean paramBoolean)
  {
    boolean bool3;
    HttpResponse localHttpResponse;
    if (this.k == null)
    {
      HttpRequest localHttpRequest = a(paramBoolean);
      bool3 = localHttpRequest.m();
      localHttpRequest.b(false);
      localHttpResponse = localHttpRequest.n();
    }
    for (;;)
    {
      this.f = localHttpResponse.b();
      this.g = localHttpResponse.d();
      this.h = localHttpResponse.e();
      if ((!bool3) || (localHttpResponse.c())) {
        break;
      }
      throw a(localHttpResponse);
      boolean bool1 = this.i;
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      Preconditions.a(bool2);
      GenericUrl localGenericUrl = b();
      bool3 = a().d().a(this.b, localGenericUrl, this.d).m();
      this.k.a(new GoogleHeaders(this.e));
      localHttpResponse = this.k.a(localGenericUrl);
      localHttpResponse.f().a(a().f());
    }
    return localHttpResponse;
  }
  
  public AbstractGoogleClient a()
  {
    return this.a;
  }
  
  protected IOException a(HttpResponse paramHttpResponse)
  {
    return new HttpResponseException(paramHttpResponse);
  }
  
  protected final void a(AbstractInputStreamContent paramAbstractInputStreamContent)
  {
    HttpRequestFactory localHttpRequestFactory = this.a.d();
    this.k = new MediaHttpUploader(paramAbstractInputStreamContent, localHttpRequestFactory.a(), localHttpRequestFactory.b());
    this.k.a(this.b);
    if (this.d != null) {
      this.k.a(this.d);
    }
  }
  
  public GenericUrl b()
  {
    return new GenericUrl(UriTemplate.a(this.a.b(), this.c, this, true));
  }
  
  public HttpResponse c()
  {
    return b(false);
  }
  
  public T d()
  {
    HttpResponse localHttpResponse = c();
    if (Void.class.equals(this.j))
    {
      localHttpResponse.h();
      return null;
    }
    return localHttpResponse.a(this.j);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.AbstractGoogleClientRequest
 * JD-Core Version:    0.7.0.1
 */