package com.facebook.android;

import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

class AsyncFacebookRunner$2
  extends Thread
{
  AsyncFacebookRunner$2(AsyncFacebookRunner paramAsyncFacebookRunner, String paramString1, Bundle paramBundle, String paramString2, AsyncFacebookRunner.RequestListener paramRequestListener, Object paramObject) {}
  
  public void run()
  {
    try
    {
      String str = this.a.a.a(this.b, this.c, this.d);
      this.e.a(str, this.f);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      this.e.a(localFileNotFoundException, this.f);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      this.e.a(localMalformedURLException, this.f);
      return;
    }
    catch (IOException localIOException)
    {
      this.e.a(localIOException, this.f);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.AsyncFacebookRunner.2
 * JD-Core Version:    0.7.0.1
 */