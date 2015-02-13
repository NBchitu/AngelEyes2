package com.telesoftas.utilities.weather;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.crashlytics.android.Crashlytics;
import com.telesoftas.httpcommunication.DeeperDefaultHttpClient;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BufferedHttpEntity;

public class WeatherService
{
  private static WeatherService a;
  private static DeeperDefaultHttpClient b;
  private final WeatherCache c;
  
  public WeatherService(Context paramContext)
  {
    b = DeeperDefaultHttpClient.a(paramContext);
    this.c = new WeatherCache(paramContext);
  }
  
  public static WeatherService a(Context paramContext)
  {
    if (a == null) {
      a = new WeatherService(paramContext);
    }
    return a;
  }
  
  /* Error */
  public static String a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 44	java/io/StringWriter
    //   3: dup
    //   4: invokespecial 45	java/io/StringWriter:<init>	()V
    //   7: astore_1
    //   8: sipush 1024
    //   11: newarray char
    //   13: astore_2
    //   14: new 47	java/io/BufferedReader
    //   17: dup
    //   18: new 49	java/io/InputStreamReader
    //   21: dup
    //   22: aload_0
    //   23: ldc 51
    //   25: invokespecial 54	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   28: invokespecial 57	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   31: astore_3
    //   32: aload_3
    //   33: aload_2
    //   34: invokevirtual 63	java/io/Reader:read	([C)I
    //   37: istore 6
    //   39: iload 6
    //   41: iconst_m1
    //   42: if_icmpeq +23 -> 65
    //   45: aload_1
    //   46: aload_2
    //   47: iconst_0
    //   48: iload 6
    //   50: invokevirtual 69	java/io/Writer:write	([CII)V
    //   53: goto -21 -> 32
    //   56: astore 5
    //   58: aload 5
    //   60: invokestatic 74	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   63: aconst_null
    //   64: areturn
    //   65: aload_0
    //   66: invokevirtual 79	java/io/InputStream:close	()V
    //   69: aload_1
    //   70: invokevirtual 83	java/lang/Object:toString	()Ljava/lang/String;
    //   73: astore 7
    //   75: aload 7
    //   77: areturn
    //   78: astore 4
    //   80: aload 4
    //   82: invokestatic 74	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   85: goto -22 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	paramInputStream	InputStream
    //   7	63	1	localStringWriter	java.io.StringWriter
    //   13	34	2	arrayOfChar	char[]
    //   31	2	3	localBufferedReader	java.io.BufferedReader
    //   78	3	4	localIOException	IOException
    //   56	3	5	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   37	12	6	i	int
    //   73	3	7	str	String
    // Exception table:
    //   from	to	target	type
    //   14	32	56	java/io/UnsupportedEncodingException
    //   32	39	56	java/io/UnsupportedEncodingException
    //   45	53	56	java/io/UnsupportedEncodingException
    //   65	75	56	java/io/UnsupportedEncodingException
    //   14	32	78	java/io/IOException
    //   32	39	78	java/io/IOException
    //   45	53	78	java/io/IOException
    //   65	75	78	java/io/IOException
  }
  
  private String a(HttpGet paramHttpGet, HttpPost paramHttpPost)
  {
    BufferedHttpEntity localBufferedHttpEntity = b.a(paramHttpGet, paramHttpPost);
    if (localBufferedHttpEntity != null) {
      try
      {
        InputStream localInputStream = localBufferedHttpEntity.getContent();
        if (localInputStream != null)
        {
          String str = a(localInputStream);
          return str;
        }
      }
      catch (IOException localIOException)
      {
        Crashlytics.a(localIOException);
      }
    }
    return null;
  }
  
  public void a(Handler paramHandler, Location paramLocation)
  {
    new WeatherService.1(this, paramLocation, paramHandler).start();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.weather.WeatherService
 * JD-Core Version:    0.7.0.1
 */