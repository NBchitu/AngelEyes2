package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.Arrays;

public class DefaultPrettyPrinter$Lf2SpacesIndenter
  implements DefaultPrettyPrinter.Indenter
{
  static final String a;
  static final char[] b;
  
  static
  {
    try
    {
      String str2 = System.getProperty("line.separator");
      str1 = str2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        String str1 = null;
      }
    }
    if (str1 == null) {
      str1 = "\n";
    }
    a = str1;
    b = new char[64];
    Arrays.fill(b, ' ');
  }
  
  public void a(JsonGenerator paramJsonGenerator, int paramInt)
  {
    paramJsonGenerator.c(a);
    int i = paramInt + paramInt;
    while (i > 64)
    {
      paramJsonGenerator.a(b, 0, 64);
      i -= b.length;
    }
    paramJsonGenerator.a(b, 0, i);
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter
 * JD-Core Version:    0.7.0.1
 */