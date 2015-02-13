package com.google.api.client.util;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class ArrayMap$EntryIterator
  implements Iterator<Map.Entry<K, V>>
{
  private boolean b;
  private int c;
  
  ArrayMap$EntryIterator(ArrayMap paramArrayMap) {}
  
  public Map.Entry<K, V> a()
  {
    int i = this.c;
    if (i == this.a.a) {
      throw new NoSuchElementException();
    }
    this.c = (1 + this.c);
    return new ArrayMap.Entry(this.a, i);
  }
  
  public boolean hasNext()
  {
    return this.c < this.a.a;
  }
  
  public void remove()
  {
    int i = -1 + this.c;
    if ((this.b) || (i < 0)) {
      throw new IllegalArgumentException();
    }
    this.a.c(i);
    this.b = true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ArrayMap.EntryIterator
 * JD-Core Version:    0.7.0.1
 */