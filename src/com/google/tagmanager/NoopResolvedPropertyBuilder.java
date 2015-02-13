package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;

class NoopResolvedPropertyBuilder
  implements ResolvedPropertyBuilder
{
  public ValueBuilder a(TypeSystem.Value paramValue)
  {
    return new NoopValueBuilder();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.NoopResolvedPropertyBuilder
 * JD-Core Version:    0.7.0.1
 */