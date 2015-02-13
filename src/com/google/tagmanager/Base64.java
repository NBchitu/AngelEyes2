package com.google.tagmanager;

final class Base64
{
  private static final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] b = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  private static final byte[] c = { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9 };
  private static final byte[] d = { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9 };
  
  private static int a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1[(paramInt1 + 2)] == 61)
    {
      paramArrayOfByte2[paramInt2] = ((byte)((paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 1)]] << 24 >>> 12) >>> 16));
      return 1;
    }
    if (paramArrayOfByte1[(paramInt1 + 3)] == 61)
    {
      int j = paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 1)]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 2)]] << 24 >>> 18;
      paramArrayOfByte2[paramInt2] = ((byte)(j >>> 16));
      paramArrayOfByte2[(paramInt2 + 1)] = ((byte)(j >>> 8));
      return 2;
    }
    int i = paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 1)]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 2)]] << 24 >>> 18 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 3)]] << 24 >>> 24;
    paramArrayOfByte2[paramInt2] = ((byte)(i >> 16));
    paramArrayOfByte2[(paramInt2 + 1)] = ((byte)(i >> 8));
    paramArrayOfByte2[(paramInt2 + 2)] = ((byte)i);
    return 3;
  }
  
  private static String a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, boolean paramBoolean)
  {
    byte[] arrayOfByte = a(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, 2147483647);
    for (int i = arrayOfByte.length;; i--) {
      if ((paramBoolean) || (i <= 0) || (arrayOfByte[(i - 1)] != 61)) {
        return new String(arrayOfByte, 0, i);
      }
    }
  }
  
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, a, paramBoolean);
  }
  
  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes();
    return a(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(paramArrayOfByte, paramInt1, paramInt2, c);
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = new byte[2 + paramInt2 * 3 / 4];
    int i = 0;
    byte[] arrayOfByte2 = new byte[4];
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    int i2;
    if (k < paramInt2)
    {
      n = (byte)(0x7F & paramArrayOfByte1[(k + paramInt1)]);
      int i1 = paramArrayOfByte2[n];
      if (i1 < -5) {
        throw new Base64.Base64DecoderException("Bad Base64 input character at " + k + ": " + paramArrayOfByte1[(k + paramInt1)] + "(decimal)");
      }
      if (i1 < -1) {
        break label387;
      }
      if (n == 61) {
        if (j != 0) {
          i2 = i;
        }
      }
    }
    for (;;)
    {
      k++;
      i = i2;
      break;
      if (k < 2) {
        throw new Base64.Base64DecoderException("Invalid padding byte found in position " + k);
      }
      j = 1;
      int i4 = (byte)(0x7F & paramArrayOfByte1[(paramInt1 + (paramInt2 - 1))]);
      if ((i4 != 61) && (i4 != 10)) {
        throw new Base64.Base64DecoderException("encoded value has invalid trailing byte");
      }
      i2 = i;
      continue;
      if (j != 0) {
        throw new Base64.Base64DecoderException("Data found after trailing padding byte at index " + k);
      }
      int i3 = m + 1;
      arrayOfByte2[m] = n;
      if (i3 == 4)
      {
        i2 = i + a(arrayOfByte2, 0, arrayOfByte1, i, paramArrayOfByte2);
        m = 0;
        continue;
        if (m != 0)
        {
          if (m == 1) {
            throw new Base64.Base64DecoderException("single trailing character at offset " + (paramInt2 - 1));
          }
          arrayOfByte2[m] = 61;
          i += a(arrayOfByte2, 0, arrayOfByte1, i, paramArrayOfByte2);
        }
        byte[] arrayOfByte3 = new byte[i];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, i);
        return arrayOfByte3;
      }
      else
      {
        m = i3;
        i2 = i;
        continue;
        label387:
        i2 = i;
      }
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i = 4 * ((paramInt2 + 2) / 3);
    byte[] arrayOfByte = new byte[i + i / paramInt3];
    int j = paramInt2 - 2;
    int k = 0;
    int m = 0;
    int n = 0;
    while (n < j)
    {
      int i1 = paramArrayOfByte1[(n + paramInt1)] << 24 >>> 8 | paramArrayOfByte1[(paramInt1 + (n + 1))] << 24 >>> 16 | paramArrayOfByte1[(paramInt1 + (n + 2))] << 24 >>> 24;
      arrayOfByte[m] = paramArrayOfByte2[(i1 >>> 18)];
      arrayOfByte[(m + 1)] = paramArrayOfByte2[(0x3F & i1 >>> 12)];
      arrayOfByte[(m + 2)] = paramArrayOfByte2[(0x3F & i1 >>> 6)];
      arrayOfByte[(m + 3)] = paramArrayOfByte2[(i1 & 0x3F)];
      int i2 = k + 4;
      if (i2 == paramInt3)
      {
        arrayOfByte[(m + 4)] = 10;
        m++;
        i2 = 0;
      }
      n += 3;
      m += 4;
      k = i2;
    }
    if (n < paramInt2)
    {
      a(paramArrayOfByte1, n + paramInt1, paramInt2 - n, arrayOfByte, m, paramArrayOfByte2);
      if (k + 4 == paramInt3)
      {
        arrayOfByte[(m + 4)] = 10;
        m++;
      }
      (m + 4);
    }
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, byte[] paramArrayOfByte3)
  {
    int i;
    if (paramInt2 > 0)
    {
      i = paramArrayOfByte1[paramInt1] << 24 >>> 8;
      label15:
      if (paramInt2 <= 1) {
        break label104;
      }
    }
    int n;
    label104:
    for (int j = paramArrayOfByte1[(paramInt1 + 1)] << 24 >>> 16;; j = 0)
    {
      int k = j | i;
      int m = 0;
      if (paramInt2 > 2) {
        m = paramArrayOfByte1[(paramInt1 + 2)] << 24 >>> 24;
      }
      n = m | k;
      switch (paramInt2)
      {
      default: 
        return paramArrayOfByte2;
        i = 0;
        break label15;
      }
    }
    paramArrayOfByte2[paramInt3] = paramArrayOfByte3[(n >>> 18)];
    paramArrayOfByte2[(paramInt3 + 1)] = paramArrayOfByte3[(0x3F & n >>> 12)];
    paramArrayOfByte2[(paramInt3 + 2)] = paramArrayOfByte3[(0x3F & n >>> 6)];
    paramArrayOfByte2[(paramInt3 + 3)] = paramArrayOfByte3[(n & 0x3F)];
    return paramArrayOfByte2;
    paramArrayOfByte2[paramInt3] = paramArrayOfByte3[(n >>> 18)];
    paramArrayOfByte2[(paramInt3 + 1)] = paramArrayOfByte3[(0x3F & n >>> 12)];
    paramArrayOfByte2[(paramInt3 + 2)] = paramArrayOfByte3[(0x3F & n >>> 6)];
    paramArrayOfByte2[(paramInt3 + 3)] = 61;
    return paramArrayOfByte2;
    paramArrayOfByte2[paramInt3] = paramArrayOfByte3[(n >>> 18)];
    paramArrayOfByte2[(paramInt3 + 1)] = paramArrayOfByte3[(0x3F & n >>> 12)];
    paramArrayOfByte2[(paramInt3 + 2)] = 61;
    paramArrayOfByte2[(paramInt3 + 3)] = 61;
    return paramArrayOfByte2;
  }
  
  public static String b(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, b, paramBoolean);
  }
  
  public static byte[] b(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes();
    return b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(paramArrayOfByte, paramInt1, paramInt2, d);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Base64
 * JD-Core Version:    0.7.0.1
 */