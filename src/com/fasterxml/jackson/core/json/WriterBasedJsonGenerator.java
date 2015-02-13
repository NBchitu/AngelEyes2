package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class WriterBasedJsonGenerator
  extends GeneratorBase
{
  protected static final char[] g = ;
  protected static final int[] h = CharTypes.f();
  protected final IOContext i;
  protected final Writer j;
  protected int[] k = h;
  protected int l;
  protected CharacterEscapes m;
  protected SerializableString n;
  protected char[] o;
  protected int p = 0;
  protected int q = 0;
  protected int r;
  protected char[] s;
  
  public WriterBasedJsonGenerator(IOContext paramIOContext, int paramInt, ObjectCodec paramObjectCodec, Writer paramWriter)
  {
    super(paramInt, paramObjectCodec);
    this.i = paramIOContext;
    this.j = paramWriter;
    this.o = paramIOContext.h();
    this.r = this.o.length;
    if (a(JsonGenerator.Feature.g)) {
      a(127);
    }
  }
  
  private final int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, char paramChar, int paramInt3)
  {
    if (paramInt3 >= 0)
    {
      if ((paramInt1 > 1) && (paramInt1 < paramInt2))
      {
        int i13 = paramInt1 - 2;
        paramArrayOfChar[i13] = '\\';
        paramArrayOfChar[(i13 + 1)] = ((char)paramInt3);
        return i13;
      }
      char[] arrayOfChar2 = this.s;
      if (arrayOfChar2 == null) {
        arrayOfChar2 = m();
      }
      arrayOfChar2[1] = ((char)paramInt3);
      this.j.write(arrayOfChar2, 0, 2);
      return paramInt1;
    }
    if (paramInt3 != -2)
    {
      if ((paramInt1 > 5) && (paramInt1 < paramInt2))
      {
        int i5 = paramInt1 - 6;
        int i6 = i5 + 1;
        paramArrayOfChar[i5] = '\\';
        int i7 = i6 + 1;
        paramArrayOfChar[i6] = 'u';
        int i9;
        if (paramChar > 'ÿ')
        {
          int i11 = 0xFF & paramChar >> '\b';
          int i12 = i7 + 1;
          paramArrayOfChar[i7] = g[(i11 >> 4)];
          i9 = i12 + 1;
          paramArrayOfChar[i12] = g[(i11 & 0xF)];
          paramChar = (char)(paramChar & 0xFF);
        }
        for (;;)
        {
          int i10 = i9 + 1;
          paramArrayOfChar[i9] = g[(paramChar >> '\004')];
          paramArrayOfChar[i10] = g[(paramChar & 0xF)];
          return i10 - 5;
          int i8 = i7 + 1;
          paramArrayOfChar[i7] = '0';
          i9 = i8 + 1;
          paramArrayOfChar[i8] = '0';
        }
      }
      char[] arrayOfChar1 = this.s;
      if (arrayOfChar1 == null) {
        arrayOfChar1 = m();
      }
      this.p = this.q;
      if (paramChar > 'ÿ')
      {
        int i3 = 0xFF & paramChar >> '\b';
        int i4 = paramChar & 0xFF;
        arrayOfChar1[10] = g[(i3 >> 4)];
        arrayOfChar1[11] = g[(i3 & 0xF)];
        arrayOfChar1[12] = g[(i4 >> 4)];
        arrayOfChar1[13] = g[(i4 & 0xF)];
        this.j.write(arrayOfChar1, 8, 6);
        return paramInt1;
      }
      arrayOfChar1[6] = g[(paramChar >> '\004')];
      arrayOfChar1[7] = g[(paramChar & 0xF)];
      this.j.write(arrayOfChar1, 2, 6);
      return paramInt1;
    }
    String str;
    if (this.n == null) {
      str = this.m.a(paramChar).a();
    }
    for (;;)
    {
      int i1 = str.length();
      if ((paramInt1 < i1) || (paramInt1 >= paramInt2)) {
        break;
      }
      int i2 = paramInt1 - i1;
      str.getChars(0, i1, paramArrayOfChar, i2);
      return i2;
      str = this.n.a();
      this.n = null;
    }
    this.j.write(str);
    return paramInt1;
  }
  
  private final void a(char paramChar, int paramInt)
  {
    if (paramInt >= 0)
    {
      if (this.q >= 2)
      {
        int i12 = -2 + this.q;
        this.p = i12;
        char[] arrayOfChar4 = this.o;
        int i13 = i12 + 1;
        arrayOfChar4[i12] = '\\';
        this.o[i13] = ((char)paramInt);
        return;
      }
      char[] arrayOfChar3 = this.s;
      if (arrayOfChar3 == null) {
        arrayOfChar3 = m();
      }
      this.p = this.q;
      arrayOfChar3[1] = ((char)paramInt);
      this.j.write(arrayOfChar3, 0, 2);
      return;
    }
    if (paramInt != -2)
    {
      if (this.q >= 6)
      {
        char[] arrayOfChar2 = this.o;
        int i5 = -6 + this.q;
        this.p = i5;
        arrayOfChar2[i5] = '\\';
        int i6 = i5 + 1;
        arrayOfChar2[i6] = 'u';
        int i8;
        if (paramChar > 'ÿ')
        {
          int i10 = 0xFF & paramChar >> '\b';
          int i11 = i6 + 1;
          arrayOfChar2[i11] = g[(i10 >> 4)];
          i8 = i11 + 1;
          arrayOfChar2[i8] = g[(i10 & 0xF)];
          paramChar = (char)(paramChar & 0xFF);
        }
        for (;;)
        {
          int i9 = i8 + 1;
          arrayOfChar2[i9] = g[(paramChar >> '\004')];
          arrayOfChar2[(i9 + 1)] = g[(paramChar & 0xF)];
          return;
          int i7 = i6 + 1;
          arrayOfChar2[i7] = '0';
          i8 = i7 + 1;
          arrayOfChar2[i8] = '0';
        }
      }
      char[] arrayOfChar1 = this.s;
      if (arrayOfChar1 == null) {
        arrayOfChar1 = m();
      }
      this.p = this.q;
      if (paramChar > 'ÿ')
      {
        int i3 = 0xFF & paramChar >> '\b';
        int i4 = paramChar & 0xFF;
        arrayOfChar1[10] = g[(i3 >> 4)];
        arrayOfChar1[11] = g[(i3 & 0xF)];
        arrayOfChar1[12] = g[(i4 >> 4)];
        arrayOfChar1[13] = g[(i4 & 0xF)];
        this.j.write(arrayOfChar1, 8, 6);
        return;
      }
      arrayOfChar1[6] = g[(paramChar >> '\004')];
      arrayOfChar1[7] = g[(paramChar & 0xF)];
      this.j.write(arrayOfChar1, 2, 6);
      return;
    }
    String str;
    if (this.n == null) {
      str = this.m.a(paramChar).a();
    }
    for (;;)
    {
      int i1 = str.length();
      if (this.q < i1) {
        break;
      }
      int i2 = this.q - i1;
      this.p = i2;
      str.getChars(0, i1, this.o, i2);
      return;
      str = this.n.a();
      this.n = null;
    }
    this.p = this.q;
    this.j.write(str);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 + this.q;
    int[] arrayOfInt = this.k;
    int i2 = Math.min(arrayOfInt.length, paramInt2 + 1);
    if (this.q < i1)
    {
      label128:
      int i4;
      do
      {
        int i3 = this.o[this.q];
        int i5;
        if (i3 < i2)
        {
          i5 = arrayOfInt[i3];
          if (i5 == 0) {}
        }
        else
        {
          for (;;)
          {
            int i6 = this.q - this.p;
            if (i6 > 0) {
              this.j.write(this.o, this.p, i6);
            }
            this.q = (1 + this.q);
            a(i3, i5);
            break;
            if (i3 <= paramInt2) {
              break label128;
            }
            i5 = -1;
          }
        }
        i4 = 1 + this.q;
        this.q = i4;
      } while (i4 < i1);
    }
  }
  
  private final void a(Object paramObject)
  {
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    c(paramObject.toString());
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }
  
  private final void b(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int[] arrayOfInt = this.k;
    int i2 = Math.min(arrayOfInt.length, paramInt2 + 1);
    int i3 = 0;
    int i4 = 0;
    for (;;)
    {
      int i5;
      int i6;
      if (i4 < paramInt1)
      {
        i5 = this.o[i4];
        if (i5 >= i2) {
          break label93;
        }
        i6 = arrayOfInt[i5];
        if (i6 == 0) {
          break label105;
        }
      }
      for (;;)
      {
        int i7 = i4 - i3;
        if (i7 <= 0) {
          break label123;
        }
        this.j.write(this.o, i3, i7);
        if (i4 < paramInt1) {
          break label123;
        }
        return;
        label93:
        if (i5 > paramInt2)
        {
          i6 = -1;
          continue;
          label105:
          i1 = i6;
        }
        else
        {
          i4++;
          if (i4 < paramInt1) {
            break;
          }
          i6 = i1;
        }
      }
      label123:
      int i8 = i4 + 1;
      int i9 = a(this.o, i8, paramInt1, i5, i6);
      i4 = i8;
      i3 = i9;
      i1 = i6;
    }
  }
  
  private final void b(long paramLong)
  {
    if (23 + this.q >= this.r) {
      k();
    }
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    this.q = NumberOutput.a(paramLong, this.o, this.q);
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }
  
  private final void c(int paramInt)
  {
    if (13 + this.q >= this.r) {
      k();
    }
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    this.q = NumberOutput.a(paramInt, this.o, this.q);
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }
  
  private void d(int paramInt)
  {
    int i1 = paramInt + this.q;
    int[] arrayOfInt = this.k;
    int i2 = arrayOfInt.length;
    if (this.q < i1)
    {
      int i4;
      do
      {
        int i3 = this.o[this.q];
        if ((i3 < i2) && (arrayOfInt[i3] != 0))
        {
          int i5 = this.q - this.p;
          if (i5 > 0) {
            this.j.write(this.o, this.p, i5);
          }
          char[] arrayOfChar = this.o;
          int i6 = this.q;
          this.q = (i6 + 1);
          char c = arrayOfChar[i6];
          a(c, arrayOfInt[c]);
          break;
        }
        i4 = 1 + this.q;
        this.q = i4;
      } while (i4 < i1);
    }
  }
  
  private final void e(int paramInt)
  {
    int[] arrayOfInt = this.k;
    int i1 = arrayOfInt.length;
    int i2 = 0;
    int i3 = 0;
    for (;;)
    {
      int i4;
      if (i2 < paramInt)
      {
        i4 = this.o[i2];
        if ((i4 >= i1) || (arrayOfInt[i4] == 0)) {
          break label76;
        }
      }
      for (;;)
      {
        int i5 = i2 - i3;
        if (i5 <= 0) {
          break label88;
        }
        this.j.write(this.o, i3, i5);
        if (i2 < paramInt) {
          break label88;
        }
        return;
        label76:
        i2++;
        if (i2 < paramInt) {
          break;
        }
      }
      label88:
      int i6 = i2 + 1;
      i3 = a(this.o, i6, paramInt, i4, arrayOfInt[i4]);
      i2 = i6;
    }
  }
  
  private void f(int paramInt)
  {
    int i1 = paramInt + this.q;
    int[] arrayOfInt = this.k;
    int i2;
    int i3;
    CharacterEscapes localCharacterEscapes;
    if (this.l < 1)
    {
      i2 = 65535;
      i3 = Math.min(arrayOfInt.length, i2 + 1);
      localCharacterEscapes = this.m;
      label41:
      if (this.q >= i1) {}
    }
    else
    {
      label181:
      int i5;
      do
      {
        int i4 = this.o[this.q];
        int i6;
        if (i4 < i3)
        {
          i6 = arrayOfInt[i4];
          if (i6 == 0) {}
        }
        else
        {
          for (;;)
          {
            int i7 = this.q - this.p;
            if (i7 > 0) {
              this.j.write(this.o, this.p, i7);
            }
            this.q = (1 + this.q);
            a(i4, i6);
            break label41;
            i2 = this.l;
            break;
            if (i4 > i2)
            {
              i6 = -1;
            }
            else
            {
              SerializableString localSerializableString = localCharacterEscapes.a(i4);
              this.n = localSerializableString;
              if (localSerializableString == null) {
                break label181;
              }
              i6 = -2;
            }
          }
        }
        i5 = 1 + this.q;
        this.q = i5;
      } while (i5 < i1);
    }
  }
  
  private void f(String paramString)
  {
    int i1 = this.r - this.q;
    paramString.getChars(0, i1, this.o, this.q);
    this.q = (i1 + this.q);
    k();
    int i2 = paramString.length() - i1;
    while (i2 > this.r)
    {
      int i3 = this.r;
      paramString.getChars(i1, i1 + i3, this.o, 0);
      this.p = 0;
      this.q = i3;
      k();
      i1 += i3;
      i2 -= i3;
    }
    paramString.getChars(i1, i1 + i2, this.o, 0);
    this.p = 0;
    this.q = i2;
  }
  
  private final void g(int paramInt)
  {
    int i1 = 0;
    int[] arrayOfInt = this.k;
    int i2;
    int i3;
    CharacterEscapes localCharacterEscapes;
    int i4;
    if (this.l < 1)
    {
      i2 = 65535;
      i3 = Math.min(arrayOfInt.length, i2 + 1);
      localCharacterEscapes = this.m;
      i4 = 0;
    }
    label47:
    int i7;
    for (int i5 = 0;; i5 = i7)
    {
      int i6;
      if (i1 < paramInt)
      {
        i6 = this.o[i1];
        if (i6 >= i3) {
          break label114;
        }
        i7 = arrayOfInt[i6];
        if (i7 == 0) {
          break label154;
        }
      }
      label154:
      for (;;)
      {
        int i8 = i1 - i4;
        if (i8 <= 0) {
          break label173;
        }
        this.j.write(this.o, i4, i8);
        if (i1 < paramInt) {
          break label173;
        }
        return;
        i2 = this.l;
        break;
        label114:
        if (i6 > i2)
        {
          i7 = -1;
        }
        else
        {
          SerializableString localSerializableString = localCharacterEscapes.a(i6);
          this.n = localSerializableString;
          if (localSerializableString != null)
          {
            i7 = -2;
            continue;
            i5 = i7;
          }
          else
          {
            i1++;
            if (i1 < paramInt) {
              break label47;
            }
            i7 = i5;
          }
        }
      }
      label173:
      int i9 = i1 + 1;
      int i10 = a(this.o, i9, paramInt, i6, i7);
      i1 = i9;
      i4 = i10;
    }
  }
  
  private void g(String paramString)
  {
    int i1 = paramString.length();
    if (i1 > this.r)
    {
      h(paramString);
      return;
    }
    if (i1 + this.q > this.r) {
      k();
    }
    paramString.getChars(0, i1, this.o, this.q);
    if (this.m != null)
    {
      f(i1);
      return;
    }
    if (this.l != 0)
    {
      a(i1, this.l);
      return;
    }
    d(i1);
  }
  
  private void h(String paramString)
  {
    k();
    int i1 = paramString.length();
    int i2 = 0;
    int i3 = this.r;
    if (i2 + i3 > i1) {
      i3 = i1 - i2;
    }
    paramString.getChars(i2, i2 + i3, this.o, 0);
    if (this.m != null) {
      g(i3);
    }
    for (;;)
    {
      i2 += i3;
      if (i2 < i1) {
        break;
      }
      return;
      if (this.l != 0) {
        b(i3, this.l);
      } else {
        e(i3);
      }
    }
  }
  
  private final void l()
  {
    if (4 + this.q >= this.r) {
      k();
    }
    int i1 = this.q;
    char[] arrayOfChar = this.o;
    arrayOfChar[i1] = 'n';
    int i2 = i1 + 1;
    arrayOfChar[i2] = 'u';
    int i3 = i2 + 1;
    arrayOfChar[i3] = 'l';
    int i4 = i3 + 1;
    arrayOfChar[i4] = 'l';
    this.q = (i4 + 1);
  }
  
  private char[] m()
  {
    char[] arrayOfChar = new char[14];
    arrayOfChar[0] = '\\';
    arrayOfChar[2] = '\\';
    arrayOfChar[3] = 'u';
    arrayOfChar[4] = '0';
    arrayOfChar[5] = '0';
    arrayOfChar[8] = '\\';
    arrayOfChar[9] = 'u';
    this.s = arrayOfChar;
    return arrayOfChar;
  }
  
  public JsonGenerator a(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    this.l = paramInt;
    return this;
  }
  
  public JsonGenerator a(CharacterEscapes paramCharacterEscapes)
  {
    this.m = paramCharacterEscapes;
    if (paramCharacterEscapes == null)
    {
      this.k = h;
      return this;
    }
    this.k = paramCharacterEscapes.a();
    return this;
  }
  
  public void a(char paramChar)
  {
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = paramChar;
  }
  
  public void a(double paramDouble)
  {
    if ((this.d) || (((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) && (a(JsonGenerator.Feature.d))))
    {
      b(String.valueOf(paramDouble));
      return;
    }
    d("write number");
    c(String.valueOf(paramDouble));
  }
  
  public void a(float paramFloat)
  {
    if ((this.d) || (((Float.isNaN(paramFloat)) || (Float.isInfinite(paramFloat))) && (a(JsonGenerator.Feature.d))))
    {
      b(String.valueOf(paramFloat));
      return;
    }
    d("write number");
    c(String.valueOf(paramFloat));
  }
  
  public void a(long paramLong)
  {
    d("write number");
    if (this.d)
    {
      b(paramLong);
      return;
    }
    if (21 + this.q >= this.r) {
      k();
    }
    this.q = NumberOutput.a(paramLong, this.o, this.q);
  }
  
  public final void a(String paramString)
  {
    int i1 = 1;
    int i2 = this.e.a(paramString);
    if (i2 == 4) {
      e("Can not write a field name, expecting a value");
    }
    if (i2 == i1) {}
    for (;;)
    {
      a(paramString, i1);
      return;
      i1 = 0;
    }
  }
  
  protected final void a(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      j();
    }
    do
    {
      return;
      this.a.f(this);
      return;
      this.a.d(this);
      return;
      this.a.a(this);
      return;
      if (this.e.a())
      {
        this.a.g(this);
        return;
      }
    } while (!this.e.c());
    this.a.h(this);
  }
  
  protected void a(String paramString, boolean paramBoolean)
  {
    if (this.a != null)
    {
      b(paramString, paramBoolean);
      return;
    }
    if (1 + this.q >= this.r) {
      k();
    }
    if (paramBoolean)
    {
      char[] arrayOfChar3 = this.o;
      int i3 = this.q;
      this.q = (i3 + 1);
      arrayOfChar3[i3] = ',';
    }
    if (!a(JsonGenerator.Feature.c))
    {
      g(paramString);
      return;
    }
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    g(paramString);
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }
  
  public void a(BigDecimal paramBigDecimal)
  {
    d("write number");
    if (paramBigDecimal == null)
    {
      l();
      return;
    }
    if (this.d)
    {
      a(paramBigDecimal);
      return;
    }
    c(paramBigDecimal.toString());
  }
  
  public void a(BigInteger paramBigInteger)
  {
    d("write number");
    if (paramBigInteger == null)
    {
      l();
      return;
    }
    if (this.d)
    {
      a(paramBigInteger);
      return;
    }
    c(paramBigInteger.toString());
  }
  
  public void a(boolean paramBoolean)
  {
    d("write boolean value");
    if (5 + this.q >= this.r) {
      k();
    }
    int i1 = this.q;
    char[] arrayOfChar = this.o;
    int i5;
    if (paramBoolean)
    {
      arrayOfChar[i1] = 't';
      int i6 = i1 + 1;
      arrayOfChar[i6] = 'r';
      int i7 = i6 + 1;
      arrayOfChar[i7] = 'u';
      i5 = i7 + 1;
      arrayOfChar[i5] = 'e';
    }
    for (;;)
    {
      this.q = (i5 + 1);
      return;
      arrayOfChar[i1] = 'f';
      int i2 = i1 + 1;
      arrayOfChar[i2] = 'a';
      int i3 = i2 + 1;
      arrayOfChar[i3] = 'l';
      int i4 = i3 + 1;
      arrayOfChar[i4] = 's';
      i5 = i4 + 1;
      arrayOfChar[i5] = 'e';
    }
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 32)
    {
      if (paramInt2 > this.r - this.q) {
        k();
      }
      System.arraycopy(paramArrayOfChar, paramInt1, this.o, this.q, paramInt2);
      this.q = (paramInt2 + this.q);
      return;
    }
    k();
    this.j.write(paramArrayOfChar, paramInt1, paramInt2);
  }
  
  public final void b()
  {
    d("start an array");
    this.e = this.e.h();
    if (this.a != null)
    {
      this.a.e(this);
      return;
    }
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = '[';
  }
  
  public void b(int paramInt)
  {
    d("write number");
    if (this.d)
    {
      c(paramInt);
      return;
    }
    if (11 + this.q >= this.r) {
      k();
    }
    this.q = NumberOutput.a(paramInt, this.o, this.q);
  }
  
  public void b(String paramString)
  {
    d("write text value");
    if (paramString == null)
    {
      l();
      return;
    }
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    g(paramString);
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }
  
  protected final void b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.c(this);
    }
    while (a(JsonGenerator.Feature.c))
    {
      if (this.q >= this.r) {
        k();
      }
      char[] arrayOfChar1 = this.o;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfChar1[i1] = '"';
      g(paramString);
      if (this.q >= this.r) {
        k();
      }
      char[] arrayOfChar2 = this.o;
      int i2 = this.q;
      this.q = (i2 + 1);
      arrayOfChar2[i2] = '"';
      return;
      this.a.h(this);
    }
    g(paramString);
  }
  
  public final void c()
  {
    if (!this.e.a()) {
      e("Current context not an ARRAY but " + this.e.d());
    }
    if (this.a != null) {
      this.a.b(this, this.e.e());
    }
    for (;;)
    {
      this.e = this.e.j();
      return;
      if (this.q >= this.r) {
        k();
      }
      char[] arrayOfChar = this.o;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfChar[i1] = ']';
    }
  }
  
  public void c(String paramString)
  {
    int i1 = paramString.length();
    int i2 = this.r - this.q;
    if (i2 == 0)
    {
      k();
      i2 = this.r - this.q;
    }
    if (i2 >= i1)
    {
      paramString.getChars(0, i1, this.o, this.q);
      this.q = (i1 + this.q);
      return;
    }
    f(paramString);
  }
  
  public void close()
  {
    super.close();
    if ((this.o != null) && (a(JsonGenerator.Feature.b))) {
      for (;;)
      {
        JsonWriteContext localJsonWriteContext = h();
        if (localJsonWriteContext.a())
        {
          c();
        }
        else
        {
          if (!localJsonWriteContext.c()) {
            break;
          }
          e();
        }
      }
    }
    k();
    if (this.j != null)
    {
      if ((!this.i.c()) && (!a(JsonGenerator.Feature.a))) {
        break label97;
      }
      this.j.close();
    }
    for (;;)
    {
      i();
      return;
      label97:
      if (a(JsonGenerator.Feature.f)) {
        this.j.flush();
      }
    }
  }
  
  public final void d()
  {
    d("start an object");
    this.e = this.e.i();
    if (this.a != null)
    {
      this.a.b(this);
      return;
    }
    if (this.q >= this.r) {
      k();
    }
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = '{';
  }
  
  protected final void d(String paramString)
  {
    int i1 = this.e.k();
    if (i1 == 5) {
      e("Can not " + paramString + ", expecting field name");
    }
    if (this.a == null)
    {
      int i2;
      switch (i1)
      {
      default: 
        return;
      case 1: 
        i2 = 44;
      }
      for (;;)
      {
        if (this.q >= this.r) {
          k();
        }
        this.o[this.q] = i2;
        this.q = (1 + this.q);
        return;
        i2 = 58;
        continue;
        i2 = 32;
      }
    }
    a(paramString, i1);
  }
  
  public final void e()
  {
    if (!this.e.c()) {
      e("Current context not an object but " + this.e.d());
    }
    if (this.a != null) {
      this.a.a(this, this.e.e());
    }
    for (;;)
    {
      this.e = this.e.j();
      return;
      if (this.q >= this.r) {
        k();
      }
      char[] arrayOfChar = this.o;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfChar[i1] = '}';
    }
  }
  
  public void f()
  {
    d("write null value");
    l();
  }
  
  public final void g()
  {
    k();
    if ((this.j != null) && (a(JsonGenerator.Feature.f))) {
      this.j.flush();
    }
  }
  
  protected void i()
  {
    char[] arrayOfChar = this.o;
    if (arrayOfChar != null)
    {
      this.o = null;
      this.i.b(arrayOfChar);
    }
  }
  
  protected final void k()
  {
    int i1 = this.q - this.p;
    if (i1 > 0)
    {
      int i2 = this.p;
      this.p = 0;
      this.q = 0;
      this.j.write(this.o, i2, i1);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.json.WriterBasedJsonGenerator
 * JD-Core Version:    0.7.0.1
 */