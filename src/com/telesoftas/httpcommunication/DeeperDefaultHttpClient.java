package com.telesoftas.httpcommunication;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import com.telesoftas.utilities.ConnectionCheckUtils;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

public class DeeperDefaultHttpClient
{
  private static DeeperDefaultHttpClient a;
  private static DefaultHttpClient c;
  private static Semaphore d;
  private final Context b;
  
  private DeeperDefaultHttpClient(Context paramContext)
  {
    this.b = paramContext;
    c = new DefaultHttpClient();
    HttpConnectionParams.setConnectionTimeout(c.getParams(), 10000);
    d = new Semaphore(1, true);
  }
  
  public static DeeperDefaultHttpClient a(Context paramContext)
  {
    if (a == null) {
      a = new DeeperDefaultHttpClient(paramContext);
    }
    return a;
  }
  
  public BufferedHttpEntity a(HttpGet paramHttpGet, HttpPost paramHttpPost)
  {
    try
    {
      d.acquire();
      if (ConnectionCheckUtils.a(this.b))
      {
        if (c == null)
        {
          c = new DefaultHttpClient();
          HttpConnectionParams.setConnectionTimeout(c.getParams(), 10000);
        }
        if (paramHttpGet == null) {}
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      try
      {
        HttpResponse localHttpResponse;
        for (localObject = c.execute(paramHttpGet);; localObject = localHttpResponse)
        {
          BufferedHttpEntity localBufferedHttpEntity = new BufferedHttpEntity(((HttpResponse)localObject).getEntity());
          d.release();
          return localBufferedHttpEntity;
          localInterruptedException = localInterruptedException;
          Crashlytics.a(localInterruptedException);
          break;
          if (paramHttpPost == null) {
            break label138;
          }
          localHttpResponse = c.execute(paramHttpPost);
        }
      }
      catch (ClientProtocolException localClientProtocolException)
      {
        Crashlytics.a(localClientProtocolException);
        d.release();
        return null;
        d.release();
        return null;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          continue;
          label138:
          Object localObject = null;
        }
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.httpcommunication.DeeperDefaultHttpClient
 * JD-Core Version:    0.7.0.1
 */