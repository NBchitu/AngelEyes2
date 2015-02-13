package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

class NoopResolvedFunctionCallBuilder
  implements ResolvedFunctionCallBuilder
{
  public ResolvedPropertyBuilder a(String paramString)
  {
    return new NoopResolvedPropertyBuilder();
  }
  
  public void a(TypeSystem.Value paramValue) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopResolvedFunctionCallBuilder
 * JD-Core Version:    0.7.0.1
 */