package com.google.android.gms.common;

import java.util.Comparator;

final class b$1
  implements Comparator<byte[]>
{
  public int a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = Math.min(paramArrayOfByte1.length, paramArrayOfByte2.length);
    for (int j = 0; j < i; j++)
    {
      int k = 0xFF & paramArrayOfByte1[j];
      int m = 0xFF & paramArrayOfByte2[j];
      if (k != m) {
        return k - m;
      }
    }
    return paramArrayOfByte1.length - paramArrayOfByte2.length;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.b.1
 * JD-Core Version:    0.7.0.1
 */