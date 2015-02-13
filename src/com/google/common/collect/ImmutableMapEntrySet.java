package com.google.common.collect;

import java.util.Map.Entry;
import javax.annotation.Nullable;

abstract class ImmutableMapEntrySet<K, V>
  extends ImmutableSet<Map.Entry<K, V>>
{
  boolean a()
  {
    return c().g();
  }
  
  abstract ImmutableMap<K, V> c();
  
  public boolean contains(@Nullable Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    if (bool1)
    {
      Map.Entry localEntry = (Map.Entry)paramObject;
      Object localObject = c().get(localEntry.getKey());
      bool2 = false;
      if (localObject != null)
      {
        boolean bool3 = localObject.equals(localEntry.getValue());
        bool2 = false;
        if (bool3) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public int size()
  {
    return c().size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableMapEntrySet
 * JD-Core Version:    0.7.0.1
 */