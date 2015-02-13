package com.google.api.client.util;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class GenericData$EntrySet
  extends AbstractSet<Map.Entry<String, Object>>
{
  private final DataMap.EntrySet b;
  
  GenericData$EntrySet(GenericData paramGenericData)
  {
    this.b = new DataMap(paramGenericData, paramGenericData.classInfo.a()).a();
  }
  
  public void clear()
  {
    this.a.unknownFields.clear();
    this.b.clear();
  }
  
  public Iterator<Map.Entry<String, Object>> iterator()
  {
    return new GenericData.EntryIterator(this.a, this.b);
  }
  
  public int size()
  {
    return this.a.unknownFields.size() + this.b.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.GenericData.EntrySet
 * JD-Core Version:    0.7.0.1
 */