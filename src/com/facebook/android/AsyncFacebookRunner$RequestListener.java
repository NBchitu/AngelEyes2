package com.facebook.android;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public abstract interface AsyncFacebookRunner$RequestListener
{
  public abstract void a(FileNotFoundException paramFileNotFoundException, Object paramObject);
  
  public abstract void a(IOException paramIOException, Object paramObject);
  
  public abstract void a(String paramString, Object paramObject);
  
  public abstract void a(MalformedURLException paramMalformedURLException, Object paramObject);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.AsyncFacebookRunner.RequestListener
 * JD-Core Version:    0.7.0.1
 */