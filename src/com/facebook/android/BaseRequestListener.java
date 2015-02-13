package com.facebook.android;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public abstract class BaseRequestListener
  implements AsyncFacebookRunner.RequestListener
{
  public void a(FileNotFoundException paramFileNotFoundException, Object paramObject)
  {
    Log.e("Facebook", paramFileNotFoundException.getMessage());
    paramFileNotFoundException.printStackTrace();
  }
  
  public void a(IOException paramIOException, Object paramObject)
  {
    Log.e("Facebook", paramIOException.getMessage());
    paramIOException.printStackTrace();
  }
  
  public void a(MalformedURLException paramMalformedURLException, Object paramObject)
  {
    Log.e("Facebook", paramMalformedURLException.getMessage());
    paramMalformedURLException.printStackTrace();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.BaseRequestListener
 * JD-Core Version:    0.7.0.1
 */