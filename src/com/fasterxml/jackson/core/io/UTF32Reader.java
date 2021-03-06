package com.fasterxml.jackson.core.io;

import java.io.CharConversionException;
import java.io.InputStream;

public final class UTF32Reader
  extends BaseReader
{
  final boolean g;
  char h = '\000';
  int i = 0;
  int j = 0;
  
  public UTF32Reader(IOContext paramIOContext, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramIOContext, paramInputStream, paramArrayOfByte, paramInt1, paramInt2);
    this.g = paramBoolean;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int k = paramInt1 + this.j;
    int m = this.i;
    throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + paramInt1 + ", needed " + paramInt2 + ", at char #" + m + ", byte #" + k + ")");
  }
  
  private void a(int paramInt1, int paramInt2, String paramString)
  {
    int k = -1 + (this.j + this.d);
    int m = paramInt2 + this.i;
    throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(paramInt1) + paramString + " at char #" + m + ", byte #" + k + ")");
  }
  
  private boolean a(int paramInt)
  {
    this.j += this.e - paramInt;
    if (paramInt > 0)
    {
      if (this.d > 0)
      {
        for (int n = 0; n < paramInt; n++) {
          this.c[n] = this.c[(n + this.d)];
        }
        this.d = 0;
      }
      this.e = paramInt;
    }
    while (this.e < 4)
    {
      int m = this.b.read(this.c, this.e, this.c.length - this.e);
      if (m < 1)
      {
        if (m < 0)
        {
          a();
          a(this.e, 4);
        }
        b();
      }
      this.e = (m + this.e);
      continue;
      this.d = 0;
      int k = this.b.read(this.c);
      if (k < 1)
      {
        this.e = 0;
        if (k < 0)
        {
          a();
          return false;
        }
        b();
      }
      this.e = k;
    }
    return true;
  }
  
  public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.c == null) {
      paramInt2 = -1;
    }
    while (paramInt2 < 1) {
      return paramInt2;
    }
    if ((paramInt1 < 0) || (paramInt1 + paramInt2 > paramArrayOfChar.length)) {
      a(paramArrayOfChar, paramInt1, paramInt2);
    }
    int k = paramInt2 + paramInt1;
    int n;
    if (this.h != 0)
    {
      n = paramInt1 + 1;
      paramArrayOfChar[paramInt1] = this.h;
      this.h = '\000';
    }
    for (;;)
    {
      int i3;
      int i4;
      label144:
      int i1;
      if (n < k)
      {
        i3 = this.d;
        if (this.g)
        {
          i4 = this.c[i3] << 24 | (0xFF & this.c[(i3 + 1)]) << 16 | (0xFF & this.c[(i3 + 2)]) << 8 | 0xFF & this.c[(i3 + 3)];
          this.d = (4 + this.d);
          if (i4 <= 65535) {
            break label368;
          }
          if (i4 > 1114111) {
            a(i4, n - paramInt1, "(above " + Integer.toHexString(1114111) + ") ");
          }
          int i5 = i4 - 65536;
          i1 = n + 1;
          paramArrayOfChar[n] = ((char)(55296 + (i5 >> 10)));
          i4 = 0xDC00 | i5 & 0x3FF;
          if (i1 < k) {
            break label372;
          }
          this.h = ((char)i4);
        }
      }
      for (;;)
      {
        int i2 = i1 - paramInt1;
        this.i = (i2 + this.i);
        return i2;
        int m = this.e - this.d;
        if ((m >= 4) || (a(m))) {
          break label410;
        }
        return -1;
        i4 = 0xFF & this.c[i3] | (0xFF & this.c[(i3 + 1)]) << 8 | (0xFF & this.c[(i3 + 2)]) << 16 | this.c[(i3 + 3)] << 24;
        break label144;
        label368:
        i1 = n;
        label372:
        n = i1 + 1;
        paramArrayOfChar[i1] = ((char)i4);
        if (this.d < this.e) {
          break;
        }
        i1 = n;
        continue;
        i1 = n;
      }
      label410:
      n = paramInt1;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.io.UTF32Reader
 * JD-Core Version:    0.7.0.1
 */