package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

public final class Iterables
{
  public static <F, T> Iterable<T> a(Iterable<F> paramIterable, Function<? super F, ? extends T> paramFunction)
  {
    Preconditions.a(paramIterable);
    Preconditions.a(paramFunction);
    return new Iterables.8(paramIterable, paramFunction);
  }
  
  public static <T> Iterable<T> a(Iterable<T> paramIterable, Predicate<? super T> paramPredicate)
  {
    Preconditions.a(paramIterable);
    Preconditions.a(paramPredicate);
    return new Iterables.6(paramIterable, paramPredicate);
  }
  
  public static String a(Iterable<?> paramIterable)
  {
    return Iterators.a(paramIterable.iterator());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Iterables
 * JD-Core Version:    0.7.0.1
 */