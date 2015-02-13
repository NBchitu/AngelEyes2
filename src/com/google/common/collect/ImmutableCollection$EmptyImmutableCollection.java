package com.google.common.collect;

import javax.annotation.Nullable;

class ImmutableCollection$EmptyImmutableCollection
  extends ImmutableCollection<Object>
{
  private static final Object[] a = new Object[0];
  
  boolean a()
  {
    return false;
  }
  
  public UnmodifiableIterator<Object> b()
  {
    return Iterators.a;
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    return false;
  }
  
  ImmutableList<Object> f()
  {
    return ImmutableList.g();
  }
  
  public boolean isEmpty()
  {
    return true;
  }
  
  public int size()
  {
    return 0;
  }
  
  public Object[] toArray()
  {
    return a;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length > 0) {
      paramArrayOfT[0] = null;
    }
    return paramArrayOfT;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableCollection.EmptyImmutableCollection
 * JD-Core Version:    0.7.0.1
 */