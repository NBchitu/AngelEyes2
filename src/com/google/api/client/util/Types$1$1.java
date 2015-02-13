package com.google.api.client.util;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Types$1$1
  implements Iterator<T>
{
  final int a = Array.getLength(this.c.a);
  int b = 0;
  
  Types$1$1(Types.1 param1) {}
  
  public boolean hasNext()
  {
    return this.b < this.a;
  }
  
  public T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    Object localObject = this.c.a;
    int i = this.b;
    this.b = (i + 1);
    return Array.get(localObject, i);
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.Types.1.1
 * JD-Core Version:    0.7.0.1
 */