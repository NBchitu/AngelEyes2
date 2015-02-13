package com.google.tagmanager.protobuf;

import java.util.Map.Entry;

class SmallSortedMap$Entry
  implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V>
{
  private final K b;
  private V c;
  
  SmallSortedMap$Entry(K paramK, V paramV)
  {
    this.b = paramV;
    Object localObject;
    this.c = localObject;
  }
  
  SmallSortedMap$Entry(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)localObject.getKey(), localObject.getValue());
  }
  
  private boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public int a(SmallSortedMap<K, V>.Entry paramSmallSortedMap)
  {
    return a().compareTo(paramSmallSortedMap.a());
  }
  
  public K a()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    Map.Entry localEntry;
    do
    {
      return true;
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      localEntry = (Map.Entry)paramObject;
    } while ((a(this.b, localEntry.getKey())) && (a(this.c, localEntry.getValue())));
    return false;
  }
  
  public V getValue()
  {
    return this.c;
  }
  
  public int hashCode()
  {
    int i;
    int j;
    if (this.b == null)
    {
      i = 0;
      Object localObject = this.c;
      j = 0;
      if (localObject != null) {
        break label35;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.b.hashCode();
      break;
      label35:
      j = this.c.hashCode();
    }
  }
  
  public V setValue(V paramV)
  {
    SmallSortedMap.a(this.a);
    Object localObject = this.c;
    this.c = paramV;
    return localObject;
  }
  
  public String toString()
  {
    return this.b + "=" + this.c;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.SmallSortedMap.Entry
 * JD-Core Version:    0.7.0.1
 */