package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

abstract class NumberPredicate
  extends Predicate
{
  public NumberPredicate(String paramString)
  {
    super(paramString);
  }
  
  protected boolean a(TypeSystem.Value paramValue1, TypeSystem.Value paramValue2, Map<String, TypeSystem.Value> paramMap)
  {
    TypedNumber localTypedNumber1 = Types.b(paramValue1);
    TypedNumber localTypedNumber2 = Types.b(paramValue2);
    if ((localTypedNumber1 == Types.b()) || (localTypedNumber2 == Types.b())) {
      return false;
    }
    return a(localTypedNumber1, localTypedNumber2, paramMap);
  }
  
  protected abstract boolean a(TypedNumber paramTypedNumber1, TypedNumber paramTypedNumber2, Map<String, TypeSystem.Value> paramMap);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NumberPredicate
 * JD-Core Version:    0.7.0.1
 */