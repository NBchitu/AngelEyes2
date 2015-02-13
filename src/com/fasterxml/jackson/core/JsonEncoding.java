package com.fasterxml.jackson.core;

public enum JsonEncoding
{
  protected final String f;
  protected final boolean g;
  
  static
  {
    JsonEncoding[] arrayOfJsonEncoding = new JsonEncoding[5];
    arrayOfJsonEncoding[0] = a;
    arrayOfJsonEncoding[1] = b;
    arrayOfJsonEncoding[2] = c;
    arrayOfJsonEncoding[3] = d;
    arrayOfJsonEncoding[4] = e;
    h = arrayOfJsonEncoding;
  }
  
  private JsonEncoding(String paramString, boolean paramBoolean)
  {
    this.f = paramString;
    this.g = paramBoolean;
  }
  
  public String a()
  {
    return this.f;
  }
  
  public boolean b()
  {
    return this.g;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonEncoding
 * JD-Core Version:    0.7.0.1
 */