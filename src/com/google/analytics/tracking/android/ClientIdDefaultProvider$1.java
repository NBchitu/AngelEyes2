package com.google.analytics.tracking.android;

class ClientIdDefaultProvider$1
  extends Thread
{
  ClientIdDefaultProvider$1(ClientIdDefaultProvider paramClientIdDefaultProvider, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    synchronized (ClientIdDefaultProvider.a(this.a))
    {
      ClientIdDefaultProvider.a(this.a, this.a.c());
      ClientIdDefaultProvider.a(this.a, true);
      ClientIdDefaultProvider.a(this.a).notifyAll();
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.ClientIdDefaultProvider.1
 * JD-Core Version:    0.7.0.1
 */