package com.google.api.client.json;

import com.google.api.client.util.ObjectParser;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public class JsonObjectParser
  implements ObjectParser
{
  private final JsonFactory a;
  
  public JsonObjectParser(JsonFactory paramJsonFactory)
  {
    this.a = ((JsonFactory)Preconditions.a(paramJsonFactory));
  }
  
  public final JsonFactory a()
  {
    return this.a;
  }
  
  public <T> T a(InputStream paramInputStream, Charset paramCharset, Class<T> paramClass)
  {
    return a(paramInputStream, paramCharset, paramClass);
  }
  
  public Object a(InputStream paramInputStream, Charset paramCharset, Type paramType)
  {
    return this.a.a(paramInputStream, paramCharset).a(paramType, true, null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.JsonObjectParser
 * JD-Core Version:    0.7.0.1
 */