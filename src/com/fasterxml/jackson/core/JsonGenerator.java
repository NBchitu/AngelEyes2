package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonGenerator
  implements Closeable
{
  protected PrettyPrinter a;
  
  public abstract JsonGenerator a();
  
  public JsonGenerator a(int paramInt)
  {
    return this;
  }
  
  public JsonGenerator a(PrettyPrinter paramPrettyPrinter)
  {
    this.a = paramPrettyPrinter;
    return this;
  }
  
  public JsonGenerator a(CharacterEscapes paramCharacterEscapes)
  {
    return this;
  }
  
  public abstract void a(char paramChar);
  
  public abstract void a(double paramDouble);
  
  public abstract void a(float paramFloat);
  
  public abstract void a(long paramLong);
  
  public abstract void a(String paramString);
  
  public abstract void a(BigDecimal paramBigDecimal);
  
  public abstract void a(BigInteger paramBigInteger);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void a(char[] paramArrayOfChar, int paramInt1, int paramInt2);
  
  public abstract void b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(String paramString);
  
  public abstract void c();
  
  public abstract void c(String paramString);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonGenerator
 * JD-Core Version:    0.7.0.1
 */