package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

final class EmptyImmutableList
  extends ImmutableList<Object>
{
  static final EmptyImmutableList a = new EmptyImmutableList();
  
  public ImmutableList<Object> a(int paramInt1, int paramInt2)
  {
    Preconditions.a(paramInt1, paramInt2, 0);
    return this;
  }
  
  public UnmodifiableListIterator<Object> a(int paramInt)
  {
    Preconditions.b(paramInt, 0);
    return Iterators.a;
  }
  
  boolean a()
  {
    return false;
  }
  
  public UnmodifiableIterator<Object> b()
  {
    return c();
  }
  
  public UnmodifiableListIterator<Object> c()
  {
    return Iterators.a;
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    return false;
  }
  
  public boolean containsAll(Collection<?> paramCollection)
  {
    return paramCollection.isEmpty();
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if ((paramObject instanceof List)) {
      return ((List)paramObject).isEmpty();
    }
    return false;
  }
  
  public Object get(int paramInt)
  {
    Preconditions.a(paramInt, 0);
    throw new AssertionError("unreachable");
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public int indexOf(@Nullable Object paramObject)
  {
    return -1;
  }
  
  public boolean isEmpty()
  {
    return true;
  }
  
  public int lastIndexOf(@Nullable Object paramObject)
  {
    return -1;
  }
  
  public int size()
  {
    return 0;
  }
  
  public Object[] toArray()
  {
    return ObjectArrays.a;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length > 0) {
      paramArrayOfT[0] = null;
    }
    return paramArrayOfT;
  }
  
  public String toString()
  {
    return "[]";
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.EmptyImmutableList
 * JD-Core Version:    0.7.0.1
 */