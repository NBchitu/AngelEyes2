package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonWriteContext
  extends JsonStreamContext
{
  protected final JsonWriteContext c;
  protected String d;
  protected JsonWriteContext e = null;
  
  protected JsonWriteContext(int paramInt, JsonWriteContext paramJsonWriteContext)
  {
    this.a = paramInt;
    this.c = paramJsonWriteContext;
    this.b = -1;
  }
  
  private final JsonWriteContext a(int paramInt)
  {
    this.a = paramInt;
    this.b = -1;
    this.d = null;
    return this;
  }
  
  public static JsonWriteContext g()
  {
    return new JsonWriteContext(0, null);
  }
  
  public final int a(String paramString)
  {
    if ((this.a != 2) || (this.d != null)) {
      return 4;
    }
    this.d = paramString;
    if (this.b < 0) {
      return 0;
    }
    return 1;
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    if (this.a == 2)
    {
      paramStringBuilder.append('{');
      if (this.d != null)
      {
        paramStringBuilder.append('"');
        paramStringBuilder.append(this.d);
        paramStringBuilder.append('"');
      }
      for (;;)
      {
        paramStringBuilder.append('}');
        return;
        paramStringBuilder.append('?');
      }
    }
    if (this.a == 1)
    {
      paramStringBuilder.append('[');
      paramStringBuilder.append(f());
      paramStringBuilder.append(']');
      return;
    }
    paramStringBuilder.append("/");
  }
  
  public final JsonWriteContext h()
  {
    JsonWriteContext localJsonWriteContext1 = this.e;
    if (localJsonWriteContext1 == null)
    {
      JsonWriteContext localJsonWriteContext2 = new JsonWriteContext(1, this);
      this.e = localJsonWriteContext2;
      return localJsonWriteContext2;
    }
    return localJsonWriteContext1.a(1);
  }
  
  public final JsonWriteContext i()
  {
    JsonWriteContext localJsonWriteContext1 = this.e;
    if (localJsonWriteContext1 == null)
    {
      JsonWriteContext localJsonWriteContext2 = new JsonWriteContext(2, this);
      this.e = localJsonWriteContext2;
      return localJsonWriteContext2;
    }
    return localJsonWriteContext1.a(2);
  }
  
  public final JsonWriteContext j()
  {
    return this.c;
  }
  
  public final int k()
  {
    int j;
    if (this.a == 2) {
      if (this.d == null) {
        j = 5;
      }
    }
    int i;
    do
    {
      int k;
      do
      {
        return j;
        this.d = null;
        this.b = (1 + this.b);
        return 2;
        if (this.a != 1) {
          break;
        }
        k = this.b;
        this.b = (1 + this.b);
        j = 0;
      } while (k < 0);
      return 1;
      this.b = (1 + this.b);
      i = this.b;
      j = 0;
    } while (i == 0);
    return 3;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    a(localStringBuilder);
    return localStringBuilder.toString();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.json.JsonWriteContext
 * JD-Core Version:    0.7.0.1
 */