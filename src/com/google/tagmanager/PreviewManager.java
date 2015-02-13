package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class PreviewManager
{
  private static PreviewManager a;
  private volatile PreviewManager.PreviewMode b;
  private volatile String c;
  private volatile String d;
  private volatile String e;
  
  PreviewManager()
  {
    e();
  }
  
  static PreviewManager a()
  {
    try
    {
      if (a == null) {
        a = new PreviewManager();
      }
      PreviewManager localPreviewManager = a;
      return localPreviewManager;
    }
    finally {}
  }
  
  private String a(String paramString)
  {
    return paramString.split("&")[0].split("=")[1];
  }
  
  private String b(Uri paramUri)
  {
    return paramUri.getQuery().replace("&gtm_debug=x", "");
  }
  
  boolean a(Uri paramUri)
  {
    boolean bool = true;
    String str;
    try
    {
      str = URLDecoder.decode(paramUri.toString(), "UTF-8");
      if (!str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
        break label158;
      }
      Log.e("Container preview url: " + str);
      if (!str.matches(".*?&gtm_debug=x$")) {
        break label143;
      }
      this.b = PreviewManager.PreviewMode.c;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        bool = false;
        continue;
        this.b = PreviewManager.PreviewMode.b;
      }
    }
    finally {}
    this.e = b(paramUri);
    if ((this.b == PreviewManager.PreviewMode.b) || (this.b == PreviewManager.PreviewMode.c)) {
      this.d = ("/r?" + this.e);
    }
    this.c = a(this.e);
    for (;;)
    {
      return bool;
      label143:
      label158:
      if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
      {
        if (a(paramUri.getQuery()).equals(this.c))
        {
          Log.e("Exit preview mode for container: " + this.c);
          this.b = PreviewManager.PreviewMode.a;
          this.d = null;
        }
      }
      else
      {
        Log.b("Invalid preview uri: " + str);
        bool = false;
        continue;
      }
      bool = false;
    }
  }
  
  PreviewManager.PreviewMode b()
  {
    return this.b;
  }
  
  String c()
  {
    return this.d;
  }
  
  String d()
  {
    return this.c;
  }
  
  void e()
  {
    this.b = PreviewManager.PreviewMode.a;
    this.d = null;
    this.c = null;
    this.e = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.PreviewManager
 * JD-Core Version:    0.7.0.1
 */