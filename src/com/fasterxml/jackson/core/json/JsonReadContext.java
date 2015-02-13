package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.CharTypes;

public final class JsonReadContext
  extends JsonStreamContext
{
  protected final JsonReadContext c;
  protected int d;
  protected int e;
  protected String f;
  protected JsonReadContext g = null;
  
  public JsonReadContext(JsonReadContext paramJsonReadContext, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.c = paramJsonReadContext;
    this.d = paramInt2;
    this.e = paramInt3;
    this.b = -1;
  }
  
  public static JsonReadContext g()
  {
    return new JsonReadContext(null, 0, 1, 0);
  }
  
  public final JsonLocation a(Object paramObject)
  {
    return new JsonLocation(paramObject, -1L, this.d, this.e);
  }
  
  public final JsonReadContext a(int paramInt1, int paramInt2)
  {
    JsonReadContext localJsonReadContext1 = this.g;
    if (localJsonReadContext1 == null)
    {
      JsonReadContext localJsonReadContext2 = new JsonReadContext(this, 1, paramInt1, paramInt2);
      this.g = localJsonReadContext2;
      return localJsonReadContext2;
    }
    localJsonReadContext1.a(1, paramInt1, paramInt2);
    return localJsonReadContext1;
  }
  
  protected final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = -1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = null;
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public final JsonReadContext b(int paramInt1, int paramInt2)
  {
    JsonReadContext localJsonReadContext1 = this.g;
    if (localJsonReadContext1 == null)
    {
      JsonReadContext localJsonReadContext2 = new JsonReadContext(this, 2, paramInt1, paramInt2);
      this.g = localJsonReadContext2;
      return localJsonReadContext2;
    }
    localJsonReadContext1.a(2, paramInt1, paramInt2);
    return localJsonReadContext1;
  }
  
  public final String h()
  {
    return this.f;
  }
  
  public final JsonReadContext i()
  {
    return this.c;
  }
  
  public final boolean j()
  {
    int i = 1 + this.b;
    this.b = i;
    return (this.a != 0) && (i > 0);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    switch (this.a)
    {
    default: 
    case 0: 
    case 1: 
      for (;;)
      {
        return localStringBuilder.toString();
        localStringBuilder.append("/");
        continue;
        localStringBuilder.append('[');
        localStringBuilder.append(f());
        localStringBuilder.append(']');
      }
    }
    localStringBuilder.append('{');
    if (this.f != null)
    {
      localStringBuilder.append('"');
      CharTypes.a(localStringBuilder, this.f);
      localStringBuilder.append('"');
    }
    for (;;)
    {
      localStringBuilder.append('}');
      break;
      localStringBuilder.append('?');
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.json.JsonReadContext
 * JD-Core Version:    0.7.0.1
 */