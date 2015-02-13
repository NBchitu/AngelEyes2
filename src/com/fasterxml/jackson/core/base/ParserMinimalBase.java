package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;

public abstract class ParserMinimalBase
  extends JsonParser
{
  protected JsonToken K;
  
  protected static final String c(int paramInt)
  {
    char c = (char)paramInt;
    if (Character.isISOControl(c)) {
      return "(CTRL-CHAR, code " + paramInt + ")";
    }
    if (paramInt > 255) {
      return "'" + c + "' (code " + paramInt + " / 0x" + Integer.toHexString(paramInt) + ")";
    }
    return "'" + c + "' (code " + paramInt + ")";
  }
  
  protected void C()
  {
    c(" in " + this.K);
  }
  
  protected void D()
  {
    c(" in a value");
  }
  
  protected final void E()
  {
    throw new RuntimeException("Internal error: this code path should never get executed");
  }
  
  protected char a(char paramChar)
  {
    if (a(JsonParser.Feature.f)) {}
    while ((paramChar == '\'') && (a(JsonParser.Feature.d))) {
      return paramChar;
    }
    d("Unrecognized character escape " + c(paramChar));
    return paramChar;
  }
  
  public abstract JsonToken a();
  
  protected final void a(String paramString, Throwable paramThrowable)
  {
    throw b(paramString, paramThrowable);
  }
  
  protected final JsonParseException b(String paramString, Throwable paramThrowable)
  {
    return new JsonParseException(paramString, e(), paramThrowable);
  }
  
  public JsonParser b()
  {
    if ((this.K != JsonToken.b) && (this.K != JsonToken.d)) {
      return this;
    }
    int i = 1;
    do
    {
      for (;;)
      {
        JsonToken localJsonToken = a();
        if (localJsonToken == null)
        {
          t();
          return this;
        }
        switch (ParserMinimalBase.1.a[localJsonToken.ordinal()])
        {
        default: 
          break;
        case 1: 
        case 2: 
          i++;
        }
      }
      i--;
    } while (i != 0);
    return this;
  }
  
  protected void b(int paramInt)
  {
    int i = (char)paramInt;
    d("Illegal character (" + c(i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
  }
  
  protected void b(int paramInt, String paramString)
  {
    String str = "Unexpected character (" + c(paramInt) + ")";
    if (paramString != null) {
      str = str + ": " + paramString;
    }
    d(str);
  }
  
  public JsonToken c()
  {
    return this.K;
  }
  
  protected void c(int paramInt, String paramString)
  {
    if ((!a(JsonParser.Feature.e)) || (paramInt >= 32))
    {
      int i = (char)paramInt;
      d("Illegal unquoted character (" + c(i) + "): has to be escaped using backslash to be included in " + paramString);
    }
  }
  
  protected void c(String paramString)
  {
    d("Unexpected end-of-input" + paramString);
  }
  
  protected final void d(String paramString)
  {
    throw a(paramString);
  }
  
  public abstract String f();
  
  protected abstract void t();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.base.ParserMinimalBase
 * JD-Core Version:    0.7.0.1
 */