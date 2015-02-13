package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

public final class BytesToNameCanonicalizer
{
  protected final BytesToNameCanonicalizer a;
  protected int b;
  private final int c;
  private final boolean d;
  private int e;
  private int f;
  private int[] g;
  private Name[] h;
  private BytesToNameCanonicalizer.Bucket[] i;
  private int j;
  private int k;
  private transient boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  
  private BytesToNameCanonicalizer(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    this.a = null;
    this.c = paramInt2;
    this.d = paramBoolean;
    if (paramInt1 < i1) {
      paramInt1 = i1;
    }
    for (;;)
    {
      e(paramInt1);
      return;
      if ((paramInt1 & paramInt1 - 1) != 0)
      {
        while (i1 < paramInt1) {
          i1 += i1;
        }
        paramInt1 = i1;
      }
    }
  }
  
  private BytesToNameCanonicalizer(BytesToNameCanonicalizer paramBytesToNameCanonicalizer, boolean paramBoolean, int paramInt)
  {
    this.a = paramBytesToNameCanonicalizer;
    this.c = paramInt;
    this.d = paramBoolean;
    this.e = paramBytesToNameCanonicalizer.e;
    this.f = paramBytesToNameCanonicalizer.f;
    this.g = paramBytesToNameCanonicalizer.g;
    this.h = paramBytesToNameCanonicalizer.h;
    this.i = paramBytesToNameCanonicalizer.i;
    this.j = paramBytesToNameCanonicalizer.j;
    this.k = paramBytesToNameCanonicalizer.k;
    this.b = paramBytesToNameCanonicalizer.b;
    this.l = false;
    this.m = true;
    this.n = true;
    this.o = true;
  }
  
  public static BytesToNameCanonicalizer a()
  {
    long l1 = System.currentTimeMillis();
    return a(0x1 | (int)l1 + ((int)l1 >>> 32));
  }
  
  protected static BytesToNameCanonicalizer a(int paramInt)
  {
    return new BytesToNameCanonicalizer(64, true, paramInt);
  }
  
  private static Name a(int paramInt1, String paramString, int[] paramArrayOfInt, int paramInt2)
  {
    if (paramInt2 < 4) {}
    int[] arrayOfInt;
    int i1;
    switch (paramInt2)
    {
    default: 
      arrayOfInt = new int[paramInt2];
      i1 = 0;
    }
    while (i1 < paramInt2)
    {
      arrayOfInt[i1] = paramArrayOfInt[i1];
      i1++;
      continue;
      return new Name1(paramString, paramInt1, paramArrayOfInt[0]);
      return new Name2(paramString, paramInt1, paramArrayOfInt[0], paramArrayOfInt[1]);
      return new Name3(paramString, paramInt1, paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2]);
    }
    return new NameN(paramString, paramInt1, arrayOfInt, paramInt2);
  }
  
  private void a(int paramInt, Name paramName)
  {
    if (this.m) {
      j();
    }
    if (this.l) {
      g();
    }
    this.e = (1 + this.e);
    int i1 = paramInt & this.f;
    int i6;
    if (this.h[i1] == null)
    {
      this.g[i1] = (paramInt << 8);
      if (this.n) {
        l();
      }
      this.h[i1] = paramName;
      int i5 = this.g.length;
      if (this.e > i5 >> 1)
      {
        i6 = i5 >> 2;
        if (this.e <= i5 - i6) {
          break label297;
        }
        this.l = true;
      }
    }
    label200:
    while (this.j < i6)
    {
      return;
      if (this.o) {
        k();
      }
      this.j = (1 + this.j);
      int i2 = this.g[i1];
      int i3 = i2 & 0xFF;
      int i4;
      if (i3 == 0) {
        if (this.k <= 254)
        {
          i4 = this.k;
          this.k = (1 + this.k);
          if (i4 >= this.i.length) {
            m();
          }
          this.g[i1] = (i2 & 0xFFFFFF00 | i4 + 1);
        }
      }
      for (;;)
      {
        BytesToNameCanonicalizer.Bucket localBucket = new BytesToNameCanonicalizer.Bucket(paramName, this.i[i4]);
        this.i[i4] = localBucket;
        this.b = Math.max(localBucket.a(), this.b);
        if (this.b <= 255) {
          break;
        }
        d(255);
        break;
        i4 = i();
        break label200;
        i4 = i3 - 1;
      }
    }
    label297:
    this.l = true;
  }
  
  private void a(BytesToNameCanonicalizer paramBytesToNameCanonicalizer)
  {
    for (;;)
    {
      try
      {
        int i1 = paramBytesToNameCanonicalizer.e;
        int i2 = this.e;
        if (i1 <= i2) {
          return;
        }
        if ((paramBytesToNameCanonicalizer.c() > 6000) || (paramBytesToNameCanonicalizer.b > 63))
        {
          e(64);
          continue;
        }
        this.e = paramBytesToNameCanonicalizer.e;
      }
      finally {}
      this.b = paramBytesToNameCanonicalizer.b;
      this.g = paramBytesToNameCanonicalizer.g;
      this.h = paramBytesToNameCanonicalizer.h;
      this.m = true;
      this.n = true;
      this.f = paramBytesToNameCanonicalizer.f;
      this.i = paramBytesToNameCanonicalizer.i;
      this.j = paramBytesToNameCanonicalizer.j;
      this.k = paramBytesToNameCanonicalizer.k;
    }
  }
  
  public static Name e()
  {
    return Name1.b();
  }
  
  private void e(int paramInt)
  {
    this.e = 0;
    this.b = 0;
    this.g = new int[paramInt];
    this.h = new Name[paramInt];
    this.m = false;
    this.n = false;
    this.f = (paramInt - 1);
    this.o = true;
    this.i = null;
    this.k = 0;
    this.l = false;
  }
  
  private void f()
  {
    this.m = true;
    this.n = true;
    this.o = true;
  }
  
  private void g()
  {
    int i1 = 0;
    this.l = false;
    this.n = false;
    int i2 = this.g.length;
    int i3 = i2 + i2;
    if (i3 > 65536) {
      h();
    }
    int i8;
    label365:
    do
    {
      return;
      this.g = new int[i3];
      this.f = (i3 - 1);
      Name[] arrayOfName = this.h;
      this.h = new Name[i3];
      int i4 = 0;
      int i5 = 0;
      while (i4 < i2)
      {
        Name localName2 = arrayOfName[i4];
        if (localName2 != null)
        {
          i5++;
          int i17 = localName2.hashCode();
          int i18 = i17 & this.f;
          this.h[i18] = localName2;
          this.g[i18] = (i17 << 8);
        }
        i4++;
      }
      int i6 = this.k;
      if (i6 == 0)
      {
        this.b = 0;
        return;
      }
      this.j = 0;
      this.k = 0;
      this.o = false;
      BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this.i;
      this.i = new BytesToNameCanonicalizer.Bucket[arrayOfBucket.length];
      int i7 = 0;
      int i9;
      for (i8 = i5; i7 < i6; i8 = i9)
      {
        BytesToNameCanonicalizer.Bucket localBucket1 = arrayOfBucket[i7];
        i9 = i8;
        BytesToNameCanonicalizer.Bucket localBucket2 = localBucket1;
        while (localBucket2 != null)
        {
          int i10 = i9 + 1;
          Name localName1 = localBucket2.a;
          int i11 = localName1.hashCode();
          int i12 = i11 & this.f;
          int i13 = this.g[i12];
          int i16;
          if (this.h[i12] == null)
          {
            this.g[i12] = (i11 << 8);
            this.h[i12] = localName1;
            i16 = i1;
            localBucket2 = localBucket2.b;
            i1 = i16;
            i9 = i10;
          }
          else
          {
            this.j = (1 + this.j);
            int i14 = i13 & 0xFF;
            int i15;
            if (i14 == 0) {
              if (this.k <= 254)
              {
                i15 = this.k;
                this.k = (1 + this.k);
                if (i15 >= this.i.length) {
                  m();
                }
                this.g[i12] = (i13 & 0xFFFFFF00 | i15 + 1);
              }
            }
            for (;;)
            {
              BytesToNameCanonicalizer.Bucket localBucket3 = new BytesToNameCanonicalizer.Bucket(localName1, this.i[i15]);
              this.i[i15] = localBucket3;
              i16 = Math.max(i1, localBucket3.a());
              break;
              i15 = i();
              break label365;
              i15 = i14 - 1;
            }
          }
        }
        i7++;
      }
      this.b = i1;
    } while (i8 == this.e);
    throw new RuntimeException("Internal error: count after rehash " + i8 + "; should be " + this.e);
  }
  
  private void h()
  {
    this.e = 0;
    this.b = 0;
    Arrays.fill(this.g, 0);
    Arrays.fill(this.h, null);
    Arrays.fill(this.i, null);
    this.j = 0;
    this.k = 0;
  }
  
  private int i()
  {
    BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this.i;
    int i1 = 2147483647;
    int i2 = -1;
    int i3 = 0;
    int i4 = this.k;
    int i5;
    if (i3 < i4)
    {
      i5 = arrayOfBucket[i3].a();
      if (i5 >= i1) {
        break label64;
      }
      if (i5 == 1) {
        return i3;
      }
      i2 = i3;
    }
    for (;;)
    {
      i3++;
      i1 = i5;
      break;
      return i2;
      label64:
      i5 = i1;
    }
  }
  
  private void j()
  {
    int[] arrayOfInt = this.g;
    int i1 = this.g.length;
    this.g = new int[i1];
    System.arraycopy(arrayOfInt, 0, this.g, 0, i1);
    this.m = false;
  }
  
  private void k()
  {
    BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this.i;
    if (arrayOfBucket == null) {
      this.i = new BytesToNameCanonicalizer.Bucket[32];
    }
    for (;;)
    {
      this.o = false;
      return;
      int i1 = arrayOfBucket.length;
      this.i = new BytesToNameCanonicalizer.Bucket[i1];
      System.arraycopy(arrayOfBucket, 0, this.i, 0, i1);
    }
  }
  
  private void l()
  {
    Name[] arrayOfName = this.h;
    int i1 = arrayOfName.length;
    this.h = new Name[i1];
    System.arraycopy(arrayOfName, 0, this.h, 0, i1);
    this.n = false;
  }
  
  private void m()
  {
    BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this.i;
    int i1 = arrayOfBucket.length;
    this.i = new BytesToNameCanonicalizer.Bucket[i1 + i1];
    System.arraycopy(arrayOfBucket, 0, this.i, 0, i1);
  }
  
  public BytesToNameCanonicalizer a(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      BytesToNameCanonicalizer localBytesToNameCanonicalizer = new BytesToNameCanonicalizer(this, paramBoolean2, this.c);
      return localBytesToNameCanonicalizer;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public Name a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {}
    int i3;
    Name localName;
    for (int i1 = c(paramInt1);; i1 = b(paramInt1, paramInt2))
    {
      int i2 = i1 & this.f;
      i3 = this.g[i2];
      if ((i1 ^ i3 >> 8) << 8 != 0) {
        break label79;
      }
      localName = this.h[i2];
      if (localName != null) {
        break;
      }
      return null;
    }
    if (localName.a(paramInt1, paramInt2))
    {
      return localName;
      label79:
      if (i3 == 0) {
        return null;
      }
    }
    int i4 = i3 & 0xFF;
    if (i4 > 0)
    {
      int i5 = i4 - 1;
      BytesToNameCanonicalizer.Bucket localBucket = this.i[i5];
      if (localBucket != null) {
        return localBucket.a(i1, paramInt1, paramInt2);
      }
    }
    return null;
  }
  
  public Name a(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    if (this.d) {
      paramString = InternCache.a.a(paramString);
    }
    int i1;
    if (paramInt < 3) {
      if (paramInt == 1) {
        i1 = c(paramArrayOfInt[0]);
      }
    }
    for (;;)
    {
      Name localName = a(i1, paramString, paramArrayOfInt, paramInt);
      a(i1, localName);
      return localName;
      i1 = b(paramArrayOfInt[0], paramArrayOfInt[1]);
      continue;
      i1 = b(paramArrayOfInt, paramInt);
    }
  }
  
  public Name a(int[] paramArrayOfInt, int paramInt)
  {
    int i7;
    Name localName;
    if (paramInt < 3)
    {
      int i6 = paramArrayOfInt[0];
      i7 = 0;
      if (paramInt < 2) {
        localName = a(i6, i7);
      }
    }
    int i1;
    int i3;
    do
    {
      return localName;
      i7 = paramArrayOfInt[1];
      break;
      i1 = b(paramArrayOfInt, paramInt);
      int i2 = i1 & this.f;
      i3 = this.g[i2];
      if ((i1 ^ i3 >> 8) << 8 != 0) {
        break label142;
      }
      localName = this.h[i2];
    } while ((localName == null) || (localName.a(paramArrayOfInt, paramInt)));
    label142:
    while (i3 != 0)
    {
      int i4 = i3 & 0xFF;
      if (i4 <= 0) {
        break;
      }
      int i5 = i4 - 1;
      BytesToNameCanonicalizer.Bucket localBucket = this.i[i5];
      if (localBucket == null) {
        break;
      }
      return localBucket.a(i1, paramArrayOfInt, paramInt);
    }
    return null;
    return null;
  }
  
  public final int b(int paramInt1, int paramInt2)
  {
    int i1 = (paramInt1 ^ paramInt1 >>> 15) + paramInt2 * 33 ^ this.c;
    return i1 + (i1 >>> 7);
  }
  
  public final int b(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = 3;
    if (paramInt < i1) {
      throw new IllegalArgumentException();
    }
    int i2 = paramArrayOfInt[0] ^ this.c;
    int i3 = 33 * (i2 + (i2 >>> 9));
    paramArrayOfInt[1];
    int i4 = 65599 * (i3 + paramArrayOfInt[1]);
    int i5 = i4 + (i4 >>> 15) ^ paramArrayOfInt[2];
    int i6 = i5 + (i5 >>> 17);
    while (i1 < paramInt)
    {
      int i8 = i6 * 31 ^ paramArrayOfInt[i1];
      int i9 = i8 + (i8 >>> 3);
      i6 = i9 ^ i9 << 7;
      i1++;
    }
    int i7 = i6 + (i6 >>> 15);
    return i7 ^ i7 << 9;
  }
  
  public Name b(int paramInt)
  {
    int i1 = c(paramInt);
    int i2 = i1 & this.f;
    int i3 = this.g[i2];
    Name localName;
    if ((i1 ^ i3 >> 8) << 8 == 0)
    {
      localName = this.h[i2];
      if (localName != null) {}
    }
    BytesToNameCanonicalizer.Bucket localBucket;
    do
    {
      int i4;
      do
      {
        do
        {
          return null;
          if (!localName.a(paramInt)) {
            break;
          }
          return localName;
        } while (i3 == 0);
        i4 = i3 & 0xFF;
      } while (i4 <= 0);
      int i5 = i4 - 1;
      localBucket = this.i[i5];
    } while (localBucket == null);
    return localBucket.a(i1, paramInt, 0);
  }
  
  public void b()
  {
    if ((d()) && (this.a != null))
    {
      this.a.a(this);
      f();
    }
  }
  
  public int c()
  {
    return this.e;
  }
  
  public final int c(int paramInt)
  {
    int i1 = paramInt ^ this.c;
    int i2 = i1 + (i1 >>> 15);
    return i2 ^ i2 >>> 9;
  }
  
  protected void d(int paramInt)
  {
    throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.e + ") now exceeds maximum, " + paramInt + " -- suspect a DoS attack based on hash collisions");
  }
  
  public boolean d()
  {
    return !this.m;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer
 * JD-Core Version:    0.7.0.1
 */