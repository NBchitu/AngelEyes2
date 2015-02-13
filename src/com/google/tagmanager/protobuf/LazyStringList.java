package com.google.tagmanager.protobuf;

import java.util.List;

public abstract interface LazyStringList
  extends List<String>
{
  public abstract List<?> a();
  
  public abstract void a(ByteString paramByteString);
  
  public abstract ByteString c(int paramInt);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.LazyStringList
 * JD-Core Version:    0.7.0.1
 */