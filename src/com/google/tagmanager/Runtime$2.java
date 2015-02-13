package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

class Runtime$2
  implements CacheFactory.CacheSizeManager<String, ObjectAndStatic<TypeSystem.Value>>
{
  Runtime$2(Runtime paramRuntime) {}
  
  public int a(String paramString, ObjectAndStatic<TypeSystem.Value> paramObjectAndStatic)
  {
    return paramString.length() + ((TypeSystem.Value)paramObjectAndStatic.a()).V().length;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Runtime.2
 * JD-Core Version:    0.7.0.1
 */