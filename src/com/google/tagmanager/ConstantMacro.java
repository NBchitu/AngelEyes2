package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class ConstantMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.g.toString();
  private static final String b = Key.ck.toString();
  
  public ConstantMacro()
  {
    super(str, arrayOfString);
  }
  
  public static String b()
  {
    return a;
  }
  
  public static String c()
  {
    return b;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return (TypeSystem.Value)paramMap.get(b);
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ConstantMacro
 * JD-Core Version:    0.7.0.1
 */