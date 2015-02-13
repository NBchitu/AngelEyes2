package com.google.tagmanager.protobuf;

import java.util.List;

public class UninitializedMessageException
  extends RuntimeException
{
  private final List<String> a = null;
  
  public UninitializedMessageException(MessageLite paramMessageLite)
  {
    super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public InvalidProtocolBufferException a()
  {
    return new InvalidProtocolBufferException(getMessage());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.UninitializedMessageException
 * JD-Core Version:    0.7.0.1
 */