package com.google.android.gms.internal;

public final class jc$a
{
  public final int a;
  public final int b;
  
  public jc$a(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof a)) {
      bool = false;
    }
    a locala;
    do
    {
      do
      {
        return bool;
      } while (this == paramObject);
      locala = (a)paramObject;
    } while ((locala.a == this.a) && (locala.b == this.b));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    return jv.a(arrayOfObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jc.a
 * JD-Core Version:    0.7.0.1
 */