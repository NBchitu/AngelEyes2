package com.google.common.collect;

import java.util.Iterator;

public abstract class ImmutableCollection$Builder<E>
{
  static int a(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 0) {
      throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
    int i = 1 + (paramInt1 + (paramInt1 >> 1));
    if (i < paramInt2) {
      i = Integer.highestOneBit(paramInt2 - 1) << 1;
    }
    if (i < 0) {
      i = 2147483647;
    }
    return i;
  }
  
  public Builder<E> a(Iterable<? extends E> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext()) {
      a(localIterator.next());
    }
    return this;
  }
  
  public abstract Builder<E> a(E paramE);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableCollection.Builder
 * JD-Core Version:    0.7.0.1
 */