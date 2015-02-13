package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class EqualsPredicate
  extends StringPredicate
{
  private static final String a = FunctionType.M.toString();
  
  public EqualsPredicate()
  {
    super(a);
  }
  
  protected boolean a(String paramString1, String paramString2, Map<String, TypeSystem.Value> paramMap)
  {
    return paramString1.equals(paramString2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.EqualsPredicate
 * JD-Core Version:    0.7.0.1
 */