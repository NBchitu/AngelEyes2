package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public abstract class GeneratorBase
  extends JsonGenerator
{
  protected ObjectCodec b;
  protected int c;
  protected boolean d;
  protected JsonWriteContext e;
  protected boolean f;
  
  protected GeneratorBase(int paramInt, ObjectCodec paramObjectCodec)
  {
    this.c = paramInt;
    this.e = JsonWriteContext.g();
    this.b = paramObjectCodec;
    this.d = a(JsonGenerator.Feature.e);
  }
  
  public JsonGenerator a()
  {
    return a(new DefaultPrettyPrinter());
  }
  
  public final boolean a(JsonGenerator.Feature paramFeature)
  {
    return (this.c & paramFeature.c()) != 0;
  }
  
  public void close()
  {
    this.f = true;
  }
  
  protected abstract void d(String paramString);
  
  protected void e(String paramString)
  {
    throw new JsonGenerationException(paramString);
  }
  
  public final JsonWriteContext h()
  {
    return this.e;
  }
  
  protected abstract void i();
  
  protected void j()
  {
    throw new RuntimeException("Internal error: should never end up through this code path");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.base.GeneratorBase
 * JD-Core Version:    0.7.0.1
 */