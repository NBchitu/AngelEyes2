package com.google.api.client.util.escape;

public abstract class UnicodeEscaper
  extends Escaper
{
  private static char[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    char[] arrayOfChar = new char[paramInt2];
    if (paramInt1 > 0) {
      System.arraycopy(paramArrayOfChar, 0, arrayOfChar, 0, paramInt1);
    }
    return arrayOfChar;
  }
  
  protected static int b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      int i = paramInt1 + 1;
      int j = paramCharSequence.charAt(paramInt1);
      if ((j < 55296) || (j > 57343)) {
        return j;
      }
      if (j <= 56319)
      {
        if (i == paramInt2) {
          return -j;
        }
        char c = paramCharSequence.charAt(i);
        if (Character.isLowSurrogate(c)) {
          return Character.toCodePoint(j, c);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + c + "' with value " + c + " at index " + i);
      }
      throw new IllegalArgumentException("Unexpected low surrogate character '" + j + "' with value " + j + " at index " + (i - 1));
    }
    throw new IndexOutOfBoundsException("Index exceeds specified range");
  }
  
  protected abstract int a(CharSequence paramCharSequence, int paramInt1, int paramInt2);
  
  protected final String a(String paramString, int paramInt)
  {
    int i = paramString.length();
    char[] arrayOfChar1 = Platform.a();
    int j = 0;
    int k = 0;
    int i2;
    label63:
    int i3;
    int i5;
    if (paramInt < i)
    {
      int i1 = b(paramString, paramInt, i);
      if (i1 < 0) {
        throw new IllegalArgumentException("Trailing high surrogate at end of input");
      }
      char[] arrayOfChar2 = a(i1);
      if (Character.isSupplementaryCodePoint(i1))
      {
        i2 = 2;
        i3 = i2 + paramInt;
        if (arrayOfChar2 == null) {
          break label270;
        }
        int i8 = paramInt - j;
        int i9 = k + i8 + arrayOfChar2.length;
        if (arrayOfChar1.length < i9) {
          arrayOfChar1 = a(arrayOfChar1, k, 32 + (i9 + i - paramInt));
        }
        if (i8 > 0)
        {
          paramString.getChars(j, paramInt, arrayOfChar1, k);
          k += i8;
        }
        if (arrayOfChar2.length > 0)
        {
          System.arraycopy(arrayOfChar2, 0, arrayOfChar1, k, arrayOfChar2.length);
          k += arrayOfChar2.length;
        }
        i5 = k;
      }
    }
    label270:
    int i4;
    for (int i6 = i3;; i6 = i4)
    {
      paramInt = a(paramString, i3, i);
      int i7 = i6;
      k = i5;
      j = i7;
      break;
      i2 = 1;
      break label63;
      int m = i - j;
      if (m > 0)
      {
        int n = m + k;
        if (arrayOfChar1.length < n) {
          arrayOfChar1 = a(arrayOfChar1, k, n);
        }
        paramString.getChars(j, i, arrayOfChar1, k);
        k = n;
      }
      return new String(arrayOfChar1, 0, k);
      i4 = j;
      i5 = k;
    }
  }
  
  protected abstract char[] a(int paramInt);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.escape.UnicodeEscaper
 * JD-Core Version:    0.7.0.1
 */