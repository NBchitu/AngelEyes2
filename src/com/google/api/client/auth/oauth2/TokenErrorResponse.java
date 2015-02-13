package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class TokenErrorResponse
  extends GenericJson
{
  @Key
  private String error;
  @Key(a="error_description")
  private String errorDescription;
  @Key(a="error_uri")
  private String errorUri;
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.TokenErrorResponse
 * JD-Core Version:    0.7.0.1
 */