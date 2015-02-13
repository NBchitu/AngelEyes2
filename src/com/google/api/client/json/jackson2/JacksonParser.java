package com.google.api.client.json.jackson2;

import com.google.api.client.json.JsonToken;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import java.math.BigDecimal;
import java.math.BigInteger;

final class JacksonParser
  extends com.google.api.client.json.JsonParser
{
  private final com.fasterxml.jackson.core.JsonParser a;
  private final JacksonFactory b;
  
  JacksonParser(JacksonFactory paramJacksonFactory, com.fasterxml.jackson.core.JsonParser paramJsonParser)
  {
    this.b = paramJacksonFactory;
    this.a = paramJsonParser;
  }
  
  public void b()
  {
    this.a.close();
  }
  
  public JsonToken c()
  {
    return JacksonFactory.a(this.a.a());
  }
  
  public JsonToken d()
  {
    return JacksonFactory.a(this.a.c());
  }
  
  public String e()
  {
    return this.a.d();
  }
  
  public com.google.api.client.json.JsonParser f()
  {
    this.a.b();
    return this;
  }
  
  public String g()
  {
    return this.a.f();
  }
  
  public byte h()
  {
    return this.a.g();
  }
  
  public short i()
  {
    return this.a.h();
  }
  
  public int j()
  {
    return this.a.i();
  }
  
  public float k()
  {
    return this.a.l();
  }
  
  public long l()
  {
    return this.a.j();
  }
  
  public double m()
  {
    return this.a.m();
  }
  
  public BigInteger n()
  {
    return this.a.k();
  }
  
  public UnsignedInteger o()
  {
    return UnsignedInteger.a(this.a.j());
  }
  
  public UnsignedLong p()
  {
    return UnsignedLong.a(this.a.k());
  }
  
  public BigDecimal q()
  {
    return this.a.n();
  }
  
  public JacksonFactory r()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.jackson2.JacksonParser
 * JD-Core Version:    0.7.0.1
 */