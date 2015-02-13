package com.telesoftas.services;

import android.content.Context;
import android.os.Handler;
import com.fridaylab.deeper.communication.DeeperChannel.SignalObserver;

public class FileService
{
  DeeperChannel.SignalObserver a;
  private boolean b;
  private final Context c;
  private FileService.ConnectedThread d;
  private String e;
  private final float f;
  private int g;
  private boolean h;
  private volatile boolean i = false;
  
  public FileService(Context paramContext, Handler paramHandler, float paramFloat, DeeperChannel.SignalObserver paramSignalObserver)
  {
    this.c = paramContext;
    this.f = paramFloat;
    this.a = paramSignalObserver;
  }
  
  public String a()
  {
    return this.e;
  }
  
  public void a(String paramString, int paramInt, boolean paramBoolean)
  {
    this.e = paramString;
    this.g = paramInt;
    this.h = paramBoolean;
    if (this.e != null)
    {
      this.d = new FileService.ConnectedThread(this, this.e);
      this.d.start();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public int b()
  {
    return this.g;
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  public void d()
  {
    if (this.d != null)
    {
      this.d.a();
      this.d = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.FileService
 * JD-Core Version:    0.7.0.1
 */