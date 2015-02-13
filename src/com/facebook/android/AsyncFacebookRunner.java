package com.facebook.android;

import android.os.Bundle;

public class AsyncFacebookRunner
{
  Facebook a;
  
  public AsyncFacebookRunner(Facebook paramFacebook)
  {
    this.a = paramFacebook;
  }
  
  public void a(String paramString1, Bundle paramBundle, String paramString2, AsyncFacebookRunner.RequestListener paramRequestListener, Object paramObject)
  {
    new AsyncFacebookRunner.2(this, paramString1, paramBundle, paramString2, paramRequestListener, paramObject).start();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.AsyncFacebookRunner
 * JD-Core Version:    0.7.0.1
 */