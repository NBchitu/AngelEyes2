package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer
{
  public static final Object a = new Object();
  static final String[] b = "gtm.lifetime".toString().split("\\.");
  private static final Pattern c = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap<DataLayer.b, Integer> d;
  private final Map<String, Object> e;
  private final ReentrantLock f;
  private final LinkedList<Map<String, Object>> g;
  private final DataLayer.c h;
  private final CountDownLatch i;
  
  DataLayer()
  {
    this(new DataLayer.1());
  }
  
  DataLayer(DataLayer.c paramc)
  {
    this.h = paramc;
    this.d = new ConcurrentHashMap();
    this.e = new HashMap();
    this.f = new ReentrantLock();
    this.g = new LinkedList();
    this.i = new CountDownLatch(1);
    a();
  }
  
  static Long a(String paramString)
  {
    Matcher localMatcher = c.matcher(paramString);
    if (!localMatcher.matches())
    {
      bh.c("unknown _lifetime: " + paramString);
      return null;
    }
    long l1;
    try
    {
      long l2 = Long.parseLong(localMatcher.group(1));
      l1 = l2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        bh.b("illegal number in _lifetime value: " + paramString);
        l1 = 0L;
      }
      String str = localMatcher.group(2);
      if (str.length() != 0) {
        break label130;
      }
      return Long.valueOf(l1);
      switch (str.charAt(0))
      {
      default: 
        bh.b("unknown units in _lifetime: " + paramString);
        return null;
      }
    }
    if (l1 <= 0L)
    {
      bh.c("non-positive _lifetime: " + paramString);
      return null;
    }
    label130:
    return Long.valueOf(l1 * 1000L);
    return Long.valueOf(60L * (l1 * 1000L));
    return Long.valueOf(60L * (60L * (l1 * 1000L)));
    return Long.valueOf(24L * (60L * (60L * (l1 * 1000L))));
  }
  
  private void a()
  {
    this.h.a(new DataLayer.2(this));
  }
  
  private void a(Map<String, Object> paramMap, String paramString, Collection<DataLayer.a> paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder().append(paramString);
      if (paramString.length() == 0) {}
      String str2;
      for (String str1 = "";; str1 = ".")
      {
        str2 = str1 + (String)localEntry.getKey();
        if (!(localEntry.getValue() instanceof Map)) {
          break label124;
        }
        a((Map)localEntry.getValue(), str2, paramCollection);
        break;
      }
      label124:
      if (!str2.equals("gtm.lifetime")) {
        paramCollection.add(new DataLayer.a(str2, localEntry.getValue()));
      }
    }
  }
  
  private void b()
  {
    int k;
    for (int j = 0;; j = k)
    {
      Map localMap = (Map)this.g.poll();
      if (localMap != null)
      {
        g(localMap);
        k = j + 1;
        if (k > 500)
        {
          this.g.clear();
          throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
        }
      }
      else
      {
        return;
      }
    }
  }
  
  private void b(Map<String, Object> paramMap)
  {
    this.f.lock();
    try
    {
      this.g.offer(paramMap);
      if (this.f.getHoldCount() == 1) {
        b();
      }
      c(paramMap);
      return;
    }
    finally
    {
      this.f.unlock();
    }
  }
  
  private void c(Map<String, Object> paramMap)
  {
    Long localLong = d(paramMap);
    if (localLong == null) {
      return;
    }
    List localList = f(paramMap);
    localList.remove("gtm.lifetime");
    this.h.a(localList, localLong.longValue());
  }
  
  private Long d(Map<String, Object> paramMap)
  {
    Object localObject = e(paramMap);
    if (localObject == null) {
      return null;
    }
    return a(localObject.toString());
  }
  
  private Object e(Map<String, Object> paramMap)
  {
    String[] arrayOfString = b;
    int j = arrayOfString.length;
    int k = 0;
    Object localObject2;
    for (Object localObject1 = paramMap;; localObject1 = localObject2)
    {
      String str;
      if (k < j)
      {
        str = arrayOfString[k];
        if (!(localObject1 instanceof Map)) {
          localObject1 = null;
        }
      }
      else
      {
        return localObject1;
      }
      localObject2 = ((Map)localObject1).get(str);
      k++;
    }
  }
  
  private List<DataLayer.a> f(Map<String, Object> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    a(paramMap, "", localArrayList);
    return localArrayList;
  }
  
  private void g(Map<String, Object> paramMap)
  {
    synchronized (this.e)
    {
      Iterator localIterator = paramMap.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(a(str, paramMap.get(str)), this.e);
      }
    }
    h(paramMap);
  }
  
  private void h(Map<String, Object> paramMap)
  {
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext()) {
      ((DataLayer.b)localIterator.next()).a(paramMap);
    }
  }
  
  Map<String, Object> a(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int j = 0;
    HashMap localHashMap2;
    for (Object localObject = localHashMap1; j < -1 + arrayOfString.length; localObject = localHashMap2)
    {
      localHashMap2 = new HashMap();
      ((Map)localObject).put(arrayOfString[j], localHashMap2);
      j++;
    }
    ((Map)localObject).put(arrayOfString[(-1 + arrayOfString.length)], paramObject);
    return localHashMap1;
  }
  
  void a(DataLayer.b paramb)
  {
    this.d.put(paramb, Integer.valueOf(0));
  }
  
  void a(List<Object> paramList1, List<Object> paramList2)
  {
    while (paramList2.size() < paramList1.size()) {
      paramList2.add(null);
    }
    int j = 0;
    if (j < paramList1.size())
    {
      Object localObject = paramList1.get(j);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(j) instanceof List)) {
          paramList2.set(j, new ArrayList());
        }
        a((List)localObject, (List)paramList2.get(j));
      }
      for (;;)
      {
        j++;
        break;
        if ((localObject instanceof Map))
        {
          if (!(paramList2.get(j) instanceof Map)) {
            paramList2.set(j, new HashMap());
          }
          a((Map)localObject, (Map)paramList2.get(j));
        }
        else if (localObject != a)
        {
          paramList2.set(j, localObject);
        }
      }
    }
  }
  
  public void a(Map<String, Object> paramMap)
  {
    try
    {
      this.i.await();
      b(paramMap);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        bh.b("DataLayer.push: unexpected InterruptedException");
      }
    }
  }
  
  void a(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List)) {
          paramMap2.put(str, new ArrayList());
        }
        a((List)localObject, (List)paramMap2.get(str));
      }
      else if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map)) {
          paramMap2.put(str, new HashMap());
        }
        a((Map)localObject, (Map)paramMap2.get(str));
      }
      else
      {
        paramMap2.put(str, localObject);
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder;
    synchronized (this.e)
    {
      localStringBuilder = new StringBuilder();
      Iterator localIterator = this.e.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localEntry.getKey();
        arrayOfObject[1] = localEntry.getValue();
        localStringBuilder.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", arrayOfObject));
      }
    }
    String str = localStringBuilder.toString();
    return str;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.DataLayer
 * JD-Core Version:    0.7.0.1
 */