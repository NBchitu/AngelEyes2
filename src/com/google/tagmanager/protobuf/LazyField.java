package com.google.tagmanager.protobuf;

import java.io.IOException;

class LazyField
{
  private final MessageLite a;
  private final ExtensionRegistryLite b;
  private ByteString c;
  private volatile MessageLite d;
  private volatile boolean e;
  
  private void c()
  {
    if (this.d != null) {
      return;
    }
    try
    {
      if (this.d != null) {
        return;
      }
    }
    finally {}
    try
    {
      if (this.c != null) {
        this.d = ((MessageLite)this.a.c().c(this.c, this.b));
      }
      label61:
      return;
    }
    catch (IOException localIOException)
    {
      break label61;
    }
  }
  
  public MessageLite a()
  {
    c();
    return this.d;
  }
  
  public MessageLite a(MessageLite paramMessageLite)
  {
    MessageLite localMessageLite = this.d;
    this.d = paramMessageLite;
    this.c = null;
    this.e = true;
    return localMessageLite;
  }
  
  public int b()
  {
    if (this.e) {
      return this.d.k();
    }
    return this.c.a();
  }
  
  public boolean equals(Object paramObject)
  {
    c();
    return this.d.equals(paramObject);
  }
  
  public int hashCode()
  {
    c();
    return this.d.hashCode();
  }
  
  public String toString()
  {
    c();
    return this.d.toString();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.LazyField
 * JD-Core Version:    0.7.0.1
 */