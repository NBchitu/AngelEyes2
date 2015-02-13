package com.google.tagmanager.protobuf;

import java.io.Serializable;

public abstract class GeneratedMutableMessageLite<MessageType extends GeneratedMutableMessageLite<MessageType>>
  extends AbstractMutableMessageLite
  implements Serializable
{
  protected ByteString b = ByteString.a;
  
  public abstract MessageType a(MessageType paramMessageType);
  
  public Parser<MessageType> c()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
  
  public abstract MessageType e();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMutableMessageLite
 * JD-Core Version:    0.7.0.1
 */