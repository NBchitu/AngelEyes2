package com.google.common.collect;

abstract class TransformedImmutableSet<D, E>
  extends ImmutableSet<E>
{
  final ImmutableCollection<D> c;
  final int d;
  
  TransformedImmutableSet(ImmutableCollection<D> paramImmutableCollection)
  {
    this.c = paramImmutableCollection;
    this.d = Sets.a(this);
  }
  
  TransformedImmutableSet(ImmutableCollection<D> paramImmutableCollection, int paramInt)
  {
    this.c = paramImmutableCollection;
    this.d = paramInt;
  }
  
  abstract E a(D paramD);
  
  public UnmodifiableIterator<E> b()
  {
    return new TransformedImmutableSet.1(this, this.c.b());
  }
  
  boolean d()
  {
    return true;
  }
  
  public final int hashCode()
  {
    return this.d;
  }
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public int size()
  {
    return this.c.size();
  }
  
  public Object[] toArray()
  {
    return toArray(new Object[size()]);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return ObjectArrays.a(this, paramArrayOfT);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.TransformedImmutableSet
 * JD-Core Version:    0.7.0.1
 */