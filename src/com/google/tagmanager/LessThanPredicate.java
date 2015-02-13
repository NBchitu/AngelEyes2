package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class LessThanPredicate
  extends NumberPredicate
{
  private static final String a = FunctionType.N.toString();
  
  public LessThanPredicate()
  {
    super(a);
  }
  
  protected boolean a(TypedNumber paramTypedNumber1, TypedNumber paramTypedNumber2, Map<String, TypeSystem.Value> paramMap)
  {
    return paramTypedNumber1.a(paramTypedNumber2) < 0;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.LessThanPredicate
 * JD-Core Version:    0.7.0.1
 */