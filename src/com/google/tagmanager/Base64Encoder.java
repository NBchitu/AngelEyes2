package com.google.tagmanager;

import android.os.Build.VERSION;

class Base64Encoder
{
  static int a()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = true;
    if (a() >= 8)
    {
      int i = 2;
      if ((paramInt & 0x1) != 0) {
        i = 3;
      }
      if ((paramInt & 0x2) != 0) {
        i |= 0x8;
      }
      return android.util.Base64.encodeToString(paramArrayOfByte, i);
    }
    boolean bool2;
    if ((paramInt & 0x1) == 0)
    {
      bool2 = bool1;
      if ((paramInt & 0x2) == 0) {
        break label71;
      }
    }
    for (;;)
    {
      if (!bool1) {
        break label76;
      }
      return Base64.b(paramArrayOfByte, bool2);
      bool2 = false;
      break;
      label71:
      bool1 = false;
    }
    label76:
    return Base64.a(paramArrayOfByte, bool2);
  }
  
  public static byte[] a(String paramString, int paramInt)
  {
    if (a() >= 8)
    {
      int j = 2;
      if ((paramInt & 0x1) != 0) {
        j = 3;
      }
      if ((paramInt & 0x2) != 0) {
        j |= 0x8;
      }
      return android.util.Base64.decode(paramString, j);
    }
    if (((paramInt & 0x1) != 0) || ((paramInt & 0x2) != 0)) {}
    for (int i = 1; i != 0; i = 0) {
      return Base64.b(paramString);
    }
    return Base64.a(paramString);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Base64Encoder
 * JD-Core Version:    0.7.0.1
 */