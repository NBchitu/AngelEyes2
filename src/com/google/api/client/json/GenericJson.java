package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import com.google.common.base.Throwables;
import java.io.IOException;

public class GenericJson
  extends GenericData
  implements Cloneable
{
  private JsonFactory jsonFactory;
  
  public GenericJson clone()
  {
    return (GenericJson)super.clone();
  }
  
  public final JsonFactory getFactory()
  {
    return this.jsonFactory;
  }
  
  public final void setFactory(JsonFactory paramJsonFactory)
  {
    this.jsonFactory = paramJsonFactory;
  }
  
  public String toPrettyString()
  {
    if (this.jsonFactory != null) {
      return this.jsonFactory.b(this);
    }
    return super.toString();
  }
  
  public String toString()
  {
    if (this.jsonFactory != null) {
      try
      {
        String str = this.jsonFactory.a(this);
        return str;
      }
      catch (IOException localIOException)
      {
        throw Throwables.b(localIOException);
      }
    }
    return super.toString();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.GenericJson
 * JD-Core Version:    0.7.0.1
 */