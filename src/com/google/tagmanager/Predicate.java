package com.google.tagmanager;

import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class Predicate
  extends FunctionCallImplementation
{
  private static final String a = Key.n.toString();
  private static final String b = Key.o.toString();
  
  public Predicate(String paramString)
  {
    super(paramString, arrayOfString);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    Iterator localIterator = paramMap.values().iterator();
    while (localIterator.hasNext()) {
      if ((TypeSystem.Value)localIterator.next() == Types.d()) {
        return Types.e(Boolean.valueOf(false));
      }
    }
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(a);
    TypeSystem.Value localValue2 = (TypeSystem.Value)paramMap.get(b);
    if ((localValue1 == null) || (localValue2 == null)) {}
    for (boolean bool = false;; bool = a(localValue1, localValue2, paramMap)) {
      return Types.e(Boolean.valueOf(bool));
    }
  }
  
  public boolean a()
  {
    return true;
  }
  
  protected abstract boolean a(TypeSystem.Value paramValue1, TypeSystem.Value paramValue2, Map<String, TypeSystem.Value> paramMap);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Predicate
 * JD-Core Version:    0.7.0.1
 */