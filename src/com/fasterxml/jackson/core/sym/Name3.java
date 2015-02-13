package com.fasterxml.jackson.core.sym;

public final class Name3
  extends Name
{
  final int c;
  final int d;
  final int e;
  
  Name3(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramString, paramInt1);
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }
  
  public boolean a(int paramInt)
  {
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 3) && (paramArrayOfInt[0] == this.c) && (paramArrayOfInt[1] == this.d) && (paramArrayOfInt[2] == this.e);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.Name3
 * JD-Core Version:    0.7.0.1
 */