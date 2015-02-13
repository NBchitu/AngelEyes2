package com.google.api.client.http;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class FileContent
  extends AbstractInputStreamContent
{
  private final File a;
  
  public FileContent(String paramString, File paramFile)
  {
    super(paramString);
    this.a = ((File)Preconditions.a(paramFile));
  }
  
  public long b()
  {
    return this.a.length();
  }
  
  public FileContent b(String paramString)
  {
    return (FileContent)super.a(paramString);
  }
  
  public FileContent b(boolean paramBoolean)
  {
    return (FileContent)super.a(paramBoolean);
  }
  
  public InputStream c()
  {
    return new FileInputStream(this.a);
  }
  
  public boolean g()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.FileContent
 * JD-Core Version:    0.7.0.1
 */