package com.google.common.collect;

import java.util.Map.Entry;

class ImmutableMapValues$1
  extends ImmutableAsList<V>
{
  ImmutableMapValues$1(ImmutableMapValues paramImmutableMapValues, ImmutableList paramImmutableList) {}
  
  ImmutableCollection<V> d()
  {
    return this.c;
  }
  
  public V get(int paramInt)
  {
    return ((Map.Entry)this.a.get(paramInt)).getValue();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableMapValues.1
 * JD-Core Version:    0.7.0.1
 */