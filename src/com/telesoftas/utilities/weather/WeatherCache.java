package com.telesoftas.utilities.weather;

import android.content.Context;
import android.location.Location;
import com.crashlytics.android.Crashlytics;
import com.telesoftas.httpcommunication.JsonHelper;
import com.telesoftas.httpcommunication.JsonHelper.WeatherItemList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class WeatherCache
{
  private String a = null;
  
  public WeatherCache(Context paramContext)
  {
    try
    {
      this.a = (paramContext.getCacheDir() + "/wheaters/");
      File localFile = new File(this.a);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      return;
    }
    catch (Exception localException)
    {
      Crashlytics.a(localException);
    }
  }
  
  public static String a(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes(), 0, paramString.length());
      String str = new BigInteger(1, localMessageDigest.digest()).toString(16);
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Crashlytics.a(localNoSuchAlgorithmException);
    }
    return null;
  }
  
  private void a(String paramString1, String paramString2)
  {
    FileOutputStream localFileOutputStream;
    try
    {
      localFileOutputStream = new FileOutputStream(this.a + paramString1, false);
      if (localFileOutputStream == null) {
        break label67;
      }
    }
    finally
    {
      try
      {
        localFileOutputStream.write(paramString2.getBytes());
        if (localFileOutputStream != null)
        {
          localFileOutputStream.flush();
          localFileOutputStream.close();
        }
        return;
      }
      finally {}
      localObject1 = finally;
      localFileOutputStream = null;
    }
    localFileOutputStream.flush();
    localFileOutputStream.close();
    label67:
    throw localObject1;
  }
  
  private String b(String paramString)
  {
    FileInputStream localFileInputStream = new FileInputStream(new File(this.a + paramString));
    try
    {
      FileChannel localFileChannel = localFileInputStream.getChannel();
      MappedByteBuffer localMappedByteBuffer = localFileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, localFileChannel.size());
      String str = Charset.defaultCharset().decode(localMappedByteBuffer).toString();
      return str;
    }
    finally
    {
      localFileInputStream.close();
    }
  }
  
  private static String c(Location paramLocation)
  {
    return a(Double.toString(paramLocation.getLatitude()) + Double.toString(paramLocation.getLongitude()));
  }
  
  private boolean c(String paramString)
  {
    boolean bool = true;
    File localFile = new File(this.a + paramString);
    if ((localFile != null) && (localFile.exists()))
    {
      long l = localFile.lastModified();
      if (System.currentTimeMillis() - l < 10800000L) {
        bool = false;
      }
    }
    return bool;
  }
  
  public List<WeatherItem> a(Location paramLocation)
  {
    JsonHelper.WeatherItemList localWeatherItemList = null;
    String str1;
    if (paramLocation != null)
    {
      str1 = c(paramLocation);
      boolean bool = c(str1);
      localWeatherItemList = null;
      if (bool) {}
    }
    try
    {
      String str3 = b(str1);
      str2 = str3;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Crashlytics.a(localIOException);
        String str2 = null;
      }
    }
    localWeatherItemList = null;
    if (str2 != null) {
      localWeatherItemList = JsonHelper.a(str2);
    }
    return localWeatherItemList;
  }
  
  public void a(Location paramLocation, String paramString)
  {
    String str;
    if (paramLocation != null) {
      str = c(paramLocation);
    }
    try
    {
      a(str, paramString);
      return;
    }
    catch (Exception localException)
    {
      Crashlytics.a(localException);
    }
  }
  
  public JsonHelper.WeatherItemList b(Location paramLocation)
  {
    JsonHelper.WeatherItemList localWeatherItemList = null;
    String str1;
    if (paramLocation != null) {
      str1 = c(paramLocation);
    }
    try
    {
      String str3 = b(str1);
      str2 = str3;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str2 = null;
      }
    }
    localWeatherItemList = null;
    if (str2 != null) {
      localWeatherItemList = JsonHelper.a(str2);
    }
    return localWeatherItemList;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.weather.WeatherCache
 * JD-Core Version:    0.7.0.1
 */