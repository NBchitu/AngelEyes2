package com.fasterxml.jackson.core;

public enum JsonToken
{
  final String n;
  final char[] o;
  final byte[] p;
  
  static
  {
    JsonToken[] arrayOfJsonToken = new JsonToken[13];
    arrayOfJsonToken[0] = a;
    arrayOfJsonToken[1] = b;
    arrayOfJsonToken[2] = c;
    arrayOfJsonToken[3] = d;
    arrayOfJsonToken[4] = e;
    arrayOfJsonToken[5] = f;
    arrayOfJsonToken[6] = g;
    arrayOfJsonToken[7] = h;
    arrayOfJsonToken[8] = i;
    arrayOfJsonToken[9] = j;
    arrayOfJsonToken[10] = k;
    arrayOfJsonToken[11] = l;
    arrayOfJsonToken[12] = m;
    q = arrayOfJsonToken;
  }
  
  private JsonToken(String paramString)
  {
    if (paramString == null)
    {
      this.n = null;
      this.o = null;
      this.p = null;
    }
    for (;;)
    {
      return;
      this.n = paramString;
      this.o = paramString.toCharArray();
      int i2 = this.o.length;
      this.p = new byte[i2];
      for (int i3 = 0; i3 < i2; i3++) {
        this.p[i3] = ((byte)this.o[i3]);
      }
    }
  }
  
  public String a()
  {
    return this.n;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonToken
 * JD-Core Version:    0.7.0.1
 */