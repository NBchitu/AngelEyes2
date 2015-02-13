package com.google.tagmanager;

import com.google.analytics.containertag.proto.Serving;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;

class ProtoExtensionRegistry
{
  private static ExtensionRegistryLite a;
  
  public static ExtensionRegistryLite a()
  {
    try
    {
      if (a == null)
      {
        a = ExtensionRegistryLite.a();
        Serving.a(a);
      }
      ExtensionRegistryLite localExtensionRegistryLite = a;
      return localExtensionRegistryLite;
    }
    finally {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ProtoExtensionRegistry
 * JD-Core Version:    0.7.0.1
 */