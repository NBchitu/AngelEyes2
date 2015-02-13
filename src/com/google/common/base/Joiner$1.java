package com.google.common.base;

class Joiner$1
  extends Joiner
{
  Joiner$1(Joiner paramJoiner1, Joiner paramJoiner2, String paramString)
  {
    super(paramJoiner2, null);
  }
  
  CharSequence a(Object paramObject)
  {
    if (paramObject == null) {
      return this.a;
    }
    return this.b.a(paramObject);
  }
  
  public Joiner b(String paramString)
  {
    Preconditions.a(paramString);
    throw new UnsupportedOperationException("already specified useForNull");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Joiner.1
 * JD-Core Version:    0.7.0.1
 */