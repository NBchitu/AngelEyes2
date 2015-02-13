package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

abstract interface ResolvedPropertyBuilder
{
  public abstract ValueBuilder a(TypeSystem.Value paramValue);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResolvedPropertyBuilder
 * JD-Core Version:    0.7.0.1
 */