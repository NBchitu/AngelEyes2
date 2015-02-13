package com.google.common.collect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

public final class Collections2
{
  static final Joiner a = Joiner.a(", ").b("null");
  
  static String a(Collection<?> paramCollection)
  {
    StringBuilder localStringBuilder = a(paramCollection.size()).append('[');
    a.a(localStringBuilder, Iterables.a(paramCollection, new Collections2.1(paramCollection)));
    return ']';
  }
  
  static StringBuilder a(int paramInt)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool, "size must be non-negative");
      return new StringBuilder((int)Math.min(8L * paramInt, 1073741824L));
    }
  }
  
  static boolean a(Collection<?> paramCollection1, Collection<?> paramCollection2)
  {
    Preconditions.a(paramCollection1);
    Iterator localIterator = paramCollection2.iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection1.contains(localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Collections2
 * JD-Core Version:    0.7.0.1
 */