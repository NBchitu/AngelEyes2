package com.google.tagmanager.protobuf;

final class Utf8
{
  private static int a(int paramInt)
  {
    if (paramInt > -12) {
      paramInt = -1;
    }
    return paramInt;
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > -12) || (paramInt2 > -65)) {
      return -1;
    }
    return paramInt1 ^ paramInt2 << 8;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > -12) || (paramInt2 > -65) || (paramInt3 > -65)) {
      return -1;
    }
    return paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
  }
  
  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i;
    int i5;
    int n;
    int i2;
    int k;
    int m;
    if (paramInt1 != 0)
    {
      if (paramInt2 >= paramInt3) {
        return paramInt1;
      }
      i = (byte)paramInt1;
      if (i < -32)
      {
        if (i >= -62)
        {
          i5 = paramInt2 + 1;
          if (paramArrayOfByte[paramInt2] <= -65) {}
        }
        else
        {
          return -1;
        }
      }
      else
      {
        if (i < -16)
        {
          int i3 = (byte)(0xFFFFFFFF ^ paramInt1 >> 8);
          int i4;
          if (i3 == 0)
          {
            i4 = paramInt2 + 1;
            i3 = paramArrayOfByte[paramInt2];
            if (i4 >= paramInt3) {
              return a(i, i3);
            }
          }
          else
          {
            i4 = paramInt2;
          }
          if ((i3 <= -65) && ((i != -32) || (i3 >= -96)) && ((i != -19) || (i3 < -96)))
          {
            paramInt2 = i4 + 1;
            if (paramArrayOfByte[i4] <= -65) {
              break label282;
            }
          }
          return -1;
        }
        int j = (byte)(0xFFFFFFFF ^ paramInt1 >> 8);
        if (j == 0)
        {
          n = paramInt2 + 1;
          i2 = paramArrayOfByte[paramInt2];
          if (n < paramInt3) {
            break label289;
          }
          return a(i, i2);
        }
        k = (byte)(paramInt1 >> 16);
        m = j;
        n = paramInt2;
      }
    }
    for (;;)
    {
      int i1;
      if (k == 0)
      {
        i1 = n + 1;
        k = paramArrayOfByte[n];
        if (i1 >= paramInt3) {
          return a(i, m, k);
        }
      }
      else
      {
        i1 = n;
      }
      if ((m <= -65) && ((i << 28) + (m + 112) >> 30 == 0) && (k <= -65))
      {
        paramInt2 = i1 + 1;
        if (paramArrayOfByte[i1] <= -65) {}
      }
      else
      {
        return -1;
        paramInt2 = i5;
      }
      label282:
      return b(paramArrayOfByte, paramInt2, paramInt3);
      label289:
      m = i2;
      k = 0;
    }
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return b(paramArrayOfByte, paramInt1, paramInt2) == 0;
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] >= 0)) {
      paramInt1++;
    }
    if (paramInt1 >= paramInt2) {
      return 0;
    }
    return c(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int j;
      if (paramInt1 >= paramInt2) {
        j = 0;
      }
      int i;
      do
      {
        return j;
        i = paramInt1 + 1;
        j = paramArrayOfByte[paramInt1];
        if (j >= 0) {
          break label228;
        }
        if (j >= -32) {
          break;
        }
      } while (i >= paramInt2);
      int i1;
      if (j >= -62)
      {
        i1 = i + 1;
        if (paramArrayOfByte[i] <= -65) {}
      }
      else
      {
        return -1;
        if (j < -16)
        {
          if (i >= paramInt2 - 1) {
            return d(paramArrayOfByte, i, paramInt2);
          }
          int i2 = i + 1;
          int i3 = paramArrayOfByte[i];
          if ((i3 <= -65) && ((j != -32) || (i3 >= -96)) && ((j != -19) || (i3 < -96)))
          {
            i1 = i2 + 1;
            if (paramArrayOfByte[i2] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else
        {
          if (i >= paramInt2 - 2) {
            return d(paramArrayOfByte, i, paramInt2);
          }
          int k = i + 1;
          int m = paramArrayOfByte[i];
          if ((m <= -65) && ((j << 28) + (m + 112) >> 30 == 0))
          {
            int n = k + 1;
            if (paramArrayOfByte[k] <= -65)
            {
              i1 = n + 1;
              if (paramArrayOfByte[n] <= -65) {
                break label222;
              }
            }
          }
          return -1;
        }
      }
      label222:
      paramInt1 = i1;
      continue;
      label228:
      paramInt1 = i;
    }
  }
  
  private static int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[(paramInt1 - 1)];
    switch (paramInt2 - paramInt1)
    {
    default: 
      throw new AssertionError();
    case 0: 
      return a(i);
    case 1: 
      return a(i, paramArrayOfByte[paramInt1]);
    }
    return a(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.Utf8
 * JD-Core Version:    0.7.0.1
 */