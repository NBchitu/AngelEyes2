package com.google.api.client.auth.jsontoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class JsonWebToken$Header
  extends GenericJson
{
  @Key(a="typ")
  private String type;
  
  public Header c(String paramString)
  {
    this.type = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.jsontoken.JsonWebToken.Header
 * JD-Core Version:    0.7.0.1
 */