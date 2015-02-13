package com.google.common.collect;

import java.util.Map.Entry;

final class Maps$9
  extends UnmodifiableIterator<V>
{
  Maps$9(UnmodifiableIterator paramUnmodifiableIterator) {}
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public V next()
  {
    return ((Map.Entry)this.a.next()).getValue();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.Maps.9
 * JD-Core Version:    0.7.0.1
 */