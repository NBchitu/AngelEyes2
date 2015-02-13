package com.google.tagmanager.protobuf;

public abstract class GeneratedMessageLite$Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder>
  extends AbstractMessageLite.Builder<BuilderType>
{
  private ByteString a = ByteString.a;
  
  public final BuilderType a(ByteString paramByteString)
  {
    this.a = paramByteString;
    return this;
  }
  
  public abstract BuilderType a(MessageType paramMessageType);
  
  public abstract MessageType e();
  
  public BuilderType f()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
  
  public final ByteString r()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite.Builder
 * JD-Core Version:    0.7.0.1
 */