package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.Reader;

public final class ReaderBasedJsonParser
  extends ParserBase
{
  protected Reader L;
  protected char[] M;
  protected ObjectCodec N;
  protected final CharsToNameCanonicalizer O;
  protected final int P;
  protected boolean Q = false;
  
  public ReaderBasedJsonParser(IOContext paramIOContext, int paramInt, Reader paramReader, ObjectCodec paramObjectCodec, CharsToNameCanonicalizer paramCharsToNameCanonicalizer)
  {
    super(paramIOContext, paramInt);
    this.L = paramReader;
    this.M = paramIOContext.g();
    this.N = paramObjectCodec;
    this.O = paramCharsToNameCanonicalizer;
    this.P = paramCharsToNameCanonicalizer.e();
  }
  
  private final JsonToken L()
  {
    this.p = false;
    JsonToken localJsonToken = this.m;
    this.m = null;
    if (localJsonToken == JsonToken.d) {
      this.l = this.l.a(this.j, this.k);
    }
    for (;;)
    {
      this.K = localJsonToken;
      return localJsonToken;
      if (localJsonToken == JsonToken.b) {
        this.l = this.l.b(this.j, this.k);
      }
    }
  }
  
  private final char M()
  {
    if ((this.d >= this.e) && (!p())) {}
    char c;
    do
    {
      c = '0';
      while ((this.d >= this.e) && (!p())) {
        do
        {
          return c;
          c = this.M[this.d];
          if ((c < '0') || (c > '9')) {
            return '0';
          }
          if (!a(JsonParser.Feature.g)) {
            b("Leading zeroes not allowed");
          }
          this.d = (1 + this.d);
        } while (c != '0');
      }
      c = this.M[this.d];
      if ((c < '0') || (c > '9')) {
        return '0';
      }
      this.d = (1 + this.d);
    } while (c == '0');
    return c;
  }
  
  private final int N()
  {
    while ((this.d < this.e) || (p()))
    {
      char[] arrayOfChar = this.M;
      int i = this.d;
      this.d = (i + 1);
      int j = arrayOfChar[i];
      if (j > 32)
      {
        if (j != 47) {
          return j;
        }
        P();
      }
      else if (j != 32)
      {
        if (j == 10) {
          K();
        } else if (j == 13) {
          J();
        } else if (j != 9) {
          b(j);
        }
      }
    }
    throw a("Unexpected end-of-input within/between " + this.l.d() + " entries");
  }
  
  private final int O()
  {
    while ((this.d < this.e) || (p()))
    {
      char[] arrayOfChar = this.M;
      int i = this.d;
      this.d = (i + 1);
      j = arrayOfChar[i];
      if (j > 32)
      {
        if (j != 47) {
          return j;
        }
        P();
      }
      else if (j != 32)
      {
        if (j == 10) {
          K();
        } else if (j == 13) {
          J();
        } else if (j != 9) {
          b(j);
        }
      }
    }
    t();
    int j = -1;
    return j;
  }
  
  private final void P()
  {
    if (!a(JsonParser.Feature.b)) {
      b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
    }
    if ((this.d >= this.e) && (!p())) {
      c(" in a comment");
    }
    char[] arrayOfChar = this.M;
    int i = this.d;
    this.d = (i + 1);
    int j = arrayOfChar[i];
    if (j == 47)
    {
      R();
      return;
    }
    if (j == 42)
    {
      Q();
      return;
    }
    b(j, "was expecting either '*' or '/' for a comment");
  }
  
  private final void Q()
  {
    for (;;)
    {
      int j;
      if ((this.d < this.e) || (p()))
      {
        char[] arrayOfChar = this.M;
        int i = this.d;
        this.d = (i + 1);
        j = arrayOfChar[i];
        if (j > 42) {
          continue;
        }
        if (j != 42) {
          break label101;
        }
        if ((this.d < this.e) || (p())) {}
      }
      else
      {
        c(" in a comment");
        return;
      }
      if (this.M[this.d] == '/')
      {
        this.d = (1 + this.d);
        return;
        label101:
        if (j < 32) {
          if (j == 10) {
            K();
          } else if (j == 13) {
            J();
          } else if (j != 9) {
            b(j);
          }
        }
      }
    }
  }
  
  private final void R()
  {
    for (;;)
    {
      int j;
      if ((this.d < this.e) || (p()))
      {
        char[] arrayOfChar = this.M;
        int i = this.d;
        this.d = (i + 1);
        j = arrayOfChar[i];
        if (j >= 32) {
          continue;
        }
        if (j == 10) {
          K();
        }
      }
      else
      {
        return;
      }
      if (j == 13)
      {
        J();
        return;
      }
      if (j != 9) {
        b(j);
      }
    }
  }
  
  private final JsonToken a(boolean paramBoolean)
  {
    char[] arrayOfChar1 = this.n.k();
    if (paramBoolean) {
      arrayOfChar1[0] = '-';
    }
    for (int i = 1;; i = 0)
    {
      int j;
      int k;
      char[] arrayOfChar2;
      int n;
      label84:
      int i32;
      int i4;
      int i3;
      int i1;
      char[] arrayOfChar3;
      int i2;
      if (this.d < this.e)
      {
        char[] arrayOfChar11 = this.M;
        int i34 = this.d;
        this.d = (i34 + 1);
        j = arrayOfChar11[i34];
        if (j == 48) {
          j = M();
        }
        k = 0;
        int m = j;
        arrayOfChar2 = arrayOfChar1;
        n = m;
        if ((n < 48) || (n > 57)) {
          break label886;
        }
        k++;
        if (i >= arrayOfChar2.length)
        {
          arrayOfChar2 = this.n.m();
          i = 0;
        }
        i32 = i + 1;
        arrayOfChar2[i] = n;
        if ((this.d < this.e) || (p())) {
          break label616;
        }
        i4 = 1;
        i3 = 0;
        i1 = k;
        arrayOfChar3 = arrayOfChar2;
        i2 = i32;
      }
      for (;;)
      {
        if (i1 == 0) {
          b("Missing integer part (next char " + c(i3) + ")");
        }
        char[] arrayOfChar8;
        int i25;
        int i26;
        int i27;
        int i5;
        int i29;
        label263:
        int i8;
        int i6;
        char[] arrayOfChar4;
        int i7;
        if (i3 == 46)
        {
          int i24 = i2 + 1;
          arrayOfChar3[i2] = i3;
          arrayOfChar8 = arrayOfChar3;
          i25 = i24;
          i26 = i3;
          i27 = 0;
          if ((this.d >= this.e) && (!p()))
          {
            i5 = i26;
            i29 = 1;
            if (i27 == 0) {
              a(i5, "Decimal point not followed by a digit");
            }
            i8 = i27;
            i6 = i25;
            int i30 = i29;
            arrayOfChar4 = arrayOfChar8;
            i7 = i30;
          }
        }
        for (;;)
        {
          int i9;
          int i10;
          label381:
          int i11;
          label415:
          int i13;
          label466:
          int i14;
          int i15;
          int i16;
          label477:
          int i20;
          int i17;
          int i19;
          int i18;
          if ((i5 == 101) || (i5 == 69))
          {
            if (i6 >= arrayOfChar4.length)
            {
              arrayOfChar4 = this.n.m();
              i6 = 0;
            }
            i9 = i6 + 1;
            arrayOfChar4[i6] = i5;
            if (this.d < this.e)
            {
              char[] arrayOfChar7 = this.M;
              int i23 = this.d;
              this.d = (i23 + 1);
              i10 = arrayOfChar7[i23];
              if ((i10 != 45) && (i10 != 43)) {
                break label818;
              }
              if (i9 < arrayOfChar4.length) {
                break label811;
              }
              arrayOfChar4 = this.n.m();
              i11 = 0;
              int i12 = i11 + 1;
              arrayOfChar4[i11] = i10;
              if (this.d >= this.e) {
                break label751;
              }
              char[] arrayOfChar6 = this.M;
              int i22 = this.d;
              this.d = (i22 + 1);
              i13 = arrayOfChar6[i22];
              i14 = i13;
              i15 = i12;
              i16 = 0;
              if ((i14 > 57) || (i14 < 48)) {
                break label796;
              }
              i16++;
              if (i15 >= arrayOfChar4.length)
              {
                arrayOfChar4 = this.n.m();
                i15 = 0;
              }
              i20 = i15 + 1;
              arrayOfChar4[i15] = i14;
              if ((this.d < this.e) || (p())) {
                break label762;
              }
              i17 = i16;
              i19 = 1;
              i18 = i20;
              label556:
              if (i17 == 0) {
                a(i14, "Exponent indicator not followed by a digit");
              }
              label569:
              if (i19 == 0) {
                this.d = (-1 + this.d);
              }
              this.n.a(i18);
              return a(paramBoolean, i1, i8, i17);
              j = e("No digit following minus sign");
              break;
              label616:
              char[] arrayOfChar10 = this.M;
              int i33 = this.d;
              this.d = (i33 + 1);
              n = arrayOfChar10[i33];
              i = i32;
              break label84;
              char[] arrayOfChar9 = this.M;
              int i28 = this.d;
              this.d = (i28 + 1);
              i26 = arrayOfChar9[i28];
              if (i26 < 48) {
                break label853;
              }
              if (i26 > 57)
              {
                i5 = i26;
                i29 = i4;
                break label263;
              }
              i27++;
              if (i25 < arrayOfChar8.length) {
                break label846;
              }
              arrayOfChar8 = this.n.m();
            }
          }
          label796:
          label811:
          label818:
          label846:
          for (int i31 = 0;; i31 = i25)
          {
            i25 = i31 + 1;
            arrayOfChar8[i31] = i26;
            break;
            i10 = e("expected a digit for number exponent");
            break label381;
            label751:
            i13 = e("expected a digit for number exponent");
            break label466;
            label762:
            char[] arrayOfChar5 = this.M;
            int i21 = this.d;
            this.d = (i21 + 1);
            i14 = arrayOfChar5[i21];
            i15 = i20;
            break label477;
            i17 = i16;
            i18 = i15;
            i19 = i7;
            break label556;
            i11 = i9;
            break label415;
            i14 = i10;
            i15 = i9;
            i16 = 0;
            break label477;
            i18 = i6;
            i19 = i7;
            i17 = 0;
            break label569;
          }
          label853:
          i5 = i26;
          i29 = i4;
          break label263;
          i5 = i3;
          arrayOfChar4 = arrayOfChar3;
          i6 = i2;
          i7 = i4;
          i8 = 0;
        }
        label886:
        i1 = k;
        i2 = i;
        i3 = n;
        arrayOfChar3 = arrayOfChar2;
        i4 = 0;
      }
    }
  }
  
  private String a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.n.a(this.M, paramInt1, this.d - paramInt1);
    char[] arrayOfChar1 = this.n.j();
    int i = this.n.l();
    for (;;)
    {
      if ((this.d >= this.e) && (!p())) {
        c(": was expecting closing '" + (char)paramInt3 + "' for name");
      }
      char[] arrayOfChar2 = this.M;
      int j = this.d;
      this.d = (j + 1);
      int k = arrayOfChar2[j];
      if (k <= 92) {
        if (k != 92) {}
      }
      int n;
      for (int m = B();; m = k)
      {
        paramInt2 = k + paramInt2 * 33;
        n = i + 1;
        arrayOfChar1[i] = m;
        if (n < arrayOfChar1.length) {
          break label259;
        }
        arrayOfChar1 = this.n.m();
        i = 0;
        break;
        if (k <= paramInt3)
        {
          if (k == paramInt3)
          {
            this.n.a(i);
            TextBuffer localTextBuffer = this.n;
            char[] arrayOfChar3 = localTextBuffer.e();
            int i1 = localTextBuffer.d();
            int i2 = localTextBuffer.c();
            return this.O.a(arrayOfChar3, i1, i2, paramInt2);
          }
          if (k < 32) {
            c(k, "name");
          }
        }
      }
      label259:
      i = n;
    }
  }
  
  private String a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    this.n.a(this.M, paramInt1, this.d - paramInt1);
    char[] arrayOfChar1 = this.n.j();
    int i = this.n.l();
    int j = paramArrayOfInt.length;
    for (;;)
    {
      if ((this.d >= this.e) && (!p())) {}
      int i1;
      for (;;)
      {
        this.n.a(i);
        TextBuffer localTextBuffer = this.n;
        char[] arrayOfChar2 = localTextBuffer.e();
        int m = localTextBuffer.d();
        int n = localTextBuffer.c();
        return this.O.a(arrayOfChar2, m, n, paramInt2);
        int k = this.M[this.d];
        if (k <= j)
        {
          if (paramArrayOfInt[k] != 0) {}
        }
        else {
          while (Character.isJavaIdentifierPart(k))
          {
            this.d = (1 + this.d);
            paramInt2 = k + paramInt2 * 33;
            i1 = i + 1;
            arrayOfChar1[i] = k;
            if (i1 < arrayOfChar1.length) {
              break label199;
            }
            arrayOfChar1 = this.n.m();
            i = 0;
            break;
          }
        }
      }
      label199:
      i = i1;
    }
  }
  
  protected final char B()
  {
    int i = 0;
    if ((this.d >= this.e) && (!p())) {
      c(" in character escape sequence");
    }
    char[] arrayOfChar1 = this.M;
    int j = this.d;
    this.d = (j + 1);
    char c = arrayOfChar1[j];
    switch (c)
    {
    default: 
      c = a(c);
    case '"': 
    case '/': 
    case '\\': 
      return c;
    case 'b': 
      return '\b';
    case 't': 
      return '\t';
    case 'n': 
      return '\n';
    case 'f': 
      return '\f';
    case 'r': 
      return '\r';
    }
    for (int k = 0; k < 4; k++)
    {
      if ((this.d >= this.e) && (!p())) {
        c(" in character escape sequence");
      }
      char[] arrayOfChar2 = this.M;
      int m = this.d;
      this.d = (m + 1);
      int n = arrayOfChar2[m];
      int i1 = CharTypes.a(n);
      if (i1 < 0) {
        b(n, "expected a hex-digit for character escape sequence");
      }
      i = i1 | i << 4;
    }
    return (char)i;
  }
  
  protected final String F()
  {
    int i = this.d;
    int j = this.P;
    int k = this.e;
    int i1;
    if (i < k)
    {
      int[] arrayOfInt = CharTypes.a();
      int n = arrayOfInt.length;
      i1 = this.M[i];
      if (i1 == 39)
      {
        int i2 = this.d;
        this.d = (i + 1);
        return this.O.a(this.M, i2, i - i2, j);
      }
      if ((i1 >= n) || (arrayOfInt[i1] == 0)) {
        break label113;
      }
    }
    for (;;)
    {
      int m = this.d;
      this.d = i;
      return a(m, j, 39);
      label113:
      j = i1 + j * 33;
      i++;
      if (i < k) {
        break;
      }
    }
  }
  
  protected final JsonToken G()
  {
    char[] arrayOfChar1 = this.n.k();
    int i = this.n.l();
    if ((this.d >= this.e) && (!p())) {
      c(": was expecting closing quote for a string value");
    }
    char[] arrayOfChar2 = this.M;
    int j = this.d;
    this.d = (j + 1);
    int k = arrayOfChar2[j];
    if (k <= 92)
    {
      if (k == 92) {
        k = B();
      }
    }
    else
    {
      label85:
      if (i < arrayOfChar1.length) {
        break label161;
      }
      arrayOfChar1 = this.n.m();
    }
    label161:
    for (int m = 0;; m = i)
    {
      i = m + 1;
      arrayOfChar1[m] = k;
      break;
      if (k > 39) {
        break label85;
      }
      if (k == 39)
      {
        this.n.a(i);
        return JsonToken.h;
      }
      if (k >= 32) {
        break label85;
      }
      c(k, "string value");
      break label85;
    }
  }
  
  protected void H()
  {
    char[] arrayOfChar1 = this.n.j();
    int i = this.n.l();
    if ((this.d >= this.e) && (!p())) {
      c(": was expecting closing quote for a string value");
    }
    char[] arrayOfChar2 = this.M;
    int j = this.d;
    this.d = (j + 1);
    int k = arrayOfChar2[j];
    if (k <= 92)
    {
      if (k == 92) {
        k = B();
      }
    }
    else
    {
      label85:
      if (i < arrayOfChar1.length) {
        break label158;
      }
      arrayOfChar1 = this.n.m();
    }
    label158:
    for (int m = 0;; m = i)
    {
      i = m + 1;
      arrayOfChar1[m] = k;
      break;
      if (k > 34) {
        break label85;
      }
      if (k == 34)
      {
        this.n.a(i);
        return;
      }
      if (k >= 32) {
        break label85;
      }
      c(k, "string value");
      break label85;
    }
  }
  
  protected void I()
  {
    this.Q = false;
    int i = this.d;
    int j = this.e;
    char[] arrayOfChar = this.M;
    for (;;)
    {
      if (i >= j)
      {
        this.d = i;
        if (!p()) {
          c(": was expecting closing quote for a string value");
        }
        i = this.d;
        j = this.e;
      }
      int k = i + 1;
      int m = arrayOfChar[i];
      if (m <= 92)
      {
        if (m == 92)
        {
          this.d = k;
          B();
          i = this.d;
          j = this.e;
          continue;
        }
        if (m <= 34)
        {
          if (m == 34)
          {
            this.d = k;
            return;
          }
          if (m < 32)
          {
            this.d = k;
            c(m, "string value");
          }
        }
      }
      i = k;
    }
  }
  
  protected final void J()
  {
    if (((this.d < this.e) || (p())) && (this.M[this.d] == '\n')) {
      this.d = (1 + this.d);
    }
    this.g = (1 + this.g);
    this.h = this.d;
  }
  
  protected final void K()
  {
    this.g = (1 + this.g);
    this.h = this.d;
  }
  
  public JsonToken a()
  {
    this.A = 0;
    if (this.K == JsonToken.f) {
      return L();
    }
    if (this.Q) {
      I();
    }
    int i = O();
    if (i < 0)
    {
      close();
      this.K = null;
      return null;
    }
    this.i = (this.f + this.d - 1L);
    this.j = this.g;
    this.k = (-1 + (this.d - this.h));
    this.r = null;
    if (i == 93)
    {
      if (!this.l.a()) {
        a(i, '}');
      }
      this.l = this.l.i();
      JsonToken localJsonToken3 = JsonToken.e;
      this.K = localJsonToken3;
      return localJsonToken3;
    }
    if (i == 125)
    {
      if (!this.l.c()) {
        a(i, ']');
      }
      this.l = this.l.i();
      JsonToken localJsonToken2 = JsonToken.c;
      this.K = localJsonToken2;
      return localJsonToken2;
    }
    if (this.l.j())
    {
      if (i != 44) {
        b(i, "was expecting comma to separate " + this.l.d() + " entries");
      }
      i = N();
    }
    boolean bool = this.l.c();
    if (bool)
    {
      String str = e(i);
      this.l.a(str);
      this.K = JsonToken.f;
      int j = N();
      if (j != 58) {
        b(j, "was expecting a colon to separate field name and value");
      }
      i = N();
    }
    JsonToken localJsonToken1;
    switch (i)
    {
    default: 
      localJsonToken1 = g(i);
    }
    while (bool)
    {
      this.m = localJsonToken1;
      return this.K;
      this.Q = true;
      localJsonToken1 = JsonToken.h;
      continue;
      if (!bool) {
        this.l = this.l.a(this.j, this.k);
      }
      localJsonToken1 = JsonToken.d;
      continue;
      if (!bool) {
        this.l = this.l.b(this.j, this.k);
      }
      localJsonToken1 = JsonToken.b;
      continue;
      b(i, "expected a value");
      a("true", 1);
      localJsonToken1 = JsonToken.k;
      continue;
      a("false", 1);
      localJsonToken1 = JsonToken.l;
      continue;
      a("null", 1);
      localJsonToken1 = JsonToken.m;
      continue;
      localJsonToken1 = d(i);
    }
    this.K = localJsonToken1;
    return localJsonToken1;
  }
  
  protected JsonToken a(int paramInt, boolean paramBoolean)
  {
    double d = (-1.0D / 0.0D);
    if (paramInt == 73)
    {
      if ((this.d >= this.e) && (!p())) {
        D();
      }
      char[] arrayOfChar = this.M;
      int i = this.d;
      this.d = (i + 1);
      paramInt = arrayOfChar[i];
      if (paramInt != 78) {
        break label158;
      }
      String str2;
      if (paramBoolean)
      {
        str2 = "-INF";
        a(str2, 3);
        if (!a(JsonParser.Feature.h)) {
          break label117;
        }
        if (!paramBoolean) {
          break label110;
        }
      }
      for (;;)
      {
        return a(str2, d);
        str2 = "+INF";
        break;
        label110:
        d = (1.0D / 0.0D);
      }
      label117:
      d("Non-standard token '" + str2 + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
    }
    for (;;)
    {
      a(paramInt, "expected digit (0-9) to follow minus sign, for valid numeric value");
      return null;
      label158:
      if (paramInt == 110)
      {
        String str1;
        if (paramBoolean)
        {
          str1 = "-Infinity";
          a(str1, 3);
          if (!a(JsonParser.Feature.h)) {
            break label217;
          }
          if (!paramBoolean) {
            break label210;
          }
        }
        for (;;)
        {
          return a(str1, d);
          str1 = "+Infinity";
          break;
          label210:
          d = (1.0D / 0.0D);
        }
        label217:
        d("Non-standard token '" + str1 + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
      }
    }
  }
  
  protected final String a(JsonToken paramJsonToken)
  {
    if (paramJsonToken == null) {
      return null;
    }
    switch (ReaderBasedJsonParser.1.a[paramJsonToken.ordinal()])
    {
    default: 
      return paramJsonToken.a();
    case 1: 
      return this.l.h();
    }
    return this.n.f();
  }
  
  protected final void a(String paramString, int paramInt)
  {
    int i = paramString.length();
    do
    {
      if ((this.d >= this.e) && (!p())) {
        D();
      }
      if (this.M[this.d] != paramString.charAt(paramInt)) {
        a(paramString.substring(0, paramInt), "'null', 'true', 'false' or NaN");
      }
      this.d = (1 + this.d);
      paramInt++;
    } while (paramInt < i);
    if ((this.d >= this.e) && (!p())) {}
    char c;
    do
    {
      return;
      c = this.M[this.d];
    } while ((c < '0') || (c == ']') || (c == '}') || (!Character.isJavaIdentifierPart(c)));
    a(paramString.substring(0, paramInt), "'null', 'true', 'false' or NaN");
  }
  
  protected void a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString1);
    for (;;)
    {
      if ((this.d >= this.e) && (!p())) {}
      char c;
      do
      {
        d("Unrecognized token '" + localStringBuilder.toString() + "': was expecting ");
        return;
        c = this.M[this.d];
      } while (!Character.isJavaIdentifierPart(c));
      this.d = (1 + this.d);
      localStringBuilder.append(c);
    }
  }
  
  public void close()
  {
    super.close();
    this.O.b();
  }
  
  protected final JsonToken d(int paramInt)
  {
    int i = 1;
    int j = 0;
    int k;
    int m;
    int n;
    int i1;
    if (paramInt == 45)
    {
      k = i;
      m = this.d;
      n = m - 1;
      i1 = this.e;
      if (k == 0) {
        break label118;
      }
      if (m < this.e) {
        break label75;
      }
    }
    int i14;
    label56:
    boolean bool;
    label75:
    int i2;
    label118:
    int i3;
    label128:
    int i4;
    int i15;
    int i16;
    label184:
    int i17;
    int i19;
    int i6;
    int i5;
    for (;;)
    {
      if (k != 0)
      {
        i14 = n + 1;
        this.d = i14;
        return a(k);
        bool = false;
        break;
        char[] arrayOfChar6 = this.M;
        i2 = m + 1;
        paramInt = arrayOfChar6[m];
        if ((paramInt > 57) || (paramInt < 48))
        {
          this.d = i2;
          return a(paramInt, i);
          i2 = m;
        }
        if (paramInt != 48) {
          if (i2 < this.e)
          {
            char[] arrayOfChar1 = this.M;
            i3 = i2 + 1;
            i4 = arrayOfChar1[i2];
            if ((i4 < 48) || (i4 > 57))
            {
              if (i4 != 46) {
                break label482;
              }
              i15 = 0;
              i16 = i3;
              if (i16 >= i1) {
                break label403;
              }
              char[] arrayOfChar5 = this.M;
              i17 = i16 + 1;
              int i18 = arrayOfChar5[i16];
              if ((i18 >= 48) && (i18 <= 57)) {
                break label395;
              }
              if (i15 == 0) {
                a(i18, "Decimal point not followed by a digit");
              }
              i19 = i15;
              i6 = i17;
              i5 = i18;
            }
          }
        }
      }
    }
    for (int i7 = i19;; i7 = 0)
    {
      int i10;
      int i11;
      int i12;
      if (i5 != 101)
      {
        j = 0;
        if (i5 != 69) {}
      }
      else
      {
        if (i6 >= i1) {
          break;
        }
        char[] arrayOfChar2 = this.M;
        i10 = i6 + 1;
        i11 = arrayOfChar2[i6];
        if ((i11 != 45) && (i11 != 43)) {
          break label469;
        }
        if (i10 >= i1) {
          break;
        }
        char[] arrayOfChar3 = this.M;
        i6 = i10 + 1;
        i12 = arrayOfChar3[i10];
      }
      for (;;)
      {
        if ((i12 <= 57) && (i12 >= 48))
        {
          j++;
          if (i6 >= i1) {
            break;
          }
          char[] arrayOfChar4 = this.M;
          int i13 = i6 + 1;
          i12 = arrayOfChar4[i6];
          i6 = i13;
          continue;
          i++;
          i2 = i3;
          break label128;
          break;
          label395:
          i15++;
          i16 = i17;
          break label184;
          label403:
          break;
        }
        if (j == 0) {
          a(i12, "Exponent indicator not followed by a digit");
        }
        int i8 = i6 - 1;
        this.d = i8;
        int i9 = i8 - n;
        this.n.a(this.M, n, i9);
        return a(bool, i, i7, j);
        i14 = n;
        break label56;
        label469:
        i12 = i11;
        i6 = i10;
        j = 0;
      }
      label482:
      i5 = i4;
      i6 = i3;
    }
  }
  
  protected final char e(String paramString)
  {
    if ((this.d >= this.e) && (!p())) {
      c(paramString);
    }
    char[] arrayOfChar = this.M;
    int i = this.d;
    this.d = (i + 1);
    return arrayOfChar[i];
  }
  
  protected final String e(int paramInt)
  {
    if (paramInt != 34) {
      return f(paramInt);
    }
    int i = this.d;
    int j = this.P;
    int k = this.e;
    if (i < k)
    {
      int[] arrayOfInt = CharTypes.a();
      int n = arrayOfInt.length;
      do
      {
        int i1 = this.M[i];
        if ((i1 < n) && (arrayOfInt[i1] != 0))
        {
          if (i1 != 34) {
            break;
          }
          int i2 = this.d;
          this.d = (i + 1);
          return this.O.a(this.M, i2, i - i2, j);
        }
        j = i1 + j * 33;
        i++;
      } while (i < k);
    }
    int m = this.d;
    this.d = i;
    return a(m, j, 34);
  }
  
  public final String f()
  {
    JsonToken localJsonToken = this.K;
    if (localJsonToken == JsonToken.h)
    {
      if (this.Q)
      {
        this.Q = false;
        q();
      }
      return this.n.f();
    }
    return a(localJsonToken);
  }
  
  protected final String f(int paramInt)
  {
    if ((paramInt == 39) && (a(JsonParser.Feature.d))) {
      return F();
    }
    if (!a(JsonParser.Feature.c)) {
      b(paramInt, "was expecting double-quote to start field name");
    }
    int[] arrayOfInt = CharTypes.c();
    int i = arrayOfInt.length;
    boolean bool;
    int j;
    int k;
    int m;
    if (paramInt < i) {
      if ((arrayOfInt[paramInt] == 0) && ((paramInt < 48) || (paramInt > 57)))
      {
        bool = true;
        if (!bool) {
          b(paramInt, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        j = this.d;
        k = this.P;
        m = this.e;
        if (j >= m) {
          break label246;
        }
      }
    }
    label226:
    do
    {
      int i1 = this.M[j];
      if (i1 < i)
      {
        if (arrayOfInt[i1] == 0) {
          break label226;
        }
        int i3 = -1 + this.d;
        this.d = j;
        return this.O.a(this.M, i3, j - i3, k);
        bool = false;
        break;
        bool = Character.isJavaIdentifierPart((char)paramInt);
        break;
      }
      if (!Character.isJavaIdentifierPart(i1))
      {
        int i2 = -1 + this.d;
        this.d = j;
        return this.O.a(this.M, i2, j - i2, k);
      }
      k = i1 + k * 33;
      j++;
    } while (j < m);
    label246:
    int n = -1 + this.d;
    this.d = j;
    return a(n, k, arrayOfInt);
  }
  
  protected final JsonToken g(int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case 39: 
    case 78: 
      for (;;)
      {
        b(paramInt, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
        if (a(JsonParser.Feature.d))
        {
          return G();
          a("NaN", 1);
          if (a(JsonParser.Feature.h)) {
            return a("NaN", (0.0D / 0.0D));
          }
          d("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
      }
    }
    if ((this.d >= this.e) && (!p())) {
      D();
    }
    char[] arrayOfChar = this.M;
    int i = this.d;
    this.d = (i + 1);
    return a(arrayOfChar[i], false);
  }
  
  protected final boolean p()
  {
    this.f += this.e;
    this.h -= this.e;
    Reader localReader = this.L;
    boolean bool = false;
    int i;
    if (localReader != null)
    {
      i = this.L.read(this.M, 0, this.M.length);
      if (i <= 0) {
        break label74;
      }
      this.d = 0;
      this.e = i;
      bool = true;
    }
    label74:
    do
    {
      return bool;
      r();
      bool = false;
    } while (i != 0);
    throw new IOException("Reader returned 0 characters when trying to read " + this.e);
  }
  
  protected void q()
  {
    int i = this.d;
    int j = this.e;
    if (i < j)
    {
      int[] arrayOfInt = CharTypes.a();
      int k = arrayOfInt.length;
      do
      {
        int m = this.M[i];
        if ((m < k) && (arrayOfInt[m] != 0))
        {
          if (m != 34) {
            break;
          }
          this.n.a(this.M, this.d, i - this.d);
          this.d = (i + 1);
          return;
        }
        i++;
      } while (i < j);
    }
    this.n.b(this.M, this.d, i - this.d);
    this.d = i;
    H();
  }
  
  protected void r()
  {
    if (this.L != null)
    {
      if ((this.b.c()) || (a(JsonParser.Feature.a))) {
        this.L.close();
      }
      this.L = null;
    }
  }
  
  protected void s()
  {
    super.s();
    char[] arrayOfChar = this.M;
    if (arrayOfChar != null)
    {
      this.M = null;
      this.b.a(arrayOfChar);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.json.ReaderBasedJsonParser
 * JD-Core Version:    0.7.0.1
 */