package com.google.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public class ContainerOpener
{
  private static final Map<String, List<ContainerOpener.Notifier>> a = new HashMap();
  private final TagManager b;
  private final String c;
  private final long d;
  private ContainerOpener.Notifier e;
  private volatile Container f;
  private boolean g;
  private Clock h = new ContainerOpener.1(this);
  
  private ContainerOpener(TagManager paramTagManager, String paramString, Long paramLong, ContainerOpener.Notifier paramNotifier)
  {
    this.b = paramTagManager;
    this.c = paramString;
    if (paramLong != null) {}
    for (long l = Math.max(1L, paramLong.longValue());; l = 2000L)
    {
      this.d = l;
      this.e = paramNotifier;
      return;
    }
  }
  
  private void a(long paramLong)
  {
    ContainerOpener.3 local3 = new ContainerOpener.3(this);
    new Timer("ContainerOpener").schedule(local3, paramLong);
  }
  
  private void a(Container.RefreshType paramRefreshType)
  {
    long l = this.h.a();
    int i = 0;
    for (;;)
    {
      try
      {
        this.f = this.b.a(this.c);
        if (this.f == null)
        {
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(this.e);
          this.e = null;
          a.put(this.c, localArrayList);
          TagManager localTagManager = this.b;
          String str = this.c;
          if (paramRefreshType == Container.RefreshType.a)
          {
            localObject2 = new ContainerOpener.WaitForNonDefaultRefresh(this);
            this.f = localTagManager.a(str, (Container.Callback)localObject2);
            if (i == 0) {
              break;
            }
            this.e.a(this.f);
            this.e = null;
            return;
          }
          Object localObject2 = new ContainerOpener.WaitForFresh(this, l - 43200000L);
          continue;
        }
        localList = (List)a.get(this.c);
      }
      finally {}
      List localList;
      if (localList == null)
      {
        i = 1;
      }
      else
      {
        localList.add(this.e);
        this.e = null;
        return;
      }
    }
    a(Math.max(1L, this.d - (this.h.a() - l)));
  }
  
  /* Error */
  private void a(Container paramContainer)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 135	com/google/tagmanager/ContainerOpener:g	Z
    //   6: ifne +85 -> 91
    //   9: ldc 2
    //   11: monitorenter
    //   12: getstatic 30	com/google/tagmanager/ContainerOpener:a	Ljava/util/Map;
    //   15: aload_0
    //   16: getfield 43	com/google/tagmanager/ContainerOpener:c	Ljava/lang/String;
    //   19: invokeinterface 138 2 0
    //   24: checkcast 94	java/util/List
    //   27: astore 4
    //   29: ldc 2
    //   31: monitorexit
    //   32: aload 4
    //   34: ifnull +52 -> 86
    //   37: aload 4
    //   39: invokeinterface 142 1 0
    //   44: astore 5
    //   46: aload 5
    //   48: invokeinterface 148 1 0
    //   53: ifeq +33 -> 86
    //   56: aload 5
    //   58: invokeinterface 152 1 0
    //   63: checkcast 117	com/google/tagmanager/ContainerOpener$Notifier
    //   66: aload_1
    //   67: invokeinterface 120 2 0
    //   72: goto -26 -> 46
    //   75: astore_2
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_2
    //   79: athrow
    //   80: astore_3
    //   81: ldc 2
    //   83: monitorexit
    //   84: aload_3
    //   85: athrow
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield 135	com/google/tagmanager/ContainerOpener:g	Z
    //   91: aload_0
    //   92: monitorexit
    //   93: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	ContainerOpener
    //   0	94	1	paramContainer	Container
    //   75	4	2	localObject1	Object
    //   80	5	3	localObject2	Object
    //   27	11	4	localList	List
    //   44	13	5	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	12	75	finally
    //   37	46	75	finally
    //   46	72	75	finally
    //   84	86	75	finally
    //   86	91	75	finally
    //   12	32	80	finally
    //   81	84	80	finally
  }
  
  public static void a(TagManager paramTagManager, String paramString, ContainerOpener.OpenType paramOpenType, Long paramLong, ContainerOpener.Notifier paramNotifier)
  {
    if (paramTagManager == null) {
      throw new NullPointerException("TagManager cannot be null.");
    }
    if (paramString == null) {
      throw new NullPointerException("ContainerId cannot be null.");
    }
    if (paramOpenType == null) {
      throw new NullPointerException("OpenType cannot be null.");
    }
    if (paramNotifier == null) {
      throw new NullPointerException("Notifier cannot be null.");
    }
    ContainerOpener localContainerOpener = new ContainerOpener(paramTagManager, paramString, paramLong, paramNotifier);
    if (paramOpenType == ContainerOpener.OpenType.b) {}
    for (Container.RefreshType localRefreshType = Container.RefreshType.b;; localRefreshType = Container.RefreshType.a)
    {
      localContainerOpener.a(localRefreshType);
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ContainerOpener
 * JD-Core Version:    0.7.0.1
 */