package com.google.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
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
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

class SimpleNetworkDispatcher
  implements Dispatcher
{
  private final String a;
  private final HttpClient b;
  private final Context c;
  private SimpleNetworkDispatcher.DispatchListener d;
  
  SimpleNetworkDispatcher(HttpClient paramHttpClient, Context paramContext, SimpleNetworkDispatcher.DispatchListener paramDispatchListener)
  {
    this.c = paramContext.getApplicationContext();
    this.a = a("GoogleTagManager", "3.01", Build.VERSION.RELEASE, a(Locale.getDefault()), Build.MODEL, Build.ID);
    this.b = paramHttpClient;
    this.d = paramDispatchListener;
  }
  
  static String a(Locale paramLocale)
  {
    if (paramLocale == null) {}
    while ((paramLocale.getLanguage() == null) || (paramLocale.getLanguage().length() == 0)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLocale.getLanguage().toLowerCase());
    if ((paramLocale.getCountry() != null) && (paramLocale.getCountry().length() != 0)) {
      localStringBuilder.append("-").append(paramLocale.getCountry().toLowerCase());
    }
    return localStringBuilder.toString();
  }
  
  private HttpEntityEnclosingRequest a(URL paramURL)
  {
    try
    {
      localBasicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("GET", paramURL.toURI().toString());
      Log.b("Exception sending hit: " + localURISyntaxException1.getClass().getSimpleName());
    }
    catch (URISyntaxException localURISyntaxException3)
    {
      try
      {
        localBasicHttpEntityEnclosingRequest.addHeader("User-Agent", this.a);
        return localBasicHttpEntityEnclosingRequest;
      }
      catch (URISyntaxException localURISyntaxException2)
      {
        BasicHttpEntityEnclosingRequest localBasicHttpEntityEnclosingRequest;
        URISyntaxException localURISyntaxException1;
        break label38;
      }
      localURISyntaxException3 = localURISyntaxException3;
      localBasicHttpEntityEnclosingRequest = null;
      localURISyntaxException1 = localURISyntaxException3;
    }
    label38:
    Log.b(localURISyntaxException1.getMessage());
    return localBasicHttpEntityEnclosingRequest;
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
        Log.e("Error Writing hit to log...");
      }
    }
    Log.e(localStringBuffer.toString());
  }
  
  String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  URL a(Hit paramHit)
  {
    String str = paramHit.c();
    try
    {
      URL localURL = new URL(str);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      Log.a("Error trying to parse the GTM url.");
    }
    return null;
  }
  
  public void a(List<Hit> paramList)
  {
    int i = Math.min(paramList.size(), 40);
    int j = 1;
    int k = 0;
    Hit localHit;
    URL localURL;
    int m;
    if (k < i)
    {
      localHit = (Hit)paramList.get(k);
      localURL = a(localHit);
      if (localURL == null)
      {
        Log.b("No destination: discarding hit.");
        this.d.b(localHit);
        m = j;
      }
    }
    for (;;)
    {
      k++;
      j = m;
      break;
      HttpEntityEnclosingRequest localHttpEntityEnclosingRequest = a(localURL);
      if (localHttpEntityEnclosingRequest == null)
      {
        this.d.b(localHit);
        m = j;
      }
      else
      {
        HttpHost localHttpHost = new HttpHost(localURL.getHost(), localURL.getPort(), localURL.getProtocol());
        localHttpEntityEnclosingRequest.addHeader("Host", localHttpHost.toHostString());
        a(localHttpEntityEnclosingRequest);
        if (j != 0) {}
        try
        {
          NetworkReceiver.b(this.c);
          j = 0;
          HttpResponse localHttpResponse = this.b.execute(localHttpHost, localHttpEntityEnclosingRequest);
          int n = localHttpResponse.getStatusLine().getStatusCode();
          HttpEntity localHttpEntity = localHttpResponse.getEntity();
          if (localHttpEntity != null) {
            localHttpEntity.consumeContent();
          }
          if (n != 200)
          {
            Log.b("Bad response: " + localHttpResponse.getStatusLine().getStatusCode());
            this.d.c(localHit);
          }
          else
          {
            this.d.a(localHit);
          }
        }
        catch (ClientProtocolException localClientProtocolException)
        {
          Log.b("ClientProtocolException sending hit; discarding hit...");
          this.d.b(localHit);
          m = j;
          continue;
        }
        catch (IOException localIOException)
        {
          Log.b("Exception sending hit: " + localIOException.getClass().getSimpleName());
          Log.b(localIOException.getMessage());
          this.d.c(localHit);
          m = j;
        }
        continue;
        return;
        m = j;
      }
    }
  }
  
  public boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      Log.e("...no network connectivity");
      return false;
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.SimpleNetworkDispatcher
 * JD-Core Version:    0.7.0.1
 */