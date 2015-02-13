package com.fasterxml.jackson.core.io;

public final class NumberInput
{
  static final String a = String.valueOf(-9223372036854775808L).substring(1);
  static final String b = String.valueOf(9223372036854775807L);
  
  public static final double a(String paramString)
  {
    if ("2.2250738585072012e-308".equals(paramString)) {
      return 4.9E-324D;
    }
    return Double.parseDouble(paramString);
  }
  
  public static final int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = '￐' + paramArrayOfChar[paramInt1];
    int j = paramInt2 + paramInt1;
    int k = paramInt1 + 1;
    if (k < j)
    {
      i = i * 10 + ('￐' + paramArrayOfChar[k]);
      int m = k + 1;
      if (m < j)
      {
        i = i * 10 + ('￐' + paramArrayOfChar[m]);
        int n = m + 1;
        if (n < j)
        {
          i = i * 10 + ('￐' + paramArrayOfChar[n]);
          int i1 = n + 1;
          if (i1 < j)
          {
            i = i * 10 + ('￐' + paramArrayOfChar[i1]);
            int i2 = i1 + 1;
            if (i2 < j)
            {
              i = i * 10 + ('￐' + paramArrayOfChar[i2]);
              int i3 = i2 + 1;
              if (i3 < j)
              {
                i = i * 10 + ('￐' + paramArrayOfChar[i3]);
                int i4 = i3 + 1;
                if (i4 < j)
                {
                  i = i * 10 + ('￐' + paramArrayOfChar[i4]);
                  int i5 = i4 + 1;
                  if (i5 < j) {
                    i = i * 10 + ('￐' + paramArrayOfChar[i5]);
                  }
                }
              }
            }
          }
        }
      }
    }
    return i;
  }
  
  public static final boolean a(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    String str;
    int i;
    if (paramBoolean)
    {
      str = a;
      i = str.length();
      if (paramInt2 >= i) {
        break label32;
      }
    }
    for (;;)
    {
      return true;
      str = b;
      break;
      label32:
      if (paramInt2 > i) {
        return false;
      }
      for (int j = 0; j < i; j++)
      {
        int k = paramArrayOfChar[(paramInt1 + j)] - str.charAt(j);
        if (k != 0)
        {
          if (k < 0) {}
          for (boolean bool = true;; bool = false) {
            return bool;
          }
        }
      }
    }
  }
  
  public static final long b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - 9;
    return 1000000000L * a(paramArrayOfChar, paramInt1, i) + a(paramArrayOfChar, i + paramInt1, 9);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.io.NumberInput
 * JD-Core Version:    0.7.0.1
 */