package com.fasterxml.jackson.core.sym;

public final class NameN
  extends Name
{
  final int[] c;
  final int d;
  
  NameN(String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    super(paramString, paramInt1);
    if (paramInt2 < 3) {
      throw new IllegalArgumentException("Qlen must >= 3");
    }
    this.c = paramArrayOfInt;
    this.d = paramInt2;
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
    if (paramInt != this.d) {
      return false;
    }
    for (int i = 0;; i++)
    {
      if (i >= paramInt) {
        break label35;
      }
      if (paramArrayOfInt[i] != this.c[i]) {
        break;
      }
    }
    label35:
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.NameN
 * JD-Core Version:    0.7.0.1
 */