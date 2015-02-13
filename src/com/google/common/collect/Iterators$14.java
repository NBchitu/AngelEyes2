package com.google.common.collect;

import java.util.NoSuchElementException;

final class Iterators$14
  extends UnmodifiableIterator<T>
{
  boolean a;
  
  Iterators$14(Object paramObject) {}
  
  public boolean hasNext()
  {
    return !this.a;
  }
  
  public T next()
  {
    if (this.a) {
      throw new NoSuchElementException();
    }
    this.a = true;
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterators.14
 * JD-Core Version:    0.7.0.1
 */