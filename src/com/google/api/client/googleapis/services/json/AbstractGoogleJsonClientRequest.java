package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpResponse;

public abstract class AbstractGoogleJsonClientRequest<T>
  extends AbstractGoogleClientRequest<T>
{
  private final Object a;
  
  protected AbstractGoogleJsonClientRequest(AbstractGoogleJsonClient paramAbstractGoogleJsonClient, String paramString1, String paramString2, Object paramObject, Class<T> paramClass) {}
  
  protected GoogleJsonResponseException b(HttpResponse paramHttpResponse)
  {
    return GoogleJsonResponseException.a(e().h(), paramHttpResponse);
  }
  
  public AbstractGoogleJsonClient e()
  {
    return (AbstractGoogleJsonClient)super.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest
 * JD-Core Version:    0.7.0.1
 */