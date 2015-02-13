package com.google.tagmanager.protobuf;

import java.util.Map.Entry;

class LazyField$LazyEntry<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, LazyField> a;
  
  private LazyField$LazyEntry(Map.Entry<K, LazyField> paramEntry)
  {
    this.a = paramEntry;
  }
  
  public K getKey()
  {
    return this.a.getKey();
  }
  
  public Object getValue()
  {
    LazyField localLazyField = (LazyField)this.a.getValue();
    if (localLazyField == null) {
      return null;
    }
    return localLazyField.a();
  }
  
  public Object setValue(Object paramObject)
  {
    if (!(paramObject instanceof MessageLite)) {
      throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
    return ((LazyField)this.a.getValue()).a((MessageLite)paramObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.LazyField.LazyEntry
 * JD-Core Version:    0.7.0.1
 */