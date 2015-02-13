package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class ContainsPredicate
  extends StringPredicate
{
  private static final String a = FunctionType.L.toString();
  
  public ContainsPredicate()
  {
    super(a);
  }
  
  protected boolean a(String paramString1, String paramString2, Map<String, TypeSystem.Value> paramMap)
  {
    return paramString1.contains(paramString2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ContainsPredicate
 * JD-Core Version:    0.7.0.1
 */