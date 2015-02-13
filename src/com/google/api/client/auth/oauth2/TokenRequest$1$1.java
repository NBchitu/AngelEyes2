package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;

class TokenRequest$1$1
  implements HttpExecuteInterceptor
{
  TokenRequest$1$1(TokenRequest.1 param1, HttpExecuteInterceptor paramHttpExecuteInterceptor) {}
  
  public void a(HttpRequest paramHttpRequest)
  {
    if (this.a != null) {
      this.a.a(paramHttpRequest);
    }
    if (this.b.a.b != null) {
      this.b.a.b.a(paramHttpRequest);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.TokenRequest.1.1
 * JD-Core Version:    0.7.0.1
 */