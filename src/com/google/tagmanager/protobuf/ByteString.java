package com.google.tagmanager.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class ByteString
  implements Iterable<Byte>
{
  public static final ByteString a;
  
  static
  {
    if (!ByteString.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      a = new LiteralByteString(new byte[0]);
      return;
    }
  }
  
  public static ByteString a(Iterable<ByteString> paramIterable)
  {
    ArrayList localArrayList;
    if (!(paramIterable instanceof Collection))
    {
      localArrayList = new ArrayList();
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add((ByteString)localIterator.next());
      }
    }
    for (Object localObject = localArrayList; ((Collection)localObject).isEmpty(); localObject = (Collection)paramIterable) {
      return a;
    }
    return a(((Collection)localObject).iterator(), ((Collection)localObject).size());
  }
  
  public static ByteString a(String paramString)
  {
    try
    {
      LiteralByteString localLiteralByteString = new LiteralByteString(paramString.getBytes("UTF-8"));
      return localLiteralByteString;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported?", localUnsupportedEncodingException);
    }
  }
  
  private static ByteString a(Iterator<ByteString> paramIterator, int paramInt)
  {
    if ((!b) && (paramInt < 1)) {
      throw new AssertionError();
    }
    if (paramInt == 1) {
      return (ByteString)paramIterator.next();
    }
    int i = paramInt >>> 1;
    return a(paramIterator, i).a(a(paramIterator, paramInt - i));
  }
  
  public static ByteString a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static ByteString a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new LiteralByteString(arrayOfByte);
  }
  
  public static ByteString.Output i()
  {
    return new ByteString.Output(128);
  }
  
  public abstract int a();
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public ByteString a(ByteString paramByteString)
  {
    int i = a();
    int j = paramByteString.a();
    if (i + j >= 2147483647L) {
      throw new IllegalArgumentException("ByteString would be too long: " + i + "+" + j);
    }
    return RopeByteString.a(this, paramByteString);
  }
  
  void a(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IndexOutOfBoundsException("Source offset < 0: " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IndexOutOfBoundsException("Length < 0: " + paramInt2);
    }
    if (paramInt1 + paramInt2 > a()) {
      throw new IndexOutOfBoundsException("Source end offset exceeded: " + (paramInt1 + paramInt2));
    }
    if (paramInt2 > 0) {
      b(paramOutputStream, paramInt1, paramInt2);
    }
  }
  
  protected abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  protected abstract int b(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract String b(String paramString);
  
  abstract void b(OutputStream paramOutputStream, int paramInt1, int paramInt2);
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 0) {
      throw new IndexOutOfBoundsException("Source offset < 0: " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IndexOutOfBoundsException("Target offset < 0: " + paramInt2);
    }
    if (paramInt3 < 0) {
      throw new IndexOutOfBoundsException("Length < 0: " + paramInt3);
    }
    if (paramInt1 + paramInt3 > a()) {
      throw new IndexOutOfBoundsException("Source end offset < 0: " + (paramInt1 + paramInt3));
    }
    if (paramInt2 + paramInt3 > paramArrayOfByte.length) {
      throw new IndexOutOfBoundsException("Target end offset < 0: " + (paramInt2 + paramInt3));
    }
    if (paramInt3 > 0) {
      a(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public abstract ByteString.ByteIterator c();
  
  public boolean d()
  {
    return a() == 0;
  }
  
  public byte[] e()
  {
    int i = a();
    if (i == 0) {
      return Internal.a;
    }
    byte[] arrayOfByte = new byte[i];
    a(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public String f()
  {
    try
    {
      String str = b("UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported?", localUnsupportedEncodingException);
    }
  }
  
  public abstract boolean g();
  
  public abstract CodedInputStream h();
  
  public abstract int hashCode();
  
  protected abstract int j();
  
  protected abstract boolean k();
  
  protected abstract int l();
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.toHexString(System.identityHashCode(this));
    arrayOfObject[1] = Integer.valueOf(a());
    return String.format("<ByteString@%s size=%d>", arrayOfObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.ByteString
 * JD-Core Version:    0.7.0.1
 */