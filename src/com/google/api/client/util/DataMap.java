package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;

final class DataMap
  extends AbstractMap<String, Object>
{
  final Object a;
  final ClassInfo b;
  
  DataMap(Object paramObject, boolean paramBoolean)
  {
    this.a = paramObject;
    this.b = ClassInfo.a(paramObject.getClass(), paramBoolean);
    if (!this.b.b()) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      return;
    }
  }
  
  public DataMap.EntrySet a()
  {
    return new DataMap.EntrySet(this);
  }
  
  public Object a(String paramString, Object paramObject)
  {
    FieldInfo localFieldInfo = this.b.a(paramString);
    Preconditions.a(localFieldInfo, "no field of key " + paramString);
    Object localObject = localFieldInfo.a(this.a);
    localFieldInfo.a(this.a, Preconditions.a(paramObject));
    return localObject;
  }
  
  public boolean containsKey(Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public Object get(Object paramObject)
  {
    if (!(paramObject instanceof String)) {}
    FieldInfo localFieldInfo;
    do
    {
      return null;
      localFieldInfo = this.b.a((String)paramObject);
    } while (localFieldInfo == null);
    return localFieldInfo.a(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.DataMap
 * JD-Core Version:    0.7.0.1
 */