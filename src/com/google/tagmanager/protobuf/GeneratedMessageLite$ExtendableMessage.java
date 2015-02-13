package com.google.tagmanager.protobuf;

public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends ExtendableMessage<MessageType>>
  extends GeneratedMessageLite
  implements GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType>
{
  private final FieldSet<GeneratedMessageLite.ExtensionDescriptor> a;
  
  protected GeneratedMessageLite$ExtendableMessage()
  {
    this.a = FieldSet.a();
  }
  
  protected GeneratedMessageLite$ExtendableMessage(GeneratedMessageLite.ExtendableBuilder<MessageType, ?> paramExtendableBuilder)
  {
    this.a = GeneratedMessageLite.ExtendableBuilder.a(paramExtendableBuilder);
  }
  
  private void c(GeneratedMessageLite.GeneratedExtension<MessageType, ?> paramGeneratedExtension)
  {
    if (paramGeneratedExtension.a() != q()) {
      throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
  }
  
  protected boolean M()
  {
    return this.a.f();
  }
  
  protected ExtendableMessage<MessageType>.ExtensionWriter N()
  {
    return new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, null);
  }
  
  protected int O()
  {
    return this.a.g();
  }
  
  protected void X()
  {
    this.a.c();
  }
  
  protected boolean a(CodedInputStream paramCodedInputStream, CodedOutputStream paramCodedOutputStream, ExtensionRegistryLite paramExtensionRegistryLite, int paramInt)
  {
    return GeneratedMessageLite.a(this.a, q(), paramCodedInputStream, paramCodedOutputStream, paramExtensionRegistryLite, paramInt);
  }
  
  public final <Type> boolean a(GeneratedMessageLite.GeneratedExtension<MessageType, Type> paramGeneratedExtension)
  {
    c(paramGeneratedExtension);
    return this.a.a(paramGeneratedExtension.d);
  }
  
  public final <Type> Type b(GeneratedMessageLite.GeneratedExtension<MessageType, Type> paramGeneratedExtension)
  {
    c(paramGeneratedExtension);
    Object localObject = this.a.b(paramGeneratedExtension.d);
    if (localObject == null) {
      return paramGeneratedExtension.b;
    }
    return paramGeneratedExtension.a(localObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite.ExtendableMessage
 * JD-Core Version:    0.7.0.1
 */