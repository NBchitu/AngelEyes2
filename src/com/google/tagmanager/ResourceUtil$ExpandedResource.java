package com.google.tagmanager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ResourceUtil$ExpandedResource
{
  private final List<ResourceUtil.ExpandedRule> a;
  private final Map<String, List<ResourceUtil.ExpandedFunctionCall>> b;
  private final String c;
  private final int d;
  
  private ResourceUtil$ExpandedResource(List<ResourceUtil.ExpandedRule> paramList, Map<String, List<ResourceUtil.ExpandedFunctionCall>> paramMap, String paramString, int paramInt)
  {
    this.a = Collections.unmodifiableList(paramList);
    this.b = Collections.unmodifiableMap(paramMap);
    this.c = paramString;
    this.d = paramInt;
  }
  
  public static ResourceUtil.ExpandedResourceBuilder a()
  {
    return new ResourceUtil.ExpandedResourceBuilder(null);
  }
  
  public List<ResourceUtil.ExpandedRule> b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public Map<String, List<ResourceUtil.ExpandedFunctionCall>> e()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "Rules: " + b() + "  Macros: " + this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil.ExpandedResource
 * JD-Core Version:    0.7.0.1
 */