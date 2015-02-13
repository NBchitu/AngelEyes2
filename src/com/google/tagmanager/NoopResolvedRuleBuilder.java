package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

class NoopResolvedRuleBuilder
  implements ResolvedRuleBuilder
{
  public ResolvedFunctionCallBuilder a()
  {
    return new NoopResolvedFunctionCallBuilder();
  }
  
  public void a(TypeSystem.Value paramValue) {}
  
  public ResolvedFunctionCallBuilder b()
  {
    return new NoopResolvedFunctionCallBuilder();
  }
  
  public ResolvedFunctionCallTranslatorList c()
  {
    return new NoopResolvedRuleBuilder.NoopResolvedFunctionCallTranslatorList(this);
  }
  
  public ResolvedFunctionCallTranslatorList d()
  {
    return new NoopResolvedRuleBuilder.NoopResolvedFunctionCallTranslatorList(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopResolvedRuleBuilder
 * JD-Core Version:    0.7.0.1
 */