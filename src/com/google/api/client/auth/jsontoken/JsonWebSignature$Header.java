package com.google.api.client.auth.jsontoken;

import com.google.api.client.util.Key;

public class JsonWebSignature$Header
  extends JsonWebToken.Header
{
  @Key(a="alg")
  private String algorithm;
  @Key(a="jku")
  private String jwkUrl;
  @Key(a="kid")
  private String keyId;
  @Key(a="x5t")
  private String x509Thumbprint;
  @Key(a="x5u")
  private String x509Url;
  
  public Header a(String paramString)
  {
    super.c(paramString);
    return this;
  }
  
  public Header b(String paramString)
  {
    this.algorithm = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.jsontoken.JsonWebSignature.Header
 * JD-Core Version:    0.7.0.1
 */