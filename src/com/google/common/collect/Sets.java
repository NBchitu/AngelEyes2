package com.google.common.collect;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;

public final class Sets
{
  static int a(Set<?> paramSet)
  {
    Iterator localIterator = paramSet.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject != null) {}
      for (int j = localObject.hashCode();; j = 0)
      {
        i += j;
        break;
      }
    }
    return i;
  }
  
  public static <E> HashSet<E> a(int paramInt)
  {
    return new HashSet(Maps.a(paramInt));
  }
  
  public static <E> HashSet<E> a(E... paramVarArgs)
  {
    HashSet localHashSet = a(paramVarArgs.length);
    Collections.addAll(localHashSet, paramVarArgs);
    return localHashSet;
  }
  
  static boolean a(Set<?> paramSet, @Nullable Object paramObject)
  {
    boolean bool1 = true;
    boolean bool3;
    if (paramSet == paramObject) {
      bool3 = bool1;
    }
    boolean bool2;
    do
    {
      return bool3;
      bool2 = paramObject instanceof Set;
      bool3 = false;
    } while (!bool2);
    Set localSet = (Set)paramObject;
    try
    {
      if (paramSet.size() == localSet.size())
      {
        boolean bool4 = paramSet.containsAll(localSet);
        if (!bool4) {}
      }
      for (;;)
      {
        return bool1;
        bool1 = false;
      }
      return false;
    }
    catch (ClassCastException localClassCastException)
    {
      return false;
    }
    catch (NullPointerException localNullPointerException) {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Sets
 * JD-Core Version:    0.7.0.1
 */