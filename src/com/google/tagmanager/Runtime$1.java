package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

class Runtime$1
  implements CacheFactory.CacheSizeManager<ResourceUtil.ExpandedFunctionCall, ObjectAndStatic<TypeSystem.Value>>
{
  Runtime$1(Runtime paramRuntime) {}
  
  public int a(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall, ObjectAndStatic<TypeSystem.Value> paramObjectAndStatic)
  {
    return ((TypeSystem.Value)paramObjectAndStatic.a()).V().length;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Runtime.1
 * JD-Core Version:    0.7.0.1
 */