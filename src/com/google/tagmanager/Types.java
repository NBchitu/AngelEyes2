package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Builder;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Types
{
  private static final Object a = null;
  private static Long b = new Long(0L);
  private static Double c = new Double(0.0D);
  private static TypedNumber d = TypedNumber.a(0L);
  private static String e = new String("");
  private static Boolean f = new Boolean(false);
  private static List<Object> g = new ArrayList(0);
  private static Map<Object, Object> h = new HashMap();
  private static TypeSystem.Value i = e(e);
  
  public static TypeSystem.Value a(String paramString)
  {
    return TypeSystem.Value.J().a(TypeSystem.Value.Type.e).c(paramString).c();
  }
  
  public static Long a()
  {
    return b;
  }
  
  public static String a(TypeSystem.Value paramValue)
  {
    return a(e(paramValue));
  }
  
  public static String a(Object paramObject)
  {
    if (paramObject == null) {
      return e;
    }
    return paramObject.toString();
  }
  
  public static TypedNumber b()
  {
    return d;
  }
  
  public static TypedNumber b(TypeSystem.Value paramValue)
  {
    return b(e(paramValue));
  }
  
  public static TypedNumber b(Object paramObject)
  {
    if ((paramObject instanceof TypedNumber)) {
      return (TypedNumber)paramObject;
    }
    if (h(paramObject)) {
      return TypedNumber.a(i(paramObject));
    }
    if (f(paramObject)) {
      return TypedNumber.a(Double.valueOf(g(paramObject)));
    }
    return b(a(paramObject));
  }
  
  private static TypedNumber b(String paramString)
  {
    try
    {
      TypedNumber localTypedNumber = TypedNumber.a(paramString);
      return localTypedNumber;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Log.a("Failed to convert '" + paramString + "' to a number.");
    }
    return d;
  }
  
  public static Long c(TypeSystem.Value paramValue)
  {
    return c(e(paramValue));
  }
  
  public static Long c(Object paramObject)
  {
    if (h(paramObject)) {
      return Long.valueOf(i(paramObject));
    }
    return c(a(paramObject));
  }
  
  private static Long c(String paramString)
  {
    TypedNumber localTypedNumber = b(paramString);
    if (localTypedNumber == d) {
      return b;
    }
    return Long.valueOf(localTypedNumber.longValue());
  }
  
  public static String c()
  {
    return e;
  }
  
  public static TypeSystem.Value d()
  {
    return i;
  }
  
  public static Boolean d(TypeSystem.Value paramValue)
  {
    return d(e(paramValue));
  }
  
  public static Boolean d(Object paramObject)
  {
    if ((paramObject instanceof Boolean)) {
      return (Boolean)paramObject;
    }
    return d(a(paramObject));
  }
  
  private static Boolean d(String paramString)
  {
    if ("true".equalsIgnoreCase(paramString)) {
      return Boolean.TRUE;
    }
    if ("false".equalsIgnoreCase(paramString)) {
      return Boolean.FALSE;
    }
    return f;
  }
  
  public static TypeSystem.Value e(Object paramObject)
  {
    int j = 0;
    TypeSystem.Value.Builder localBuilder = TypeSystem.Value.J();
    if ((paramObject instanceof TypeSystem.Value)) {
      return (TypeSystem.Value)paramObject;
    }
    if ((paramObject instanceof String)) {
      localBuilder.a(TypeSystem.Value.Type.a).a((String)paramObject);
    }
    for (;;)
    {
      if (j != 0) {
        localBuilder.b(true);
      }
      return localBuilder.c();
      if ((paramObject instanceof List))
      {
        localBuilder.a(TypeSystem.Value.Type.b);
        Iterator localIterator2 = ((List)paramObject).iterator();
        int n = 0;
        if (localIterator2.hasNext())
        {
          TypeSystem.Value localValue3 = e(localIterator2.next());
          if (localValue3 == i) {
            return i;
          }
          if ((n != 0) || (localValue3.I())) {}
          for (n = 1;; n = 0)
          {
            localBuilder.b(localValue3);
            break;
          }
        }
        j = n;
      }
      else if ((paramObject instanceof Map))
      {
        localBuilder.a(TypeSystem.Value.Type.c);
        Iterator localIterator1 = ((Map)paramObject).entrySet().iterator();
        int k = 0;
        if (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          TypeSystem.Value localValue1 = e(localEntry.getKey());
          TypeSystem.Value localValue2 = e(localEntry.getValue());
          if ((localValue1 == i) || (localValue2 == i)) {
            return i;
          }
          if ((k != 0) || (localValue1.I()) || (localValue2.I())) {}
          for (int m = 1;; m = 0)
          {
            localBuilder.c(localValue1);
            localBuilder.d(localValue2);
            k = m;
            break;
          }
        }
        j = k;
      }
      else if (f(paramObject))
      {
        localBuilder.a(TypeSystem.Value.Type.a).a(paramObject.toString());
        j = 0;
      }
      else if (h(paramObject))
      {
        localBuilder.a(TypeSystem.Value.Type.f).a(i(paramObject));
        j = 0;
      }
      else
      {
        if (!(paramObject instanceof Boolean)) {
          break;
        }
        localBuilder.a(TypeSystem.Value.Type.h).a(((Boolean)paramObject).booleanValue());
        j = 0;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder().append("Converting to Value from unknown object type: ");
    if (paramObject == null) {}
    for (String str = "null";; str = paramObject.getClass().toString())
    {
      Log.a(str);
      return i;
    }
  }
  
  public static Object e(TypeSystem.Value paramValue)
  {
    if (paramValue == null) {
      return a;
    }
    switch (Types.1.a[paramValue.e().ordinal()])
    {
    default: 
      Log.a("Failed to convert a value of type: " + paramValue.e());
      return a;
    case 1: 
      return paramValue.g();
    case 2: 
      ArrayList localArrayList = new ArrayList(paramValue.l());
      Iterator localIterator2 = paramValue.i().iterator();
      while (localIterator2.hasNext())
      {
        Object localObject3 = e((TypeSystem.Value)localIterator2.next());
        if (localObject3 == a) {
          return a;
        }
        localArrayList.add(localObject3);
      }
      return localArrayList;
    case 3: 
      if (paramValue.n() != paramValue.s())
      {
        Log.a("Converting an invalid value to object: " + paramValue.toString());
        return a;
      }
      HashMap localHashMap = new HashMap(paramValue.s());
      for (int j = 0; j < paramValue.n(); j++)
      {
        Object localObject1 = e(paramValue.b(j));
        Object localObject2 = e(paramValue.c(j));
        if ((localObject1 == a) || (localObject2 == a)) {
          return a;
        }
        localHashMap.put(localObject1, localObject2);
      }
      return localHashMap;
    case 4: 
      Log.a("Trying to convert a macro reference to object");
      return a;
    case 5: 
      Log.a("Trying to convert a function id to object");
      return a;
    case 6: 
      return Long.valueOf(paramValue.A());
    case 7: 
      StringBuffer localStringBuffer = new StringBuffer();
      Iterator localIterator1 = paramValue.D().iterator();
      while (localIterator1.hasNext())
      {
        String str = a((TypeSystem.Value)localIterator1.next());
        if (str == e) {
          return a;
        }
        localStringBuffer.append(str);
      }
      return localStringBuffer.toString();
    }
    return Boolean.valueOf(paramValue.C());
  }
  
  private static boolean f(Object paramObject)
  {
    return ((paramObject instanceof Double)) || ((paramObject instanceof Float)) || (((paramObject instanceof TypedNumber)) && (((TypedNumber)paramObject).a()));
  }
  
  private static double g(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).doubleValue();
    }
    Log.a("getDouble received non-Number");
    return 0.0D;
  }
  
  private static boolean h(Object paramObject)
  {
    return ((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof TypedNumber)) && (((TypedNumber)paramObject).b()));
  }
  
  private static long i(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).longValue();
    }
    Log.a("getInt64 received non-Number");
    return 0L;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Types
 * JD-Core Version:    0.7.0.1
 */