package com.telesoftas.utilities;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import java.io.File;
import java.io.InputStream;

public class FileUtils
{
  public static InputStream a(Context paramContext, String paramString)
  {
    return paramContext.getAssets().open(paramString);
  }
  
  public static String a(String paramString)
  {
    return a(paramString, "_thumb");
  }
  
  public static String a(String paramString1, String paramString2)
  {
    int i = paramString1.lastIndexOf('.');
    return paramString1.substring(0, i) + paramString2 + paramString1.substring(i);
  }
  
  public static boolean a()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  public static void b(String paramString)
  {
    File localFile = new File(paramString);
    if (localFile.exists()) {
      localFile.delete();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.FileUtils
 * JD-Core Version:    0.7.0.1
 */