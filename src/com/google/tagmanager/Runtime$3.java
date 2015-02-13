package com.google.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

class Runtime$3
  implements Runtime.AddRemoveSetPopulator
{
  Runtime$3(Runtime paramRuntime, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4) {}
  
  public void a(ResourceUtil.ExpandedRule paramExpandedRule, Set<ResourceUtil.ExpandedFunctionCall> paramSet1, Set<ResourceUtil.ExpandedFunctionCall> paramSet2, ResolvedRuleBuilder paramResolvedRuleBuilder)
  {
    List localList1 = (List)this.a.get(paramExpandedRule);
    List localList2 = (List)this.b.get(paramExpandedRule);
    if (localList1 != null)
    {
      paramSet1.addAll(localList1);
      paramResolvedRuleBuilder.c().a(localList1, localList2);
    }
    List localList3 = (List)this.c.get(paramExpandedRule);
    List localList4 = (List)this.d.get(paramExpandedRule);
    if (localList3 != null)
    {
      paramSet2.addAll(localList3);
      paramResolvedRuleBuilder.d().a(localList3, localList4);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Runtime.3
 * JD-Core Version:    0.7.0.1
 */