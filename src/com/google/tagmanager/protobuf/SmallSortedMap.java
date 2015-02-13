package com.google.tagmanager.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  private final int a;
  private List<SmallSortedMap<K, V>.Entry> b;
  private Map<K, V> c;
  private boolean d;
  private volatile SmallSortedMap<K, V>.EntrySet e;
  
  private SmallSortedMap(int paramInt)
  {
    this.a = paramInt;
    this.b = Collections.emptyList();
    this.c = Collections.emptyMap();
  }
  
  private int a(K paramK)
  {
    int i = -1 + this.b.size();
    int j = 0;
    if (i >= 0)
    {
      int i4 = paramK.compareTo(((SmallSortedMap.Entry)this.b.get(i)).a());
      if (i4 > 0) {
        return -(i + 2);
      }
      j = 0;
      if (i4 == 0) {
        return i;
      }
    }
    if (j <= i)
    {
      int k = (j + i) / 2;
      int m = paramK.compareTo(((SmallSortedMap.Entry)this.b.get(k)).a());
      int i3;
      int i2;
      if (m < 0)
      {
        i3 = k - 1;
        i2 = j;
      }
      for (;;)
      {
        j = i2;
        i = i3;
        break;
        if (m <= 0) {
          break label146;
        }
        int n = k + 1;
        int i1 = i;
        i2 = n;
        i3 = i1;
      }
      label146:
      return k;
    }
    return -(j + 1);
  }
  
  static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> SmallSortedMap<FieldDescriptorType, Object> a(int paramInt)
  {
    return new SmallSortedMap.1(paramInt);
  }
  
  private V c(int paramInt)
  {
    e();
    Object localObject = ((SmallSortedMap.Entry)this.b.remove(paramInt)).getValue();
    if (!this.c.isEmpty())
    {
      Iterator localIterator = f().entrySet().iterator();
      this.b.add(new SmallSortedMap.Entry(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return localObject;
  }
  
  private void e()
  {
    if (this.d) {
      throw new UnsupportedOperationException();
    }
  }
  
  private SortedMap<K, V> f()
  {
    e();
    if ((this.c.isEmpty()) && (!(this.c instanceof TreeMap))) {
      this.c = new TreeMap();
    }
    return (SortedMap)this.c;
  }
  
  private void g()
  {
    e();
    if ((this.b.isEmpty()) && (!(this.b instanceof ArrayList))) {
      this.b = new ArrayList(this.a);
    }
  }
  
  public V a(K paramK, V paramV)
  {
    e();
    int i = a(paramK);
    if (i >= 0) {
      return ((SmallSortedMap.Entry)this.b.get(i)).setValue(paramV);
    }
    g();
    int j = -(i + 1);
    if (j >= this.a) {
      return f().put(paramK, paramV);
    }
    if (this.b.size() == this.a)
    {
      SmallSortedMap.Entry localEntry = (SmallSortedMap.Entry)this.b.remove(-1 + this.a);
      f().put(localEntry.a(), localEntry.getValue());
    }
    this.b.add(j, new SmallSortedMap.Entry(this, paramK, paramV));
    return null;
  }
  
  public void a()
  {
    if (!this.d) {
      if (!this.c.isEmpty()) {
        break label34;
      }
    }
    label34:
    for (Map localMap = Collections.emptyMap();; localMap = Collections.unmodifiableMap(this.c))
    {
      this.c = localMap;
      this.d = true;
      return;
    }
  }
  
  public Map.Entry<K, V> b(int paramInt)
  {
    return (Map.Entry)this.b.get(paramInt);
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.b.size();
  }
  
  public void clear()
  {
    e();
    if (!this.b.isEmpty()) {
      this.b.clear();
    }
    if (!this.c.isEmpty()) {
      this.c.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    Comparable localComparable = (Comparable)paramObject;
    return (a(localComparable) >= 0) || (this.c.containsKey(localComparable));
  }
  
  public Iterable<Map.Entry<K, V>> d()
  {
    if (this.c.isEmpty()) {
      return SmallSortedMap.EmptySet.a();
    }
    return this.c.entrySet();
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    if (this.e == null) {
      this.e = new SmallSortedMap.EntrySet(this, null);
    }
    return this.e;
  }
  
  public V get(Object paramObject)
  {
    Comparable localComparable = (Comparable)paramObject;
    int i = a(localComparable);
    if (i >= 0) {
      return ((SmallSortedMap.Entry)this.b.get(i)).getValue();
    }
    return this.c.get(localComparable);
  }
  
  public V remove(Object paramObject)
  {
    e();
    Comparable localComparable = (Comparable)paramObject;
    int i = a(localComparable);
    if (i >= 0) {
      return c(i);
    }
    if (this.c.isEmpty()) {
      return null;
    }
    return this.c.remove(localComparable);
  }
  
  public int size()
  {
    return this.b.size() + this.c.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.SmallSortedMap
 * JD-Core Version:    0.7.0.1
 */