package com.google.tagmanager.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

class LazyField$LazyIterator<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> a;
  
  public LazyField$LazyIterator(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    this.a = paramIterator;
  }
  
  public Map.Entry<K, Object> a()
  {
    Object localObject = (Map.Entry)this.a.next();
    if ((((Map.Entry)localObject).getValue() instanceof LazyField)) {
      localObject = new LazyField.LazyEntry((Map.Entry)localObject, null);
    }
    return localObject;
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public void remove()
  {
    this.a.remove();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.LazyField.LazyIterator
 * JD-Core Version:    0.7.0.1
 */