package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Iterator;

final class Iterables$6
  extends FluentIterable<T>
{
  Iterables$6(Iterable paramIterable, Predicate paramPredicate) {}
  
  public Iterator<T> iterator()
  {
    return Iterators.a(this.a.iterator(), this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterables.6
 * JD-Core Version:    0.7.0.1
 */