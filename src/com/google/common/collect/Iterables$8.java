package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

final class Iterables$8
  extends FluentIterable<T>
{
  Iterables$8(Iterable paramIterable, Function paramFunction) {}
  
  public Iterator<T> iterator()
  {
    return Iterators.a(this.a.iterator(), this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterables.8
 * JD-Core Version:    0.7.0.1
 */