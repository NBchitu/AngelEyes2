package com.facebook.android;

public class DialogError
  extends Throwable
{
  private int a;
  private String b;
  
  public DialogError(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.DialogError
 * JD-Core Version:    0.7.0.1
 */