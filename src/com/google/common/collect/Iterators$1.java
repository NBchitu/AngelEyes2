package com.google.common.collect;

import java.util.NoSuchElementException;

final class Iterators$1
  extends UnmodifiableListIterator<Object>
{
  public boolean hasNext()
  {
    return false;
  }
  
  public boolean hasPrevious()
  {
    return false;
  }
  
  public Object next()
  {
    throw new NoSuchElementException();
  }
  
  public int nextIndex()
  {
    return 0;
  }
  
  public Object previous()
  {
    throw new NoSuchElementException();
  }
  
  public int previousIndex()
  {
    return -1;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterators.1
 * JD-Core Version:    0.7.0.1
 */