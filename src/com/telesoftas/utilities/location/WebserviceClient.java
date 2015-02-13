package com.telesoftas.utilities.location;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class WebserviceClient
{
  public byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  /* Error */
  public byte[] a(java.lang.String paramString)
  {
    // Byte code:
    //   0: new 32	java/net/URL
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 35	java/net/URL:<init>	(Ljava/lang/String;)V
    //   8: invokevirtual 39	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   11: checkcast 41	java/net/HttpURLConnection
    //   14: astore_2
    //   15: new 43	java/io/BufferedInputStream
    //   18: dup
    //   19: aload_2
    //   20: invokevirtual 47	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   23: invokespecial 50	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   26: astore_3
    //   27: aload_0
    //   28: aload_3
    //   29: invokevirtual 52	com/telesoftas/utilities/location/WebserviceClient:a	(Ljava/io/InputStream;)[B
    //   32: astore 6
    //   34: aload_3
    //   35: ifnull +7 -> 42
    //   38: aload_3
    //   39: invokevirtual 55	java/io/InputStream:close	()V
    //   42: aload_2
    //   43: invokevirtual 58	java/net/HttpURLConnection:disconnect	()V
    //   46: aload 6
    //   48: areturn
    //   49: astore 7
    //   51: aload 7
    //   53: invokestatic 63	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   56: aload 6
    //   58: areturn
    //   59: astore 4
    //   61: aconst_null
    //   62: astore_3
    //   63: aload_3
    //   64: ifnull +7 -> 71
    //   67: aload_3
    //   68: invokevirtual 55	java/io/InputStream:close	()V
    //   71: aload_2
    //   72: invokevirtual 58	java/net/HttpURLConnection:disconnect	()V
    //   75: aload 4
    //   77: athrow
    //   78: astore 5
    //   80: aload 5
    //   82: invokestatic 63	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   85: goto -10 -> 75
    //   88: astore 4
    //   90: goto -27 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	WebserviceClient
    //   0	93	1	paramString	java.lang.String
    //   14	58	2	localHttpURLConnection	java.net.HttpURLConnection
    //   26	42	3	localBufferedInputStream	java.io.BufferedInputStream
    //   59	17	4	localObject1	Object
    //   88	1	4	localObject2	Object
    //   78	3	5	localException1	java.lang.Exception
    //   32	25	6	arrayOfByte	byte[]
    //   49	3	7	localException2	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   42	46	49	java/lang/Exception
    //   15	27	59	finally
    //   71	75	78	java/lang/Exception
    //   27	34	88	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.location.WebserviceClient
 * JD-Core Version:    0.7.0.1
 */