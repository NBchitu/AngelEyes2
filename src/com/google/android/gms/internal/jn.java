package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

public final class jn
  implements Handler.Callback
{
  private static final Object a = new Object();
  private static jn b;
  private final Context c;
  private final HashMap<String, jn.a> d = new HashMap();
  private final Handler e = new Handler(paramContext.getMainLooper(), this);
  
  private jn(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
  }
  
  public static jn a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new jn(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  public boolean a(String paramString, jl<?>.f paramjl)
  {
    for (;;)
    {
      jn.a locala;
      synchronized (this.d)
      {
        locala = (jn.a)this.d.get(paramString);
        if (locala == null)
        {
          locala = new jn.a(this, paramString);
          locala.a(paramjl);
          locala.a();
          this.d.put(paramString, locala);
          boolean bool = locala.d();
          return bool;
        }
        this.e.removeMessages(0, locala);
        if (locala.c(paramjl)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + paramString);
        }
      }
      locala.a(paramjl);
      switch (locala.e())
      {
      case 1: 
        paramjl.onServiceConnected(locala.h(), locala.g());
        break;
      case 2: 
        locala.a();
      }
    }
  }
  
  public void b(String paramString, jl<?>.f paramjl)
  {
    jn.a locala;
    synchronized (this.d)
    {
      locala = (jn.a)this.d.get(paramString);
      if (locala == null) {
        throw new IllegalStateException("Nonexistent connection status for service action: " + paramString);
      }
    }
    if (!locala.c(paramjl)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + paramString);
    }
    locala.b(paramjl);
    if (locala.f())
    {
      Message localMessage = this.e.obtainMessage(0, locala);
      this.e.sendMessageDelayed(localMessage, 5000L);
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    jn.a locala = (jn.a)paramMessage.obj;
    synchronized (this.d)
    {
      if (locala.f())
      {
        locala.b();
        this.d.remove(locala.c());
      }
      return true;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jn
 * JD-Core Version:    0.7.0.1
 */