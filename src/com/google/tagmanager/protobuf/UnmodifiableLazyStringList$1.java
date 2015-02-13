package com.google.tagmanager.protobuf;

import java.util.ListIterator;

class UnmodifiableLazyStringList$1
  implements ListIterator<String>
{
  ListIterator<String> a = UnmodifiableLazyStringList.a(this.c).listIterator(this.b);
  
  UnmodifiableLazyStringList$1(UnmodifiableLazyStringList paramUnmodifiableLazyStringList, int paramInt) {}
  
  public String a()
  {
    return (String)this.a.next();
  }
  
  public void a(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public String b()
  {
    return (String)this.a.previous();
  }
  
  public void b(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public boolean hasPrevious()
  {
    return this.a.hasPrevious();
  }
  
  public int nextIndex()
  {
    return this.a.nextIndex();
  }
  
  public int previousIndex()
  {
    return this.a.previousIndex();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.UnmodifiableLazyStringList.1
 * JD-Core Version:    0.7.0.1
 */