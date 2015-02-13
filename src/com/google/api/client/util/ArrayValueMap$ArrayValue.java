package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.util.ArrayList;

class ArrayValueMap$ArrayValue
{
  final Class<?> a;
  final ArrayList<Object> b = new ArrayList();
  
  ArrayValueMap$ArrayValue(Class<?> paramClass)
  {
    this.a = paramClass;
  }
  
  Object a()
  {
    return Types.a(this.b, this.a);
  }
  
  void a(Class<?> paramClass, Object paramObject)
  {
    if (paramClass == this.a) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      this.b.add(paramObject);
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ArrayValueMap.ArrayValue
 * JD-Core Version:    0.7.0.1
 */