package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericData
  extends AbstractMap<String, Object>
  implements Cloneable
{
  final ClassInfo classInfo;
  Map<String, Object> unknownFields = ArrayMap.a();
  
  public GenericData()
  {
    this(EnumSet.noneOf(GenericData.Flags.class));
  }
  
  public GenericData(EnumSet<GenericData.Flags> paramEnumSet)
  {
    this.classInfo = ClassInfo.a(getClass(), paramEnumSet.contains(GenericData.Flags.a));
  }
  
  public GenericData clone()
  {
    try
    {
      GenericData localGenericData = (GenericData)super.clone();
      Data.a(this, localGenericData);
      localGenericData.unknownFields = ((Map)Data.c(this.unknownFields));
      return localGenericData;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new IllegalStateException(localCloneNotSupportedException);
    }
  }
  
  public Set<Map.Entry<String, Object>> entrySet()
  {
    return new GenericData.EntrySet(this);
  }
  
  public final Object get(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      return null;
    }
    String str = (String)paramObject;
    FieldInfo localFieldInfo = this.classInfo.a(str);
    if (localFieldInfo != null) {
      return localFieldInfo.a(this);
    }
    if (this.classInfo.a()) {
      str = str.toLowerCase();
    }
    return this.unknownFields.get(str);
  }
  
  public final ClassInfo getClassInfo()
  {
    return this.classInfo;
  }
  
  public final Map<String, Object> getUnknownKeys()
  {
    return this.unknownFields;
  }
  
  public final Object put(String paramString, Object paramObject)
  {
    FieldInfo localFieldInfo = this.classInfo.a(paramString);
    if (localFieldInfo != null)
    {
      Object localObject = localFieldInfo.a(this);
      localFieldInfo.a(this, paramObject);
      return localObject;
    }
    if (this.classInfo.a()) {
      paramString = paramString.toLowerCase();
    }
    return this.unknownFields.put(paramString, paramObject);
  }
  
  public final void putAll(Map<? extends String, ?> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      set((String)localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public final Object remove(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      return null;
    }
    String str = (String)paramObject;
    if (this.classInfo.a(str) != null) {
      throw new UnsupportedOperationException();
    }
    if (this.classInfo.a()) {
      str = str.toLowerCase();
    }
    return this.unknownFields.remove(str);
  }
  
  public final void set(String paramString, Object paramObject)
  {
    FieldInfo localFieldInfo = this.classInfo.a(paramString);
    if (localFieldInfo != null)
    {
      localFieldInfo.a(this, paramObject);
      return;
    }
    if (this.classInfo.a()) {
      paramString = paramString.toLowerCase();
    }
    this.unknownFields.put(paramString, paramObject);
  }
  
  public final void setUnknownKeys(Map<String, Object> paramMap)
  {
    this.unknownFields = paramMap;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.GenericData
 * JD-Core Version:    0.7.0.1
 */