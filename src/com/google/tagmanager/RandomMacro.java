package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class RandomMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.s.toString();
  
  public RandomMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return Types.e(Long.valueOf(Math.round(2147483647.0D * Math.random())));
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.RandomMacro
 * JD-Core Version:    0.7.0.1
 */