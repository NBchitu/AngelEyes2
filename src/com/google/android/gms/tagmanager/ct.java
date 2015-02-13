package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import com.google.android.gms.internal.d.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ct
{
  private static final bz<d.a> a = new bz(di.a(), true);
  private final ag b;
  private final Map<String, aj> c;
  private final Map<String, aj> d;
  private final Map<String, aj> e;
  private final k<cr.a, bz<d.a>> f;
  private final k<String, ct.b> g;
  private final Set<cr.e> h;
  private final DataLayer i;
  private final Map<String, ct.c> j;
  private volatile String k;
  private int l;
  
  private bz<d.a> a(d.a parama, Set<String> paramSet, dl paramdl)
  {
    if (!parama.l) {
      return new bz(parama, true);
    }
    switch (parama.a)
    {
    case 5: 
    case 6: 
    default: 
      bh.a("Unknown type: " + parama.a);
      return a;
    case 2: 
      d.a locala3 = cr.a(parama);
      locala3.c = new d.a[parama.c.length];
      for (int i1 = 0; i1 < parama.c.length; i1++)
      {
        bz localbz5 = a(parama.c[i1], paramSet, paramdl.a(i1));
        if (localbz5 == a) {
          return a;
        }
        locala3.c[i1] = ((d.a)localbz5.a());
      }
      return new bz(locala3, false);
    case 3: 
      d.a locala2 = cr.a(parama);
      if (parama.d.length != parama.e.length)
      {
        bh.a("Invalid serving value: " + parama.toString());
        return a;
      }
      locala2.d = new d.a[parama.d.length];
      locala2.e = new d.a[parama.d.length];
      for (int n = 0; n < parama.d.length; n++)
      {
        bz localbz3 = a(parama.d[n], paramSet, paramdl.b(n));
        bz localbz4 = a(parama.e[n], paramSet, paramdl.c(n));
        if ((localbz3 == a) || (localbz4 == a)) {
          return a;
        }
        locala2.d[n] = ((d.a)localbz3.a());
        locala2.e[n] = ((d.a)localbz4.a());
      }
      return new bz(locala2, false);
    case 4: 
      if (paramSet.contains(parama.f))
      {
        bh.a("Macro cycle detected.  Current macro reference: " + parama.f + "." + "  Previous macro references: " + paramSet.toString() + ".");
        return a;
      }
      paramSet.add(parama.f);
      bz localbz2 = dm.a(a(parama.f, paramSet, paramdl.a()), parama.k);
      paramSet.remove(parama.f);
      return localbz2;
    }
    d.a locala1 = cr.a(parama);
    locala1.j = new d.a[parama.j.length];
    for (int m = 0; m < parama.j.length; m++)
    {
      bz localbz1 = a(parama.j[m], paramSet, paramdl.d(m));
      if (localbz1 == a) {
        return a;
      }
      locala1.j[m] = ((d.a)localbz1.a());
    }
    return new bz(locala1, false);
  }
  
  private bz<d.a> a(String paramString, Set<String> paramSet, bk parambk)
  {
    this.l = (1 + this.l);
    ct.b localb = (ct.b)this.g.a(paramString);
    if ((localb != null) && (!this.b.a()))
    {
      a(localb.b(), paramSet);
      this.l = (-1 + this.l);
      return localb.a();
    }
    ct.c localc = (ct.c)this.j.get(paramString);
    if (localc == null)
    {
      bh.a(a() + "Invalid macro: " + paramString);
      this.l = (-1 + this.l);
      return a;
    }
    bz localbz1 = a(paramString, localc.a(), localc.b(), localc.c(), localc.e(), localc.d(), paramSet, parambk.b());
    if (((Set)localbz1.a()).isEmpty()) {}
    for (cr.a locala = localc.f(); locala == null; locala = (cr.a)((Set)localbz1.a()).iterator().next())
    {
      this.l = (-1 + this.l);
      return a;
      if (((Set)localbz1.a()).size() > 1) {
        bh.b(a() + "Multiple macros active for macroName " + paramString);
      }
    }
    bz localbz2 = a(this.e, locala, paramSet, parambk.a());
    boolean bool;
    if ((localbz1.b()) && (localbz2.b()))
    {
      bool = true;
      if (localbz2 != a) {
        break label397;
      }
    }
    label397:
    for (bz localbz3 = a;; localbz3 = new bz(localbz2.a(), bool))
    {
      d.a locala1 = locala.b();
      if (localbz3.b()) {
        this.g.a(paramString, new ct.b(localbz3, locala1));
      }
      a(locala1, paramSet);
      this.l = (-1 + this.l);
      return localbz3;
      bool = false;
      break;
    }
  }
  
  private bz<d.a> a(Map<String, aj> paramMap, cr.a parama, Set<String> paramSet, ck paramck)
  {
    boolean bool1 = true;
    d.a locala = (d.a)parama.a().get(b.aL.toString());
    bz localbz1;
    if (locala == null)
    {
      bh.a("No function id in properties");
      localbz1 = a;
    }
    String str;
    aj localaj;
    do
    {
      return localbz1;
      str = locala.g;
      localaj = (aj)paramMap.get(str);
      if (localaj == null)
      {
        bh.a(str + " has no backing implementation.");
        return a;
      }
      localbz1 = (bz)this.f.a(parama);
    } while ((localbz1 != null) && (!this.b.a()));
    HashMap localHashMap = new HashMap();
    Iterator localIterator = parama.a().entrySet().iterator();
    boolean bool2 = bool1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      cm localcm = paramck.a((String)localEntry.getKey());
      bz localbz3 = a((d.a)localEntry.getValue(), paramSet, localcm.a((d.a)localEntry.getValue()));
      if (localbz3 == a) {
        return a;
      }
      if (localbz3.b()) {
        parama.a((String)localEntry.getKey(), (d.a)localbz3.a());
      }
      for (boolean bool3 = bool2;; bool3 = false)
      {
        localHashMap.put(localEntry.getKey(), localbz3.a());
        bool2 = bool3;
        break;
      }
    }
    if (!localaj.a(localHashMap.keySet()))
    {
      bh.a("Incorrect keys for function " + str + " required " + localaj.b() + " had " + localHashMap.keySet());
      return a;
    }
    if ((bool2) && (localaj.a())) {}
    for (;;)
    {
      bz localbz2 = new bz(localaj.a(localHashMap), bool1);
      if (bool1) {
        this.f.a(parama, localbz2);
      }
      paramck.a((d.a)localbz2.a());
      return localbz2;
      bool1 = false;
    }
  }
  
  private bz<Set<cr.a>> a(Set<cr.e> paramSet, Set<String> paramSet1, ct.a parama, cs paramcs)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
    {
      cr.e locale = (cr.e)localIterator.next();
      cn localcn = paramcs.a();
      bz localbz = a(locale, paramSet1, localcn);
      if (((Boolean)localbz.a()).booleanValue()) {
        parama.a(locale, localHashSet1, localHashSet2, localcn);
      }
      if ((bool1) && (localbz.b())) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    paramcs.a(localHashSet1);
    return new bz(localHashSet1, bool1);
  }
  
  private String a()
  {
    if (this.l <= 1) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Integer.toString(this.l));
    for (int m = 2; m < this.l; m++) {
      localStringBuilder.append(' ');
    }
    localStringBuilder.append(": ");
    return localStringBuilder.toString();
  }
  
  private void a(d.a parama, Set<String> paramSet)
  {
    if (parama == null) {}
    for (;;)
    {
      return;
      bz localbz = a(parama, paramSet, new bx());
      if (localbz != a)
      {
        Object localObject1 = di.c((d.a)localbz.a());
        if ((localObject1 instanceof Map))
        {
          Map localMap2 = (Map)localObject1;
          this.i.a(localMap2);
          return;
        }
        if (!(localObject1 instanceof List)) {
          break;
        }
        Iterator localIterator = ((List)localObject1).iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = localIterator.next();
          if ((localObject2 instanceof Map))
          {
            Map localMap1 = (Map)localObject2;
            this.i.a(localMap1);
          }
          else
          {
            bh.b("pushAfterEvaluate: value not a Map");
          }
        }
      }
    }
    bh.b("pushAfterEvaluate: value not a Map or List");
  }
  
  bz<Boolean> a(cr.a parama, Set<String> paramSet, ck paramck)
  {
    bz localbz = a(this.d, parama, paramSet, paramck);
    Boolean localBoolean = di.b((d.a)localbz.a());
    paramck.a(di.c(localBoolean));
    return new bz(localBoolean, localbz.b());
  }
  
  bz<Boolean> a(cr.e parame, Set<String> paramSet, cn paramcn)
  {
    Iterator localIterator1 = parame.b().iterator();
    boolean bool1 = true;
    if (localIterator1.hasNext())
    {
      bz localbz2 = a((cr.a)localIterator1.next(), paramSet, paramcn.a());
      if (((Boolean)localbz2.a()).booleanValue())
      {
        paramcn.a(di.c(Boolean.valueOf(false)));
        return new bz(Boolean.valueOf(false), localbz2.b());
      }
      if ((bool1) && (localbz2.b())) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    Iterator localIterator2 = parame.a().iterator();
    while (localIterator2.hasNext())
    {
      bz localbz1 = a((cr.a)localIterator2.next(), paramSet, paramcn.b());
      if (!((Boolean)localbz1.a()).booleanValue())
      {
        paramcn.a(di.c(Boolean.valueOf(false)));
        return new bz(Boolean.valueOf(false), localbz1.b());
      }
      if ((bool1) && (localbz1.b())) {
        bool1 = true;
      } else {
        bool1 = false;
      }
    }
    paramcn.a(di.c(Boolean.valueOf(true)));
    return new bz(Boolean.valueOf(true), bool1);
  }
  
  bz<Set<cr.a>> a(String paramString, Set<cr.e> paramSet, Map<cr.e, List<cr.a>> paramMap1, Map<cr.e, List<String>> paramMap2, Map<cr.e, List<cr.a>> paramMap3, Map<cr.e, List<String>> paramMap4, Set<String> paramSet1, cs paramcs)
  {
    return a(paramSet, paramSet1, new ct.3(this, paramMap1, paramMap2, paramMap3, paramMap4), paramcs);
  }
  
  bz<Set<cr.a>> a(Set<cr.e> paramSet, cs paramcs)
  {
    return a(paramSet, new HashSet(), new ct.4(this), paramcs);
  }
  
  public void a(String paramString)
  {
    try
    {
      b(paramString);
      af localaf = this.b.a(paramString);
      t localt = localaf.a();
      Iterator localIterator = ((Set)a(this.h, localt.b()).a()).iterator();
      while (localIterator.hasNext())
      {
        cr.a locala = (cr.a)localIterator.next();
        a(this.c, locala, new HashSet(), localt.a());
      }
      localaf.b();
    }
    finally {}
    b(null);
  }
  
  void b(String paramString)
  {
    try
    {
      this.k = paramString;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ct
 * JD-Core Version:    0.7.0.1
 */