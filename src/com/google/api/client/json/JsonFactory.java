package com.google.api.client.json;

import com.google.common.base.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public abstract class JsonFactory
{
  private String a(Object paramObject, boolean paramBoolean)
  {
    return b(paramObject, paramBoolean).toString("UTF-8");
  }
  
  private ByteArrayOutputStream b(Object paramObject, boolean paramBoolean)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    JsonGenerator localJsonGenerator = a(localByteArrayOutputStream, Charsets.c);
    if (paramBoolean) {
      localJsonGenerator.g();
    }
    localJsonGenerator.a(paramObject);
    localJsonGenerator.a();
    return localByteArrayOutputStream;
  }
  
  public abstract JsonGenerator a(OutputStream paramOutputStream, Charset paramCharset);
  
  public abstract JsonParser a(InputStream paramInputStream);
  
  public abstract JsonParser a(InputStream paramInputStream, Charset paramCharset);
  
  public final String a(Object paramObject)
  {
    return a(paramObject, false);
  }
  
  public final String b(Object paramObject)
  {
    return a(paramObject, true);
  }
  
  public final byte[] c(Object paramObject)
  {
    return b(paramObject, false).toByteArray();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.JsonFactory
 * JD-Core Version:    0.7.0.1
 */