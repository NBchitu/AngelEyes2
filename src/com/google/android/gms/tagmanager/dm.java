package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class dm
{
  private static bz<d.a> a(bz<d.a> parambz)
  {
    try
    {
      bz localbz = new bz(di.c(a(di.a((d.a)parambz.a()))), parambz.b());
      return localbz;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      bh.a("Escape URI: unsupported encoding", localUnsupportedEncodingException);
    }
    return parambz;
  }
  
  private static bz<d.a> a(bz<d.a> parambz, int paramInt)
  {
    if (!a((d.a)parambz.a()))
    {
      bh.a("Escaping can only be applied to strings.");
      return parambz;
    }
    switch (paramInt)
    {
    default: 
      bh.a("Unsupported Value Escaping: " + paramInt);
      return parambz;
    }
    return a(parambz);
  }
  
  static bz<d.a> a(bz<d.a> parambz, int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      parambz = a(parambz, paramVarArgs[j]);
    }
    return parambz;
  }
  
  static String a(String paramString)
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }
  
  private static boolean a(d.a parama)
  {
    return di.c(parama) instanceof String;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.dm
 * JD-Core Version:    0.7.0.1
 */