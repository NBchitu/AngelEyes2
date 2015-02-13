package com.google.tagmanager.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList
  extends AbstractList<String>
  implements LazyStringList, RandomAccess
{
  public static final LazyStringList a = new UnmodifiableLazyStringList(new LazyStringArrayList());
  private final List<Object> b;
  
  public LazyStringArrayList()
  {
    this.b = new ArrayList();
  }
  
  public LazyStringArrayList(LazyStringList paramLazyStringList)
  {
    this.b = new ArrayList(paramLazyStringList.size());
    addAll(paramLazyStringList);
  }
  
  private static String a(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof ByteString)) {
      return ((ByteString)paramObject).f();
    }
    return Internal.b((byte[])paramObject);
  }
  
  private static ByteString b(Object paramObject)
  {
    if ((paramObject instanceof ByteString)) {
      return (ByteString)paramObject;
    }
    if ((paramObject instanceof String)) {
      return ByteString.a((String)paramObject);
    }
    return ByteString.a((byte[])paramObject);
  }
  
  public String a(int paramInt)
  {
    Object localObject = this.b.get(paramInt);
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    if ((localObject instanceof ByteString))
    {
      ByteString localByteString = (ByteString)localObject;
      String str2 = localByteString.f();
      if (localByteString.g()) {
        this.b.set(paramInt, str2);
      }
      return str2;
    }
    byte[] arrayOfByte = (byte[])localObject;
    String str1 = Internal.b(arrayOfByte);
    if (Internal.a(arrayOfByte)) {
      this.b.set(paramInt, str1);
    }
    return str1;
  }
  
  public String a(int paramInt, String paramString)
  {
    return a(this.b.set(paramInt, paramString));
  }
  
  public List<?> a()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public void a(ByteString paramByteString)
  {
    this.b.add(paramByteString);
    this.modCount = (1 + this.modCount);
  }
  
  public boolean addAll(int paramInt, Collection<? extends String> paramCollection)
  {
    if ((paramCollection instanceof LazyStringList)) {
      paramCollection = ((LazyStringList)paramCollection).a();
    }
    boolean bool = this.b.addAll(paramInt, paramCollection);
    this.modCount = (1 + this.modCount);
    return bool;
  }
  
  public boolean addAll(Collection<? extends String> paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public String b(int paramInt)
  {
    Object localObject = this.b.remove(paramInt);
    this.modCount = (1 + this.modCount);
    return a(localObject);
  }
  
  public void b(int paramInt, String paramString)
  {
    this.b.add(paramInt, paramString);
    this.modCount = (1 + this.modCount);
  }
  
  public ByteString c(int paramInt)
  {
    Object localObject = this.b.get(paramInt);
    ByteString localByteString = b(localObject);
    if (localByteString != localObject) {
      this.b.set(paramInt, localByteString);
    }
    return localByteString;
  }
  
  public void clear()
  {
    this.b.clear();
    this.modCount = (1 + this.modCount);
  }
  
  public int size()
  {
    return this.b.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.LazyStringArrayList
 * JD-Core Version:    0.7.0.1
 */