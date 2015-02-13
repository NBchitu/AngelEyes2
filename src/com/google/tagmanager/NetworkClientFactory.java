package com.google.tagmanager;

import android.os.Build.VERSION;

class NetworkClientFactory
{
  public NetworkClient a()
  {
    if (b() < 8) {
      return new HttpNetworkClient();
    }
    return new HttpUrlConnectionNetworkClient();
  }
  
  int b()
  {
    return Build.VERSION.SDK_INT;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NetworkClientFactory
 * JD-Core Version:    0.7.0.1
 */