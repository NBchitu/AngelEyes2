package com.google.api.client.http;

public class HttpStatusCodes
{
  public static boolean a(int paramInt)
  {
    return (paramInt >= 200) && (paramInt < 300);
  }
  
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 304: 
    case 305: 
    case 306: 
    default: 
      return false;
    }
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpStatusCodes
 * JD-Core Version:    0.7.0.1
 */