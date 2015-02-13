package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Iterator;
import javax.annotation.Nullable;

public final class Iterators
{
  static final UnmodifiableListIterator<Object> a = new Iterators.1();
  private static final Iterator<Object> b = new Iterators.2();
  
  public static <T> UnmodifiableIterator<T> a(@Nullable T paramT)
  {
    return new Iterators.14(paramT);
  }
  
  public static <T> UnmodifiableIterator<T> a(Iterator<T> paramIterator, Predicate<? super T> paramPredicate)
  {
    Preconditions.a(paramIterator);
    Preconditions.a(paramPredicate);
    return new Iterators.8(paramIterator, paramPredicate);
  }
  
  static <T> UnmodifiableListIterator<T> a(T[] paramArrayOfT, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      Preconditions.a(paramInt1, paramInt1 + paramInt2, paramArrayOfT.length);
      return new Iterators.13(paramInt2, paramInt3, paramArrayOfT, paramInt1);
    }
  }
  
  public static <T> T a(Iterator<T> paramIterator, int paramInt)
  {
    a(paramInt);
    int j;
    for (int i = 0; paramIterator.hasNext(); i = j)
    {
      Object localObject = paramIterator.next();
      j = i + 1;
      if (i == paramInt) {
        return localObject;
      }
    }
    throw new IndexOutOfBoundsException("position (" + paramInt + ") must be less than the number of elements that remained (" + i + ")");
  }
  
  public static String a(Iterator<?> paramIterator)
  {
    return ']';
  }
  
  public static <F, T> Iterator<T> a(Iterator<F> paramIterator, Function<? super F, ? extends T> paramFunction)
  {
    Preconditions.a(paramFunction);
    return new Iterators.9(paramIterator, paramFunction);
  }
  
  private static void a(int paramInt)
  {
    if (paramInt < 0) {
      throw new IndexOutOfBoundsException("position (" + paramInt + ") must not be negative");
    }
  }
  
  public static boolean a(Iterator<?> paramIterator, @Nullable Object paramObject)
  {
    if (paramObject == null)
    {
      do
      {
        if (!paramIterator.hasNext()) {
          break;
        }
      } while (paramIterator.next() != null);
      return true;
    }
    while (paramIterator.hasNext()) {
      if (paramObject.equals(paramIterator.next())) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(Iterator<?> paramIterator1, Iterator<?> paramIterator2)
  {
    if (paramIterator1.hasNext()) {
      if (paramIterator2.hasNext()) {}
    }
    while (paramIterator2.hasNext())
    {
      return false;
      if (Objects.a(paramIterator1.next(), paramIterator2.next())) {
        break;
      }
      return false;
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterators
 * JD-Core Version:    0.7.0.1
 */