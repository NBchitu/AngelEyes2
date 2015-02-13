package com.google.api.client.googleapis.json;

import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import java.io.OutputStream;

public final class JsonCContent
  extends JsonHttpContent
{
  public JsonCContent(JsonFactory paramJsonFactory, Object paramObject)
  {
    super(paramJsonFactory, paramObject);
  }
  
  public void a(OutputStream paramOutputStream)
  {
    JsonGenerator localJsonGenerator = i().a(paramOutputStream, d());
    localJsonGenerator.d();
    localJsonGenerator.a("data");
    localJsonGenerator.a(h());
    localJsonGenerator.e();
    localJsonGenerator.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.json.JsonCContent
 * JD-Core Version:    0.7.0.1
 */