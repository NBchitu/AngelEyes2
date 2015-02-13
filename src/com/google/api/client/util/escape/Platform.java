package com.google.api.client.util.escape;

final class Platform
{
  private static final ThreadLocal<char[]> a = new Platform.1();
  
  static char[] a()
  {
    return (char[])a.get();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.escape.Platform
 * JD-Core Version:    0.7.0.1
 */