package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

public final class CharsToNameCanonicalizer
{
  static final CharsToNameCanonicalizer a = new CharsToNameCanonicalizer();
  protected CharsToNameCanonicalizer b;
  protected final boolean c;
  protected final boolean d;
  protected String[] e;
  protected CharsToNameCanonicalizer.Bucket[] f;
  protected int g;
  protected int h;
  protected int i;
  protected int j;
  protected boolean k;
  private final int l;
  
  private CharsToNameCanonicalizer()
  {
    this.d = true;
    this.c = true;
    this.k = true;
    this.l = 0;
    this.j = 0;
    d(64);
  }
  
  private CharsToNameCanonicalizer(CharsToNameCanonicalizer paramCharsToNameCanonicalizer, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, CharsToNameCanonicalizer.Bucket[] paramArrayOfBucket, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramCharsToNameCanonicalizer;
    this.d = paramBoolean1;
    this.c = paramBoolean2;
    this.e = paramArrayOfString;
    this.f = paramArrayOfBucket;
    this.g = paramInt1;
    this.l = paramInt2;
    int m = paramArrayOfString.length;
    this.h = e(m);
    this.i = (m - 1);
    this.j = paramInt3;
    this.k = false;
  }
  
  public static CharsToNameCanonicalizer a()
  {
    long l1 = System.currentTimeMillis();
    return a(0x1 | (int)l1 + ((int)l1 >>> 32));
  }
  
  protected static CharsToNameCanonicalizer a(int paramInt)
  {
    return a.f(paramInt);
  }
  
  /* Error */
  private void a(CharsToNameCanonicalizer paramCharsToNameCanonicalizer)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 74	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:c	()I
    //   6: sipush 12000
    //   9: if_icmpgt +12 -> 21
    //   12: aload_1
    //   13: getfield 39	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:j	I
    //   16: bipush 63
    //   18: if_icmple +17 -> 35
    //   21: aload_0
    //   22: bipush 64
    //   24: invokespecial 42	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:d	(I)V
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield 35	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:k	Z
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: aload_1
    //   36: invokevirtual 74	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:c	()I
    //   39: aload_0
    //   40: invokevirtual 74	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:c	()I
    //   43: if_icmple -11 -> 32
    //   46: aload_0
    //   47: aload_1
    //   48: getfield 47	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:e	[Ljava/lang/String;
    //   51: putfield 47	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:e	[Ljava/lang/String;
    //   54: aload_0
    //   55: aload_1
    //   56: getfield 49	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:f	[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;
    //   59: putfield 49	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:f	[Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer$Bucket;
    //   62: aload_0
    //   63: aload_1
    //   64: getfield 51	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:g	I
    //   67: putfield 51	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:g	I
    //   70: aload_0
    //   71: aload_1
    //   72: getfield 56	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:h	I
    //   75: putfield 56	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:h	I
    //   78: aload_0
    //   79: aload_1
    //   80: getfield 58	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:i	I
    //   83: putfield 58	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:i	I
    //   86: aload_0
    //   87: aload_1
    //   88: getfield 39	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:j	I
    //   91: putfield 39	com/fasterxml/jackson/core/sym/CharsToNameCanonicalizer:j	I
    //   94: goto -67 -> 27
    //   97: astore_2
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_2
    //   101: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	CharsToNameCanonicalizer
    //   0	102	1	paramCharsToNameCanonicalizer	CharsToNameCanonicalizer
    //   97	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	97	finally
    //   21	27	97	finally
    //   27	32	97	finally
    //   35	94	97	finally
  }
  
  private void d(int paramInt)
  {
    this.e = new String[paramInt];
    this.f = new CharsToNameCanonicalizer.Bucket[paramInt >> 1];
    this.i = (paramInt - 1);
    this.g = 0;
    this.j = 0;
    this.h = e(paramInt);
  }
  
  private static final int e(int paramInt)
  {
    return paramInt - (paramInt >> 2);
  }
  
  private CharsToNameCanonicalizer f(int paramInt)
  {
    return new CharsToNameCanonicalizer(null, true, true, this.e, this.f, this.g, paramInt, this.j);
  }
  
  private void f()
  {
    String[] arrayOfString = this.e;
    int m = arrayOfString.length;
    this.e = new String[m];
    System.arraycopy(arrayOfString, 0, this.e, 0, m);
    CharsToNameCanonicalizer.Bucket[] arrayOfBucket = this.f;
    int n = arrayOfBucket.length;
    this.f = new CharsToNameCanonicalizer.Bucket[n];
    System.arraycopy(arrayOfBucket, 0, this.f, 0, n);
  }
  
  private void g()
  {
    int m = this.e.length;
    int n = m + m;
    if (n > 65536)
    {
      this.g = 0;
      Arrays.fill(this.e, null);
      Arrays.fill(this.f, null);
      this.k = true;
    }
    label153:
    int i6;
    do
    {
      return;
      String[] arrayOfString = this.e;
      CharsToNameCanonicalizer.Bucket[] arrayOfBucket = this.f;
      this.e = new String[n];
      this.f = new CharsToNameCanonicalizer.Bucket[n >> 1];
      this.i = (n - 1);
      this.h = e(n);
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      if (i1 < m)
      {
        String str2 = arrayOfString[i1];
        int i11;
        if (str2 != null)
        {
          i3++;
          i11 = b(a(str2));
          if (this.e[i11] != null) {
            break label153;
          }
          this.e[i11] = str2;
        }
        for (;;)
        {
          i1++;
          break;
          int i12 = i11 >> 1;
          CharsToNameCanonicalizer.Bucket localBucket4 = new CharsToNameCanonicalizer.Bucket(str2, this.f[i12]);
          this.f[i12] = localBucket4;
          i2 = Math.max(i2, localBucket4.c());
        }
      }
      int i4 = m >> 1;
      int i5 = 0;
      i6 = i3;
      int i8;
      for (int i7 = i2; i5 < i4; i7 = i8)
      {
        CharsToNameCanonicalizer.Bucket localBucket1 = arrayOfBucket[i5];
        i8 = i7;
        CharsToNameCanonicalizer.Bucket localBucket2 = localBucket1;
        if (localBucket2 != null)
        {
          i6++;
          String str1 = localBucket2.a();
          int i9 = b(a(str1));
          if (this.e[i9] == null) {
            this.e[i9] = str1;
          }
          for (;;)
          {
            localBucket2 = localBucket2.b();
            break;
            int i10 = i9 >> 1;
            CharsToNameCanonicalizer.Bucket localBucket3 = new CharsToNameCanonicalizer.Bucket(str1, this.f[i10]);
            this.f[i10] = localBucket3;
            i8 = Math.max(i8, localBucket3.c());
          }
        }
        i5++;
      }
      this.j = i7;
    } while (i6 == this.g);
    throw new Error("Internal error on SymbolTable.rehash(): had " + this.g + " entries; now have " + i6 + ".");
  }
  
  public int a(String paramString)
  {
    int m = paramString.length();
    int n = this.l;
    int i1 = 0;
    while (i1 < m)
    {
      int i2 = n * 33 + paramString.charAt(i1);
      i1++;
      n = i2;
    }
    if (n == 0) {
      n = 1;
    }
    return n;
  }
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int m = this.l;
    int n = 0;
    while (n < paramInt2)
    {
      int i1 = m * 33 + paramArrayOfChar[n];
      n++;
      m = i1;
    }
    if (m == 0) {
      m = 1;
    }
    return m;
  }
  
  public CharsToNameCanonicalizer a(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      CharsToNameCanonicalizer localCharsToNameCanonicalizer = new CharsToNameCanonicalizer(this, paramBoolean1, paramBoolean2, this.e, this.f, this.g, this.l, this.j);
      return localCharsToNameCanonicalizer;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String a(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    String str2;
    if (paramInt2 < 1)
    {
      str2 = "";
      return str2;
    }
    if (!this.d) {
      return new String(paramArrayOfChar, paramInt1, paramInt2);
    }
    int m = b(paramInt3);
    String str1 = this.e[m];
    if (str1 != null)
    {
      if (str1.length() == paramInt2)
      {
        int i2 = 0;
        if (str1.charAt(i2) != paramArrayOfChar[(paramInt1 + i2)]) {}
        for (;;)
        {
          if (i2 != paramInt2) {
            break label101;
          }
          return str1;
          i2++;
          if (i2 < paramInt2) {
            break;
          }
        }
      }
      label101:
      CharsToNameCanonicalizer.Bucket localBucket2 = this.f[(m >> 1)];
      if (localBucket2 != null)
      {
        String str3 = localBucket2.a(paramArrayOfChar, paramInt1, paramInt2);
        if (str3 != null) {
          return str3;
        }
      }
    }
    int n;
    if (!this.k)
    {
      f();
      this.k = true;
      n = m;
    }
    for (;;)
    {
      str2 = new String(paramArrayOfChar, paramInt1, paramInt2);
      if (this.c) {
        str2 = InternCache.a.a(str2);
      }
      this.g = (1 + this.g);
      if (this.e[n] == null)
      {
        this.e[n] = str2;
        return str2;
        if (this.g >= this.h)
        {
          g();
          n = b(a(paramArrayOfChar, paramInt1, paramInt2));
        }
      }
      else
      {
        int i1 = n >> 1;
        CharsToNameCanonicalizer.Bucket localBucket1 = new CharsToNameCanonicalizer.Bucket(str2, this.f[i1]);
        this.f[i1] = localBucket1;
        this.j = Math.max(localBucket1.c(), this.j);
        if (this.j <= 255) {
          break;
        }
        c(255);
        return str2;
      }
      n = m;
    }
  }
  
  public final int b(int paramInt)
  {
    return paramInt + (paramInt >>> 15) & this.i;
  }
  
  public void b()
  {
    if (!d()) {}
    while (this.b == null) {
      return;
    }
    this.b.a(this);
    this.k = false;
  }
  
  public int c()
  {
    return this.g;
  }
  
  protected void c(int paramInt)
  {
    throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.g + ") now exceeds maximum, " + paramInt + " -- suspect a DoS attack based on hash collisions");
  }
  
  public boolean d()
  {
    return this.k;
  }
  
  public int e()
  {
    return this.l;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer
 * JD-Core Version:    0.7.0.1
 */