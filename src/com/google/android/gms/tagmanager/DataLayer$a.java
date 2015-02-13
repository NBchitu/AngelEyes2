package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class DataLayer$a
{
  public final String a;
  public final Object b;
  
  DataLayer$a(String paramString, Object paramObject)
  {
    this.a = paramString;
    this.b = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {}
    a locala;
    do
    {
      return false;
      locala = (a)paramObject;
    } while ((!this.a.equals(locala.a)) || (!this.b.equals(locala.b)));
    return true;
  }
  
  public int hashCode()
  {
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(this.a.hashCode());
    arrayOfInteger[1] = Integer.valueOf(this.b.hashCode());
    return Arrays.hashCode(arrayOfInteger);
  }
  
  public String toString()
  {
    return "Key: " + this.a + " value: " + this.b.toString();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.DataLayer.a
 * JD-Core Version:    0.7.0.1
 */