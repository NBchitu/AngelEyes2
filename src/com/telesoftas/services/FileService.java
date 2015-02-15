package com.telesoftas.services;

import android.content.Context;
import android.os.Handler;
import com.fridaylab.deeper.communication.DeeperChannel$SignalObserver;

public class FileService
{
  DeeperChannel$SignalObserver a;
  private boolean b;
  private final Context c;
  private FileService$ConnectedThread d;
  private String e;	// 打开的文件名
  private final float f;
  private int g;
  private boolean h;
  private volatile boolean i = false;
  
  public FileService(Context paramContext, Handler paramHandler, float paramFloat, DeeperChannel$SignalObserver paramSignalObserver)
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
    this.e = paramString;	// 文件名
    this.g = paramInt;
    this.h = paramBoolean;	// 
    if (this.e != null)
    {
      this.d = new FileService$ConnectedThread(this, this.e); // 创建对应线程ConnectedThread
      this.d.start();	// 启动线程ConnectedThread
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
    if (this.d != null)	// FileService ConnectedThread线程非空
    {
      this.d.a();	// 
      this.d = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.FileService
 * JD-Core Version:    0.7.0.1
 */