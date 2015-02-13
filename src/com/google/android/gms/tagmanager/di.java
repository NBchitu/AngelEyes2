package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class di
{
  private static final Object a = null;
  private static Long b = new Long(0L);
  private static Double c = new Double(0.0D);
  private static dh d = dh.a(0L);
  private static String e = new String("");
  private static Boolean f = new Boolean(false);
  private static List<Object> g = new ArrayList(0);
  private static Map<Object, Object> h = new HashMap();
  private static d.a i = c(e);
  
  public static d.a a()
  {
    return i;
  }
  
  private static Boolean a(String paramString)
  {
    if ("true".equalsIgnoreCase(paramString)) {
      return Boolean.TRUE;
    }
    if ("false".equalsIgnoreCase(paramString)) {
      return Boolean.FALSE;
    }
    return f;
  }
  
  public static String a(d.a parama)
  {
    return a(c(parama));
  }
  
  public static String a(Object paramObject)
  {
    if (paramObject == null) {
      return e;
    }
    return paramObject.toString();
  }
  
  public static Boolean b(d.a parama)
  {
    return b(c(parama));
  }
  
  public static Boolean b(Object paramObject)
  {
    if ((paramObject instanceof Boolean)) {
      return (Boolean)paramObject;
    }
    return a(a(paramObject));
  }
  
  public static d.a c(Object paramObject)
  {
    boolean bool1 = false;
    d.a locala1 = new d.a();
    if ((paramObject instanceof d.a)) {
      return (d.a)paramObject;
    }
    if ((paramObject instanceof String))
    {
      locala1.a = 1;
      locala1.b = ((String)paramObject);
    }
    for (;;)
    {
      locala1.l = bool1;
      return locala1;
      if ((paramObject instanceof List))
      {
        locala1.a = 2;
        List localList = (List)paramObject;
        ArrayList localArrayList3 = new ArrayList(localList.size());
        Iterator localIterator2 = localList.iterator();
        boolean bool4 = false;
        if (localIterator2.hasNext())
        {
          d.a locala4 = c(localIterator2.next());
          if (locala4 == i) {
            return i;
          }
          if ((bool4) || (locala4.l)) {}
          for (boolean bool5 = true;; bool5 = false)
          {
            localArrayList3.add(locala4);
            bool4 = bool5;
            break;
          }
        }
        locala1.c = ((d.a[])localArrayList3.toArray(new d.a[0]));
        bool1 = bool4;
      }
      else if ((paramObject instanceof Map))
      {
        locala1.a = 3;
        Set localSet = ((Map)paramObject).entrySet();
        ArrayList localArrayList1 = new ArrayList(localSet.size());
        ArrayList localArrayList2 = new ArrayList(localSet.size());
        Iterator localIterator1 = localSet.iterator();
        boolean bool2 = false;
        if (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          d.a locala2 = c(localEntry.getKey());
          d.a locala3 = c(localEntry.getValue());
          if ((locala2 == i) || (locala3 == i)) {
            return i;
          }
          if ((bool2) || (locala2.l) || (locala3.l)) {}
          for (boolean bool3 = true;; bool3 = false)
          {
            localArrayList1.add(locala2);
            localArrayList2.add(locala3);
            bool2 = bool3;
            break;
          }
        }
        locala1.d = ((d.a[])localArrayList1.toArray(new d.a[0]));
        locala1.e = ((d.a[])localArrayList2.toArray(new d.a[0]));
        bool1 = bool2;
      }
      else if (d(paramObject))
      {
        locala1.a = 1;
        locala1.b = paramObject.toString();
        bool1 = false;
      }
      else if (e(paramObject))
      {
        locala1.a = 6;
        locala1.h = f(paramObject);
        bool1 = false;
      }
      else
      {
        if (!(paramObject instanceof Boolean)) {
          break;
        }
        locala1.a = 8;
        locala1.i = ((Boolean)paramObject).booleanValue();
        bool1 = false;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder().append("Converting to Value from unknown object type: ");
    if (paramObject == null) {}
    for (String str = "null";; str = paramObject.getClass().toString())
    {
      bh.a(str);
      return i;
    }
  }
  
  public static Object c(d.a parama)
  {
    int j = 0;
    if (parama == null) {
      return a;
    }
    switch (parama.a)
    {
    default: 
      bh.a("Failed to convert a value of type: " + parama.a);
      return a;
    case 1: 
      return parama.b;
    case 2: 
      ArrayList localArrayList = new ArrayList(parama.c.length);
      d.a[] arrayOfa2 = parama.c;
      int m = arrayOfa2.length;
      while (j < m)
      {
        Object localObject3 = c(arrayOfa2[j]);
        if (localObject3 == a) {
          return a;
        }
        localArrayList.add(localObject3);
        j++;
      }
      return localArrayList;
    case 3: 
      if (parama.d.length != parama.e.length)
      {
        bh.a("Converting an invalid value to object: " + parama.toString());
        return a;
      }
      HashMap localHashMap = new HashMap(parama.e.length);
      while (j < parama.d.length)
      {
        Object localObject1 = c(parama.d[j]);
        Object localObject2 = c(parama.e[j]);
        if ((localObject1 == a) || (localObject2 == a)) {
          return a;
        }
        localHashMap.put(localObject1, localObject2);
        j++;
      }
      return localHashMap;
    case 4: 
      bh.a("Trying to convert a macro reference to object");
      return a;
    case 5: 
      bh.a("Trying to convert a function id to object");
      return a;
    case 6: 
      return Long.valueOf(parama.h);
    case 7: 
      StringBuffer localStringBuffer = new StringBuffer();
      d.a[] arrayOfa1 = parama.j;
      int k = arrayOfa1.length;
      while (j < k)
      {
        String str = a(arrayOfa1[j]);
        if (str == e) {
          return a;
        }
        localStringBuffer.append(str);
        j++;
      }
      return localStringBuffer.toString();
    }
    return Boolean.valueOf(parama.i);
  }
  
  private static boolean d(Object paramObject)
  {
    return ((paramObject instanceof Double)) || ((paramObject instanceof Float)) || (((paramObject instanceof dh)) && (((dh)paramObject).a()));
  }
  
  private static boolean e(Object paramObject)
  {
    return ((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof dh)) && (((dh)paramObject).b()));
  }
  
  private static long f(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).longValue();
    }
    bh.a("getInt64 received non-Number");
    return 0L;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.di
 * JD-Core Version:    0.7.0.1
 */