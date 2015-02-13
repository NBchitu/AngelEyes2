package com.google.common.collect;

import com.google.common.base.Joiner;
import com.google.common.base.Joiner.MapJoiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;

public final class Maps
{
  static final Joiner.MapJoiner a = Collections2.a.c("=");
  
  static int a(int paramInt)
  {
    if (paramInt < 3)
    {
      if (paramInt >= 0) {}
      for (boolean bool = true;; bool = false)
      {
        Preconditions.a(bool);
        return paramInt + 1;
      }
    }
    if (paramInt < 1073741824) {
      return paramInt + paramInt / 3;
    }
    return 2147483647;
  }
  
  static <K, V> UnmodifiableIterator<V> a(UnmodifiableIterator<Map.Entry<K, V>> paramUnmodifiableIterator)
  {
    return new Maps.9(paramUnmodifiableIterator);
  }
  
  static String a(Map<?, ?> paramMap)
  {
    StringBuilder localStringBuilder = Collections2.a(paramMap.size()).append('{');
    a.a(localStringBuilder, paramMap);
    return '}';
  }
  
  public static <K, V> Map.Entry<K, V> a(@Nullable K paramK, @Nullable V paramV)
  {
    return new ImmutableEntry(paramK, paramV);
  }
  
  static boolean a(Map<?, ?> paramMap, Object paramObject)
  {
    if (paramMap == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      return paramMap.entrySet().equals(localMap.entrySet());
    }
    return false;
  }
  
  static boolean b(Map<?, ?> paramMap, @Nullable Object paramObject)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext()) {
      if (Objects.a(((Map.Entry)localIterator.next()).getValue(), paramObject)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Maps
 * JD-Core Version:    0.7.0.1
 */