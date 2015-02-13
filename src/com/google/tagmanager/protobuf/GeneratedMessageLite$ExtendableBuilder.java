package com.google.tagmanager.protobuf;

public abstract class GeneratedMessageLite$ExtendableBuilder<MessageType extends GeneratedMessageLite.ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>>
  extends GeneratedMessageLite.Builder<MessageType, BuilderType>
  implements GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType>
{
  private FieldSet<GeneratedMessageLite.ExtensionDescriptor> a = FieldSet.b();
  private boolean b;
  
  private void a()
  {
    if (!this.b)
    {
      this.a = this.a.d();
      this.b = true;
    }
  }
  
  private FieldSet<GeneratedMessageLite.ExtensionDescriptor> b()
  {
    this.a.c();
    this.b = false;
    return this.a;
  }
  
  protected final void a(MessageType paramMessageType)
  {
    a();
    this.a.a(GeneratedMessageLite.ExtendableMessage.a(paramMessageType));
  }
  
  public BuilderType o()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
  
  protected boolean s()
  {
    return this.a.f();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite.ExtendableBuilder
 * JD-Core Version:    0.7.0.1
 */