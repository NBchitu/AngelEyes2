package com.google.tagmanager.protobuf;

final class ExtensionRegistryLite$ObjectIntPair
{
  private final Object a;
  private final int b;
  
  ExtensionRegistryLite$ObjectIntPair(Object paramObject, int paramInt)
  {
    this.a = paramObject;
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ObjectIntPair)) {}
    ObjectIntPair localObjectIntPair;
    do
    {
      return false;
      localObjectIntPair = (ObjectIntPair)paramObject;
    } while ((this.a != localObjectIntPair.a) || (this.b != localObjectIntPair.b));
    return true;
  }
  
  public int hashCode()
  {
    return 65535 * System.identityHashCode(this.a) + this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.ExtensionRegistryLite.ObjectIntPair
 * JD-Core Version:    0.7.0.1
 */