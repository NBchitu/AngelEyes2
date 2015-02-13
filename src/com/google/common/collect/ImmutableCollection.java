package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.Nullable;

public abstract class ImmutableCollection<E>
  implements Serializable, Collection<E>
{
  static final ImmutableCollection<Object> b = new ImmutableCollection.EmptyImmutableCollection(null);
  private transient ImmutableList<E> a;
  
  abstract boolean a();
  
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract UnmodifiableIterator<E> b();
  
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    return (paramObject != null) && (Iterators.a(b(), paramObject));
  }
  
  public boolean containsAll(Collection<?> paramCollection)
  {
    return Collections2.a(this, paramCollection);
  }
  
  public ImmutableList<E> e()
  {
    ImmutableList localImmutableList = this.a;
    if (localImmutableList == null)
    {
      localImmutableList = f();
      this.a = localImmutableList;
    }
    return localImmutableList;
  }
  
  ImmutableList<E> f()
  {
    switch (size())
    {
    default: 
      return new RegularImmutableAsList(this, toArray());
    case 0: 
      return ImmutableList.g();
    }
    return ImmutableList.a(b().next());
  }
  
  public boolean isEmpty()
  {
    return size() == 0;
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public Object[] toArray()
  {
    return ObjectArrays.a(this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return ObjectArrays.a(this, paramArrayOfT);
  }
  
  public String toString()
  {
    return Collections2.a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableCollection
 * JD-Core Version:    0.7.0.1
 */