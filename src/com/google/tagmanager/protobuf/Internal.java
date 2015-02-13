package com.google.tagmanager.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class Internal
{
  public static final byte[] a = new byte[0];
  public static final ByteBuffer b = ByteBuffer.wrap(a);
  
  public static int a(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static int a(Internal.EnumLite paramEnumLite)
  {
    return paramEnumLite.a();
  }
  
  public static int a(List<? extends Internal.EnumLite> paramList)
  {
    Iterator localIterator = paramList.iterator();
    Internal.EnumLite localEnumLite;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + a(localEnumLite)) {
      localEnumLite = (Internal.EnumLite)localIterator.next();
    }
    return i;
  }
  
  public static int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  static boolean a(MessageLite paramMessageLite)
  {
    return ((paramMessageLite instanceof AbstractMutableMessageLite)) && (((AbstractMutableMessageLite)paramMessageLite).d());
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return Utf8.a(paramArrayOfByte);
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    try
    {
      String str = new String(paramArrayOfByte, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported?", localUnsupportedEncodingException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.Internal
 * JD-Core Version:    0.7.0.1
 */