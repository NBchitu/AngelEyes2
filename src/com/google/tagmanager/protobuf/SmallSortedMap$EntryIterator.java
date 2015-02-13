package com.google.tagmanager.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class SmallSortedMap$EntryIterator
  implements Iterator<Map.Entry<K, V>>
{
  private int b = -1;
  private boolean c;
  private Iterator<Map.Entry<K, V>> d;
  
  private SmallSortedMap$EntryIterator(SmallSortedMap paramSmallSortedMap) {}
  
  private Iterator<Map.Entry<K, V>> b()
  {
    if (this.d == null) {
      this.d = SmallSortedMap.c(this.a).entrySet().iterator();
    }
    return this.d;
  }
  
  public Map.Entry<K, V> a()
  {
    this.c = true;
    int i = 1 + this.b;
    this.b = i;
    if (i < SmallSortedMap.b(this.a).size()) {
      return (Map.Entry)SmallSortedMap.b(this.a).get(this.b);
    }
    return (Map.Entry)b().next();
  }
  
  public boolean hasNext()
  {
    return (1 + this.b < SmallSortedMap.b(this.a).size()) || (b().hasNext());
  }
  
  public void remove()
  {
    if (!this.c) {
      throw new IllegalStateException("remove() was called before next()");
    }
    this.c = false;
    SmallSortedMap.a(this.a);
    if (this.b < SmallSortedMap.b(this.a).size())
    {
      SmallSortedMap localSmallSortedMap = this.a;
      int i = this.b;
      this.b = (i - 1);
      SmallSortedMap.a(localSmallSortedMap, i);
      return;
    }
    b().remove();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.SmallSortedMap.EntryIterator
 * JD-Core Version:    0.7.0.1
 */