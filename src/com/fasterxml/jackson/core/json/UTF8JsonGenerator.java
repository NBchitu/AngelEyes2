package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
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
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator
  extends GeneratorBase
{
  static final byte[] g = ;
  protected static final int[] h = CharTypes.f();
  private static final byte[] u = { 110, 117, 108, 108 };
  private static final byte[] v = { 116, 114, 117, 101 };
  private static final byte[] w = { 102, 97, 108, 115, 101 };
  protected final IOContext i;
  protected final OutputStream j;
  protected int[] k = h;
  protected int l;
  protected CharacterEscapes m;
  protected byte[] n;
  protected int o = 0;
  protected final int p;
  protected final int q;
  protected char[] r;
  protected final int s;
  protected boolean t;
  
  public UTF8JsonGenerator(IOContext paramIOContext, int paramInt, ObjectCodec paramObjectCodec, OutputStream paramOutputStream)
  {
    super(paramInt, paramObjectCodec);
    this.i = paramIOContext;
    this.j = paramOutputStream;
    this.t = true;
    this.n = paramIOContext.f();
    this.p = this.n.length;
    this.q = (this.p >> 3);
    this.r = paramIOContext.h();
    this.s = this.r.length;
    if (a(JsonGenerator.Feature.g)) {
      a(127);
    }
  }
  
  private final int a(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 55296) && (paramInt1 <= 57343))
    {
      if (paramInt2 >= paramInt3) {
        e("Split surrogate on writeRaw() input (last character)");
      }
      a(paramInt1, paramArrayOfChar[paramInt2]);
      return paramInt2 + 1;
    }
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = ((byte)(0xE0 | paramInt1 >> 12));
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte[i2] = ((byte)(0x80 | 0x3F & paramInt1 >> 6));
    int i3 = this.o;
    this.o = (i3 + 1);
    arrayOfByte[i3] = ((byte)(0x80 | paramInt1 & 0x3F));
    return paramInt2;
  }
  
  private int a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i1 = paramArrayOfByte2.length;
    int i2;
    if (paramInt1 + i1 > paramInt2)
    {
      this.o = paramInt1;
      k();
      i2 = this.o;
      if (i1 > paramArrayOfByte1.length) {
        this.j.write(paramArrayOfByte2, 0, i1);
      }
    }
    for (;;)
    {
      return i2;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, i2, i1);
      i2 += i1;
      while (i2 + paramInt3 * 6 > paramInt2)
      {
        k();
        return this.o;
        i2 = paramInt1;
      }
    }
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt1, SerializableString paramSerializableString, int paramInt2)
  {
    byte[] arrayOfByte = paramSerializableString.b();
    int i1 = arrayOfByte.length;
    if (i1 > 6) {
      return a(paramArrayOfByte, paramInt1, this.p, arrayOfByte, paramInt2);
    }
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt1, i1);
    return i1 + paramInt1;
  }
  
  private final void a(Object paramObject)
  {
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    c(paramObject.toString());
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }
  
  private final void b(long paramLong)
  {
    if (23 + this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    this.o = NumberOutput.a(paramLong, this.n, this.o);
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }
  
  private final void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    d(this.r, 0, paramInt2);
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }
  
  private final int c(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.n;
    if ((paramInt1 >= 55296) && (paramInt1 <= 57343))
    {
      int i4 = paramInt2 + 1;
      arrayOfByte[paramInt2] = 92;
      int i5 = i4 + 1;
      arrayOfByte[i4] = 117;
      int i6 = i5 + 1;
      arrayOfByte[i5] = g[(0xF & paramInt1 >> 12)];
      int i7 = i6 + 1;
      arrayOfByte[i6] = g[(0xF & paramInt1 >> 8)];
      int i8 = i7 + 1;
      arrayOfByte[i7] = g[(0xF & paramInt1 >> 4)];
      int i9 = i8 + 1;
      arrayOfByte[i8] = g[(paramInt1 & 0xF)];
      return i9;
    }
    int i1 = paramInt2 + 1;
    arrayOfByte[paramInt2] = ((byte)(0xE0 | paramInt1 >> 12));
    int i2 = i1 + 1;
    arrayOfByte[i1] = ((byte)(0x80 | 0x3F & paramInt1 >> 6));
    int i3 = i2 + 1;
    arrayOfByte[i2] = ((byte)(0x80 | paramInt1 & 0x3F));
    return i3;
  }
  
  private final void c(int paramInt)
  {
    if (13 + this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    this.o = NumberOutput.a(paramInt, this.n, this.o);
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }
  
  private final void c(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = this.p;
    byte[] arrayOfByte = this.n;
    int i2 = paramInt1;
    label21:
    int i3;
    int i5;
    int i6;
    if (i2 < paramInt2)
    {
      i3 = paramArrayOfChar[i2];
      if (i3 >= 128)
      {
        if (3 + this.o >= this.p) {
          k();
        }
        i5 = i2 + 1;
        i6 = paramArrayOfChar[i2];
        if (i6 >= 2048) {
          break label182;
        }
        int i7 = this.o;
        this.o = (i7 + 1);
        arrayOfByte[i7] = ((byte)(0xC0 | i6 >> 6));
        int i8 = this.o;
        this.o = (i8 + 1);
        arrayOfByte[i8] = ((byte)(0x80 | i6 & 0x3F));
      }
    }
    for (;;)
    {
      i2 = i5;
      break;
      if (this.o >= i1) {
        k();
      }
      int i4 = this.o;
      this.o = (i4 + 1);
      arrayOfByte[i4] = ((byte)i3);
      i2++;
      if (i2 < paramInt2) {
        break label21;
      }
      return;
      label182:
      a(i6, paramArrayOfChar, i5, paramInt2);
    }
  }
  
  private int d(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.n;
    int i1 = paramInt2 + 1;
    arrayOfByte[paramInt2] = 92;
    int i2 = i1 + 1;
    arrayOfByte[i1] = 117;
    int i4;
    if (paramInt1 > 255)
    {
      int i7 = 0xFF & paramInt1 >> 8;
      int i8 = i2 + 1;
      arrayOfByte[i2] = g[(i7 >> 4)];
      i4 = i8 + 1;
      arrayOfByte[i8] = g[(i7 & 0xF)];
      paramInt1 &= 0xFF;
    }
    for (;;)
    {
      int i5 = i4 + 1;
      arrayOfByte[i4] = g[(paramInt1 >> 4)];
      int i6 = i5 + 1;
      arrayOfByte[i5] = g[(paramInt1 & 0xF)];
      return i6;
      int i3 = i2 + 1;
      arrayOfByte[i2] = 48;
      i4 = i3 + 1;
      arrayOfByte[i3] = 48;
    }
  }
  
  private final void d(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    do
    {
      int i1 = Math.min(this.q, paramInt2);
      if (i1 + this.o > this.p) {
        k();
      }
      e(paramArrayOfChar, paramInt1, i1);
      paramInt1 += i1;
      paramInt2 -= i1;
    } while (paramInt2 > 0);
  }
  
  private final void e(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + paramInt1;
    int i2 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    for (;;)
    {
      int i3;
      if (paramInt1 < i1)
      {
        i3 = paramArrayOfChar[paramInt1];
        if ((i3 <= 127) && (arrayOfInt[i3] == 0)) {}
      }
      else
      {
        this.o = i2;
        if (paramInt1 < i1)
        {
          if (this.m == null) {
            break;
          }
          h(paramArrayOfChar, paramInt1, i1);
        }
        return;
      }
      int i4 = i2 + 1;
      arrayOfByte[i2] = ((byte)i3);
      paramInt1++;
      i2 = i4;
    }
    if (this.l == 0)
    {
      f(paramArrayOfChar, paramInt1, i1);
      return;
    }
    g(paramArrayOfChar, paramInt1, i1);
  }
  
  private final void f(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o + 6 * (paramInt2 - paramInt1) > this.p) {
      k();
    }
    int i1 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    while (paramInt1 < paramInt2)
    {
      int i2 = paramInt1 + 1;
      int i3 = paramArrayOfChar[paramInt1];
      if (i3 <= 127)
      {
        if (arrayOfInt[i3] == 0)
        {
          int i7 = i1 + 1;
          arrayOfByte[i1] = ((byte)i3);
          i1 = i7;
          paramInt1 = i2;
        }
        else
        {
          int i5 = arrayOfInt[i3];
          if (i5 > 0)
          {
            int i6 = i1 + 1;
            arrayOfByte[i1] = 92;
            i1 = i6 + 1;
            arrayOfByte[i6] = ((byte)i5);
            paramInt1 = i2;
          }
          else
          {
            i1 = d(i3, i1);
            paramInt1 = i2;
          }
        }
      }
      else
      {
        if (i3 <= 2047)
        {
          int i4 = i1 + 1;
          arrayOfByte[i1] = ((byte)(0xC0 | i3 >> 6));
          i1 = i4 + 1;
          arrayOfByte[i4] = ((byte)(0x80 | i3 & 0x3F));
        }
        for (;;)
        {
          paramInt1 = i2;
          break;
          i1 = c(i3, i1);
        }
      }
    }
    this.o = i1;
  }
  
  private final void g(String paramString)
  {
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    h(paramString);
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }
  
  private final void g(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o + 6 * (paramInt2 - paramInt1) > this.p) {
      k();
    }
    int i1 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    int i2 = this.l;
    while (paramInt1 < paramInt2)
    {
      int i3 = paramInt1 + 1;
      int i4 = paramArrayOfChar[paramInt1];
      if (i4 <= 127)
      {
        if (arrayOfInt[i4] == 0)
        {
          int i8 = i1 + 1;
          arrayOfByte[i1] = ((byte)i4);
          i1 = i8;
          paramInt1 = i3;
        }
        else
        {
          int i6 = arrayOfInt[i4];
          if (i6 > 0)
          {
            int i7 = i1 + 1;
            arrayOfByte[i1] = 92;
            i1 = i7 + 1;
            arrayOfByte[i7] = ((byte)i6);
            paramInt1 = i3;
          }
          else
          {
            i1 = d(i4, i1);
            paramInt1 = i3;
          }
        }
      }
      else if (i4 > i2)
      {
        i1 = d(i4, i1);
        paramInt1 = i3;
      }
      else
      {
        if (i4 <= 2047)
        {
          int i5 = i1 + 1;
          arrayOfByte[i1] = ((byte)(0xC0 | i4 >> 6));
          i1 = i5 + 1;
          arrayOfByte[i5] = ((byte)(0x80 | i4 & 0x3F));
        }
        for (;;)
        {
          paramInt1 = i3;
          break;
          i1 = c(i4, i1);
        }
      }
    }
    this.o = i1;
  }
  
  private final void h(String paramString)
  {
    int i1 = paramString.length();
    char[] arrayOfChar = this.r;
    int i2 = i1;
    int i3 = 0;
    while (i2 > 0)
    {
      int i4 = Math.min(this.q, i2);
      paramString.getChars(i3, i3 + i4, arrayOfChar, 0);
      if (i4 + this.o > this.p) {
        k();
      }
      e(arrayOfChar, 0, i4);
      i3 += i4;
      i2 -= i4;
    }
  }
  
  private final void h(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o + 6 * (paramInt2 - paramInt1) > this.p) {
      k();
    }
    int i1 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    int i2;
    CharacterEscapes localCharacterEscapes;
    if (this.l <= 0)
    {
      i2 = 65535;
      localCharacterEscapes = this.m;
    }
    for (;;)
    {
      if (paramInt1 < paramInt2)
      {
        int i3 = paramInt1 + 1;
        int i4 = paramArrayOfChar[paramInt1];
        if (i4 <= 127)
        {
          if (arrayOfInt[i4] == 0)
          {
            int i8 = i1 + 1;
            arrayOfByte[i1] = ((byte)i4);
            i1 = i8;
            paramInt1 = i3;
            continue;
            i2 = this.l;
            break;
          }
          int i6 = arrayOfInt[i4];
          if (i6 > 0)
          {
            int i7 = i1 + 1;
            arrayOfByte[i1] = 92;
            i1 = i7 + 1;
            arrayOfByte[i7] = ((byte)i6);
            paramInt1 = i3;
            continue;
          }
          if (i6 == -2)
          {
            SerializableString localSerializableString2 = localCharacterEscapes.a(i4);
            if (localSerializableString2 == null) {
              throw new JsonGenerationException("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(i4) + ", although was supposed to have one");
            }
            i1 = a(arrayOfByte, i1, localSerializableString2, paramInt2 - i3);
            paramInt1 = i3;
            continue;
          }
          i1 = d(i4, i1);
          paramInt1 = i3;
          continue;
        }
        if (i4 > i2)
        {
          i1 = d(i4, i1);
          paramInt1 = i3;
        }
        else
        {
          SerializableString localSerializableString1 = localCharacterEscapes.a(i4);
          if (localSerializableString1 != null)
          {
            i1 = a(arrayOfByte, i1, localSerializableString1, paramInt2 - i3);
            paramInt1 = i3;
          }
          else
          {
            if (i4 <= 2047)
            {
              int i5 = i1 + 1;
              arrayOfByte[i1] = ((byte)(0xC0 | i4 >> 6));
              i1 = i5 + 1;
              arrayOfByte[i5] = ((byte)(0x80 | i4 & 0x3F));
            }
            for (;;)
            {
              paramInt1 = i3;
              break;
              i1 = c(i4, i1);
            }
          }
        }
      }
    }
    this.o = i1;
  }
  
  private final void l()
  {
    if (4 + this.o >= this.p) {
      k();
    }
    System.arraycopy(u, 0, this.n, this.o, 4);
    this.o = (4 + this.o);
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
    if (3 + this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte = this.n;
    if (paramChar <= '')
    {
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte[i3] = ((byte)paramChar);
      return;
    }
    if (paramChar < 'ࠀ')
    {
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte[i1] = ((byte)(0xC0 | paramChar >> '\006'));
      int i2 = this.o;
      this.o = (i2 + 1);
      arrayOfByte[i2] = ((byte)(0x80 | paramChar & 0x3F));
      return;
    }
    a(paramChar, null, 0, 0);
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
  
  protected final void a(int paramInt1, int paramInt2)
  {
    int i1 = b(paramInt1, paramInt2);
    if (4 + this.o > this.p) {
      k();
    }
    byte[] arrayOfByte = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte[i2] = ((byte)(0xF0 | i1 >> 18));
    int i3 = this.o;
    this.o = (i3 + 1);
    arrayOfByte[i3] = ((byte)(0x80 | 0x3F & i1 >> 12));
    int i4 = this.o;
    this.o = (i4 + 1);
    arrayOfByte[i4] = ((byte)(0x80 | 0x3F & i1 >> 6));
    int i5 = this.o;
    this.o = (i5 + 1);
    arrayOfByte[i5] = ((byte)(0x80 | i1 & 0x3F));
  }
  
  public void a(long paramLong)
  {
    d("write number");
    if (this.d)
    {
      b(paramLong);
      return;
    }
    if (21 + this.o >= this.p) {
      k();
    }
    this.o = NumberOutput.a(paramLong, this.n, this.o);
  }
  
  public final void a(String paramString)
  {
    int i1 = 1;
    int i2 = this.e.a(paramString);
    if (i2 == 4) {
      e("Can not write a field name, expecting a value");
    }
    if (this.a != null)
    {
      if (i2 == i1) {}
      for (;;)
      {
        a(paramString, i1);
        return;
        i1 = 0;
      }
    }
    if (i2 == i1)
    {
      if (this.o >= this.p) {
        k();
      }
      byte[] arrayOfByte = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte[i3] = 44;
    }
    f(paramString);
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
  
  protected final void a(String paramString, boolean paramBoolean)
  {
    int i2;
    if (paramBoolean)
    {
      this.a.c(this);
      if (!a(JsonGenerator.Feature.c)) {
        break label207;
      }
      if (this.o >= this.p) {
        k();
      }
      byte[] arrayOfByte1 = this.n;
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte1[i1] = 34;
      i2 = paramString.length();
      if (i2 > this.s) {
        break label199;
      }
      paramString.getChars(0, i2, this.r, 0);
      if (i2 > this.q) {
        break label185;
      }
      if (i2 + this.o > this.p) {
        k();
      }
      e(this.r, 0, i2);
    }
    for (;;)
    {
      if (this.o >= this.p) {
        k();
      }
      byte[] arrayOfByte2 = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte2[i3] = 34;
      return;
      this.a.h(this);
      break;
      label185:
      d(this.r, 0, i2);
      continue;
      label199:
      h(paramString);
    }
    label207:
    h(paramString);
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
    if (5 + this.o >= this.p) {
      k();
    }
    if (paramBoolean) {}
    for (byte[] arrayOfByte = v;; arrayOfByte = w)
    {
      int i1 = arrayOfByte.length;
      System.arraycopy(arrayOfByte, 0, this.n, this.o, i1);
      this.o = (i1 + this.o);
      return;
    }
  }
  
  public final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + (paramInt2 + paramInt2);
    if (i1 + this.o > this.p)
    {
      if (this.p < i1)
      {
        c(paramArrayOfChar, paramInt1, paramInt2);
        return;
      }
      k();
    }
    int i2 = paramInt2 + paramInt1;
    int i3 = paramInt1;
    label50:
    label57:
    int i4;
    int i6;
    int i7;
    if (i3 < i2)
    {
      i4 = paramArrayOfChar[i3];
      if (i4 <= 127) {
        break label167;
      }
      i6 = i3 + 1;
      i7 = paramArrayOfChar[i3];
      if (i7 >= 2048) {
        break label206;
      }
      byte[] arrayOfByte2 = this.n;
      int i8 = this.o;
      this.o = (i8 + 1);
      arrayOfByte2[i8] = ((byte)(0xC0 | i7 >> 6));
      byte[] arrayOfByte3 = this.n;
      int i9 = this.o;
      this.o = (i9 + 1);
      arrayOfByte3[i9] = ((byte)(0x80 | i7 & 0x3F));
    }
    for (;;)
    {
      i3 = i6;
      break label50;
      break;
      label167:
      byte[] arrayOfByte1 = this.n;
      int i5 = this.o;
      this.o = (i5 + 1);
      arrayOfByte1[i5] = ((byte)i4);
      i3++;
      if (i3 < i2) {
        break label57;
      }
      return;
      label206:
      a(i7, paramArrayOfChar, i6, i2);
    }
  }
  
  protected final int b(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 56320) || (paramInt2 > 57343)) {
      e("Incomplete surrogate pair: first char 0x" + Integer.toHexString(paramInt1) + ", second 0x" + Integer.toHexString(paramInt2));
    }
    return 65536 + (paramInt1 - 55296 << 10) + (paramInt2 - 56320);
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
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = 91;
  }
  
  public void b(int paramInt)
  {
    d("write number");
    if (11 + this.o >= this.p) {
      k();
    }
    if (this.d)
    {
      c(paramInt);
      return;
    }
    this.o = NumberOutput.a(paramInt, this.n, this.o);
  }
  
  public void b(String paramString)
  {
    d("write text value");
    if (paramString == null)
    {
      l();
      return;
    }
    int i1 = paramString.length();
    if (i1 > this.s)
    {
      g(paramString);
      return;
    }
    paramString.getChars(0, i1, this.r, 0);
    if (i1 > this.q)
    {
      b(this.r, 0, i1);
      return;
    }
    if (i1 + this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte1[i2] = 34;
    e(this.r, 0, i1);
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte2 = this.n;
    int i3 = this.o;
    this.o = (i3 + 1);
    arrayOfByte2[i3] = 34;
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
      if (this.o >= this.p) {
        k();
      }
      byte[] arrayOfByte = this.n;
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte[i1] = 93;
    }
  }
  
  public void c(String paramString)
  {
    int i1 = paramString.length();
    int i2 = 0;
    while (i1 > 0)
    {
      char[] arrayOfChar = this.r;
      int i3 = arrayOfChar.length;
      if (i1 < i3) {
        i3 = i1;
      }
      paramString.getChars(i2, i2 + i3, arrayOfChar, 0);
      a(arrayOfChar, 0, i3);
      i2 += i3;
      i1 -= i3;
    }
  }
  
  public void close()
  {
    super.close();
    if ((this.n != null) && (a(JsonGenerator.Feature.b))) {
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
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = 123;
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
        if (this.o >= this.p) {
          k();
        }
        this.n[this.o] = i2;
        this.o = (1 + this.o);
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
      if (this.o >= this.p) {
        k();
      }
      byte[] arrayOfByte = this.n;
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte[i1] = 125;
    }
  }
  
  public void f()
  {
    d("write null value");
    l();
  }
  
  protected final void f(String paramString)
  {
    if (!a(JsonGenerator.Feature.c))
    {
      h(paramString);
      return;
    }
    if (this.o >= this.p) {
      k();
    }
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    int i2 = paramString.length();
    if (i2 <= this.s)
    {
      paramString.getChars(0, i2, this.r, 0);
      if (i2 <= this.q)
      {
        if (i2 + this.o > this.p) {
          k();
        }
        e(this.r, 0, i2);
      }
    }
    for (;;)
    {
      if (this.o >= this.p) {
        k();
      }
      byte[] arrayOfByte2 = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte2[i3] = 34;
      return;
      d(this.r, 0, i2);
      continue;
      h(paramString);
    }
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
    byte[] arrayOfByte = this.n;
    if ((arrayOfByte != null) && (this.t))
    {
      this.n = null;
      this.i.b(arrayOfByte);
    }
    char[] arrayOfChar = this.r;
    if (arrayOfChar != null)
    {
      this.r = null;
      this.i.b(arrayOfChar);
    }
  }
  
  protected final void k()
  {
    int i1 = this.o;
    if (i1 > 0)
    {
      this.o = 0;
      this.j.write(this.n, 0, i1);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.json.UTF8JsonGenerator
 * JD-Core Version:    0.7.0.1
 */