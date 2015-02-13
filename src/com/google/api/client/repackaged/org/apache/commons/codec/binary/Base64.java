package com.google.api.client.repackaged.org.apache.commons.codec.binary;

public class Base64
  extends BaseNCodec
{
  static final byte[] a = { 13, 10 };
  private static final byte[] i = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] j = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  private static final byte[] k = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };
  private final byte[] l;
  private final byte[] m;
  private final byte[] n;
  private final int o;
  private final int p;
  private int q;
  
  public Base64()
  {
    this(0);
  }
  
  public Base64(int paramInt)
  {
    this(paramInt, a);
  }
  
  public Base64(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, false);
  }
  
  public Base64(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean) {}
  
  public Base64(boolean paramBoolean)
  {
    this(76, a, paramBoolean);
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return StringUtils.a(a(paramArrayOfByte, false, true));
  }
  
  public static byte[] a(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramArrayOfByte, paramBoolean1, paramBoolean2, 2147483647);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return paramArrayOfByte;
    }
    if (paramBoolean1) {}
    for (Base64 localBase64 = new Base64(paramBoolean2);; localBase64 = new Base64(0, a, paramBoolean2))
    {
      long l1 = localBase64.d(paramArrayOfByte);
      if (l1 <= paramInt) {
        break;
      }
      throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l1 + ") than the specified maximum size of " + paramInt);
    }
    return localBase64.b(paramArrayOfByte);
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.f) {}
    for (;;)
    {
      return;
      if (paramInt2 < 0)
      {
        this.f = true;
        if ((this.h != 0) || (this.c != 0))
        {
          a(this.p);
          int i8 = this.e;
          switch (this.h)
          {
          }
          for (;;)
          {
            this.g += this.e - i8;
            if ((this.c <= 0) || (this.g <= 0)) {
              break;
            }
            System.arraycopy(this.n, 0, this.d, this.e, this.n.length);
            this.e += this.n.length;
            return;
            byte[] arrayOfByte9 = this.d;
            int i13 = this.e;
            this.e = (i13 + 1);
            arrayOfByte9[i13] = this.l[(0x3F & this.q >> 2)];
            byte[] arrayOfByte10 = this.d;
            int i14 = this.e;
            this.e = (i14 + 1);
            arrayOfByte10[i14] = this.l[(0x3F & this.q << 4)];
            if (this.l == i)
            {
              byte[] arrayOfByte11 = this.d;
              int i15 = this.e;
              this.e = (i15 + 1);
              arrayOfByte11[i15] = 61;
              byte[] arrayOfByte12 = this.d;
              int i16 = this.e;
              this.e = (i16 + 1);
              arrayOfByte12[i16] = 61;
              continue;
              byte[] arrayOfByte5 = this.d;
              int i9 = this.e;
              this.e = (i9 + 1);
              arrayOfByte5[i9] = this.l[(0x3F & this.q >> 10)];
              byte[] arrayOfByte6 = this.d;
              int i10 = this.e;
              this.e = (i10 + 1);
              arrayOfByte6[i10] = this.l[(0x3F & this.q >> 4)];
              byte[] arrayOfByte7 = this.d;
              int i11 = this.e;
              this.e = (i11 + 1);
              arrayOfByte7[i11] = this.l[(0x3F & this.q << 2)];
              if (this.l == i)
              {
                byte[] arrayOfByte8 = this.d;
                int i12 = this.e;
                this.e = (i12 + 1);
                arrayOfByte8[i12] = 61;
              }
            }
          }
        }
      }
      else
      {
        int i1 = 0;
        while (i1 < paramInt2)
        {
          a(this.p);
          this.h = ((1 + this.h) % 3);
          int i2 = paramInt1 + 1;
          int i3 = paramArrayOfByte[paramInt1];
          if (i3 < 0) {
            i3 += 256;
          }
          this.q = (i3 + (this.q << 8));
          if (this.h == 0)
          {
            byte[] arrayOfByte1 = this.d;
            int i4 = this.e;
            this.e = (i4 + 1);
            arrayOfByte1[i4] = this.l[(0x3F & this.q >> 18)];
            byte[] arrayOfByte2 = this.d;
            int i5 = this.e;
            this.e = (i5 + 1);
            arrayOfByte2[i5] = this.l[(0x3F & this.q >> 12)];
            byte[] arrayOfByte3 = this.d;
            int i6 = this.e;
            this.e = (i6 + 1);
            arrayOfByte3[i6] = this.l[(0x3F & this.q >> 6)];
            byte[] arrayOfByte4 = this.d;
            int i7 = this.e;
            this.e = (i7 + 1);
            arrayOfByte4[i7] = this.l[(0x3F & this.q)];
            this.g = (4 + this.g);
            if ((this.c > 0) && (this.c <= this.g))
            {
              System.arraycopy(this.n, 0, this.d, this.e, this.n.length);
              this.e += this.n.length;
              this.g = 0;
            }
          }
          i1++;
          paramInt1 = i2;
        }
      }
    }
  }
  
  protected boolean a(byte paramByte)
  {
    return (paramByte >= 0) && (paramByte < this.m.length) && (this.m[paramByte] != -1);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64
 * JD-Core Version:    0.7.0.1
 */