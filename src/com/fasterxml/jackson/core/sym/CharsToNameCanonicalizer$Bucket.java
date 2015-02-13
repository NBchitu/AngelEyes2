package com.fasterxml.jackson.core.sym;

final class CharsToNameCanonicalizer$Bucket
{
  private final String a;
  private final Bucket b;
  private final int c;
  
  public CharsToNameCanonicalizer$Bucket(String paramString, Bucket paramBucket)
  {
    this.a = paramString;
    this.b = paramBucket;
    if (paramBucket == null) {}
    for (int i = 1;; i = 1 + paramBucket.c)
    {
      this.c = i;
      return;
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str = this.a;
    for (Bucket localBucket = this.b;; localBucket = localBucket.b())
    {
      if (str.length() == paramInt2)
      {
        int i = 0;
        if (str.charAt(i) != paramArrayOfChar[(paramInt1 + i)]) {}
        for (;;)
        {
          if (i != paramInt2) {
            break label61;
          }
          return str;
          i++;
          if (i < paramInt2) {
            break;
          }
        }
      }
      label61:
      if (localBucket == null) {
        return null;
      }
      str = localBucket.a();
    }
  }
  
  public Bucket b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.Bucket
 * JD-Core Version:    0.7.0.1
 */