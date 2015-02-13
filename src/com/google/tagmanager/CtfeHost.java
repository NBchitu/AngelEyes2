package com.google.tagmanager;

class CtfeHost
{
  private String a = "https://www.googletagmanager.com";
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
    Log.c("The Ctfe server endpoint was changed to: " + paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.CtfeHost
 * JD-Core Version:    0.7.0.1
 */