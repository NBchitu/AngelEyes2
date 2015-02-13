package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

abstract interface ResolvedRuleBuilder
{
  public abstract ResolvedFunctionCallBuilder a();
  
  public abstract void a(TypeSystem.Value paramValue);
  
  public abstract ResolvedFunctionCallBuilder b();
  
  public abstract ResolvedFunctionCallTranslatorList c();
  
  public abstract ResolvedFunctionCallTranslatorList d();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResolvedRuleBuilder
 * JD-Core Version:    0.7.0.1
 */