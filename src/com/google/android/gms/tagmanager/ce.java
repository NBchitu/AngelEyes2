package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class ce
{
  private static ce a;
  private volatile ce.a b;
  private volatile String c;
  private volatile String d;
  private volatile String e;
  
  ce()
  {
    e();
  }
  
  static ce a()
  {
    try
    {
      if (a == null) {
        a = new ce();
      }
      ce localce = a;
      return localce;
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
      bh.d("Container preview url: " + str);
      if (!str.matches(".*?&gtm_debug=x$")) {
        break label143;
      }
      this.b = ce.a.c;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        bool = false;
        continue;
        this.b = ce.a.b;
      }
    }
    finally {}
    this.e = b(paramUri);
    if ((this.b == ce.a.b) || (this.b == ce.a.c)) {
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
          bh.d("Exit preview mode for container: " + this.c);
          this.b = ce.a.a;
          this.d = null;
        }
      }
      else
      {
        bh.b("Invalid preview uri: " + str);
        bool = false;
        continue;
      }
      bool = false;
    }
  }
  
  ce.a b()
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
    this.b = ce.a.a;
    this.d = null;
    this.c = null;
    this.e = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ce
 * JD-Core Version:    0.7.0.1
 */