package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.jsontoken.JsonWebSignature.Header;
import com.google.api.client.auth.jsontoken.JsonWebToken.Payload;
import com.google.api.client.auth.jsontoken.RsaSHA256Signer;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Clock;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;

public class GoogleCredential
  extends Credential
{
  private String b;
  private String c;
  private PrivateKey d;
  private String e;
  
  public GoogleCredential()
  {
    super(BearerToken.a(), null, null, "https://accounts.google.com/o/oauth2/token", null, null, null);
  }
  
  public GoogleCredential b(TokenResponse paramTokenResponse)
  {
    return (GoogleCredential)super.a(paramTokenResponse);
  }
  
  public GoogleCredential c(Long paramLong)
  {
    return (GoogleCredential)super.a(paramLong);
  }
  
  public GoogleCredential c(String paramString)
  {
    return (GoogleCredential)super.a(paramString);
  }
  
  public GoogleCredential d(Long paramLong)
  {
    return (GoogleCredential)super.b(paramLong);
  }
  
  public GoogleCredential d(String paramString)
  {
    if (paramString != null) {
      if ((c() == null) || (b() == null) || (f() == null)) {
        break label42;
      }
    }
    label42:
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
      return (GoogleCredential)super.b(paramString);
    }
  }
  
  protected TokenResponse h()
  {
    if (this.d == null) {
      return super.h();
    }
    JsonWebSignature.Header localHeader = new JsonWebSignature.Header();
    localHeader.b("RS256");
    localHeader.a("JWT");
    JsonWebToken.Payload localPayload = new JsonWebToken.Payload(a());
    long l = a().a();
    localPayload.a(this.b).b(d()).b(Long.valueOf(l / 1000L)).a(Long.valueOf(3600L + l / 1000L)).c(this.e);
    localPayload.put("scope", this.c);
    try
    {
      String str = RsaSHA256Signer.a(this.d, c(), localHeader, localPayload);
      TokenRequest localTokenRequest = new TokenRequest(b(), c(), new GenericUrl(d()), "assertion");
      localTokenRequest.put("assertion_type", "http://oauth.net/grant_type/jwt/1.0/bearer");
      localTokenRequest.put("assertion", str);
      TokenResponse localTokenResponse = localTokenRequest.b();
      return localTokenResponse;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      IOException localIOException = new IOException();
      localIOException.initCause(localGeneralSecurityException);
      throw localIOException;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.auth.oauth2.GoogleCredential
 * JD-Core Version:    0.7.0.1
 */