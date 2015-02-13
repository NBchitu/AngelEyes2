package com.google.tagmanager.protobuf;

import java.io.InputStream;

public abstract interface Parser<MessageType>
{
  public abstract MessageType b(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite);
  
  public abstract MessageType c(ByteString paramByteString, ExtensionRegistryLite paramExtensionRegistryLite);
  
  public abstract MessageType c(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.Parser
 * JD-Core Version:    0.7.0.1
 */