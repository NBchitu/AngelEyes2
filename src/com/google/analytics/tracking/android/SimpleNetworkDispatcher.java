package com.google.analytics.tracking.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

class SimpleNetworkDispatcher
  implements Dispatcher
{
  private final String a;
  private final HttpClient b;
  private final Context c;
  private GoogleAnalytics d;
  private URL e;
  
  SimpleNetworkDispatcher(HttpClient paramHttpClient, Context paramContext)
  {
    this(paramHttpClient, GoogleAnalytics.a(paramContext), paramContext);
  }
  
  SimpleNetworkDispatcher(HttpClient paramHttpClient, GoogleAnalytics paramGoogleAnalytics, Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    this.a = a("GoogleAnalytics", "3.0", Build.VERSION.RELEASE, Utils.a(Locale.getDefault()), Build.MODEL, Build.ID);
    this.b = paramHttpClient;
    this.d = paramGoogleAnalytics;
  }
  
  private HttpEntityEnclosingRequest a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      Log.d("Empty hit, discarding.");
      return null;
    }
    String str = paramString2 + "?" + paramString1;
    BasicHttpEntityEnclosingRequest localBasicHttpEntityEnclosingRequest;
    if (str.length() < 2036) {
      localBasicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("GET", str);
    }
    for (;;)
    {
      localBasicHttpEntityEnclosingRequest.addHeader("User-Agent", this.a);
      return localBasicHttpEntityEnclosingRequest;
      localBasicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("POST", paramString2);
      try
      {
        localBasicHttpEntityEnclosingRequest.setEntity(new StringEntity(paramString1));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Log.d("Encoding error, discarding hit");
      }
    }
    return null;
  }
  
  private void a(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Header[] arrayOfHeader = paramHttpEntityEnclosingRequest.getAllHeaders();
    int i = arrayOfHeader.length;
    for (int j = 0; j < i; j++) {
      localStringBuffer.append(arrayOfHeader[j].toString()).append("\n");
    }
    localStringBuffer.append(paramHttpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
    if (paramHttpEntityEnclosingRequest.getEntity() != null) {}
    try
    {
      InputStream localInputStream = paramHttpEntityEnclosingRequest.getEntity().getContent();
      if (localInputStream != null)
      {
        int k = localInputStream.available();
        if (k > 0)
        {
          byte[] arrayOfByte = new byte[k];
          localInputStream.read(arrayOfByte);
          localStringBuffer.append("POST:\n");
          localStringBuffer.append(new String(arrayOfByte)).append("\n");
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.c("Error Writing hit to log...");
      }
    }
    Log.c(localStringBuffer.toString());
  }
  
  public int a(List<Hit> paramList)
  {
    int i = Math.min(paramList.size(), 40);
    int j = 1;
    int k = 0;
    int m = 0;
    HttpHost localHttpHost;
    HttpEntityEnclosingRequest localHttpEntityEnclosingRequest;
    label191:
    int n;
    if (k < i)
    {
      Hit localHit = (Hit)paramList.get(k);
      URL localURL = a(localHit);
      int i3;
      if (localURL == null)
      {
        if (Log.a()) {
          Log.d("No destination: discarding hit: " + localHit.a());
        }
        for (;;)
        {
          i3 = m + 1;
          k++;
          m = i3;
          break;
          Log.d("No destination: discarding hit.");
        }
      }
      localHttpHost = new HttpHost(localURL.getHost(), localURL.getPort(), localURL.getProtocol());
      String str1 = localURL.getPath();
      if (TextUtils.isEmpty(localHit.a())) {}
      for (String str2 = "";; str2 = HitBuilder.a(localHit, System.currentTimeMillis()))
      {
        localHttpEntityEnclosingRequest = a(str2, str1);
        if (localHttpEntityEnclosingRequest != null) {
          break label191;
        }
        i3 = m + 1;
        break;
      }
      localHttpEntityEnclosingRequest.addHeader("Host", localHttpHost.toHostString());
      if (Log.a()) {
        a(localHttpEntityEnclosingRequest);
      }
      if (str2.length() > 8192) {
        Log.d("Hit too long (> 8192 bytes)--not sent");
      }
      for (n = j;; n = j)
      {
        int i1 = m + 1;
        int i2 = n;
        i3 = i1;
        j = i2;
        break;
        if (!this.d.b()) {
          break label279;
        }
        Log.b("Dry run enabled. Hit not actually sent.");
      }
      label279:
      if (j == 0) {
        break label453;
      }
    }
    for (;;)
    {
      try
      {
        for (;;)
        {
          GANetworkReceiver.b(this.c);
          n = 0;
          try
          {
            HttpResponse localHttpResponse = this.b.execute(localHttpHost, localHttpEntityEnclosingRequest);
            int i4 = localHttpResponse.getStatusLine().getStatusCode();
            HttpEntity localHttpEntity = localHttpResponse.getEntity();
            if (localHttpEntity != null) {
              localHttpEntity.consumeContent();
            }
            if (i4 == 200) {
              break;
            }
            Log.d("Bad response: " + localHttpResponse.getStatusLine().getStatusCode());
          }
          catch (ClientProtocolException localClientProtocolException1) {}
        }
      }
      catch (IOException localIOException)
      {
        Log.d("Exception sending hit: " + localIOException.getClass().getSimpleName());
        Log.d(localIOException.getMessage());
        return m;
        return m;
      }
      catch (ClientProtocolException localClientProtocolException2)
      {
        n = j;
        continue;
      }
      Log.d("ClientProtocolException sending hit; discarding hit...");
      break;
      label453:
      n = j;
    }
  }
  
  String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  URL a(Hit paramHit)
  {
    if (this.e != null) {
      return this.e;
    }
    String str1 = paramHit.d();
    for (;;)
    {
      try
      {
        if ("http:".equals(str1))
        {
          str2 = "http://www.google-analytics.com/collect";
          URL localURL = new URL(str2);
          return localURL;
        }
      }
      catch (MalformedURLException localMalformedURLException)
      {
        Log.a("Error trying to parse the hardcoded host url. This really shouldn't happen.");
        return null;
      }
      String str2 = "https://ssl.google-analytics.com/collect";
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      this.e = new URL(paramString);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      this.e = null;
    }
  }
  
  public boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      Log.c("...no network connectivity");
      return false;
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.SimpleNetworkDispatcher
 * JD-Core Version:    0.7.0.1
 */