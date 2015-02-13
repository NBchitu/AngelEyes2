package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager
{
  private static TagManager g;
  private final TagManager.a a;
  private final Context b;
  private final DataLayer c;
  private final cx d;
  private final ConcurrentMap<n, Boolean> e;
  private final r f;
  
  TagManager(Context paramContext, TagManager.a parama, DataLayer paramDataLayer, cx paramcx)
  {
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.b = paramContext.getApplicationContext();
    this.d = paramcx;
    this.a = parama;
    this.e = new ConcurrentHashMap();
    this.c = paramDataLayer;
    this.c.a(new TagManager.1(this));
    this.c.a(new d(this.b));
    this.f = new r();
    b();
  }
  
  public static TagManager a(Context paramContext)
  {
    try
    {
      if (g != null) {
        break label68;
      }
      if (paramContext == null)
      {
        bh.a("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
      }
    }
    finally {}
    g = new TagManager(paramContext, new TagManager.2(), new DataLayer(new v(paramContext)), cy.b());
    label68:
    TagManager localTagManager = g;
    return localTagManager;
  }
  
  private void a(String paramString)
  {
    Iterator localIterator = this.e.keySet().iterator();
    while (localIterator.hasNext()) {
      ((n)localIterator.next()).a(paramString);
    }
  }
  
  private void b()
  {
    if (Build.VERSION.SDK_INT >= 14) {
      this.b.registerComponentCallbacks(new TagManager.3(this));
    }
  }
  
  public void a()
  {
    this.d.a();
  }
  
  boolean a(Uri paramUri)
  {
    for (;;)
    {
      ce localce;
      String str;
      boolean bool;
      try
      {
        localce = ce.a();
        if (!localce.a(paramUri)) {
          break label228;
        }
        str = localce.d();
        int i = TagManager.4.a[localce.b().ordinal()];
        switch (i)
        {
        default: 
          bool = true;
          return bool;
        }
      }
      finally {}
      Iterator localIterator2 = this.e.keySet().iterator();
      if (localIterator2.hasNext())
      {
        n localn2 = (n)localIterator2.next();
        if (localn2.d().equals(str))
        {
          localn2.b(null);
          localn2.c();
        }
      }
      else
      {
        continue;
        Iterator localIterator1 = this.e.keySet().iterator();
        while (localIterator1.hasNext())
        {
          n localn1 = (n)localIterator1.next();
          if (localn1.d().equals(str))
          {
            localn1.b(localce.c());
            localn1.c();
          }
          else if (localn1.e() != null)
          {
            localn1.b(null);
            localn1.c();
          }
        }
        continue;
        label228:
        bool = false;
      }
    }
  }
  
  boolean a(n paramn)
  {
    return this.e.remove(paramn) != null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.TagManager
 * JD-Core Version:    0.7.0.1
 */