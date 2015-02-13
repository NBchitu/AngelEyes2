package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Type;
import com.google.analytics.tracking.android.Tracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class UniversalAnalyticsTag
  extends TrackingTag
{
  private static final String a = FunctionType.ah.toString();
  private static final String b = Key.a.toString();
  private static final String c = Key.j.toString();
  private static final String d = Key.i.toString();
  private static final String e = Key.bU.toString();
  private static final String f = Key.bW.toString();
  private static final String g = Key.bY.toString();
  private static Map<String, String> h;
  private static Map<String, String> i;
  private final Set<String> j;
  private final TrackerProvider k;
  private final DataLayer l;
  
  public UniversalAnalyticsTag(Context paramContext, DataLayer paramDataLayer)
  {
    this(paramContext, paramDataLayer, new TrackerProvider(paramContext));
  }
  
  UniversalAnalyticsTag(Context paramContext, DataLayer paramDataLayer, TrackerProvider paramTrackerProvider)
  {
    super(a, new String[0]);
    this.l = paramDataLayer;
    this.k = paramTrackerProvider;
    this.j = new HashSet();
    this.j.add("");
    this.j.add("0");
    this.j.add("false");
  }
  
  private String a(String paramString)
  {
    Object localObject = this.l.a(paramString);
    if (localObject == null) {
      return null;
    }
    return localObject.toString();
  }
  
  private Map<String, String> a(TypeSystem.Value paramValue)
  {
    if (paramValue.e() != TypeSystem.Value.Type.c) {
      return null;
    }
    HashMap localHashMap = new HashMap(paramValue.n());
    for (int m = 0; m < paramValue.n(); m++) {
      localHashMap.put(Types.a(paramValue.b(m)), Types.a(paramValue.c(m)));
    }
    return localHashMap;
  }
  
  private void a(Tracker paramTracker, Map<String, TypeSystem.Value> paramMap)
  {
    ((TypeSystem.Value)paramMap.get(b)).g();
    String str = a("transactionId");
    if (str == null) {
      Log.a("Cannot find transactionId in data layer.");
    }
    for (;;)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      try
      {
        Map localMap1 = b((TypeSystem.Value)paramMap.get(d));
        localMap1.put("&t", "transaction");
        Iterator localIterator1 = c(paramMap).entrySet().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
          a(localMap1, (String)localEntry2.getValue(), a((String)localEntry2.getKey()));
        }
        localLinkedList.add(localMap1);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        Log.a("Unable to send transaction", localIllegalArgumentException);
        return;
      }
      List localList = b();
      if (localList != null)
      {
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          Map localMap2 = (Map)localIterator2.next();
          if (localMap2.get("name") == null)
          {
            Log.a("Unable to send transaction item hit due to missing 'name' field.");
            return;
          }
          Map localMap3 = b((TypeSystem.Value)paramMap.get(d));
          localMap3.put("&t", "item");
          localMap3.put("&ti", str);
          Iterator localIterator4 = d(paramMap).entrySet().iterator();
          while (localIterator4.hasNext())
          {
            Map.Entry localEntry1 = (Map.Entry)localIterator4.next();
            a(localMap3, (String)localEntry1.getValue(), (String)localMap2.get(localEntry1.getKey()));
          }
          localLinkedList.add(localMap3);
        }
      }
      Iterator localIterator3 = localLinkedList.iterator();
      while (localIterator3.hasNext()) {
        paramTracker.a((Map)localIterator3.next());
      }
    }
  }
  
  private void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private boolean a(Map<String, TypeSystem.Value> paramMap, String paramString)
  {
    TypeSystem.Value localValue = (TypeSystem.Value)paramMap.get(paramString);
    if (localValue == null) {
      return false;
    }
    return localValue.C();
  }
  
  private List<Map<String, String>> b()
  {
    Object localObject = this.l.a("transactionProducts");
    if (localObject == null) {
      return null;
    }
    if (!(localObject instanceof List)) {
      throw new IllegalArgumentException("transactionProducts should be of type List.");
    }
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext()) {
      if (!(localIterator.next() instanceof Map)) {
        throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
      }
    }
    return (List)localObject;
  }
  
  private Map<String, String> b(TypeSystem.Value paramValue)
  {
    if ((paramValue == null) || (paramValue.e() != TypeSystem.Value.Type.c)) {
      return new HashMap();
    }
    Map localMap = a(paramValue);
    String str = (String)localMap.get("&aip");
    if ((str != null) && (this.j.contains(str.toLowerCase()))) {
      localMap.remove("&aip");
    }
    return localMap;
  }
  
  private Map<String, String> c(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue = (TypeSystem.Value)paramMap.get(f);
    if (localValue != null) {
      return a(localValue);
    }
    if (h == null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("transactionId", "&ti");
      localHashMap.put("transactionAffiliation", "&ta");
      localHashMap.put("transactionTax", "&tt");
      localHashMap.put("transactionShipping", "&ts");
      localHashMap.put("transactionTotal", "&tr");
      localHashMap.put("transactionCurrency", "&cu");
      h = localHashMap;
    }
    return h;
  }
  
  private Map<String, String> d(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue = (TypeSystem.Value)paramMap.get(g);
    if (localValue != null) {
      return a(localValue);
    }
    if (i == null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("name", "&in");
      localHashMap.put("sku", "&ic");
      localHashMap.put("category", "&iv");
      localHashMap.put("price", "&ip");
      localHashMap.put("quantity", "&iq");
      localHashMap.put("currency", "&cu");
      i = localHashMap;
    }
    return i;
  }
  
  public void b(Map<String, TypeSystem.Value> paramMap)
  {
    Tracker localTracker = this.k.a("_GTM_DEFAULT_TRACKER_");
    if (a(paramMap, c)) {
      localTracker.a(b((TypeSystem.Value)paramMap.get(d)));
    }
    for (;;)
    {
      this.k.a(localTracker);
      return;
      if (a(paramMap, e)) {
        a(localTracker, paramMap);
      } else {
        Log.b("Ignoring unknown tag.");
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.UniversalAnalyticsTag
 * JD-Core Version:    0.7.0.1
 */