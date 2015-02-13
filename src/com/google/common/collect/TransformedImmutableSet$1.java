package com.google.common.collect;

import java.util.Iterator;

class TransformedImmutableSet$1
  extends UnmodifiableIterator<E>
{
  TransformedImmutableSet$1(TransformedImmutableSet paramTransformedImmutableSet, Iterator paramIterator) {}
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public E next()
  {
    return this.b.a(this.a.next());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.TransformedImmutableSet.1
 * JD-Core Version:    0.7.0.1
 */