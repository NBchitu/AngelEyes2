package com.google.common.collect;

import java.util.Map.Entry;

class RegularImmutableMap$EntrySet
  extends ImmutableMapEntrySet<K, V>
{
  private RegularImmutableMap$EntrySet(RegularImmutableMap paramRegularImmutableMap) {}
  
  public UnmodifiableIterator<Map.Entry<K, V>> b()
  {
    return e().b();
  }
  
  ImmutableMap<K, V> c()
  {
    return this.a;
  }
  
  ImmutableList<Map.Entry<K, V>> f()
  {
    return new RegularImmutableAsList(this, RegularImmutableMap.a(this.a));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.RegularImmutableMap.EntrySet
 * JD-Core Version:    0.7.0.1
 */