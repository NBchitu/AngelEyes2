package com.google.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class HitSendingThreadImpl
  extends Thread
  implements HitSendingThread
{
  private static HitSendingThreadImpl d;
  private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
  private volatile boolean b = false;
  private volatile boolean c = false;
  private volatile HitStore e;
  private final Context f;
  
  private HitSendingThreadImpl(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null) {}
    for (this.f = paramContext.getApplicationContext();; this.f = paramContext)
    {
      start();
      return;
    }
  }
  
  static HitSendingThreadImpl a(Context paramContext)
  {
    if (d == null) {
      d = new HitSendingThreadImpl(paramContext);
    }
    return d;
  }
  
  private String a(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }
  
  public void a(Runnable paramRunnable)
  {
    this.a.add(paramRunnable);
  }
  
  public void a(String paramString)
  {
    a(paramString, System.currentTimeMillis());
  }
  
  void a(String paramString, long paramLong)
  {
    a(new HitSendingThreadImpl.1(this, this, paramLong, paramString));
  }
  
  public void run()
  {
    while (!this.c) {
      try
      {
        Runnable localRunnable = (Runnable)this.a.take();
        if (!this.b) {
          localRunnable.run();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Log.c(localInterruptedException.toString());
      }
      catch (Throwable localThrowable)
      {
        Log.a("Error on GAThread: " + a(localThrowable));
        Log.a("Google Analytics is shutting down.");
        this.b = true;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.HitSendingThreadImpl
 * JD-Core Version:    0.7.0.1
 */