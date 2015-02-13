package com.google.api.client.http.json;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.common.base.Preconditions;
import java.io.OutputStream;

public class JsonHttpContent
  extends AbstractHttpContent
{
  private final Object a;
  private final JsonFactory b;
  
  public JsonHttpContent(JsonFactory paramJsonFactory, Object paramObject)
  {
    super(Json.a);
    this.b = ((JsonFactory)Preconditions.a(paramJsonFactory));
    this.a = Preconditions.a(paramObject);
  }
  
  public void a(OutputStream paramOutputStream)
  {
    JsonGenerator localJsonGenerator = this.b.a(paramOutputStream, d());
    localJsonGenerator.a(this.a);
    localJsonGenerator.a();
  }
  
  public final Object h()
  {
    return this.a;
  }
  
  public final JsonFactory i()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.json.JsonHttpContent
 * JD-Core Version:    0.7.0.1
 */