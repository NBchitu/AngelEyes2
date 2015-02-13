package com.google.api.client.auth.jsontoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Key;
import com.google.common.base.Preconditions;

public class JsonWebToken$Payload
  extends GenericJson
{
  private final Clock a;
  @Key(a="aud")
  private String audience;
  @Key(a="exp")
  private Long expirationTimeSeconds;
  @Key(a="iat")
  private Long issuedAtTimeSeconds;
  @Key(a="iss")
  private String issuer;
  @Key(a="jti")
  private String jwtId;
  @Key(a="nbf")
  private Long notBeforeTimeSeconds;
  @Key(a="prn")
  private String principal;
  @Key(a="typ")
  private String type;
  
  public JsonWebToken$Payload()
  {
    this(Clock.a);
  }
  
  public JsonWebToken$Payload(Clock paramClock)
  {
    this.a = ((Clock)Preconditions.a(paramClock));
  }
  
  public Payload a(Long paramLong)
  {
    this.expirationTimeSeconds = paramLong;
    return this;
  }
  
  public Payload a(String paramString)
  {
    this.issuer = paramString;
    return this;
  }
  
  public Payload b(Long paramLong)
  {
    this.issuedAtTimeSeconds = paramLong;
    return this;
  }
  
  public Payload b(String paramString)
  {
    this.audience = paramString;
    return this;
  }
  
  public Payload c(String paramString)
  {
    this.principal = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.jsontoken.JsonWebToken.Payload
 * JD-Core Version:    0.7.0.1
 */