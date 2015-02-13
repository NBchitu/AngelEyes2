package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer;

public class CommonGoogleJsonClientRequestInitializer
  extends CommonGoogleClientRequestInitializer
{
  public final void a(AbstractGoogleClientRequest<?> paramAbstractGoogleClientRequest)
  {
    super.a(paramAbstractGoogleClientRequest);
    a((AbstractGoogleJsonClientRequest)paramAbstractGoogleClientRequest);
  }
  
  protected void a(AbstractGoogleJsonClientRequest<?> paramAbstractGoogleJsonClientRequest) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer
 * JD-Core Version:    0.7.0.1
 */