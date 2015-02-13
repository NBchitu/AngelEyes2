package com.google.tagmanager.protobuf;

public abstract class AbstractMutableMessageLite
  implements MutableMessageLite
{
  protected int a = -1;
  private boolean b = true;
  
  public MutableMessageLite a()
  {
    throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
  }
  
  public void a(CodedOutputStream paramCodedOutputStream)
  {
    k();
    b(paramCodedOutputStream);
  }
  
  UninitializedMessageException b()
  {
    return new UninitializedMessageException(this);
  }
  
  protected boolean d()
  {
    return false;
  }
  
  public MessageLite.Builder o()
  {
    throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
  }
  
  public MessageLite.Builder p()
  {
    throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.AbstractMutableMessageLite
 * JD-Core Version:    0.7.0.1
 */