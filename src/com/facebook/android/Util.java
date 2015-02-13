package com.facebook.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public final class Util
{
  private static boolean a = false;
  
  public static Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    String[] arrayOfString1;
    int i;
    if (paramString != null)
    {
      arrayOfString1 = paramString.split("&");
      i = arrayOfString1.length;
    }
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return localBundle;
      }
      String[] arrayOfString2 = arrayOfString1[j].split("=");
      if (arrayOfString2.length == 2) {
        localBundle.putString(URLDecoder.decode(arrayOfString2[0]), URLDecoder.decode(arrayOfString2[1]));
      }
    }
  }
  
  public static String a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    int i = 1;
    String str;
    do
    {
      if (!localIterator.hasNext()) {
        return localStringBuilder.toString();
      }
      str = (String)localIterator.next();
    } while (!(paramBundle.get(str) instanceof String));
    if (i != 0) {
      i = 0;
    }
    for (;;)
    {
      localStringBuilder.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(paramBundle.getString(str)));
      break;
      localStringBuilder.append("&");
    }
  }
  
  public static String a(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localStringBuilder.toString();
      }
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if ((localObject instanceof String))
      {
        localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n\r\n" + (String)localObject);
        localStringBuilder.append("\r\n--" + paramString + "\r\n");
      }
    }
  }
  
  private static String a(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 1000);
    for (String str = localBufferedReader.readLine();; str = localBufferedReader.readLine())
    {
      if (str == null)
      {
        paramInputStream.close();
        return localStringBuilder.toString();
      }
      localStringBuilder.append(str);
    }
  }
  
  public static String a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2.equals("GET")) {
      paramString1 = paramString1 + "?" + a(paramBundle);
    }
    a("Facebook-Util", paramString2 + " URL: " + paramString1);
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString1).openConnection();
    localHttpURLConnection.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
    Bundle localBundle;
    Iterator localIterator1;
    BufferedOutputStream localBufferedOutputStream;
    Iterator localIterator2;
    if (!paramString2.equals("GET"))
    {
      localBundle = new Bundle();
      localIterator1 = paramBundle.keySet().iterator();
      if (localIterator1.hasNext()) {
        break label383;
      }
      if (!paramBundle.containsKey("method")) {
        paramBundle.putString("method", paramString2);
      }
      if (paramBundle.containsKey("access_token")) {
        paramBundle.putString("access_token", URLDecoder.decode(paramBundle.getString("access_token")));
      }
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
      localHttpURLConnection.setDoOutput(true);
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.setRequestProperty("Connection", "Keep-Alive");
      localHttpURLConnection.connect();
      localBufferedOutputStream = new BufferedOutputStream(localHttpURLConnection.getOutputStream());
      localBufferedOutputStream.write(("--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
      localBufferedOutputStream.write(a(paramBundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
      localBufferedOutputStream.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
      if (!localBundle.isEmpty()) {
        localIterator2 = localBundle.keySet().iterator();
      }
    }
    for (;;)
    {
      if (!localIterator2.hasNext()) {
        localBufferedOutputStream.flush();
      }
      label383:
      try
      {
        String str2 = a(localHttpURLConnection.getInputStream());
        return str2;
      }
      catch (FileNotFoundException localFileNotFoundException) {}
      String str1 = (String)localIterator1.next();
      Object localObject = paramBundle.get(str1);
      if (!(localObject instanceof byte[])) {
        break;
      }
      localBundle.putByteArray(str1, (byte[])localObject);
      break;
      String str3 = (String)localIterator2.next();
      localBufferedOutputStream.write(("Content-Disposition: form-data; filename=\"" + str3 + "\"" + "\r\n").getBytes());
      localBufferedOutputStream.write(("Content-Type: content/unknown" + "\r\n" + "\r\n").getBytes());
      localBufferedOutputStream.write(localBundle.getByteArray(str3));
      localBufferedOutputStream.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
    }
    return a(localHttpURLConnection.getErrorStream());
  }
  
  public static void a(Context paramContext)
  {
    CookieSyncManager.createInstance(paramContext);
    CookieManager.getInstance().removeAllCookie();
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(paramString2);
    localBuilder.create().show();
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (a) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static Bundle b(String paramString)
  {
    String str = paramString.replace("fbconnect", "http");
    try
    {
      URL localURL = new URL(str);
      Bundle localBundle = a(localURL.getQuery());
      localBundle.putAll(a(localURL.getRef()));
      return localBundle;
    }
    catch (MalformedURLException localMalformedURLException) {}
    return new Bundle();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.Util
 * JD-Core Version:    0.7.0.1
 */