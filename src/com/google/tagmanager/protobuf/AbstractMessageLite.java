package com.google.tagmanager.protobuf;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractMessageLite
  implements MessageLite
{
  protected int c = 0;
  
  public byte[] V()
  {
    try
    {
      byte[] arrayOfByte = new byte[k()];
      CodedOutputStream localCodedOutputStream = CodedOutputStream.a(arrayOfByte);
      a(localCodedOutputStream);
      localCodedOutputStream.c();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }
  
  UninitializedMessageException W()
  {
    return new UninitializedMessageException(this);
  }
  
  public void a(OutputStream paramOutputStream)
  {
    CodedOutputStream localCodedOutputStream = CodedOutputStream.a(paramOutputStream, CodedOutputStream.a(k()));
    a(localCodedOutputStream);
    localCodedOutputStream.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.AbstractMessageLite
 * JD-Core Version:    0.7.0.1
 */