package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

class TokenRequest$1
  implements HttpRequestInitializer
{
  TokenRequest$1(TokenRequest paramTokenRequest) {}
  
  public void b(HttpRequest paramHttpRequest)
  {
    if (this.a.a != null) {
      this.a.a.b(paramHttpRequest);
    }
    paramHttpRequest.a(new TokenRequest.1.1(this, paramHttpRequest.j()));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.TokenRequest.1
 * JD-Core Version:    0.7.0.1
 */