package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.Nullable;

public abstract class ImmutableList<E>
  extends ImmutableCollection<E>
  implements List<E>, RandomAccess
{
  public static <E> ImmutableList<E> a(E paramE)
  {
    return new SingletonImmutableList(paramE);
  }
  
  public static <E> ImmutableList<E> a(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof ImmutableCollection))
    {
      ImmutableList localImmutableList = ((ImmutableCollection)paramCollection).e();
      if (localImmutableList.a()) {
        localImmutableList = b(localImmutableList);
      }
      return localImmutableList;
    }
    return b(paramCollection);
  }
  
  static <E> ImmutableList<E> a(Object[] paramArrayOfObject)
  {
    switch (paramArrayOfObject.length)
    {
    default: 
      return b(paramArrayOfObject);
    case 0: 
      return g();
    }
    return new SingletonImmutableList(paramArrayOfObject[0]);
  }
  
  private static <E> ImmutableList<E> b(Collection<? extends E> paramCollection)
  {
    return a(paramCollection.toArray());
  }
  
  private static <E> ImmutableList<E> b(Object... paramVarArgs)
  {
    for (int i = 0; i < paramVarArgs.length; i++) {
      ObjectArrays.a(paramVarArgs[i], i);
    }
    return new RegularImmutableList(paramVarArgs);
  }
  
  public static <E> ImmutableList<E> g()
  {
    return EmptyImmutableList.a;
  }
  
  public ImmutableList<E> a(int paramInt1, int paramInt2)
  {
    Preconditions.a(paramInt1, paramInt2, size());
    switch (paramInt2 - paramInt1)
    {
    default: 
      return b(paramInt1, paramInt2);
    case 0: 
      return g();
    }
    return a(get(paramInt1));
  }
  
  public UnmodifiableListIterator<E> a(int paramInt)
  {
    return new ImmutableList.1(this, size(), paramInt);
  }
  
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  ImmutableList<E> b(int paramInt1, int paramInt2)
  {
    return new ImmutableList.SubList(this, paramInt1, paramInt2 - paramInt1);
  }
  
  public UnmodifiableIterator<E> b()
  {
    return c();
  }
  
  public UnmodifiableListIterator<E> c()
  {
    return a(0);
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public ImmutableList<E> e()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    return Lists.a(this, paramObject);
  }
  
  public int hashCode()
  {
    return Lists.a(this);
  }
  
  public int indexOf(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    return Lists.b(this, paramObject);
  }
  
  public int lastIndexOf(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    return Lists.c(this, paramObject);
  }
  
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableList
 * JD-Core Version:    0.7.0.1
 */