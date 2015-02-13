package com.google.common.collect;

public abstract class FluentIterable<E>
  implements Iterable<E>
{
  private final Iterable<E> a = this;
  
  public String toString()
  {
    return Iterables.a(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.FluentIterable
 * JD-Core Version:    0.7.0.1
 */