package com.google.analytics.tracking.android;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

class ClientIdDefaultProvider
  implements DefaultProvider
{
  private static ClientIdDefaultProvider a;
  private static final Object b = new Object();
  private final Context c;
  private String d;
  private boolean e = false;
  private final Object f = new Object();
  
  protected ClientIdDefaultProvider(Context paramContext)
  {
    this.c = paramContext;
    e();
  }
  
  public static ClientIdDefaultProvider a()
  {
    synchronized (b)
    {
      ClientIdDefaultProvider localClientIdDefaultProvider = a;
      return localClientIdDefaultProvider;
    }
  }
  
  public static void a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null) {
        a = new ClientIdDefaultProvider(paramContext);
      }
      return;
    }
  }
  
  private boolean b(String paramString)
  {
    try
    {
      Log.c("Storing clientId.");
      FileOutputStream localFileOutputStream = this.c.openFileOutput("gaClientId", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      return true;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Log.a("Error creating clientId file.");
      return false;
    }
    catch (IOException localIOException)
    {
      Log.a("Error writing to clientId file.");
    }
    return false;
  }
  
  private String d()
  {
    if (!this.e) {}
    synchronized (this.f)
    {
      if (!this.e) {
        Log.c("Waiting for clientId to load");
      }
      try
      {
        do
        {
          this.f.wait();
        } while (!this.e);
        Log.c("Loaded clientId");
        return this.d;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Log.a("Exception while waiting for clientId: " + localInterruptedException);
        }
      }
    }
  }
  
  private void e()
  {
    new ClientIdDefaultProvider.1(this, "client_id_fetcher").start();
  }
  
  public String a(String paramString)
  {
    if ("&cid".equals(paramString)) {
      return d();
    }
    return null;
  }
  
  protected String b()
  {
    String str = UUID.randomUUID().toString().toLowerCase();
    if (!b(str)) {
      str = "0";
    }
    return str;
  }
  
  String c()
  {
    Object localObject = null;
    try
    {
      localFileInputStream = this.c.openFileInput("gaClientId");
      byte[] arrayOfByte = new byte[''];
      int i = localFileInputStream.read(arrayOfByte, 0, 128);
      if (localFileInputStream.available() > 0)
      {
        Log.a("clientId file seems corrupted, deleting it.");
        localFileInputStream.close();
        this.c.deleteFile("gaClientId");
      }
      for (;;)
      {
        if (localObject == null) {
          localObject = b();
        }
        return localObject;
        if (i > 0) {
          break;
        }
        Log.a("clientId file seems empty, deleting it.");
        localFileInputStream.close();
        this.c.deleteFile("gaClientId");
        localObject = null;
      }
      str = new String(arrayOfByte, 0, i);
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        try
        {
          FileInputStream localFileInputStream;
          localFileInputStream.close();
          localObject = str;
        }
        catch (IOException localIOException2)
        {
          localObject = str;
          continue;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          String str;
          localObject = str;
        }
        localIOException1 = localIOException1;
        Log.a("Error reading clientId file, deleting it.");
        this.c.deleteFile("gaClientId");
      }
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      for (;;)
      {
        localObject = null;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.ClientIdDefaultProvider
 * JD-Core Version:    0.7.0.1
 */