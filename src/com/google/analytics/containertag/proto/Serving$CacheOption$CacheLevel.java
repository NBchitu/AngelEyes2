package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.Internal.EnumLite;
import com.google.tagmanager.protobuf.Internal.EnumLiteMap;

public enum Serving$CacheOption$CacheLevel
  implements Internal.EnumLite
{
  private static Internal.EnumLiteMap<CacheLevel> d = new Serving.CacheOption.CacheLevel.1();
  private final int e;
  
  static
  {
    CacheLevel[] arrayOfCacheLevel = new CacheLevel[3];
    arrayOfCacheLevel[0] = a;
    arrayOfCacheLevel[1] = b;
    arrayOfCacheLevel[2] = c;
    f = arrayOfCacheLevel;
  }
  
  private Serving$CacheOption$CacheLevel(int paramInt1, int paramInt2)
  {
    this.e = paramInt2;
  }
  
  public static CacheLevel a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return a;
    case 2: 
      return b;
    }
    return c;
  }
  
  public final int a()
  {
    return this.e;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.CacheOption.CacheLevel
 * JD-Core Version:    0.7.0.1
 */