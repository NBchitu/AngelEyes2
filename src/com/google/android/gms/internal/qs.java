package com.google.android.gms.internal;

class qs
{
  private static final qt a = new qt();
  private boolean b = false;
  private int[] c;
  private qt[] d;
  private int e;
  
  public qs()
  {
    this(10);
  }
  
  public qs(int paramInt)
  {
    int i = b(paramInt);
    this.c = new int[i];
    this.d = new qt[i];
    this.e = 0;
  }
  
  private boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i]) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(qt[] paramArrayOfqt1, qt[] paramArrayOfqt2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (!paramArrayOfqt1[i].equals(paramArrayOfqt2[i])) {
        return false;
      }
    }
    return true;
  }
  
  private int b(int paramInt)
  {
    return c(paramInt * 4) / 4;
  }
  
  private int c(int paramInt)
  {
    for (int i = 4;; i++) {
      if (i < 32)
      {
        if (paramInt <= -12 + (1 << i)) {
          paramInt = -12 + (1 << i);
        }
      }
      else {
        return paramInt;
      }
    }
  }
  
  private void c()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
    qt[] arrayOfqt = this.d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      qt localqt = arrayOfqt[j];
      if (localqt != a)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfqt[k] = localqt;
          arrayOfqt[j] = null;
        }
        k++;
      }
      j++;
    }
    this.b = false;
    this.e = k;
  }
  
  public int a()
  {
    if (this.b) {
      c();
    }
    return this.e;
  }
  
  public qt a(int paramInt)
  {
    if (this.b) {
      c();
    }
    return this.d[paramInt];
  }
  
  public boolean b()
  {
    return a() == 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    qs localqs;
    do
    {
      return true;
      if (!(paramObject instanceof qs)) {
        return false;
      }
      localqs = (qs)paramObject;
      if (a() != localqs.a()) {
        return false;
      }
    } while ((a(this.c, localqs.c, this.e)) && (a(this.d, localqs.d, this.e)));
    return false;
  }
  
  public int hashCode()
  {
    if (this.b) {
      c();
    }
    int i = 17;
    for (int j = 0; j < this.e; j++) {
      i = 31 * (i * 31 + this.c[j]) + this.d[j].hashCode();
    }
    return i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qs
 * JD-Core Version:    0.7.0.1
 */