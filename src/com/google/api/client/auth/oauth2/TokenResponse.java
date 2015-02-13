package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class TokenResponse
  extends GenericJson
{
  @Key(a="access_token")
  private String accessToken;
  @Key(a="expires_in")
  private Long expiresInSeconds;
  @Key(a="refresh_token")
  private String refreshToken;
  @Key
  private String scope;
  @Key(a="token_type")
  private String tokenType;
  
  public final String a()
  {
    return this.accessToken;
  }
  
  public final Long b()
  {
    return this.expiresInSeconds;
  }
  
  public final String c()
  {
    return this.refreshToken;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.TokenResponse
 * JD-Core Version:    0.7.0.1
 */