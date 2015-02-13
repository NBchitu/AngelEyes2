package com.google.tagmanager.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite
{
  private static volatile boolean a = false;
  private static final ExtensionRegistryLite c = new ExtensionRegistryLite(true);
  private final Map<ExtensionRegistryLite.ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> b;
  
  ExtensionRegistryLite()
  {
    this.b = new HashMap();
  }
  
  private ExtensionRegistryLite(boolean paramBoolean)
  {
    this.b = Collections.emptyMap();
  }
  
  public static ExtensionRegistryLite a()
  {
    return new ExtensionRegistryLite();
  }
  
  public static ExtensionRegistryLite b()
  {
    return c;
  }
  
  public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> a(ContainingType paramContainingType, int paramInt)
  {
    return (GeneratedMessageLite.GeneratedExtension)this.b.get(new ExtensionRegistryLite.ObjectIntPair(paramContainingType, paramInt));
  }
  
  public final void a(GeneratedMessageLite.GeneratedExtension<?, ?> paramGeneratedExtension)
  {
    this.b.put(new ExtensionRegistryLite.ObjectIntPair(paramGeneratedExtension.a(), paramGeneratedExtension.b()), paramGeneratedExtension);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.ExtensionRegistryLite
 * JD-Core Version:    0.7.0.1
 */