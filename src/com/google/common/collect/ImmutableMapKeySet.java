package com.google.common.collect;

import java.util.Map.Entry;
import javax.annotation.Nullable;

abstract class ImmutableMapKeySet<K, V>
  extends TransformedImmutableSet<Map.Entry<K, V>, K>
{
  ImmutableMapKeySet(ImmutableSet<Map.Entry<K, V>> paramImmutableSet)
  {
    super(paramImmutableSet);
  }
  
  ImmutableMapKeySet(ImmutableSet<Map.Entry<K, V>> paramImmutableSet, int paramInt)
  {
    super(paramImmutableSet, paramInt);
  }
  
  K a(Map.Entry<K, V> paramEntry)
  {
    return paramEntry.getKey();
  }
  
  boolean a()
  {
    return true;
  }
  
  abstract ImmutableMap<K, V> c();
  
  public boolean contains(@Nullable Object paramObject)
  {
    return c().containsKey(paramObject);
  }
  
  ImmutableList<K> f()
  {
    return new ImmutableMapKeySet.1(this, c().a().e());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableMapKeySet
 * JD-Core Version:    0.7.0.1
 */