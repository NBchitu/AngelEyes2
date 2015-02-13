package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class JacksonFactory
  extends com.google.api.client.json.JsonFactory
{
  private final com.fasterxml.jackson.core.JsonFactory a = new com.fasterxml.jackson.core.JsonFactory();
  
  public JacksonFactory()
  {
    this.a.a(JsonGenerator.Feature.b, false);
  }
  
  static com.google.api.client.json.JsonToken a(com.fasterxml.jackson.core.JsonToken paramJsonToken)
  {
    if (paramJsonToken == null) {
      return null;
    }
    switch (JacksonFactory.1.a[paramJsonToken.ordinal()])
    {
    default: 
      return com.google.api.client.json.JsonToken.l;
    case 1: 
      return com.google.api.client.json.JsonToken.b;
    case 2: 
      return com.google.api.client.json.JsonToken.a;
    case 3: 
      return com.google.api.client.json.JsonToken.d;
    case 4: 
      return com.google.api.client.json.JsonToken.c;
    case 5: 
      return com.google.api.client.json.JsonToken.j;
    case 6: 
      return com.google.api.client.json.JsonToken.i;
    case 7: 
      return com.google.api.client.json.JsonToken.k;
    case 8: 
      return com.google.api.client.json.JsonToken.f;
    case 9: 
      return com.google.api.client.json.JsonToken.h;
    case 10: 
      return com.google.api.client.json.JsonToken.g;
    }
    return com.google.api.client.json.JsonToken.e;
  }
  
  public JsonGenerator a(OutputStream paramOutputStream, Charset paramCharset)
  {
    return new JacksonGenerator(this, this.a.a(paramOutputStream, JsonEncoding.a));
  }
  
  public JsonParser a(InputStream paramInputStream)
  {
    Preconditions.a(paramInputStream);
    return new JacksonParser(this, this.a.a(paramInputStream));
  }
  
  public JsonParser a(InputStream paramInputStream, Charset paramCharset)
  {
    Preconditions.a(paramInputStream);
    return new JacksonParser(this, this.a.a(paramInputStream));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.jackson2.JacksonFactory
 * JD-Core Version:    0.7.0.1
 */