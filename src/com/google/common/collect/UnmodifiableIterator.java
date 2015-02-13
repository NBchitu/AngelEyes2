package com.google.common.collect;

import java.util.Iterator;

public abstract class UnmodifiableIterator<E>
  implements Iterator<E>
{
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.UnmodifiableIterator
 * JD-Core Version:    0.7.0.1
 */