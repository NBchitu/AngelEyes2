package com.google.common.collect;

import java.util.Map.Entry;

class ImmutableMapKeySet$1
  extends ImmutableAsList<K>
{
  ImmutableMapKeySet$1(ImmutableMapKeySet paramImmutableMapKeySet, ImmutableList paramImmutableList) {}
  
  ImmutableCollection<K> d()
  {
    return this.c;
  }
  
  public K get(int paramInt)
  {
    return ((Map.Entry)this.a.get(paramInt)).getKey();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableMapKeySet.1
 * JD-Core Version:    0.7.0.1
 */