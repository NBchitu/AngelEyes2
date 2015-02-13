package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Collections;
import java.util.Map;

public class ResourceUtil$ExpandedFunctionCall
{
  private final Map<String, TypeSystem.Value> a;
  
  private ResourceUtil$ExpandedFunctionCall(Map<String, TypeSystem.Value> paramMap)
  {
    this.a = paramMap;
  }
  
  public static ResourceUtil.ExpandedFunctionCallBuilder a()
  {
    return new ResourceUtil.ExpandedFunctionCallBuilder(null);
  }
  
  public void a(String paramString, TypeSystem.Value paramValue)
  {
    this.a.put(paramString, paramValue);
  }
  
  public Map<String, TypeSystem.Value> b()
  {
    return Collections.unmodifiableMap(this.a);
  }
  
  public String toString()
  {
    return "Properties: " + b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil.ExpandedFunctionCall
 * JD-Core Version:    0.7.0.1
 */