package com.google.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Runtime$MacroInfo
{
  private final Set<ResourceUtil.ExpandedRule> a = new HashSet();
  private final Map<ResourceUtil.ExpandedRule, List<ResourceUtil.ExpandedFunctionCall>> b = new HashMap();
  private final Map<ResourceUtil.ExpandedRule, List<ResourceUtil.ExpandedFunctionCall>> c = new HashMap();
  private final Map<ResourceUtil.ExpandedRule, List<String>> d = new HashMap();
  private final Map<ResourceUtil.ExpandedRule, List<String>> e = new HashMap();
  private ResourceUtil.ExpandedFunctionCall f;
  
  public Set<ResourceUtil.ExpandedRule> a()
  {
    return this.a;
  }
  
  public void a(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.f = paramExpandedFunctionCall;
  }
  
  public void a(ResourceUtil.ExpandedRule paramExpandedRule)
  {
    this.a.add(paramExpandedRule);
  }
  
  public void a(ResourceUtil.ExpandedRule paramExpandedRule, ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    Object localObject = (List)this.b.get(paramExpandedRule);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.b.put(paramExpandedRule, localObject);
    }
    ((List)localObject).add(paramExpandedFunctionCall);
  }
  
  public void a(ResourceUtil.ExpandedRule paramExpandedRule, String paramString)
  {
    Object localObject = (List)this.d.get(paramExpandedRule);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.d.put(paramExpandedRule, localObject);
    }
    ((List)localObject).add(paramString);
  }
  
  public Map<ResourceUtil.ExpandedRule, List<ResourceUtil.ExpandedFunctionCall>> b()
  {
    return this.b;
  }
  
  public void b(ResourceUtil.ExpandedRule paramExpandedRule, ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    Object localObject = (List)this.c.get(paramExpandedRule);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.c.put(paramExpandedRule, localObject);
    }
    ((List)localObject).add(paramExpandedFunctionCall);
  }
  
  public void b(ResourceUtil.ExpandedRule paramExpandedRule, String paramString)
  {
    Object localObject = (List)this.e.get(paramExpandedRule);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.e.put(paramExpandedRule, localObject);
    }
    ((List)localObject).add(paramString);
  }
  
  public Map<ResourceUtil.ExpandedRule, List<String>> c()
  {
    return this.d;
  }
  
  public Map<ResourceUtil.ExpandedRule, List<String>> d()
  {
    return this.e;
  }
  
  public Map<ResourceUtil.ExpandedRule, List<ResourceUtil.ExpandedFunctionCall>> e()
  {
    return this.c;
  }
  
  public ResourceUtil.ExpandedFunctionCall f()
  {
    return this.f;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Runtime.MacroInfo
 * JD-Core Version:    0.7.0.1
 */