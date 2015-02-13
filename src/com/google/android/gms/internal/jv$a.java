package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class jv$a
{
  private final List<String> a;
  private final Object b;
  
  private jv$a(Object paramObject)
  {
    this.b = jx.a(paramObject);
    this.a = new ArrayList();
  }
  
  public a a(String paramString, Object paramObject)
  {
    this.a.add((String)jx.a(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j < i - 1) {
        localStringBuilder.append(", ");
      }
    }
    return '}';
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jv.a
 * JD-Core Version:    0.7.0.1
 */