package com.google.api.client.http;

import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class ByteArrayContent
  extends AbstractInputStreamContent
{
  private final byte[] a;
  private final int b;
  private final int c;
  
  public ByteArrayContent(String paramString, byte[] paramArrayOfByte)
  {
    this(paramString, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public ByteArrayContent(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramString);
    this.a = ((byte[])Preconditions.a(paramArrayOfByte));
    if ((paramInt1 >= 0) && (paramInt2 >= 0) && (paramInt1 + paramInt2 <= paramArrayOfByte.length)) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      this.b = paramInt1;
      this.c = paramInt2;
      return;
    }
  }
  
  public long b()
  {
    return this.c;
  }
  
  public ByteArrayContent b(String paramString)
  {
    return (ByteArrayContent)super.a(paramString);
  }
  
  public ByteArrayContent b(boolean paramBoolean)
  {
    return (ByteArrayContent)super.a(paramBoolean);
  }
  
  public InputStream c()
  {
    return new ByteArrayInputStream(this.a, this.b, this.c);
  }
  
  public boolean g()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.ByteArrayContent
 * JD-Core Version:    0.7.0.1
 */