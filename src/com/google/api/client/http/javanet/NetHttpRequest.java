package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class NetHttpRequest
  extends LowLevelHttpRequest
{
  private final HttpURLConnection a;
  private HttpContent b;
  
  NetHttpRequest(String paramString1, String paramString2)
  {
    this(paramString1, (HttpURLConnection)new URL(paramString2).openConnection());
  }
  
  NetHttpRequest(String paramString, HttpURLConnection paramHttpURLConnection)
  {
    this.a = paramHttpURLConnection;
    paramHttpURLConnection.setRequestMethod(paramString);
    paramHttpURLConnection.setUseCaches(false);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
  }
  
  public LowLevelHttpResponse a()
  {
    localHttpURLConnection = this.a;
    long l;
    String str3;
    if (this.b != null)
    {
      String str1 = this.b.e();
      if (str1 != null) {
        a("Content-Type", str1);
      }
      String str2 = this.b.a();
      if (str2 != null) {
        a("Content-Encoding", str2);
      }
      l = this.b.b();
      if (l >= 0L) {
        a("Content-Length", Long.toString(l));
      }
      str3 = localHttpURLConnection.getRequestMethod();
      if ((!"POST".equals(str3)) && (!"PUT".equals(str3))) {
        break label198;
      }
      localHttpURLConnection.setDoOutput(true);
      if ((l < 0L) || (l > 2147483647L)) {
        break label180;
      }
      localHttpURLConnection.setFixedLengthStreamingMode((int)l);
    }
    OutputStream localOutputStream;
    for (;;)
    {
      localOutputStream = localHttpURLConnection.getOutputStream();
      try
      {
        this.b.a(localOutputStream);
        localOutputStream.close();
      }
      finally
      {
        NetHttpResponse localNetHttpResponse;
        label180:
        localOutputStream.close();
      }
      try
      {
        localHttpURLConnection.connect();
        return localNetHttpResponse;
      }
      finally
      {
        boolean bool;
        localHttpURLConnection.disconnect();
      }
      localHttpURLConnection.setChunkedStreamingMode(0);
    }
    label198:
    for (bool = true;; bool = false)
    {
      Preconditions.a(bool, "%s with non-zero content length is not supported", new Object[] { str3 });
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.setReadTimeout(paramInt2);
    this.a.setConnectTimeout(paramInt1);
  }
  
  public void a(HttpContent paramHttpContent)
  {
    this.b = paramHttpContent;
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.a.addRequestProperty(paramString1, paramString2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.javanet.NetHttpRequest
 * JD-Core Version:    0.7.0.1
 */