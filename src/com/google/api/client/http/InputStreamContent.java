package com.google.api.client.http;

import com.google.common.base.Preconditions;
import java.io.InputStream;

public final class InputStreamContent
  extends AbstractInputStreamContent
{
  private long a = -1L;
  private boolean b;
  private final InputStream c;
  
  public InputStreamContent(String paramString, InputStream paramInputStream)
  {
    super(paramString);
    this.c = ((InputStream)Preconditions.a(paramInputStream));
  }
  
  public InputStreamContent a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }
  
  public long b()
  {
    return this.a;
  }
  
  public InputStreamContent b(String paramString)
  {
    return (InputStreamContent)super.a(paramString);
  }
  
  public InputStreamContent b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }
  
  public InputStreamContent c(boolean paramBoolean)
  {
    return (InputStreamContent)super.a(paramBoolean);
  }
  
  public InputStream c()
  {
    return this.c;
  }
  
  public boolean g()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.InputStreamContent
 * JD-Core Version:    0.7.0.1
 */