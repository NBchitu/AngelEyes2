package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.List;
import javax.annotation.Nullable;

final class SingletonImmutableList<E>
  extends ImmutableList<E>
{
  final transient E a;
  
  SingletonImmutableList(E paramE)
  {
    this.a = Preconditions.a(paramE);
  }
  
  public ImmutableList<E> a(int paramInt1, int paramInt2)
  {
    Preconditions.a(paramInt1, paramInt2, 1);
    if (paramInt1 == paramInt2) {
      this = ImmutableList.g();
    }
    return this;
  }
  
  boolean a()
  {
    return false;
  }
  
  public UnmodifiableIterator<E> b()
  {
    return Iterators.a(this.a);
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    List localList;
    do
    {
      return true;
      if (!(paramObject instanceof List)) {
        break;
      }
      localList = (List)paramObject;
    } while ((localList.size() == 1) && (this.a.equals(localList.get(0))));
    return false;
    return false;
  }
  
  public E get(int paramInt)
  {
    Preconditions.a(paramInt, 1);
    return this.a;
  }
  
  public int hashCode()
  {
    return 31 + this.a.hashCode();
  }
  
  public int indexOf(@Nullable Object paramObject)
  {
    if (this.a.equals(paramObject)) {
      return 0;
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public int lastIndexOf(@Nullable Object paramObject)
  {
    return indexOf(paramObject);
  }
  
  public int size()
  {
    return 1;
  }
  
  public Object[] toArray()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length == 0) {
      paramArrayOfT = ObjectArrays.a(paramArrayOfT, 1);
    }
    for (;;)
    {
      paramArrayOfT[0] = this.a;
      return paramArrayOfT;
      if (paramArrayOfT.length > 1) {
        paramArrayOfT[1] = null;
      }
    }
  }
  
  public String toString()
  {
    String str = this.a.toString();
    return 2 + str.length() + '[' + str + ']';
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.SingletonImmutableList
 * JD-Core Version:    0.7.0.1
 */