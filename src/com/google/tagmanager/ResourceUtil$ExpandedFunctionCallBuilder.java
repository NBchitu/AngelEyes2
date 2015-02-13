package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.HashMap;
import java.util.Map;

public class ResourceUtil$ExpandedFunctionCallBuilder
{
  private final Map<String, TypeSystem.Value> a = new HashMap();
  
  public ResourceUtil.ExpandedFunctionCall a()
  {
    return new ResourceUtil.ExpandedFunctionCall(this.a, null);
  }
  
  public ExpandedFunctionCallBuilder a(String paramString, TypeSystem.Value paramValue)
  {
    this.a.put(paramString, paramValue);
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil.ExpandedFunctionCallBuilder
 * JD-Core Version:    0.7.0.1
 */