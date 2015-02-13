package com.google.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;

@TargetApi(12)
class LRUCache<K, V>
  implements Cache<K, V>
{
  private LruCache<K, V> a;
  
  LRUCache(int paramInt, CacheFactory.CacheSizeManager<K, V> paramCacheSizeManager)
  {
    this.a = new LRUCache.1(this, paramInt, paramCacheSizeManager);
  }
  
  public V a(K paramK)
  {
    return this.a.get(paramK);
  }
  
  public void a(K paramK, V paramV)
  {
    this.a.put(paramK, paramV);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.LRUCache
 * JD-Core Version:    0.7.0.1
 */