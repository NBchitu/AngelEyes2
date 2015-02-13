package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;

final class BearerToken$AuthorizationHeaderAccessMethod
  implements Credential.AccessMethod
{
  public String a(HttpRequest paramHttpRequest)
  {
    String str = paramHttpRequest.h().b();
    if ((str != null) && (str.startsWith("Bearer "))) {
      return str.substring("Bearer ".length());
    }
    return null;
  }
  
  public void a(HttpRequest paramHttpRequest, String paramString)
  {
    paramHttpRequest.h().b("Bearer " + paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.BearerToken.AuthorizationHeaderAccessMethod
 * JD-Core Version:    0.7.0.1
 */