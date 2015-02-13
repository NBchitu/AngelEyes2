package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.Nullable;

class ImmutableEntry<K, V>
  extends AbstractMapEntry<K, V>
  implements Serializable
{
  private final K a;
  private final V b;
  
  ImmutableEntry(@Nullable K paramK, @Nullable V paramV)
  {
    this.a = paramK;
    this.b = paramV;
  }
  
  @Nullable
  public K getKey()
  {
    return this.a;
  }
  
  @Nullable
  public V getValue()
  {
    return this.b;
  }
  
  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableEntry
 * JD-Core Version:    0.7.0.1
 */