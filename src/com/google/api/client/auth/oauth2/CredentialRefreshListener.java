package com.google.api.client.auth.oauth2;

public abstract interface CredentialRefreshListener
{
  public abstract void a(Credential paramCredential, TokenErrorResponse paramTokenErrorResponse);
  
  public abstract void a(Credential paramCredential, TokenResponse paramTokenResponse);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.CredentialRefreshListener
 * JD-Core Version:    0.7.0.1
 */