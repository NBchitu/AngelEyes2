package com.google.common.collect;

import java.util.ListIterator;

public abstract class UnmodifiableListIterator<E>
  extends UnmodifiableIterator<E>
  implements ListIterator<E>
{
  public final void add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void set(E paramE)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.UnmodifiableListIterator
 * JD-Core Version:    0.7.0.1
 */