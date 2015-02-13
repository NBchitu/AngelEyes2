package com.google.common.collect;

abstract class ImmutableMapValues<K, V>
  extends ImmutableCollection<V>
{
  boolean a()
  {
    return true;
  }
  
  public UnmodifiableIterator<V> b()
  {
    return Maps.a(c().a().b());
  }
  
  abstract ImmutableMap<K, V> c();
  
  public boolean contains(Object paramObject)
  {
    return c().containsValue(paramObject);
  }
  
  ImmutableList<V> f()
  {
    return new ImmutableMapValues.1(this, c().a().e());
  }
  
  public int size()
  {
    return c().size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableMapValues
 * JD-Core Version:    0.7.0.1
 */