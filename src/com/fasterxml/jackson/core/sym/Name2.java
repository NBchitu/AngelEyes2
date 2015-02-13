package com.fasterxml.jackson.core.sym;

public final class Name2
  extends Name
{
  final int c;
  final int d;
  
  Name2(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramString, paramInt1);
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public boolean a(int paramInt)
  {
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.c) && (paramInt2 == this.d);
  }
  
  public boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 2) && (paramArrayOfInt[0] == this.c) && (paramArrayOfInt[1] == this.d);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.Name2
 * JD-Core Version:    0.7.0.1
 */