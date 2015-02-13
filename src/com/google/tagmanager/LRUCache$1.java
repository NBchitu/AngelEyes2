package com.google.tagmanager;

import android.util.LruCache;

class LRUCache$1
  extends LruCache<K, V>
{
  LRUCache$1(LRUCache paramLRUCache, int paramInt, CacheFactory.CacheSizeManager paramCacheSizeManager)
  {
    super(paramInt);
  }
  
  protected int sizeOf(K paramK, V paramV)
  {
    return this.a.a(paramK, paramV);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.LRUCache.1
 * JD-Core Version:    0.7.0.1
 */