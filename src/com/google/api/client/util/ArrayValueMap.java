package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ArrayValueMap
{
  private final Map<String, ArrayValueMap.ArrayValue> a = ArrayMap.a();
  private final Map<Field, ArrayValueMap.ArrayValue> b = ArrayMap.a();
  private final Object c;
  
  public ArrayValueMap(Object paramObject)
  {
    this.c = paramObject;
  }
  
  public void a()
  {
    Iterator localIterator1 = this.a.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      ((Map)this.c).put(localEntry2.getKey(), ((ArrayValueMap.ArrayValue)localEntry2.getValue()).a());
    }
    Iterator localIterator2 = this.b.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      FieldInfo.a((Field)localEntry1.getKey(), this.c, ((ArrayValueMap.ArrayValue)localEntry1.getValue()).a());
    }
  }
  
  public void a(Field paramField, Class<?> paramClass, Object paramObject)
  {
    ArrayValueMap.ArrayValue localArrayValue = (ArrayValueMap.ArrayValue)this.b.get(paramField);
    if (localArrayValue == null)
    {
      localArrayValue = new ArrayValueMap.ArrayValue(paramClass);
      this.b.put(paramField, localArrayValue);
    }
    localArrayValue.a(paramClass, paramObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ArrayValueMap
 * JD-Core Version:    0.7.0.1
 */