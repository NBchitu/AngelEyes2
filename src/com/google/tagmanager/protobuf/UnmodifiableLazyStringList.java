package com.google.tagmanager.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList
  extends AbstractList<String>
  implements LazyStringList, RandomAccess
{
  private final LazyStringList a;
  
  public UnmodifiableLazyStringList(LazyStringList paramLazyStringList)
  {
    this.a = paramLazyStringList;
  }
  
  public String a(int paramInt)
  {
    return (String)this.a.get(paramInt);
  }
  
  public List<?> a()
  {
    return this.a.a();
  }
  
  public void a(ByteString paramByteString)
  {
    throw new UnsupportedOperationException();
  }
  
  public ByteString c(int paramInt)
  {
    return this.a.c(paramInt);
  }
  
  public Iterator<String> iterator()
  {
    return new UnmodifiableLazyStringList.2(this);
  }
  
  public ListIterator<String> listIterator(int paramInt)
  {
    return new UnmodifiableLazyStringList.1(this, paramInt);
  }
  
  public int size()
  {
    return this.a.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.UnmodifiableLazyStringList
 * JD-Core Version:    0.7.0.1
 */