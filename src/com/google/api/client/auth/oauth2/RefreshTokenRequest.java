package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;
import com.google.common.base.Preconditions;

public class RefreshTokenRequest
  extends TokenRequest
{
  @Key(a="refresh_token")
  private String refreshToken;
  
  public RefreshTokenRequest(HttpTransport paramHttpTransport, JsonFactory paramJsonFactory, GenericUrl paramGenericUrl, String paramString)
  {
    super(paramHttpTransport, paramJsonFactory, paramGenericUrl, "refresh_token");
    b(paramString);
  }
  
  public RefreshTokenRequest a(GenericUrl paramGenericUrl)
  {
    return (RefreshTokenRequest)super.b(paramGenericUrl);
  }
  
  public RefreshTokenRequest a(HttpExecuteInterceptor paramHttpExecuteInterceptor)
  {
    return (RefreshTokenRequest)super.b(paramHttpExecuteInterceptor);
  }
  
  public RefreshTokenRequest a(HttpRequestInitializer paramHttpRequestInitializer)
  {
    return (RefreshTokenRequest)super.b(paramHttpRequestInitializer);
  }
  
  public RefreshTokenRequest a(String paramString)
  {
    return (RefreshTokenRequest)super.c(paramString);
  }
  
  public RefreshTokenRequest b(String paramString)
  {
    this.refreshToken = ((String)Preconditions.a(paramString));
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.RefreshTokenRequest
 * JD-Core Version:    0.7.0.1
 */