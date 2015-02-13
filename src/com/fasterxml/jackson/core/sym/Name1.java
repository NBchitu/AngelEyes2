package com.fasterxml.jackson.core.sym;

public final class Name1
  extends Name
{
  static final Name1 c = new Name1("", 0, 0);
  final int d;
  
  Name1(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1);
    this.d = paramInt2;
  }
  
  static final Name1 b()
  {
    return c;
  }
  
  public boolean a(int paramInt)
  {
    return paramInt == this.d;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.d) && (paramInt2 == 0);
  }
  
  public boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 1) && (paramArrayOfInt[0] == this.d);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.Name1
 * JD-Core Version:    0.7.0.1
 */