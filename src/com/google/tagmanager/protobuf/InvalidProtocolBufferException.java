package com.google.tagmanager.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException
  extends IOException
{
  private MessageLite a = null;
  
  public InvalidProtocolBufferException(String paramString)
  {
    super(paramString);
  }
  
  static InvalidProtocolBufferException b()
  {
    return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static InvalidProtocolBufferException c()
  {
    return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static InvalidProtocolBufferException d()
  {
    return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
  }
  
  static InvalidProtocolBufferException e()
  {
    return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
  }
  
  static InvalidProtocolBufferException f()
  {
    return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
  }
  
  static InvalidProtocolBufferException g()
  {
    return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
  }
  
  static InvalidProtocolBufferException h()
  {
    return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  static InvalidProtocolBufferException i()
  {
    return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
  
  static InvalidProtocolBufferException j()
  {
    return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
  }
  
  public InvalidProtocolBufferException a(MessageLite paramMessageLite)
  {
    this.a = paramMessageLite;
    return this;
  }
  
  public MessageLite a()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.InvalidProtocolBufferException
 * JD-Core Version:    0.7.0.1
 */