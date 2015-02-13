package com.google.tagmanager.protobuf;

public abstract interface MessageLite
  extends MessageLiteOrBuilder
{
  public abstract void a(CodedOutputStream paramCodedOutputStream);
  
  public abstract Parser<? extends MessageLite> c();
  
  public abstract int k();
  
  public abstract MessageLite.Builder o();
  
  public abstract MessageLite.Builder p();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.MessageLite
 * JD-Core Version:    0.7.0.1
 */