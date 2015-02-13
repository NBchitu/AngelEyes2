package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;

public final class ImmutableList$Builder<E>
  extends ImmutableCollection.Builder<E>
{
  private Object[] a;
  private int b;
  
  public ImmutableList$Builder()
  {
    this(4);
  }
  
  ImmutableList$Builder(int paramInt)
  {
    this.a = new Object[paramInt];
    this.b = 0;
  }
  
  Builder<E> a(int paramInt)
  {
    int i = paramInt + this.b;
    if (this.a.length < i) {
      this.a = ObjectArrays.b(this.a, a(this.a.length, i));
    }
    return this;
  }
  
  public ImmutableList<E> a()
  {
    switch (this.b)
    {
    default: 
      if (this.b == this.a.length) {
        return new RegularImmutableList(this.a);
      }
      break;
    case 0: 
      return ImmutableList.g();
    case 1: 
      return ImmutableList.a(this.a[0]);
    }
    return new RegularImmutableList(ObjectArrays.b(this.a, this.b));
  }
  
  public Builder<E> b(Iterable<? extends E> paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      a(((Collection)paramIterable).size());
    }
    super.a(paramIterable);
    return this;
  }
  
  public Builder<E> b(E paramE)
  {
    Preconditions.a(paramE);
    a(1);
    Object[] arrayOfObject = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfObject[i] = paramE;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableList.Builder
 * JD-Core Version:    0.7.0.1
 */