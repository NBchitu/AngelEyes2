package com.google.tagmanager.protobuf;

final class GeneratedMessageLite$ExtensionDescriptor
  implements FieldSet.FieldDescriptorLite<ExtensionDescriptor>
{
  final Internal.EnumLiteMap<?> a;
  final int b;
  final WireFormat.FieldType c;
  final boolean d;
  final boolean e;
  
  GeneratedMessageLite$ExtensionDescriptor(Internal.EnumLiteMap<?> paramEnumLiteMap, int paramInt, WireFormat.FieldType paramFieldType, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramEnumLiteMap;
    this.b = paramInt;
    this.c = paramFieldType;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int a(ExtensionDescriptor paramExtensionDescriptor)
  {
    return this.b - paramExtensionDescriptor.b;
  }
  
  public MessageLite.Builder a(MessageLite.Builder paramBuilder, MessageLite paramMessageLite)
  {
    return ((GeneratedMessageLite.Builder)paramBuilder).a((GeneratedMessageLite)paramMessageLite);
  }
  
  public MutableMessageLite a(MutableMessageLite paramMutableMessageLite1, MutableMessageLite paramMutableMessageLite2)
  {
    return ((GeneratedMutableMessageLite)paramMutableMessageLite1).a((GeneratedMutableMessageLite)paramMutableMessageLite2);
  }
  
  public WireFormat.FieldType b()
  {
    return this.c;
  }
  
  public WireFormat.JavaType c()
  {
    return this.c.a();
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public Internal.EnumLiteMap<?> f()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite.ExtensionDescriptor
 * JD-Core Version:    0.7.0.1
 */