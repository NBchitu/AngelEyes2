package com.fasterxml.jackson.core;

public abstract class JsonStreamContext
{
  protected int a;
  protected int b;
  
  public final boolean a()
  {
    return this.a == 1;
  }
  
  public final boolean b()
  {
    return this.a == 0;
  }
  
  public final boolean c()
  {
    return this.a == 2;
  }
  
  public final String d()
  {
    switch (this.a)
    {
    default: 
      return "?";
    case 0: 
      return "ROOT";
    case 1: 
      return "ARRAY";
    }
    return "OBJECT";
  }
  
  public final int e()
  {
    return 1 + this.b;
  }
  
  public final int f()
  {
    if (this.b < 0) {
      return 0;
    }
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonStreamContext
 * JD-Core Version:    0.7.0.1
 */