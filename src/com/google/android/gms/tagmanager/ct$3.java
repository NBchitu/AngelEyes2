package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

class ct$3
  implements ct.a
{
  ct$3(ct paramct, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4) {}
  
  public void a(cr.e parame, Set<cr.a> paramSet1, Set<cr.a> paramSet2, cn paramcn)
  {
    List localList1 = (List)this.a.get(parame);
    List localList2 = (List)this.b.get(parame);
    if (localList1 != null)
    {
      paramSet1.addAll(localList1);
      paramcn.c().a(localList1, localList2);
    }
    List localList3 = (List)this.c.get(parame);
    List localList4 = (List)this.d.get(parame);
    if (localList3 != null)
    {
      paramSet2.addAll(localList3);
      paramcn.d().a(localList3, localList4);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ct.3
 * JD-Core Version:    0.7.0.1
 */