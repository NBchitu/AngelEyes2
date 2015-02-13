package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class kr
{
  private void a(StringBuilder paramStringBuilder, kr.a parama, Object paramObject)
  {
    if (parama.b() == 11)
    {
      paramStringBuilder.append(((kr)parama.h().cast(paramObject)).toString());
      return;
    }
    if (parama.b() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(li.a((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private void a(StringBuilder paramStringBuilder, kr.a parama, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0) {
        paramStringBuilder.append(",");
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        a(paramStringBuilder, parama, localObject);
      }
      i++;
    }
    paramStringBuilder.append("]");
  }
  
  protected <O, I> I a(kr.a<I, O> parama, Object paramObject)
  {
    if (kr.a.a(parama) != null) {
      paramObject = parama.a(paramObject);
    }
    return paramObject;
  }
  
  protected abstract Object a(String paramString);
  
  public abstract HashMap<String, kr.a<?, ?>> a();
  
  protected boolean a(kr.a parama)
  {
    if (parama.d() == 11)
    {
      if (parama.e()) {
        return d(parama.f());
      }
      return c(parama.f());
    }
    return b(parama.f());
  }
  
  protected Object b(kr.a parama)
  {
    String str1 = parama.f();
    if (parama.h() != null)
    {
      boolean bool;
      if (a(parama.f()) == null)
      {
        bool = true;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = parama.f();
        jx.a(bool, "Concrete field shouldn't be value object: %s", arrayOfObject);
        if (!parama.e()) {
          break label79;
        }
      }
      label79:
      for (HashMap localHashMap = c();; localHashMap = b())
      {
        if (localHashMap == null) {
          break label88;
        }
        return localHashMap.get(str1);
        bool = false;
        break;
      }
      try
      {
        label88:
        String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
        Object localObject = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
        return localObject;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    return a(parama.f());
  }
  
  public HashMap<String, Object> b()
  {
    return null;
  }
  
  protected abstract boolean b(String paramString);
  
  public HashMap<String, Object> c()
  {
    return null;
  }
  
  protected boolean c(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }
  
  protected boolean d(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }
  
  public String toString()
  {
    HashMap localHashMap = a();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      kr.a locala = (kr.a)localHashMap.get(str);
      if (a(locala))
      {
        Object localObject = a(locala, b(locala));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        }
        for (;;)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null) {
            break label135;
          }
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label135:
        switch (locala.d())
        {
        default: 
          if (locala.c()) {
            a(localStringBuilder, locala, (ArrayList)localObject);
          }
          break;
        case 8: 
          localStringBuilder.append("\"").append(lb.a((byte[])localObject)).append("\"");
          break;
        case 9: 
          localStringBuilder.append("\"").append(lb.b((byte[])localObject)).append("\"");
          break;
        case 10: 
          lj.a(localStringBuilder, (HashMap)localObject);
          continue;
          a(localStringBuilder, locala, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kr
 * JD-Core Version:    0.7.0.1
 */