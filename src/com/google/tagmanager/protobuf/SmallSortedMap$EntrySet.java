package com.google.tagmanager.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class SmallSortedMap$EntrySet
  extends AbstractSet<Map.Entry<K, V>>
{
  private SmallSortedMap$EntrySet(SmallSortedMap paramSmallSortedMap) {}
  
  public boolean a(Map.Entry<K, V> paramEntry)
  {
    if (!contains(paramEntry))
    {
      this.a.a((Comparable)paramEntry.getKey(), paramEntry.getValue());
      return true;
    }
    return false;
  }
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    Map.Entry localEntry = (Map.Entry)paramObject;
    Object localObject1 = this.a.get(localEntry.getKey());
    Object localObject2 = localEntry.getValue();
    return (localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)));
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new SmallSortedMap.EntryIterator(this.a, null);
  }
  
  public boolean remove(Object paramObject)
  {
    Map.Entry localEntry = (Map.Entry)paramObject;
    if (contains(localEntry))
    {
      this.a.remove(localEntry.getKey());
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return this.a.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.SmallSortedMap.EntrySet
 * JD-Core Version:    0.7.0.1
 */