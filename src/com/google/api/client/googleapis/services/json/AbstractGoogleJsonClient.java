package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.json.JsonCParser;
import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;

public abstract class AbstractGoogleJsonClient
  extends AbstractGoogleClient
{
  protected AbstractGoogleJsonClient(HttpTransport paramHttpTransport, HttpRequestInitializer paramHttpRequestInitializer, String paramString1, String paramString2, JsonObjectParser paramJsonObjectParser, GoogleClientRequestInitializer paramGoogleClientRequestInitializer, String paramString3, boolean paramBoolean)
  {
    super(paramHttpTransport, paramHttpRequestInitializer, paramString1, paramString2, paramJsonObjectParser, paramGoogleClientRequestInitializer, paramString3, paramBoolean);
  }
  
  static JsonObjectParser a(JsonFactory paramJsonFactory, boolean paramBoolean)
  {
    if (paramBoolean) {
      return new JsonCParser(paramJsonFactory);
    }
    return new JsonObjectParser(paramJsonFactory);
  }
  
  public JsonObjectParser g()
  {
    return (JsonObjectParser)super.f();
  }
  
  public final JsonFactory h()
  {
    return g().a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
 * JD-Core Version:    0.7.0.1
 */