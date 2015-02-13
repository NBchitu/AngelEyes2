package com.fasterxml.jackson.core.io;

import java.io.OutputStream;
import java.io.Writer;

public abstract class OutputDecorator
{
  public abstract OutputStream a(IOContext paramIOContext, OutputStream paramOutputStream);
  
  public abstract Writer a(IOContext paramIOContext, Writer paramWriter);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.io.OutputDecorator
 * JD-Core Version:    0.7.0.1
 */