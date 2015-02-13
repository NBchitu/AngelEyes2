package com.google.tagmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

class HttpNetworkClient
  implements NetworkClient
{
  private HttpClient a;
  
  private InputStream a(HttpClient paramHttpClient, HttpResponse paramHttpResponse)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    if (i == 200)
    {
      Log.e("Success response");
      return paramHttpResponse.getEntity().getContent();
    }
    String str = "Bad response: " + i;
    if (i == 404) {
      throw new FileNotFoundException(str);
    }
    throw new IOException(str);
  }
  
  private void a(HttpClient paramHttpClient)
  {
    if ((paramHttpClient != null) && (paramHttpClient.getConnectionManager() != null)) {
      paramHttpClient.getConnectionManager().shutdown();
    }
  }
  
  public InputStream a(String paramString)
  {
    this.a = b();
    HttpResponse localHttpResponse = this.a.execute(new HttpGet(paramString));
    return a(this.a, localHttpResponse);
  }
  
  public void a()
  {
    a(this.a);
  }
  
  HttpClient b()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 20000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 20000);
    return new DefaultHttpClient(localBasicHttpParams);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.HttpNetworkClient
 * JD-Core Version:    0.7.0.1
 */