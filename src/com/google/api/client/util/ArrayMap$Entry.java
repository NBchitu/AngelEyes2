package com.google.api.client.util;

import com.google.common.base.Objects;
import java.util.Map.Entry;

final class ArrayMap$Entry
  implements Map.Entry<K, V>
{
  private int b;
  
  ArrayMap$Entry(ArrayMap paramArrayMap, int paramInt)
  {
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    Map.Entry localEntry;
    do
    {
      return true;
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      localEntry = (Map.Entry)paramObject;
    } while ((Objects.a(getKey(), localEntry.getKey())) && (Objects.a(getValue(), localEntry.getValue())));
    return false;
  }
  
  public K getKey()
  {
    return this.a.a(this.b);
  }
  
  public V getValue()
  {
    return this.a.b(this.b);
  }
  
  public int hashCode()
  {
    return getKey().hashCode() ^ getValue().hashCode();
  }
  
  public V setValue(V paramV)
  {
    return this.a.a(this.b, paramV);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ArrayMap.Entry
 * JD-Core Version:    0.7.0.1
 */