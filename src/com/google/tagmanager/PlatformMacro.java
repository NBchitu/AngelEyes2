package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class PlatformMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.r.toString();
  private static final TypeSystem.Value b = Types.e("Android");
  
  public PlatformMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return b;
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.PlatformMacro
 * JD-Core Version:    0.7.0.1
 */