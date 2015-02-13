package com.google.api.client.googleapis.services;

import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.ObjectParser;
import com.google.common.base.Preconditions;
import java.util.logging.Logger;

public abstract class AbstractGoogleClient
{
  static final Logger a = Logger.getLogger(AbstractGoogleClient.class.getName());
  private final HttpRequestFactory b;
  private final GoogleClientRequestInitializer c;
  private final String d;
  private final String e;
  private final String f;
  private final ObjectParser g;
  private boolean h;
  
  protected AbstractGoogleClient(HttpTransport paramHttpTransport, HttpRequestInitializer paramHttpRequestInitializer, String paramString1, String paramString2, ObjectParser paramObjectParser, GoogleClientRequestInitializer paramGoogleClientRequestInitializer, String paramString3, boolean paramBoolean)
  {
    this.c = paramGoogleClientRequestInitializer;
    this.d = a(paramString1);
    this.e = b(paramString2);
    this.f = paramString3;
    if (paramHttpRequestInitializer == null) {}
    for (HttpRequestFactory localHttpRequestFactory = paramHttpTransport.a();; localHttpRequestFactory = paramHttpTransport.a(paramHttpRequestInitializer))
    {
      this.b = localHttpRequestFactory;
      this.g = paramObjectParser;
      this.h = paramBoolean;
      return;
    }
  }
  
  static String a(String paramString)
  {
    Preconditions.a(paramString, "root URL cannot be null.");
    if (!paramString.endsWith("/")) {
      paramString = paramString + "/";
    }
    return paramString;
  }
  
  static String b(String paramString)
  {
    Preconditions.a(paramString, "service path cannot be null");
    if (paramString.length() == 1)
    {
      Preconditions.a("/".equals(paramString), "service path must equal \"/\" if it is of length 1.");
      paramString = "";
    }
    do
    {
      do
      {
        return paramString;
      } while (paramString.length() <= 0);
      if (!paramString.endsWith("/")) {
        paramString = paramString + "/";
      }
    } while (!paramString.startsWith("/"));
    return paramString.substring(1);
  }
  
  public final String a()
  {
    return this.e;
  }
  
  protected void a(AbstractGoogleClientRequest<?> paramAbstractGoogleClientRequest)
  {
    if (e() != null) {
      e().a(paramAbstractGoogleClientRequest);
    }
  }
  
  public final String b()
  {
    return this.d + this.e;
  }
  
  public final String c()
  {
    return this.f;
  }
  
  public final HttpRequestFactory d()
  {
    return this.b;
  }
  
  public final GoogleClientRequestInitializer e()
  {
    return this.c;
  }
  
  public ObjectParser f()
  {
    return this.g;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.AbstractGoogleClient
 * JD-Core Version:    0.7.0.1
 */