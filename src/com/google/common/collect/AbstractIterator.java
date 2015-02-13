package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T>
  extends UnmodifiableIterator<T>
{
  private AbstractIterator.State a = AbstractIterator.State.b;
  private T b;
  
  private boolean c()
  {
    this.a = AbstractIterator.State.d;
    this.b = a();
    if (this.a != AbstractIterator.State.c)
    {
      this.a = AbstractIterator.State.a;
      return true;
    }
    return false;
  }
  
  protected abstract T a();
  
  protected final T b()
  {
    this.a = AbstractIterator.State.c;
    return null;
  }
  
  public final boolean hasNext()
  {
    if (this.a != AbstractIterator.State.d) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Preconditions.b(bool1);
      int i = AbstractIterator.1.a[this.a.ordinal()];
      boolean bool2 = false;
      switch (i)
      {
      default: 
        bool2 = c();
      case 1: 
        return bool2;
      }
    }
    return true;
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    this.a = AbstractIterator.State.b;
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.AbstractIterator
 * JD-Core Version:    0.7.0.1
 */