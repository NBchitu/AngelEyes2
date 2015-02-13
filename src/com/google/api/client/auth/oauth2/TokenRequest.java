package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;
import com.google.common.base.Preconditions;

public class TokenRequest
  extends GenericData
{
  HttpRequestInitializer a;
  HttpExecuteInterceptor b;
  private final HttpTransport c;
  private final JsonFactory d;
  private GenericUrl e;
  @Key(a="grant_type")
  private String grantType;
  @Key(a="scope")
  private String scopes;
  
  public TokenRequest(HttpTransport paramHttpTransport, JsonFactory paramJsonFactory, GenericUrl paramGenericUrl, String paramString)
  {
    this.c = ((HttpTransport)Preconditions.a(paramHttpTransport));
    this.d = ((JsonFactory)Preconditions.a(paramJsonFactory));
    b(paramGenericUrl);
    c(paramString);
  }
  
  public final HttpResponse a()
  {
    HttpRequest localHttpRequest = this.c.a(new TokenRequest.1(this)).a(this.e, new UrlEncodedContent(this));
    localHttpRequest.a(new JsonObjectParser(this.d));
    localHttpRequest.b(false);
    HttpResponse localHttpResponse = localHttpRequest.n();
    if (localHttpResponse.c()) {
      return localHttpResponse;
    }
    throw TokenResponseException.a(this.d, localHttpResponse);
  }
  
  public TokenRequest b(GenericUrl paramGenericUrl)
  {
    this.e = paramGenericUrl;
    if (paramGenericUrl.b() == null) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      return this;
    }
  }
  
  public TokenRequest b(HttpExecuteInterceptor paramHttpExecuteInterceptor)
  {
    this.b = paramHttpExecuteInterceptor;
    return this;
  }
  
  public TokenRequest b(HttpRequestInitializer paramHttpRequestInitializer)
  {
    this.a = paramHttpRequestInitializer;
    return this;
  }
  
  public TokenResponse b()
  {
    return (TokenResponse)a().a(TokenResponse.class);
  }
  
  public TokenRequest c(String paramString)
  {
    this.grantType = ((String)Preconditions.a(paramString));
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.TokenRequest
 * JD-Core Version:    0.7.0.1
 */