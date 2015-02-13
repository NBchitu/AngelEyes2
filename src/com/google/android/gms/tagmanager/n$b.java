package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

class n$b
  extends Handler
{
  private final ContainerHolder.ContainerAvailableListener b;
  
  protected void a(String paramString)
  {
    this.b.a(this.a, paramString);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      bh.a("Don't know how to handle this message.");
      return;
    }
    a((String)paramMessage.obj);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.n.b
 * JD-Core Version:    0.7.0.1
 */