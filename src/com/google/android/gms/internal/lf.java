package com.google.android.gms.internal;

public final class lf
  implements ld
{
  private static lf a;
  
  public static ld b()
  {
    try
    {
      if (a == null) {
        a = new lf();
      }
      lf locallf = a;
      return locallf;
    }
    finally {}
  }
  
  public long a()
  {
    return System.currentTimeMillis();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lf
 * JD-Core Version:    0.7.0.1
 */