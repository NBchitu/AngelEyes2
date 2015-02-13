package com.google.api.client.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class GenericData$EntryIterator
  implements Iterator<Map.Entry<String, Object>>
{
  private boolean b;
  private final Iterator<Map.Entry<String, Object>> c;
  private final Iterator<Map.Entry<String, Object>> d;
  
  GenericData$EntryIterator(GenericData paramGenericData, DataMap.EntrySet paramEntrySet)
  {
    this.c = paramEntrySet.a();
    this.d = paramGenericData.unknownFields.entrySet().iterator();
  }
  
  public Map.Entry<String, Object> a()
  {
    if (!this.b)
    {
      if (this.c.hasNext()) {
        return (Map.Entry)this.c.next();
      }
      this.b = true;
    }
    return (Map.Entry)this.d.next();
  }
  
  public boolean hasNext()
  {
    return (this.c.hasNext()) || (this.d.hasNext());
  }
  
  public void remove()
  {
    if (this.b) {
      this.d.remove();
    }
    this.c.remove();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.GenericData.EntryIterator
 * JD-Core Version:    0.7.0.1
 */