package com.fridaylab.util;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.telesoftas.utilities.ByteUtils;
import com.telesoftas.utilities.StringUtils;
import com.telesoftas.utilities.location.LocationHelperSingleton;
import com.telesoftas.utilities.location.LocationListenerInterface;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

public class ByteLogger
  implements LocationListenerInterface
{
  public static boolean a = false;
  private static final Object b = new Object();
  private static ByteLogger c;
  private static StringBuilder d = new StringBuilder();
  private static LocationHelperSingleton e;
  private final GZIPOutputStream f;
  private final OutputStreamWriter g;
  private Location h;
  
  private ByteLogger(Context paramContext)
  {
    long l = System.currentTimeMillis();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(l)));
    String str = Long.toHexString(l);
    localStringBuilder.append("@");
    localStringBuilder.append(str.substring(Math.max(0, -8 + str.length())));
    localStringBuilder.append(".deep.gz");
    this.f = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(new File(paramContext.getExternalFilesDir("deeper"), localStringBuilder.toString()))));
    this.g = new OutputStreamWriter(this.f);
  }
  
  public static void a()
  {
    if (c == null) {
      return;
    }
    try
    {
      c.c();
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("Logger", "problem closing log", localIOException);
      return;
    }
    finally
    {
      c = null;
    }
  }
  
  public static void a(Context paramContext)
  {
    synchronized (b)
    {
      try
      {
        b(paramContext);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("Logger", "failed to initialize", localIOException);
        }
      }
    }
  }
  
  public static void a(Context paramContext, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    synchronized (b)
    {
      try
      {
        b(paramContext);
        c.b();
        c.a(false, paramArrayOfByte, paramInt1, paramInt2);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("Logger", "failed to record received bytes", localIOException);
        }
      }
    }
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    synchronized (b)
    {
      if (c == null)
      {
        Log.e("Logger", "tried to send bytes through a closed link");
        return;
      }
    }
    try
    {
      c.a(true, paramArrayOfByte, paramInt1, paramInt2);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.e("Logger", "failed to record sent bytes", localIOException);
      }
    }
  }
  
  private static void b(Context paramContext)
  {
    if (c != null) {
      return;
    }
    if (paramContext == null) {
      throw new IOException("Context not provided");
    }
    c = new ByteLogger(paramContext);
    e = LocationHelperSingleton.a(paramContext);
    new Handler(Looper.getMainLooper()).post(new ByteLogger.1());
  }
  
  public void a(Location paramLocation)
  {
    this.h = paramLocation;
    e.b(this);
  }
  
  public void a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    OutputStreamWriter localOutputStreamWriter1 = this.g;
    String str1;
    OutputStreamWriter localOutputStreamWriter2;
    if (paramBoolean)
    {
      str1 = "<";
      localOutputStreamWriter1.write(str1);
      this.g.write(StringUtils.a(System.currentTimeMillis()));
      localOutputStreamWriter2 = this.g;
      if (!paramBoolean) {
        break label91;
      }
    }
    label91:
    for (String str2 = "> ";; str2 = ") ")
    {
      localOutputStreamWriter2.write(str2);
      this.g.write(ByteUtils.a(paramArrayOfByte, paramInt1, paramInt2, " ", d));
      this.g.write("\n");
      return;
      str1 = "(";
      break;
    }
  }
  
  public void b()
  {
    if (this.h == null) {
      return;
    }
    d.delete(0, d.length());
    d.append("@").append(this.h.getLatitude()).append("~").append(this.h.getLongitude()).append("o").append(this.h.getAccuracy()).append("^").append(this.h.getAltitude()).append("*").append(this.h.getTime()).append("!").append(this.h.getSpeed()).append("\n");
    this.g.write(d.toString());
    this.h = null;
  }
  
  public void c()
  {
    this.g.flush();
    this.f.finish();
    this.g.close();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.ByteLogger
 * JD-Core Version:    0.7.0.1
 */