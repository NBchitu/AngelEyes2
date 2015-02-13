package com.google.common.collect;

import com.google.common.base.Preconditions;

class ImmutableList$SubList
  extends ImmutableList<E>
{
  final transient int a;
  final transient int c;
  
  ImmutableList$SubList(ImmutableList paramImmutableList, int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.c = paramInt2;
  }
  
  public ImmutableList<E> a(int paramInt1, int paramInt2)
  {
    Preconditions.a(paramInt1, paramInt2, this.c);
    return this.d.a(paramInt1 + this.a, paramInt2 + this.a);
  }
  
  boolean a()
  {
    return true;
  }
  
  public E get(int paramInt)
  {
    Preconditions.a(paramInt, this.c);
    return this.d.get(paramInt + this.a);
  }
  
  public int size()
  {
    return this.c;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableList.SubList
 * JD-Core Version:    0.7.0.1
 */