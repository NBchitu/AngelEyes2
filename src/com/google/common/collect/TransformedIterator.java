package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

abstract class TransformedIterator<F, T>
  implements Iterator<T>
{
  final Iterator<? extends F> b;
  
  TransformedIterator(Iterator<? extends F> paramIterator)
  {
    this.b = ((Iterator)Preconditions.a(paramIterator));
  }
  
  abstract T a(F paramF);
  
  public final boolean hasNext()
  {
    return this.b.hasNext();
  }
  
  public final T next()
  {
    return a(this.b.next());
  }
  
  public final void remove()
  {
    this.b.remove();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.TransformedIterator
 * JD-Core Version:    0.7.0.1
 */