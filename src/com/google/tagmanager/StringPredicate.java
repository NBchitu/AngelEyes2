package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

abstract class StringPredicate
  extends Predicate
{
  public StringPredicate(String paramString)
  {
    super(paramString);
  }
  
  protected boolean a(TypeSystem.Value paramValue1, TypeSystem.Value paramValue2, Map<String, TypeSystem.Value> paramMap)
  {
    String str1 = Types.a(paramValue1);
    String str2 = Types.a(paramValue2);
    if ((str1 == Types.c()) || (str2 == Types.c())) {
      return false;
    }
    return a(str1, str2, paramMap);
  }
  
  protected abstract boolean a(String paramString1, String paramString2, Map<String, TypeSystem.Value> paramMap);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.StringPredicate
 * JD-Core Version:    0.7.0.1
 */