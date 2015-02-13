package com.google.tagmanager;

class NoopMacroEvaluationInfoBuilder
  implements MacroEvaluationInfoBuilder
{
  public ResolvedFunctionCallBuilder a()
  {
    return new NoopResolvedFunctionCallBuilder();
  }
  
  public RuleEvaluationStepInfoBuilder b()
  {
    return new NoopRuleEvaluationStepInfoBuilder();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopMacroEvaluationInfoBuilder
 * JD-Core Version:    0.7.0.1
 */