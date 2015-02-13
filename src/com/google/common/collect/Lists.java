package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;

public final class Lists
{
  static int a(List<?> paramList)
  {
    int i = 1;
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      int j = i * 31;
      if (localObject == null) {}
      for (int k = 0;; k = localObject.hashCode())
      {
        i = k + j;
        break;
      }
    }
    return i;
  }
  
  static boolean a(List<?> paramList, @Nullable Object paramObject)
  {
    if (paramObject == Preconditions.a(paramList)) {}
    List localList;
    do
    {
      return true;
      if (!(paramObject instanceof List)) {
        return false;
      }
      localList = (List)paramObject;
    } while ((paramList.size() == localList.size()) && (Iterators.a(paramList.iterator(), localList.iterator())));
    return false;
  }
  
  static int b(List<?> paramList, @Nullable Object paramObject)
  {
    ListIterator localListIterator = paramList.listIterator();
    while (localListIterator.hasNext()) {
      if (Objects.a(paramObject, localListIterator.next())) {
        return localListIterator.previousIndex();
      }
    }
    return -1;
  }
  
  static int c(List<?> paramList, @Nullable Object paramObject)
  {
    ListIterator localListIterator = paramList.listIterator(paramList.size());
    while (localListIterator.hasPrevious()) {
      if (Objects.a(paramObject, localListIterator.previous())) {
        return localListIterator.nextIndex();
      }
    }
    return -1;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Lists
 * JD-Core Version:    0.7.0.1
 */