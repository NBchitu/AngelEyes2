package com.telesoftas.services;

import com.google.common.collect.ImmutableList;

public class SignalBundle
{
  private final ImmutableList<Signal> a;
  private final long b;
  private Object c;
  
  public SignalBundle(ImmutableList<Signal> paramImmutableList, long paramLong)
  {
    this.a = paramImmutableList;
    this.b = paramLong;
  }
  
  public long a()
  {
    return this.b;
  }
  
  public void a(Object paramObject)
  {
    this.c = paramObject;
  }
  
  public ImmutableList<Signal> b()
  {
    return this.a;
  }
  
  public Object c()
  {
    return this.c;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.SignalBundle
 * JD-Core Version:    0.7.0.1
 */