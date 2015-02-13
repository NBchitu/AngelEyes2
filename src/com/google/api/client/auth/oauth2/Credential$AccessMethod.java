package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpRequest;

public abstract interface Credential$AccessMethod
{
  public abstract String a(HttpRequest paramHttpRequest);
  
  public abstract void a(HttpRequest paramHttpRequest, String paramString);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.Credential.AccessMethod
 * JD-Core Version:    0.7.0.1
 */