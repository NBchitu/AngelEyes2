package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClient.Builder;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;

public abstract class AbstractGoogleJsonClient$Builder
  extends AbstractGoogleClient.Builder
{
  protected AbstractGoogleJsonClient$Builder(HttpTransport paramHttpTransport, JsonFactory paramJsonFactory, String paramString1, String paramString2, HttpRequestInitializer paramHttpRequestInitializer, boolean paramBoolean)
  {
    super(paramHttpTransport, paramString1, paramString2, AbstractGoogleJsonClient.a(paramJsonFactory, paramBoolean), paramHttpRequestInitializer);
  }
  
  public Builder b(GoogleClientRequestInitializer paramGoogleClientRequestInitializer)
  {
    return (Builder)super.a(paramGoogleClientRequestInitializer);
  }
  
  public Builder d(String paramString)
  {
    return (Builder)super.a(paramString);
  }
  
  public Builder e(String paramString)
  {
    return (Builder)super.b(paramString);
  }
  
  public Builder f(String paramString)
  {
    return (Builder)super.c(paramString);
  }
  
  public final JsonObjectParser i()
  {
    return (JsonObjectParser)super.b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
 * JD-Core Version:    0.7.0.1
 */