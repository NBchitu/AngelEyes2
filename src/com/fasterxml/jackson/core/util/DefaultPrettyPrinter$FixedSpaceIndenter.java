package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;

public class DefaultPrettyPrinter$FixedSpaceIndenter
  implements DefaultPrettyPrinter.Indenter
{
  public void a(JsonGenerator paramJsonGenerator, int paramInt)
  {
    paramJsonGenerator.a(' ');
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter
 * JD-Core Version:    0.7.0.1
 */