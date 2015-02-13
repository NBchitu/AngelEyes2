package com.google.tagmanager.protobuf;

import java.io.InputStream;

public abstract class AbstractParser<MessageType extends MessageLite>
  implements Parser<MessageType>
{
  private static final ExtensionRegistryLite a = ;
  
  private UninitializedMessageException a(MessageType paramMessageType)
  {
    if ((paramMessageType instanceof AbstractMessageLite)) {
      return ((AbstractMessageLite)paramMessageType).W();
    }
    if ((paramMessageType instanceof AbstractMutableMessageLite)) {
      return ((AbstractMutableMessageLite)paramMessageType).b();
    }
    return new UninitializedMessageException(paramMessageType);
  }
  
  private MessageType b(MessageType paramMessageType)
  {
    if ((paramMessageType != null) && (!paramMessageType.j())) {
      throw a(paramMessageType).a().a(paramMessageType);
    }
    return paramMessageType;
  }
  
  /* Error */
  public MessageType a(ByteString paramByteString, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 64	com/google/tagmanager/protobuf/ByteString:h	()Lcom/google/tagmanager/protobuf/CodedInputStream;
    //   4: astore 5
    //   6: aload_0
    //   7: aload 5
    //   9: aload_2
    //   10: invokevirtual 67	com/google/tagmanager/protobuf/AbstractParser:b	(Lcom/google/tagmanager/protobuf/CodedInputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
    //   13: checkcast 41	com/google/tagmanager/protobuf/MessageLite
    //   16: astore 6
    //   18: aload 5
    //   20: iconst_0
    //   21: invokevirtual 72	com/google/tagmanager/protobuf/CodedInputStream:a	(I)V
    //   24: aload 6
    //   26: areturn
    //   27: astore 7
    //   29: aload 7
    //   31: aload 6
    //   33: invokevirtual 55	com/google/tagmanager/protobuf/InvalidProtocolBufferException:a	(Lcom/google/tagmanager/protobuf/MessageLite;)Lcom/google/tagmanager/protobuf/InvalidProtocolBufferException;
    //   36: athrow
    //   37: astore 4
    //   39: aload 4
    //   41: athrow
    //   42: astore_3
    //   43: new 74	java/lang/RuntimeException
    //   46: dup
    //   47: ldc 76
    //   49: aload_3
    //   50: invokespecial 79	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	AbstractParser
    //   0	54	1	paramByteString	ByteString
    //   0	54	2	paramExtensionRegistryLite	ExtensionRegistryLite
    //   42	8	3	localIOException	java.io.IOException
    //   37	3	4	localInvalidProtocolBufferException1	InvalidProtocolBufferException
    //   4	15	5	localCodedInputStream	CodedInputStream
    //   16	16	6	localMessageLite	MessageLite
    //   27	3	7	localInvalidProtocolBufferException2	InvalidProtocolBufferException
    // Exception table:
    //   from	to	target	type
    //   18	24	27	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   0	18	37	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   29	37	37	com/google/tagmanager/protobuf/InvalidProtocolBufferException
    //   0	18	42	java/io/IOException
    //   18	24	42	java/io/IOException
    //   29	37	42	java/io/IOException
  }
  
  public MessageType a(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    CodedInputStream localCodedInputStream = CodedInputStream.a(paramInputStream);
    MessageLite localMessageLite = (MessageLite)b(localCodedInputStream, paramExtensionRegistryLite);
    try
    {
      localCodedInputStream.a(0);
      return localMessageLite;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      throw localInvalidProtocolBufferException.a(localMessageLite);
    }
  }
  
  public MessageType b(ByteString paramByteString, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    return b(a(paramByteString, paramExtensionRegistryLite));
  }
  
  public MessageType b(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    return b(a(paramInputStream, paramExtensionRegistryLite));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.AbstractParser
 * JD-Core Version:    0.7.0.1
 */