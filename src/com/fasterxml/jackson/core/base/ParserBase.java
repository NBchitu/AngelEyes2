package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ParserBase
  extends ParserMinimalBase
{
  static final BigInteger s = BigInteger.valueOf(-2147483648L);
  static final BigInteger t = BigInteger.valueOf(2147483647L);
  static final BigInteger u = BigInteger.valueOf(-9223372036854775808L);
  static final BigInteger v = BigInteger.valueOf(9223372036854775807L);
  static final BigDecimal w = new BigDecimal(u);
  static final BigDecimal x = new BigDecimal(v);
  static final BigDecimal y = new BigDecimal(s);
  static final BigDecimal z = new BigDecimal(t);
  protected int A = 0;
  protected int B;
  protected long C;
  protected double D;
  protected BigInteger E;
  protected BigDecimal F;
  protected boolean G;
  protected int H;
  protected int I;
  protected int J;
  protected final IOContext b;
  protected boolean c;
  protected int d = 0;
  protected int e = 0;
  protected long f = 0L;
  protected int g = 1;
  protected int h = 0;
  protected long i = 0L;
  protected int j = 1;
  protected int k = 0;
  protected JsonReadContext l;
  protected JsonToken m;
  protected final TextBuffer n;
  protected char[] o = null;
  protected boolean p = false;
  protected ByteArrayBuilder q = null;
  protected byte[] r;
  
  protected ParserBase(IOContext paramIOContext, int paramInt)
  {
    this.a = paramInt;
    this.b = paramIOContext;
    this.n = paramIOContext.d();
    this.l = JsonReadContext.g();
  }
  
  private final void a(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    String str = this.n.f();
    try
    {
      if (NumberInput.a(paramArrayOfChar, paramInt2, paramInt3, this.G))
      {
        this.C = Long.parseLong(str);
        this.A = 2;
        return;
      }
      this.E = new BigInteger(str);
      this.A = 4;
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      a("Malformed numeric value '" + str + "'", localNumberFormatException);
    }
  }
  
  private final void d(int paramInt)
  {
    if (paramInt == 16) {}
    try
    {
      this.F = this.n.h();
      this.A = 16;
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      a("Malformed numeric value '" + this.n.f() + "'", localNumberFormatException);
    }
    this.D = this.n.i();
    this.A = 8;
    return;
  }
  
  protected void A()
  {
    d("Numeric value (" + f() + ") out of range of long (" + -9223372036854775808L + " - " + 9223372036854775807L + ")");
  }
  
  protected char B()
  {
    throw new UnsupportedOperationException();
  }
  
  protected final JsonToken a(String paramString, double paramDouble)
  {
    this.n.a(paramString);
    this.D = paramDouble;
    this.A = 8;
    return JsonToken.j;
  }
  
  protected final JsonToken a(boolean paramBoolean, int paramInt)
  {
    this.G = paramBoolean;
    this.H = paramInt;
    this.I = 0;
    this.J = 0;
    this.A = 0;
    return JsonToken.i;
  }
  
  protected final JsonToken a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 < 1) && (paramInt3 < 1)) {
      return a(paramBoolean, paramInt1);
    }
    return b(paramBoolean, paramInt1, paramInt2, paramInt3);
  }
  
  protected void a(int paramInt)
  {
    if (this.K == JsonToken.i)
    {
      char[] arrayOfChar = this.n.e();
      int i1 = this.n.d();
      int i2 = this.H;
      if (this.G) {
        i1++;
      }
      if (i2 <= 9)
      {
        int i3 = NumberInput.a(arrayOfChar, i1, i2);
        if (this.G) {
          i3 = -i3;
        }
        this.B = i3;
        this.A = 1;
        return;
      }
      if (i2 <= 18)
      {
        long l1 = NumberInput.b(arrayOfChar, i1, i2);
        if (this.G) {
          l1 = -l1;
        }
        if (i2 == 10) {
          if (this.G)
          {
            if (l1 >= -2147483648L)
            {
              this.B = ((int)l1);
              this.A = 1;
            }
          }
          else if (l1 <= 2147483647L)
          {
            this.B = ((int)l1);
            this.A = 1;
            return;
          }
        }
        this.C = l1;
        this.A = 2;
        return;
      }
      a(paramInt, arrayOfChar, i1, i2);
      return;
    }
    if (this.K == JsonToken.j)
    {
      d(paramInt);
      return;
    }
    d("Current token (" + this.K + ") not numeric, can not use numeric value accessors");
  }
  
  protected void a(int paramInt, char paramChar)
  {
    String str = "" + this.l.a(this.b.a());
    d("Unexpected close marker '" + (char)paramInt + "': expected '" + paramChar + "' (for " + this.l.d() + " starting at " + str + ")");
  }
  
  protected void a(int paramInt, String paramString)
  {
    String str = "Unexpected character (" + c(paramInt) + ") in numeric value";
    if (paramString != null) {
      str = str + ": " + paramString;
    }
    d(str);
  }
  
  protected final JsonToken b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    this.G = paramBoolean;
    this.H = paramInt1;
    this.I = paramInt2;
    this.J = paramInt3;
    this.A = 0;
    return JsonToken.j;
  }
  
  protected void b(String paramString)
  {
    d("Invalid numeric value: " + paramString);
  }
  
  public void close()
  {
    if (!this.c) {
      this.c = true;
    }
    try
    {
      r();
      return;
    }
    finally
    {
      s();
    }
  }
  
  public String d()
  {
    if ((this.K == JsonToken.b) || (this.K == JsonToken.d)) {
      return this.l.i().h();
    }
    return this.l.h();
  }
  
  public JsonLocation e()
  {
    int i1 = 1 + (this.d - this.h);
    return new JsonLocation(this.b.a(), this.f + this.d - 1L, this.g, i1);
  }
  
  public int i()
  {
    if ((0x1 & this.A) == 0)
    {
      if (this.A == 0) {
        a(1);
      }
      if ((0x1 & this.A) == 0) {
        u();
      }
    }
    return this.B;
  }
  
  public long j()
  {
    if ((0x2 & this.A) == 0)
    {
      if (this.A == 0) {
        a(2);
      }
      if ((0x2 & this.A) == 0) {
        v();
      }
    }
    return this.C;
  }
  
  public BigInteger k()
  {
    if ((0x4 & this.A) == 0)
    {
      if (this.A == 0) {
        a(4);
      }
      if ((0x4 & this.A) == 0) {
        w();
      }
    }
    return this.E;
  }
  
  public float l()
  {
    return (float)m();
  }
  
  public double m()
  {
    if ((0x8 & this.A) == 0)
    {
      if (this.A == 0) {
        a(8);
      }
      if ((0x8 & this.A) == 0) {
        x();
      }
    }
    return this.D;
  }
  
  public BigDecimal n()
  {
    if ((0x10 & this.A) == 0)
    {
      if (this.A == 0) {
        a(16);
      }
      if ((0x10 & this.A) == 0) {
        y();
      }
    }
    return this.F;
  }
  
  protected final void o()
  {
    if (!p()) {
      C();
    }
  }
  
  protected abstract boolean p();
  
  protected abstract void q();
  
  protected abstract void r();
  
  protected void s()
  {
    this.n.a();
    char[] arrayOfChar = this.o;
    if (arrayOfChar != null)
    {
      this.o = null;
      this.b.c(arrayOfChar);
    }
  }
  
  protected void t()
  {
    if (!this.l.b()) {
      c(": expected close marker for " + this.l.d() + " (from " + this.l.a(this.b.a()) + ")");
    }
  }
  
  protected void u()
  {
    if ((0x2 & this.A) != 0)
    {
      int i1 = (int)this.C;
      if (i1 != this.C) {
        d("Numeric value (" + f() + ") out of range of int");
      }
      this.B = i1;
    }
    for (;;)
    {
      this.A = (0x1 | this.A);
      return;
      if ((0x4 & this.A) != 0)
      {
        if ((s.compareTo(this.E) > 0) || (t.compareTo(this.E) < 0)) {
          z();
        }
        this.B = this.E.intValue();
      }
      else if ((0x8 & this.A) != 0)
      {
        if ((this.D < -2147483648.0D) || (this.D > 2147483647.0D)) {
          z();
        }
        this.B = ((int)this.D);
      }
      else if ((0x10 & this.A) != 0)
      {
        if ((y.compareTo(this.F) > 0) || (z.compareTo(this.F) < 0)) {
          z();
        }
        this.B = this.F.intValue();
      }
      else
      {
        E();
      }
    }
  }
  
  protected void v()
  {
    if ((0x1 & this.A) != 0) {
      this.C = this.B;
    }
    for (;;)
    {
      this.A = (0x2 | this.A);
      return;
      if ((0x4 & this.A) != 0)
      {
        if ((u.compareTo(this.E) > 0) || (v.compareTo(this.E) < 0)) {
          A();
        }
        this.C = this.E.longValue();
      }
      else if ((0x8 & this.A) != 0)
      {
        if ((this.D < -9.223372036854776E+018D) || (this.D > 9.223372036854776E+018D)) {
          A();
        }
        this.C = (this.D);
      }
      else if ((0x10 & this.A) != 0)
      {
        if ((w.compareTo(this.F) > 0) || (x.compareTo(this.F) < 0)) {
          A();
        }
        this.C = this.F.longValue();
      }
      else
      {
        E();
      }
    }
  }
  
  protected void w()
  {
    if ((0x10 & this.A) != 0) {
      this.E = this.F.toBigInteger();
    }
    for (;;)
    {
      this.A = (0x4 | this.A);
      return;
      if ((0x2 & this.A) != 0) {
        this.E = BigInteger.valueOf(this.C);
      } else if ((0x1 & this.A) != 0) {
        this.E = BigInteger.valueOf(this.B);
      } else if ((0x8 & this.A) != 0) {
        this.E = BigDecimal.valueOf(this.D).toBigInteger();
      } else {
        E();
      }
    }
  }
  
  protected void x()
  {
    if ((0x10 & this.A) != 0) {
      this.D = this.F.doubleValue();
    }
    for (;;)
    {
      this.A = (0x8 | this.A);
      return;
      if ((0x4 & this.A) != 0) {
        this.D = this.E.doubleValue();
      } else if ((0x2 & this.A) != 0) {
        this.D = this.C;
      } else if ((0x1 & this.A) != 0) {
        this.D = this.B;
      } else {
        E();
      }
    }
  }
  
  protected void y()
  {
    if ((0x8 & this.A) != 0) {
      this.F = new BigDecimal(f());
    }
    for (;;)
    {
      this.A = (0x10 | this.A);
      return;
      if ((0x4 & this.A) != 0) {
        this.F = new BigDecimal(this.E);
      } else if ((0x2 & this.A) != 0) {
        this.F = BigDecimal.valueOf(this.C);
      } else if ((0x1 & this.A) != 0) {
        this.F = BigDecimal.valueOf(this.B);
      } else {
        E();
      }
    }
  }
  
  protected void z()
  {
    d("Numeric value (" + f() + ") out of range of int (" + -2147483648 + " - " + 2147483647 + ")");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.base.ParserBase
 * JD-Core Version:    0.7.0.1
 */