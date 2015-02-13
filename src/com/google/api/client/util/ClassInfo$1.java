package com.google.api.client.util;

import java.util.Comparator;

class ClassInfo$1
  implements Comparator<String>
{
  ClassInfo$1(ClassInfo paramClassInfo) {}
  
  public int a(String paramString1, String paramString2)
  {
    if (paramString1 == paramString2) {
      return 0;
    }
    if (paramString1 == null) {
      return -1;
    }
    if (paramString2 == null) {
      return 1;
    }
    return paramString1.compareTo(paramString2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ClassInfo.1
 * JD-Core Version:    0.7.0.1
 */