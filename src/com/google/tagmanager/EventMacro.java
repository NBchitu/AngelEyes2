package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class EventMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.m.toString();
  private final Runtime b;
  
  public EventMacro(Runtime paramRuntime)
  {
    super(a, new String[0]);
    this.b = paramRuntime;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    String str = this.b.a();
    if (str == null) {
      return Types.d();
    }
    return Types.e(str);
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.EventMacro
 * JD-Core Version:    0.7.0.1
 */