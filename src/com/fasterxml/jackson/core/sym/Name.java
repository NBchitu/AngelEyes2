package com.fasterxml.jackson.core.sym;

public abstract class Name
{
  protected final String a;
  protected final int b;
  
  protected Name(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public abstract boolean a(int paramInt);
  
  public abstract boolean a(int paramInt1, int paramInt2);
  
  public abstract boolean a(int[] paramArrayOfInt, int paramInt);
  
  public boolean equals(Object paramObject)
  {
    return paramObject == this;
  }
  
  public final int hashCode()
  {
    return this.b;
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.Name
 * JD-Core Version:    0.7.0.1
 */