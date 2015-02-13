package com.google.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class SimpleCache<K, V>
  implements Cache<K, V>
{
  private final Map<K, V> a = new HashMap();
  private final int b;
  private final CacheFactory.CacheSizeManager<K, V> c;
  private int d;
  
  SimpleCache(int paramInt, CacheFactory.CacheSizeManager<K, V> paramCacheSizeManager)
  {
    this.b = paramInt;
    this.c = paramCacheSizeManager;
  }
  
  public V a(K paramK)
  {
    try
    {
      Object localObject2 = this.a.get(paramK);
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }
  
  public void a(K paramK, V paramV)
  {
    if ((paramK == null) || (paramV == null)) {
      try
      {
        throw new NullPointerException("key == null || value == null");
      }
      finally {}
    }
    this.d += this.c.a(paramK, paramV);
    if (this.d > this.b)
    {
      Iterator localIterator = this.a.entrySet().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.d -= this.c.a(localEntry.getKey(), localEntry.getValue());
        localIterator.remove();
      } while (this.d > this.b);
    }
    this.a.put(paramK, paramV);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.SimpleCache
 * JD-Core Version:    0.7.0.1
 */