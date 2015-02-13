package com.google.tagmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class HttpUrlConnectionNetworkClient
  implements NetworkClient
{
  private HttpURLConnection a;
  
  private InputStream a(HttpURLConnection paramHttpURLConnection)
  {
    int i = paramHttpURLConnection.getResponseCode();
    if (i == 200) {
      return paramHttpURLConnection.getInputStream();
    }
    String str = "Bad response: " + i;
    if (i == 404) {
      throw new FileNotFoundException(str);
    }
    throw new IOException(str);
  }
  
  private void b(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
  }
  
  public InputStream a(String paramString)
  {
    this.a = b(paramString);
    return a(this.a);
  }
  
  public void a()
  {
    b(this.a);
  }
  
  HttpURLConnection b(String paramString)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
    localHttpURLConnection.setReadTimeout(20000);
    localHttpURLConnection.setConnectTimeout(20000);
    return localHttpURLConnection;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.HttpUrlConnectionNetworkClient
 * JD-Core Version:    0.7.0.1
 */