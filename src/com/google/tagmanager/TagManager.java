package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager
{
  private static TagManager g;
  private final TagManager.ContainerProvider a;
  private final Context b;
  private final DataLayer c;
  private volatile TagManager.RefreshMode d;
  private volatile String e;
  private final ConcurrentMap<String, Container> f;
  
  TagManager(Context paramContext, TagManager.ContainerProvider paramContainerProvider, DataLayer paramDataLayer)
  {
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.b = paramContext.getApplicationContext();
    this.a = paramContainerProvider;
    this.d = TagManager.RefreshMode.a;
    this.f = new ConcurrentHashMap();
    this.c = paramDataLayer;
    this.c.a(new TagManager.1(this));
    this.c.a(new AdwordsClickReferrerListener(this.b));
  }
  
  public static TagManager a(Context paramContext)
  {
    try
    {
      if (g == null) {
        g = new TagManager(paramContext, new TagManager.2(), new DataLayer());
      }
      TagManager localTagManager = g;
      return localTagManager;
    }
    finally {}
  }
  
  public Container a(String paramString)
  {
    return (Container)this.f.get(paramString);
  }
  
  public Container a(String paramString, Container.Callback paramCallback)
  {
    Container localContainer = this.a.a(this.b, paramString, this);
    if (this.f.putIfAbsent(paramString, localContainer) != null) {
      throw new IllegalArgumentException("Container id:" + paramString + " has already been opened.");
    }
    if (this.e != null) {
      localContainer.e(this.e);
    }
    localContainer.a(paramCallback);
    return localContainer;
  }
  
  public DataLayer a()
  {
    return this.c;
  }
  
  boolean a(Uri paramUri)
  {
    for (;;)
    {
      PreviewManager localPreviewManager;
      String str;
      boolean bool;
      try
      {
        localPreviewManager = PreviewManager.a();
        if (!localPreviewManager.a(paramUri)) {
          break label215;
        }
        str = localPreviewManager.d();
        int i = TagManager.3.a[localPreviewManager.b().ordinal()];
        switch (i)
        {
        default: 
          bool = true;
          return bool;
        }
      }
      finally {}
      Container localContainer2 = (Container)this.f.get(str);
      if (localContainer2 != null)
      {
        localContainer2.f(null);
        localContainer2.b();
        continue;
        Iterator localIterator = this.f.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          Container localContainer1 = (Container)localEntry.getValue();
          if (((String)localEntry.getKey()).equals(str))
          {
            localContainer1.f(localPreviewManager.c());
            localContainer1.b();
          }
          else if (localContainer1.d() != null)
          {
            localContainer1.f(null);
            localContainer1.b();
          }
        }
        continue;
        label215:
        bool = false;
      }
    }
  }
  
  public TagManager.RefreshMode b()
  {
    return this.d;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.TagManager
 * JD-Core Version:    0.7.0.1
 */