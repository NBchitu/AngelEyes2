package com.google.common.collect;

class RegularImmutableAsList<E>
  extends ImmutableAsList<E>
{
  private final ImmutableCollection<E> a;
  private final ImmutableList<? extends E> c;
  
  RegularImmutableAsList(ImmutableCollection<E> paramImmutableCollection, ImmutableList<? extends E> paramImmutableList)
  {
    this.a = paramImmutableCollection;
    this.c = paramImmutableList;
  }
  
  RegularImmutableAsList(ImmutableCollection<E> paramImmutableCollection, Object[] paramArrayOfObject)
  {
    this(paramImmutableCollection, ImmutableList.a(paramArrayOfObject));
  }
  
  public UnmodifiableListIterator<E> a(int paramInt)
  {
    return this.c.a(paramInt);
  }
  
  ImmutableCollection<E> d()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    return this.c.equals(paramObject);
  }
  
  public E get(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public int hashCode()
  {
    return this.c.hashCode();
  }
  
  public int indexOf(Object paramObject)
  {
    return this.c.indexOf(paramObject);
  }
  
  public int lastIndexOf(Object paramObject)
  {
    return this.c.lastIndexOf(paramObject);
  }
  
  public Object[] toArray()
  {
    return this.c.toArray();
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.c.toArray(paramArrayOfT);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.RegularImmutableAsList
 * JD-Core Version:    0.7.0.1
 */