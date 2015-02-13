package com.google.api.client.util;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class DataMap$EntrySet
  extends AbstractSet<Map.Entry<String, Object>>
{
  DataMap$EntrySet(DataMap paramDataMap) {}
  
  public DataMap.EntryIterator a()
  {
    return new DataMap.EntryIterator(this.a);
  }
  
  public void clear()
  {
    Iterator localIterator = this.a.b.a.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.a.b.a(str).a(this.a.a, null);
    }
  }
  
  public boolean isEmpty()
  {
    Iterator localIterator = this.a.b.a.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.a.b.a(str).a(this.a.a) != null) {
        return false;
      }
    }
    return true;
  }
  
  public int size()
  {
    Iterator localIterator = this.a.b.a.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.a.b.a(str).a(this.a.a) == null) {
        break label74;
      }
    }
    label74:
    for (int j = i + 1;; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.DataMap.EntrySet
 * JD-Core Version:    0.7.0.1
 */