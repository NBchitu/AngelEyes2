package com.google.api.client.json.jackson2;

import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import java.math.BigDecimal;
import java.math.BigInteger;

final class JacksonGenerator
  extends com.google.api.client.json.JsonGenerator
{
  private final com.fasterxml.jackson.core.JsonGenerator a;
  private final JacksonFactory b;
  
  JacksonGenerator(JacksonFactory paramJacksonFactory, com.fasterxml.jackson.core.JsonGenerator paramJsonGenerator)
  {
    this.b = paramJacksonFactory;
    this.a = paramJsonGenerator;
  }
  
  public void a()
  {
    this.a.g();
  }
  
  public void a(double paramDouble)
  {
    this.a.a(paramDouble);
  }
  
  public void a(float paramFloat)
  {
    this.a.a(paramFloat);
  }
  
  public void a(int paramInt)
  {
    this.a.b(paramInt);
  }
  
  public void a(long paramLong)
  {
    this.a.a(paramLong);
  }
  
  public void a(UnsignedInteger paramUnsignedInteger)
  {
    this.a.a(paramUnsignedInteger.longValue());
  }
  
  public void a(UnsignedLong paramUnsignedLong)
  {
    this.a.a(paramUnsignedLong.a());
  }
  
  public void a(String paramString)
  {
    this.a.a(paramString);
  }
  
  public void a(BigDecimal paramBigDecimal)
  {
    this.a.a(paramBigDecimal);
  }
  
  public void a(BigInteger paramBigInteger)
  {
    this.a.a(paramBigInteger);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public void b()
  {
    this.a.b();
  }
  
  public void b(String paramString)
  {
    this.a.b(paramString);
  }
  
  public void c()
  {
    this.a.c();
  }
  
  public void d()
  {
    this.a.d();
  }
  
  public void e()
  {
    this.a.e();
  }
  
  public void f()
  {
    this.a.f();
  }
  
  public void g()
  {
    this.a.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.jackson2.JacksonGenerator
 * JD-Core Version:    0.7.0.1
 */