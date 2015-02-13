package com.fasterxml.jackson.core.sym;

final class BytesToNameCanonicalizer$Bucket
{
  protected final Name a;
  protected final Bucket b;
  private final int c;
  
  BytesToNameCanonicalizer$Bucket(Name paramName, Bucket paramBucket)
  {
    this.a = paramName;
    this.b = paramBucket;
    if (paramBucket == null) {}
    for (int i = 1;; i = 1 + paramBucket.c)
    {
      this.c = i;
      return;
    }
  }
  
  public int a()
  {
    return this.c;
  }
  
  public Name a(int paramInt1, int paramInt2, int paramInt3)
  {
    Name localName;
    if ((this.a.hashCode() == paramInt1) && (this.a.a(paramInt2, paramInt3)))
    {
      localName = this.a;
      return localName;
    }
    for (Bucket localBucket = this.b;; localBucket = localBucket.b)
    {
      if (localBucket == null) {
        break label79;
      }
      localName = localBucket.a;
      if ((localName.hashCode() == paramInt1) && (localName.a(paramInt2, paramInt3))) {
        break;
      }
    }
    label79:
    return null;
  }
  
  public Name a(int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Name localName;
    if ((this.a.hashCode() == paramInt1) && (this.a.a(paramArrayOfInt, paramInt2)))
    {
      localName = this.a;
      return localName;
    }
    for (Bucket localBucket = this.b;; localBucket = localBucket.b)
    {
      if (localBucket == null) {
        break label79;
      }
      localName = localBucket.a;
      if ((localName.hashCode() == paramInt1) && (localName.a(paramArrayOfInt, paramInt2))) {
        break;
      }
    }
    label79:
    return null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.Bucket
 * JD-Core Version:    0.7.0.1
 */