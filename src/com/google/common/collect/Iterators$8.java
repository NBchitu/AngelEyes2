package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Iterator;

final class Iterators$8
  extends AbstractIterator<T>
{
  Iterators$8(Iterator paramIterator, Predicate paramPredicate) {}
  
  protected T a()
  {
    while (this.a.hasNext())
    {
      Object localObject = this.a.next();
      if (this.b.a(localObject)) {
        return localObject;
      }
    }
    return b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterators.8
 * JD-Core Version:    0.7.0.1
 */