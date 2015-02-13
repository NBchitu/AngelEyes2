package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;

public class DefaultPrettyPrinter
  implements PrettyPrinter
{
  protected DefaultPrettyPrinter.Indenter a = new DefaultPrettyPrinter.FixedSpaceIndenter();
  protected DefaultPrettyPrinter.Indenter b = new DefaultPrettyPrinter.Lf2SpacesIndenter();
  protected boolean c = true;
  protected int d = 0;
  
  public void a(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.a(' ');
  }
  
  public void a(JsonGenerator paramJsonGenerator, int paramInt)
  {
    if (!this.b.a()) {
      this.d = (-1 + this.d);
    }
    if (paramInt > 0) {
      this.b.a(paramJsonGenerator, this.d);
    }
    for (;;)
    {
      paramJsonGenerator.a('}');
      return;
      paramJsonGenerator.a(' ');
    }
  }
  
  public void b(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.a('{');
    if (!this.b.a()) {
      this.d = (1 + this.d);
    }
  }
  
  public void b(JsonGenerator paramJsonGenerator, int paramInt)
  {
    if (!this.a.a()) {
      this.d = (-1 + this.d);
    }
    if (paramInt > 0) {
      this.a.a(paramJsonGenerator, this.d);
    }
    for (;;)
    {
      paramJsonGenerator.a(']');
      return;
      paramJsonGenerator.a(' ');
    }
  }
  
  public void c(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.a(',');
    this.b.a(paramJsonGenerator, this.d);
  }
  
  public void d(JsonGenerator paramJsonGenerator)
  {
    if (this.c)
    {
      paramJsonGenerator.c(" : ");
      return;
    }
    paramJsonGenerator.a(':');
  }
  
  public void e(JsonGenerator paramJsonGenerator)
  {
    if (!this.a.a()) {
      this.d = (1 + this.d);
    }
    paramJsonGenerator.a('[');
  }
  
  public void f(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.a(',');
    this.a.a(paramJsonGenerator, this.d);
  }
  
  public void g(JsonGenerator paramJsonGenerator)
  {
    this.a.a(paramJsonGenerator, this.d);
  }
  
  public void h(JsonGenerator paramJsonGenerator)
  {
    this.b.a(paramJsonGenerator, this.d);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.util.DefaultPrettyPrinter
 * JD-Core Version:    0.7.0.1
 */