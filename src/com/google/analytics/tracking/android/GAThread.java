package com.google.analytics.tracking.android;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

class GAThread
  extends Thread
  implements AnalyticsThread
{
  private static GAThread g;
  private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
  private volatile boolean b = false;
  private volatile boolean c = false;
  private volatile List<Command> d;
  private volatile String e;
  private volatile String f;
  private volatile ServiceProxy h;
  private final Context i;
  
  private GAThread(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null) {}
    for (this.i = paramContext.getApplicationContext();; this.i = paramContext)
    {
      start();
      return;
    }
  }
  
  static int a(String paramString)
  {
    int j = 1;
    if (!TextUtils.isEmpty(paramString))
    {
      int k = -1 + paramString.length();
      j = 0;
      for (int m = k; m >= 0; m--)
      {
        int n = paramString.charAt(m);
        j = n + (0xFFFFFFF & j << 6) + (n << 14);
        int i1 = 0xFE00000 & j;
        if (i1 != 0) {
          j ^= i1 >> 21;
        }
      }
    }
    return j;
  }
  
  static GAThread a(Context paramContext)
  {
    if (g == null) {
      g = new GAThread(paramContext);
    }
    return g;
  }
  
  private String a(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }
  
  static String b(Context paramContext)
  {
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput("gaInstallData");
      arrayOfByte = new byte[8192];
      j = localFileInputStream.read(arrayOfByte, 0, 8192);
      if (localFileInputStream.available() > 0)
      {
        Log.a("Too much campaign data, ignoring it.");
        localFileInputStream.close();
        paramContext.deleteFile("gaInstallData");
        return null;
      }
      localFileInputStream.close();
      paramContext.deleteFile("gaInstallData");
      if (j <= 0)
      {
        Log.d("Campaign file is empty.");
        return null;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      byte[] arrayOfByte;
      int j;
      Log.b("No campaign data found.");
      return null;
      String str = new String(arrayOfByte, 0, j);
      Log.b("Campaign found: " + str);
      return str;
    }
    catch (IOException localIOException)
    {
      Log.a("Error reading campaign data.");
      paramContext.deleteFile("gaInstallData");
    }
    return null;
  }
  
  private String b(Map<String, String> paramMap)
  {
    if (paramMap.containsKey("useSecure"))
    {
      if (Utils.a((String)paramMap.get("useSecure"), true)) {
        return "https:";
      }
      return "http:";
    }
    return "https:";
  }
  
  private boolean c(Map<String, String> paramMap)
  {
    if (paramMap.get("&sf") == null) {
      return false;
    }
    double d1 = Utils.a((String)paramMap.get("&sf"), 100.0D);
    if (d1 >= 100.0D) {
      return false;
    }
    if (a((String)paramMap.get("&cid")) % 10000 >= d1 * 100.0D)
    {
      if (paramMap.get("&t") == null) {}
      for (String str = "unknown";; str = (String)paramMap.get("&t"))
      {
        Log.c(String.format("%s hit sampled out", new Object[] { str }));
        return true;
      }
    }
    return false;
  }
  
  private void d(Map<String, String> paramMap)
  {
    AppFieldsDefaultProvider localAppFieldsDefaultProvider = AppFieldsDefaultProvider.a();
    Utils.a(paramMap, "&an", localAppFieldsDefaultProvider.a("&an"));
    Utils.a(paramMap, "&av", localAppFieldsDefaultProvider.a("&av"));
    Utils.a(paramMap, "&aid", localAppFieldsDefaultProvider.a("&aid"));
    Utils.a(paramMap, "&aiid", localAppFieldsDefaultProvider.a("&aiid"));
    paramMap.put("&v", "1");
  }
  
  public void a()
  {
    a(new GAThread.2(this));
  }
  
  void a(Runnable paramRunnable)
  {
    this.a.add(paramRunnable);
  }
  
  public void a(Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap(paramMap);
    String str = (String)paramMap.get("&ht");
    if (str != null) {}
    try
    {
      Long.valueOf(str).longValue();
      if (str == null) {
        localHashMap.put("&ht", Long.toString(System.currentTimeMillis()));
      }
      a(new GAThread.1(this, localHashMap));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        str = null;
      }
    }
  }
  
  public void b()
  {
    a(new GAThread.4(this));
  }
  
  public LinkedBlockingQueue<Runnable> c()
  {
    return this.a;
  }
  
  public Thread d()
  {
    return this;
  }
  
  protected void e()
  {
    this.h.f();
    this.d = new ArrayList();
    this.d.add(new Command("appendVersion", "&_v".substring(1), "ma3.0.1"));
    this.d.add(new Command("appendQueueTime", "&qt".substring(1), null));
    this.d.add(new Command("appendCacheBuster", "&z".substring(1), null));
  }
  
  public void run()
  {
    try
    {
      Thread.sleep(5000L);
      for (;;)
      {
        try
        {
          if (this.h == null) {
            this.h = new GAServiceProxy(this.i, this);
          }
          e();
          this.f = ClientIdDefaultProvider.a().a("&cid");
          this.e = b(this.i);
        }
        catch (Throwable localThrowable1)
        {
          Log.a("Error initializing the GAThread: " + a(localThrowable1));
          Log.a("Google Analytics will not start up.");
          this.b = true;
          continue;
        }
        if (this.c) {
          return;
        }
        try
        {
          Runnable localRunnable = (Runnable)this.a.take();
          if (!this.b) {
            localRunnable.run();
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          Log.b(localInterruptedException2.toString());
        }
        catch (Throwable localThrowable2)
        {
          Log.a("Error on GAThread: " + a(localThrowable2));
          Log.a("Google Analytics is shutting down.");
          this.b = true;
        }
      }
    }
    catch (InterruptedException localInterruptedException1)
    {
      for (;;)
      {
        Log.d("sleep interrupted in GAThread initialize");
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAThread
 * JD-Core Version:    0.7.0.1
 */