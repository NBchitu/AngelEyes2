package com.fasterxml.jackson.core.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class InternCache
  extends LinkedHashMap<String, String>
{
  public static final InternCache a = new InternCache();
  
  private InternCache()
  {
    super(100, 0.8F, true);
  }
  
  public String a(String paramString)
  {
    try
    {
      String str = (String)get(paramString);
      if (str == null)
      {
        str = paramString.intern();
        put(str, str);
      }
      return str;
    }
    finally {}
  }
  
  protected boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
  {
    return size() > 100;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.util.InternCache
 * JD-Core Version:    0.7.0.1
 */