package com.crashlytics.android;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class d
{
  private final byte[] a;
  private volatile int b = 0;
  
  static
  {
    new d(new byte[0]);
  }
  
  private d(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public static d a(String paramString)
  {
    try
    {
      d locald = new d(paramString.getBytes("UTF-8"));
      return locald;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported.", localUnsupportedEncodingException);
    }
  }
  
  public static d a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramInt2);
    return new d(arrayOfByte);
  }
  
  public final int a()
  {
    return this.a.length;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.a, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public final InputStream b()
  {
    return new ByteArrayInputStream(this.a);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    for (;;)
    {
      return true;
      if (!(paramObject instanceof d)) {
        return false;
      }
      d locald = (d)paramObject;
      int i = this.a.length;
      if (i != locald.a.length) {
        return false;
      }
      byte[] arrayOfByte1 = this.a;
      byte[] arrayOfByte2 = locald.a;
      for (int j = 0; j < i; j++) {
        if (arrayOfByte1[j] != arrayOfByte2[j]) {
          return false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = this.b;
    if (i == 0)
    {
      byte[] arrayOfByte = this.a;
      int j = this.a.length;
      int k = 0;
      int m;
      for (i = j; k < j; i = m)
      {
        m = i * 31 + arrayOfByte[k];
        k++;
      }
      if (i == 0) {
        i = 1;
      }
      this.b = i;
    }
    return i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.d
 * JD-Core Version:    0.7.0.1
 */