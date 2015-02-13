package com.google.tagmanager;

import java.util.Collections;
import java.util.List;

public class ResourceUtil$ExpandedRule
{
  private final List<ResourceUtil.ExpandedFunctionCall> a;
  private final List<ResourceUtil.ExpandedFunctionCall> b;
  private final List<ResourceUtil.ExpandedFunctionCall> c;
  private final List<ResourceUtil.ExpandedFunctionCall> d;
  private final List<ResourceUtil.ExpandedFunctionCall> e;
  private final List<ResourceUtil.ExpandedFunctionCall> f;
  private final List<String> g;
  private final List<String> h;
  private final List<String> i;
  private final List<String> j;
  
  private ResourceUtil$ExpandedRule(List<ResourceUtil.ExpandedFunctionCall> paramList1, List<ResourceUtil.ExpandedFunctionCall> paramList2, List<ResourceUtil.ExpandedFunctionCall> paramList3, List<ResourceUtil.ExpandedFunctionCall> paramList4, List<ResourceUtil.ExpandedFunctionCall> paramList5, List<ResourceUtil.ExpandedFunctionCall> paramList6, List<String> paramList7, List<String> paramList8, List<String> paramList9, List<String> paramList10)
  {
    this.a = Collections.unmodifiableList(paramList1);
    this.b = Collections.unmodifiableList(paramList2);
    this.c = Collections.unmodifiableList(paramList3);
    this.d = Collections.unmodifiableList(paramList4);
    this.e = Collections.unmodifiableList(paramList5);
    this.f = Collections.unmodifiableList(paramList6);
    this.g = Collections.unmodifiableList(paramList7);
    this.h = Collections.unmodifiableList(paramList8);
    this.i = Collections.unmodifiableList(paramList9);
    this.j = Collections.unmodifiableList(paramList10);
  }
  
  public static ResourceUtil.ExpandedRuleBuilder a()
  {
    return new ResourceUtil.ExpandedRuleBuilder(null);
  }
  
  public List<ResourceUtil.ExpandedFunctionCall> b()
  {
    return this.a;
  }
  
  public List<ResourceUtil.ExpandedFunctionCall> c()
  {
    return this.b;
  }
  
  public List<ResourceUtil.ExpandedFunctionCall> d()
  {
    return this.c;
  }
  
  public List<ResourceUtil.ExpandedFunctionCall> e()
  {
    return this.d;
  }
  
  public List<ResourceUtil.ExpandedFunctionCall> f()
  {
    return this.e;
  }
  
  public List<String> g()
  {
    return this.g;
  }
  
  public List<String> h()
  {
    return this.h;
  }
  
  public List<String> i()
  {
    return this.i;
  }
  
  public List<String> j()
  {
    return this.j;
  }
  
  public List<ResourceUtil.ExpandedFunctionCall> k()
  {
    return this.f;
  }
  
  public String toString()
  {
    return "Positive predicates: " + b() + "  Negative predicates: " + c() + "  Add tags: " + d() + "  Remove tags: " + e() + "  Add macros: " + f() + "  Remove macros: " + k();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceUtil.ExpandedRule
 * JD-Core Version:    0.7.0.1
 */