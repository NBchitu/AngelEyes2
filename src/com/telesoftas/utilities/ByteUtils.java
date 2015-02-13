package com.telesoftas.utilities;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class ByteUtils
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  
  public static String a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, " ");
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    return a(paramArrayOfByte, paramInt1, paramInt2, paramString, new StringBuilder());
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.delete(0, paramStringBuilder.length());
    for (int i = paramInt1; i < paramInt2; i++)
    {
      if (i != paramInt1) {
        paramStringBuilder.append(paramString);
      }
      int j = 0xFF & paramArrayOfByte[i];
      paramStringBuilder.append(a[(j >> 4)]).append(a[(j & 0xF)]);
    }
    return paramStringBuilder.toString();
  }
  
  public static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[16384];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    localByteArrayOutputStream.flush();
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static byte[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    int j = 0;
    int k = 0;
    for (;;)
    {
      if (i < paramInt1)
      {
        c = paramArrayOfChar[i];
        if (c == ',') {
          if (k == paramInt2 - 1)
          {
            if ((j == 6) || (j == 66))
            {
              arrayOfByte = new byte[1120];
              k++;
              j = 0;
              i++;
              continue;
            }
            arrayOfByte = null;
          }
        }
      }
    }
    while ((arrayOfByte == null) || (k - paramInt2 >= arrayOfByte.length)) {
      for (;;)
      {
        char c;
        return arrayOfByte;
        if (k >= paramInt2)
        {
          arrayOfByte[(k - paramInt2)] = ((byte)j);
          continue;
          if (Character.isDigit(c)) {
            j = Character.getNumericValue(c) + j * 10;
          } else {
            j = 0;
          }
        }
      }
    }
    arrayOfByte[(k - paramInt2)] = ((byte)j);
    return arrayOfByte;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ByteUtils
 * JD-Core Version:    0.7.0.1
 */