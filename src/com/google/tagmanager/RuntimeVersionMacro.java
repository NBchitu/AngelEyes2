package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class RuntimeVersionMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.v.toString();
  
  public RuntimeVersionMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return Types.e(Long.valueOf(50788154L));
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.RuntimeVersionMacro
 * JD-Core Version:    0.7.0.1
 */