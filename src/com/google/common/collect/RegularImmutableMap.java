package com.google.common.collect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Map.Entry;
import javax.annotation.Nullable;

final class RegularImmutableMap<K, V>
  extends ImmutableMap<K, V>
{
  private final transient RegularImmutableMap.LinkedEntry<K, V>[] a;
  private final transient RegularImmutableMap.LinkedEntry<K, V>[] b;
  private final transient int c;
  private final transient int d;
  
  RegularImmutableMap(Map.Entry<?, ?>... paramVarArgs)
  {
    int i = paramVarArgs.length;
    this.a = b(i);
    int j = a(i);
    this.b = b(j);
    this.c = (j - 1);
    int k = 0;
    int i1;
    for (int m = 0; k < i; m = i1)
    {
      Map.Entry<?, ?> localEntry = paramVarArgs[k];
      Object localObject = localEntry.getKey();
      int n = localObject.hashCode();
      i1 = m + n;
      int i2 = Hashing.a(n) & this.c;
      RegularImmutableMap.LinkedEntry localLinkedEntry1 = this.b[i2];
      RegularImmutableMap.LinkedEntry localLinkedEntry2 = a(localObject, localEntry.getValue(), localLinkedEntry1);
      this.b[i2] = localLinkedEntry2;
      this.a[k] = localLinkedEntry2;
      RegularImmutableMap.LinkedEntry localLinkedEntry3 = localLinkedEntry1;
      if (localLinkedEntry3 != null)
      {
        if (!localObject.equals(localLinkedEntry3.getKey())) {}
        for (boolean bool = true;; bool = false)
        {
          Preconditions.a(bool, "duplicate key: %s", new Object[] { localObject });
          localLinkedEntry3 = localLinkedEntry3.a();
          break;
        }
      }
      k++;
    }
    this.d = m;
  }
  
  private static int a(int paramInt)
  {
    int i = Integer.highestOneBit(paramInt);
    int j;
    if (paramInt / i > 1.2D)
    {
      j = i << 1;
      if (j <= 0) {
        break label53;
      }
    }
    label53:
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      Preconditions.a(bool, "table too large: %s", arrayOfObject);
      i = j;
      return i;
    }
  }
  
  private static <K, V> RegularImmutableMap.LinkedEntry<K, V> a(K paramK, V paramV, @Nullable RegularImmutableMap.LinkedEntry<K, V> paramLinkedEntry)
  {
    if (paramLinkedEntry == null) {
      return new RegularImmutableMap.TerminalEntry(paramK, paramV);
    }
    return new RegularImmutableMap.NonTerminalEntry(paramK, paramV, paramLinkedEntry);
  }
  
  private RegularImmutableMap.LinkedEntry<K, V>[] b(int paramInt)
  {
    return new RegularImmutableMap.LinkedEntry[paramInt];
  }
  
  ImmutableSet<Map.Entry<K, V>> b()
  {
    return new RegularImmutableMap.EntrySet(this, null);
  }
  
  public boolean containsValue(@Nullable Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      RegularImmutableMap.LinkedEntry[] arrayOfLinkedEntry = this.a;
      int i = arrayOfLinkedEntry.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfLinkedEntry[j].getValue().equals(paramObject)) {
          return true;
        }
      }
    }
  }
  
  ImmutableSet<K> d()
  {
    return new RegularImmutableMap.1(this, a(), this.d);
  }
  
  boolean g()
  {
    return false;
  }
  
  public V get(@Nullable Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return null;
      int i = Hashing.a(paramObject.hashCode()) & this.c;
      for (RegularImmutableMap.LinkedEntry localLinkedEntry = this.b[i]; localLinkedEntry != null; localLinkedEntry = localLinkedEntry.a()) {
        if (paramObject.equals(localLinkedEntry.getKey())) {
          return localLinkedEntry.getValue();
        }
      }
    }
  }
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public int size()
  {
    return this.a.length;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = Collections2.a(size()).append('{');
    Collections2.a.a(localStringBuilder, this.a);
    return '}';
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.RegularImmutableMap
 * JD-Core Version:    0.7.0.1
 */