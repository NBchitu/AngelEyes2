package com.google.common.collect;

abstract class ImmutableAsList<E>
  extends ImmutableList<E>
{
  boolean a()
  {
    return d().a();
  }
  
  public boolean contains(Object paramObject)
  {
    return d().contains(paramObject);
  }
  
  abstract ImmutableCollection<E> d();
  
  public boolean isEmpty()
  {
    return d().isEmpty();
  }
  
  public int size()
  {
    return d().size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableAsList
 * JD-Core Version:    0.7.0.1
 */