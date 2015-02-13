package com.google.android.gms.tagmanager;

import java.util.Arrays;

class v$b
{
  final String a;
  final byte[] b;
  
  v$b(String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
  }
  
  public String toString()
  {
    return "KeyAndSerialized: key = " + this.a + " serialized hash = " + Arrays.hashCode(this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.v.b
 * JD-Core Version:    0.7.0.1
 */