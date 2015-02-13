package com.google.api.client.util;

import java.io.InputStream;
import java.nio.charset.Charset;

public abstract interface ObjectParser
{
  public abstract <T> T a(InputStream paramInputStream, Charset paramCharset, Class<T> paramClass);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ObjectParser
 * JD-Core Version:    0.7.0.1
 */