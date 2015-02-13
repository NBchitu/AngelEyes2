package com.google.api.client.util.escape;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class CharEscapers
{
  private static final Escaper a = new PercentEscaper("-_.*", true);
  private static final Escaper b = new PercentEscaper("-_.!~*'()@:$&,;=", false);
  private static final Escaper c = new PercentEscaper("-_.!~*'()@:$,;/?:", false);
  
  public static String a(String paramString)
  {
    return a.a(paramString);
  }
  
  public static String b(String paramString)
  {
    try
    {
      String str = URLDecoder.decode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException);
    }
  }
  
  public static String c(String paramString)
  {
    return b.a(paramString);
  }
  
  public static String d(String paramString)
  {
    return c.a(paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.escape.CharEscapers
 * JD-Core Version:    0.7.0.1
 */