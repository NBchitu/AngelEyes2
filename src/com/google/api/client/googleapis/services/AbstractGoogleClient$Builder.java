package com.google.api.client.googleapis.services;

import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.ObjectParser;
import com.google.common.base.Preconditions;

public abstract class AbstractGoogleClient$Builder
{
  private final HttpTransport a;
  private GoogleClientRequestInitializer b;
  private HttpRequestInitializer c;
  private final ObjectParser d;
  private String e;
  private String f;
  private String g;
  private boolean h;
  
  protected AbstractGoogleClient$Builder(HttpTransport paramHttpTransport, String paramString1, String paramString2, ObjectParser paramObjectParser, HttpRequestInitializer paramHttpRequestInitializer)
  {
    this.a = ((HttpTransport)Preconditions.a(paramHttpTransport));
    this.d = ((ObjectParser)Preconditions.a(paramObjectParser));
    a(paramString1);
    b(paramString2);
    this.c = paramHttpRequestInitializer;
  }
  
  public Builder a(GoogleClientRequestInitializer paramGoogleClientRequestInitializer)
  {
    this.b = paramGoogleClientRequestInitializer;
    return this;
  }
  
  public Builder a(String paramString)
  {
    this.e = AbstractGoogleClient.a(paramString);
    return this;
  }
  
  public final HttpTransport a()
  {
    return this.a;
  }
  
  public Builder b(String paramString)
  {
    this.f = AbstractGoogleClient.b(paramString);
    return this;
  }
  
  public ObjectParser b()
  {
    return this.d;
  }
  
  public Builder c(String paramString)
  {
    this.g = paramString;
    return this;
  }
  
  public final String c()
  {
    return this.e;
  }
  
  public final String d()
  {
    return this.f;
  }
  
  public final GoogleClientRequestInitializer e()
  {
    return this.b;
  }
  
  public final HttpRequestInitializer f()
  {
    return this.c;
  }
  
  public final String g()
  {
    return this.g;
  }
  
  public final boolean h()
  {
    return this.h;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
 * JD-Core Version:    0.7.0.1
 */