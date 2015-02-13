package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public abstract class ImmutableMap<K, V>
  implements Serializable, Map<K, V>
{
  private transient ImmutableSet<Map.Entry<K, V>> a;
  private transient ImmutableSet<K> b;
  private transient ImmutableCollection<V> c;
  
  public static <K, V> ImmutableMap<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2)
  {
    Map.Entry[] arrayOfEntry = new Map.Entry[2];
    arrayOfEntry[0] = a(paramK1, paramV1);
    arrayOfEntry[1] = a(paramK2, paramV2);
    return new RegularImmutableMap(arrayOfEntry);
  }
  
  static <K, V> Map.Entry<K, V> a(K paramK, V paramV)
  {
    Preconditions.a(paramK, "null key in entry: null=%s", new Object[] { paramV });
    Preconditions.a(paramV, "null value in entry: %s=null", new Object[] { paramK });
    return Maps.a(paramK, paramV);
  }
  
  public ImmutableSet<Map.Entry<K, V>> a()
  {
    ImmutableSet localImmutableSet = this.a;
    if (localImmutableSet == null)
    {
      localImmutableSet = b();
      this.a = localImmutableSet;
    }
    return localImmutableSet;
  }
  
  abstract ImmutableSet<Map.Entry<K, V>> b();
  
  public ImmutableSet<K> c()
  {
    ImmutableSet localImmutableSet = this.b;
    if (localImmutableSet == null)
    {
      localImmutableSet = d();
      this.b = localImmutableSet;
    }
    return localImmutableSet;
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(@Nullable Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public boolean containsValue(@Nullable Object paramObject)
  {
    return (paramObject != null) && (Maps.b(this, paramObject));
  }
  
  ImmutableSet<K> d()
  {
    return new ImmutableMap.1(this, a());
  }
  
  public ImmutableCollection<V> e()
  {
    ImmutableCollection localImmutableCollection = this.c;
    if (localImmutableCollection == null)
    {
      localImmutableCollection = f();
      this.c = localImmutableCollection;
    }
    return localImmutableCollection;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    return Maps.a(this, paramObject);
  }
  
  ImmutableCollection<V> f()
  {
    return new ImmutableMap.2(this);
  }
  
  abstract boolean g();
  
  public abstract V get(@Nullable Object paramObject);
  
  public int hashCode()
  {
    return a().hashCode();
  }
  
  public boolean isEmpty()
  {
    return size() == 0;
  }
  
  public final V put(K paramK, V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  public final V remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    return Maps.a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableMap
 * JD-Core Version:    0.7.0.1
 */