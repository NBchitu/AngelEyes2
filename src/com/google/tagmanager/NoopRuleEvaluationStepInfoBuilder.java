package com.google.tagmanager;

import java.util.Set;

class NoopRuleEvaluationStepInfoBuilder
  implements RuleEvaluationStepInfoBuilder
{
  public ResolvedRuleBuilder a()
  {
    return new NoopResolvedRuleBuilder();
  }
  
  public void a(Set<ResourceUtil.ExpandedFunctionCall> paramSet) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopRuleEvaluationStepInfoBuilder
 * JD-Core Version:    0.7.0.1
 */