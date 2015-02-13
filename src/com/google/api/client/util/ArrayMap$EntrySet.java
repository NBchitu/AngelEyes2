package com.google.api.client.util;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class ArrayMap$EntrySet
  extends AbstractSet<Map.Entry<K, V>>
{
  ArrayMap$EntrySet(ArrayMap paramArrayMap) {}
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new ArrayMap.EntryIterator(this.a);
  }
  
  public int size()
  {
    return this.a.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ArrayMap.EntrySet
 * JD-Core Version:    0.7.0.1
 */