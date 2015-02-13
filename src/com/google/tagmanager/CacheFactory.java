package com.google.tagmanager;

import android.os.Build.VERSION;

class CacheFactory<K, V>
{
  final CacheFactory.CacheSizeManager<K, V> a = new CacheFactory.1(this);
  
  int a()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public Cache<K, V> a(int paramInt, CacheFactory.CacheSizeManager<K, V> paramCacheSizeManager)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (a() < 12) {
      return new SimpleCache(paramInt, paramCacheSizeManager);
    }
    return new LRUCache(paramInt, paramCacheSizeManager);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.CacheFactory
 * JD-Core Version:    0.7.0.1
 */