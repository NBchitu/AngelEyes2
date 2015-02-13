package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonParser
  implements Closeable
{
  protected int a;
  
  protected JsonParseException a(String paramString)
  {
    return new JsonParseException(paramString, e());
  }
  
  public abstract JsonToken a();
  
  public boolean a(JsonParser.Feature paramFeature)
  {
    return (this.a & paramFeature.c()) != 0;
  }
  
  public abstract JsonParser b();
  
  public abstract JsonToken c();
  
  public abstract void close();
  
  public abstract String d();
  
  public abstract JsonLocation e();
  
  public abstract String f();
  
  public byte g()
  {
    int i = i();
    if ((i < -128) || (i > 255)) {
      throw a("Numeric value (" + f() + ") out of range of Java byte");
    }
    return (byte)i;
  }
  
  public short h()
  {
    int i = i();
    if ((i < -32768) || (i > 32767)) {
      throw a("Numeric value (" + f() + ") out of range of Java short");
    }
    return (short)i;
  }
  
  public abstract int i();
  
  public abstract long j();
  
  public abstract BigInteger k();
  
  public abstract float l();
  
  public abstract double m();
  
  public abstract BigDecimal n();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonParser
 * JD-Core Version:    0.7.0.1
 */