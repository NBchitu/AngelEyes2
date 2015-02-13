package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.util.Map.Entry;

final class DataMap$Entry
  implements Map.Entry<String, Object>
{
  private Object b;
  private final FieldInfo c;
  
  DataMap$Entry(DataMap paramDataMap, FieldInfo paramFieldInfo, Object paramObject)
  {
    this.c = paramFieldInfo;
    this.b = Preconditions.a(paramObject);
  }
  
  public String a()
  {
    String str = this.c.b();
    if (this.a.b.a()) {
      str = str.toLowerCase();
    }
    return str;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    Map.Entry localEntry;
    do
    {
      return true;
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      localEntry = (Map.Entry)paramObject;
    } while ((a().equals(localEntry.getKey())) && (getValue().equals(localEntry.getValue())));
    return false;
  }
  
  public Object getValue()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return a().hashCode() ^ getValue().hashCode();
  }
  
  public Object setValue(Object paramObject)
  {
    Object localObject = this.b;
    this.b = Preconditions.a(paramObject);
    this.c.a(this.a.a, paramObject);
    return localObject;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.DataMap.Entry
 * JD-Core Version:    0.7.0.1
 */