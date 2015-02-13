package com.google.tagmanager;

import java.util.ArrayList;
import java.util.List;

public class ResourceUtil$ExpandedRuleBuilder
{
  private final List<ResourceUtil.ExpandedFunctionCall> a = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> b = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> c = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> d = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> e = new ArrayList();
  private final List<ResourceUtil.ExpandedFunctionCall> f = new ArrayList();
  private final List<String> g = new ArrayList();
  private final List<String> h = new ArrayList();
  private final List<String> i = new ArrayList();
  private final List<String> j = new ArrayList();
  
  public ResourceUtil.ExpandedRule a()
  {
    return new ResourceUtil.ExpandedRule(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
  }
  
  public ExpandedRuleBuilder a(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.a.add(paramExpandedFunctionCall);
    return this;
  }
  
  public ExpandedRuleBuilder a(String paramString)
  {
    this.i.add(paramString);
    return this;
  }
  
  public ExpandedRuleBuilder b(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.b.add(paramExpandedFunctionCall);
    return this;
  }
  
  public ExpandedRuleBuilder b(String paramString)
  {
    this.j.add(paramString);
    return this;
  }
  
  public ExpandedRuleBuilder c(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.c.add(paramExpandedFunctionCall);
    return this;
  }
  
  public ExpandedRuleBuilder c(String paramString)
  {
    this.g.add(paramString);
    return this;
  }
  
  public ExpandedRuleBuilder d(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.d.add(paramExpandedFunctionCall);
    return this;
  }
  
  public ExpandedRuleBuilder d(String paramString)
  {
    this.h.add(paramString);
    return this;
  }
  
  public ExpandedRuleBuilder e(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.e.add(paramExpandedFunctionCall);
    return this;
  }
  
  public ExpandedRuleBuilder f(ResourceUtil.ExpandedFunctionCall paramExpandedFunctionCall)
  {
    this.f.add(paramExpandedFunctionCall);
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil.ExpandedRuleBuilder
 * JD-Core Version:    0.7.0.1
 */