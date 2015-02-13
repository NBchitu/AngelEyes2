package com.google.tagmanager.protobuf;

import java.util.Iterator;

class UnmodifiableLazyStringList$2
  implements Iterator<String>
{
  Iterator<String> a = UnmodifiableLazyStringList.a(this.b).iterator();
  
  UnmodifiableLazyStringList$2(UnmodifiableLazyStringList paramUnmodifiableLazyStringList) {}
  
  public String a()
  {
    return (String)this.a.next();
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.UnmodifiableLazyStringList.2
 * JD-Core Version:    0.7.0.1
 */