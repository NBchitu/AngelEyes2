package com.google.common.collect;

import java.util.Set;
import javax.annotation.Nullable;

public abstract class ImmutableSet<E>
  extends ImmutableCollection<E>
  implements Set<E>
{
  private static final int a = (int)Math.floor(751619276.79999995D);
  
  public abstract UnmodifiableIterator<E> b();
  
  boolean d()
  {
    return false;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof ImmutableSet)) && (d()) && (((ImmutableSet)paramObject).d()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    return Sets.a(this, paramObject);
  }
  
  public int hashCode()
  {
    return Sets.a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableSet
 * JD-Core Version:    0.7.0.1
 */