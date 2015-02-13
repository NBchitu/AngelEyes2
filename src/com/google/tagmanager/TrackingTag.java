package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

abstract class TrackingTag
  extends FunctionCallImplementation
{
  public TrackingTag(String paramString, String... paramVarArgs)
  {
    super(paramString, paramVarArgs);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    b(paramMap);
    return Types.d();
  }
  
  public boolean a()
  {
    return false;
  }
  
  public abstract void b(Map<String, TypeSystem.Value> paramMap);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.TrackingTag
 * JD-Core Version:    0.7.0.1
 */