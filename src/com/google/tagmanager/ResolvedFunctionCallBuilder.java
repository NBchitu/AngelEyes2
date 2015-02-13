package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

abstract interface ResolvedFunctionCallBuilder
{
  public abstract ResolvedPropertyBuilder a(String paramString);
  
  public abstract void a(TypeSystem.Value paramValue);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResolvedFunctionCallBuilder
 * JD-Core Version:    0.7.0.1
 */