package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class ByteSourceJsonBootstrapper
{
  protected final IOContext a;
  protected final InputStream b;
  protected final byte[] c;
  protected int d;
  protected boolean e = true;
  protected int f = 0;
  private int g;
  private int h;
  private final boolean i;
  
  public ByteSourceJsonBootstrapper(IOContext paramIOContext, InputStream paramInputStream)
  {
    this.a = paramIOContext;
    this.b = paramInputStream;
    this.c = paramIOContext.e();
    this.g = 0;
    this.h = 0;
    this.d = 0;
    this.i = true;
  }
  
  private void a(String paramString)
  {
    throw new CharConversionException("Unsupported UCS-4 endianness (" + paramString + ") detected");
  }
  
  private boolean b(int paramInt)
  {
    switch (paramInt)
    {
    }
    int j;
    for (;;)
    {
      j = paramInt >>> 16;
      if (j != 65279) {
        break;
      }
      this.g = (2 + this.g);
      this.f = 2;
      this.e = true;
      return true;
      this.e = true;
      this.g = (4 + this.g);
      this.f = 4;
      return true;
      this.g = (4 + this.g);
      this.f = 4;
      this.e = false;
      return true;
      a("2143");
      a("3412");
    }
    if (j == 65534)
    {
      this.g = (2 + this.g);
      this.f = 2;
      this.e = false;
      return true;
    }
    if (paramInt >>> 8 == 15711167)
    {
      this.g = (3 + this.g);
      this.f = 1;
      this.e = true;
      return true;
    }
    return false;
  }
  
  private boolean c(int paramInt)
  {
    if (paramInt >> 8 == 0) {
      this.e = true;
    }
    for (;;)
    {
      this.f = 4;
      boolean bool = true;
      int j;
      do
      {
        return bool;
        if ((0xFFFFFF & paramInt) == 0)
        {
          this.e = false;
          break;
        }
        if ((0xFF00FFFF & paramInt) == 0)
        {
          a("3412");
          break;
        }
        j = 0xFFFF00FF & paramInt;
        bool = false;
      } while (j != 0);
      a("2143");
    }
  }
  
  private boolean d(int paramInt)
  {
    if ((0xFF00 & paramInt) == 0) {}
    for (this.e = true;; this.e = false)
    {
      this.f = 2;
      boolean bool = true;
      int j;
      do
      {
        return bool;
        j = paramInt & 0xFF;
        bool = false;
      } while (j != 0);
    }
  }
  
  public JsonEncoding a()
  {
    int j = 1;
    int k;
    JsonEncoding localJsonEncoding;
    if (a(4))
    {
      k = this.c[this.g] << 24 | (0xFF & this.c[(1 + this.g)]) << 16 | (0xFF & this.c[(2 + this.g)]) << 8 | 0xFF & this.c[(3 + this.g)];
      if (b(k))
      {
        if (j != 0) {
          break label177;
        }
        localJsonEncoding = JsonEncoding.a;
      }
    }
    for (;;)
    {
      this.a.a(localJsonEncoding);
      return localJsonEncoding;
      if ((c(k)) || (d(k >>> 16))) {
        break;
      }
      do
      {
        j = 0;
        break;
      } while ((!a(2)) || (!d((0xFF & this.c[this.g]) << 8 | 0xFF & this.c[(1 + this.g)])));
      break;
      label177:
      switch (this.f)
      {
      case 3: 
      default: 
        throw new RuntimeException("Internal error");
      case 1: 
        localJsonEncoding = JsonEncoding.a;
        break;
      case 2: 
        if (this.e) {
          localJsonEncoding = JsonEncoding.b;
        } else {
          localJsonEncoding = JsonEncoding.c;
        }
        break;
      case 4: 
        if (this.e) {
          localJsonEncoding = JsonEncoding.d;
        } else {
          localJsonEncoding = JsonEncoding.e;
        }
        break;
      }
    }
  }
  
  public JsonParser a(int paramInt, ObjectCodec paramObjectCodec, BytesToNameCanonicalizer paramBytesToNameCanonicalizer, CharsToNameCanonicalizer paramCharsToNameCanonicalizer, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((a() == JsonEncoding.a) && (paramBoolean1))
    {
      BytesToNameCanonicalizer localBytesToNameCanonicalizer = paramBytesToNameCanonicalizer.a(paramBoolean1, paramBoolean2);
      return new UTF8StreamJsonParser(this.a, paramInt, this.b, paramObjectCodec, localBytesToNameCanonicalizer, this.c, this.g, this.h, this.i);
    }
    return new ReaderBasedJsonParser(this.a, paramInt, b(), paramObjectCodec, paramCharsToNameCanonicalizer.a(paramBoolean1, paramBoolean2));
  }
  
  protected boolean a(int paramInt)
  {
    int j = 1;
    label37:
    int n;
    for (int k = this.h - this.g;; k = n + k)
    {
      if (k < paramInt) {
        if (this.b != null) {
          break label37;
        }
      }
      for (int m = -1; m < j; n = this.b.read(this.c, this.h, this.c.length - this.h))
      {
        j = 0;
        return j;
      }
      this.h = (n + this.h);
    }
  }
  
  public Reader b()
  {
    JsonEncoding localJsonEncoding = this.a.b();
    switch (ByteSourceJsonBootstrapper.1.a[localJsonEncoding.ordinal()])
    {
    default: 
      throw new RuntimeException("Internal error");
    case 1: 
    case 2: 
      return new UTF32Reader(this.a, this.b, this.c, this.g, this.h, this.a.b().b());
    }
    InputStream localInputStream = this.b;
    Object localObject;
    if (localInputStream == null) {
      localObject = new ByteArrayInputStream(this.c, this.g, this.h);
    }
    for (;;)
    {
      return new InputStreamReader((InputStream)localObject, localJsonEncoding.a());
      if (this.g < this.h) {
        localObject = new MergedStream(this.a, localInputStream, this.c, this.g, this.h);
      } else {
        localObject = localInputStream;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper
 * JD-Core Version:    0.7.0.1
 */