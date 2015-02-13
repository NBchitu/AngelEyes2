package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.proto.Serving.Resource;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.tagmanager.proto.Resource.ResourceWithMetadata;
import com.google.tagmanager.proto.Resource.ResourceWithMetadata.Builder;
import java.util.HashMap;
import java.util.Map;

public class Container
{
  LoadCallback<Serving.Resource> a;
  LoadCallback<Resource.ResourceWithMetadata> b;
  private final Context c;
  private final String d;
  private final TagManager e;
  private Container.ResourceStorage f;
  private Container.ResourceLoaderScheduler g;
  private Container.Callback h;
  private Runtime i;
  private CtfeHost j = new CtfeHost();
  private Clock k;
  private Map<String, Container.FunctionCallMacroHandler> l;
  private Map<String, Container.FunctionCallTagHandler> m;
  private volatile long n;
  private volatile String o;
  private volatile String p;
  private volatile String q = "";
  private volatile int r = 0;
  private volatile Serving.Resource s;
  private volatile long t;
  private volatile int u;
  
  Container(Context paramContext, String paramString, TagManager paramTagManager)
  {
    this(paramContext, paramString, paramTagManager, new ResourceStorageImpl(paramContext, paramString));
  }
  
  Container(Context paramContext, String paramString, TagManager paramTagManager, Container.ResourceStorage paramResourceStorage)
  {
    this.c = paramContext;
    this.d = paramString;
    this.e = paramTagManager;
    this.f = paramResourceStorage;
    this.u = 30;
    this.l = new HashMap();
    this.m = new HashMap();
    g();
  }
  
  private void a(Serving.Resource paramResource)
  {
    try
    {
      if (this.f != null) {
        this.f.a(Resource.ResourceWithMetadata.h().a(a()).a(paramResource).c());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void a(Serving.Resource paramResource, boolean paramBoolean)
  {
    try
    {
      ResourceUtil.ExpandedResource localExpandedResource = ResourceUtil.a(paramResource);
      if (!paramBoolean) {
        this.s = paramResource;
      }
      a(localExpandedResource);
      return;
    }
    catch (ResourceUtil.InvalidResourceException localInvalidResourceException)
    {
      Log.a("Not loading resource: " + paramResource + " because it is invalid: " + localInvalidResourceException.toString());
    }
  }
  
  private void a(Container.RefreshType paramRefreshType)
  {
    try
    {
      Log.e("calling containerRefreshSuccess(" + paramRefreshType + "): mUserCallback = " + this.h);
      if (this.h != null) {
        this.h.b(this, paramRefreshType);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void a(Container.RefreshType paramRefreshType, Container.RefreshFailure paramRefreshFailure)
  {
    try
    {
      if (this.h != null) {
        this.h.a(this, paramRefreshType, paramRefreshFailure);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void a(ResourceUtil.ExpandedResource paramExpandedResource)
  {
    this.q = paramExpandedResource.c();
    this.r = paramExpandedResource.d();
    EventInfoDistributor localEventInfoDistributor = d(this.q);
    a(new Runtime(this.c, paramExpandedResource, this.e.a(), new Container.FunctionCallMacroHandlerAdapter(this, null), new Container.FunctionCallTagHandlerAdapter(this, null), localEventInfoDistributor));
  }
  
  private void a(Runtime paramRuntime)
  {
    try
    {
      this.i = paramRuntime;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void b(Container.RefreshType paramRefreshType)
  {
    try
    {
      if (this.h != null) {
        this.h.a(this, paramRefreshType);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private boolean b(long paramLong)
  {
    if (this.t == 0L)
    {
      this.u = (-1 + this.u);
      return true;
    }
    long l1 = paramLong - this.t;
    if (l1 < 5000L) {
      return false;
    }
    if (this.u < 30) {
      this.u = Math.min(30, (int)Math.floor(l1 / 900000L) + this.u);
    }
    if (this.u > 0)
    {
      this.u = (-1 + this.u);
      return true;
    }
    return false;
  }
  
  private Runtime e()
  {
    try
    {
      Runtime localRuntime = this.i;
      return localRuntime;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private boolean f()
  {
    PreviewManager localPreviewManager = PreviewManager.a();
    return ((localPreviewManager.b() == PreviewManager.PreviewMode.b) || (localPreviewManager.b() == PreviewManager.PreviewMode.c)) && (this.d.equals(localPreviewManager.d()));
  }
  
  private void g()
  {
    String str = "tagmanager/" + this.d;
    Serving.Resource localResource = this.f.a(str);
    if (localResource != null)
    {
      a(localResource, true);
      return;
    }
    ResourceUtil.ExpandedResource localExpandedResource = this.f.b(str + ".json");
    if (localExpandedResource == null)
    {
      Log.b("No default container found; creating an empty container.");
      localExpandedResource = ResourceUtil.ExpandedResource.a().a();
    }
    a(localExpandedResource);
  }
  
  private boolean h()
  {
    return this.e.b() == TagManager.RefreshMode.b;
  }
  
  public long a()
  {
    return this.n;
  }
  
  public String a(String paramString)
  {
    Runtime localRuntime = e();
    if (localRuntime == null)
    {
      Log.a("getString called for closed container.");
      return Types.c();
    }
    try
    {
      String str = Types.a((TypeSystem.Value)localRuntime.a(paramString).a());
      return str;
    }
    catch (Exception localException)
    {
      Log.a("Calling getString() threw an exception: " + localException.getMessage() + " Returning default value.");
    }
    return Types.c();
  }
  
  /* Error */
  void a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 326	com/google/tagmanager/Container:g	Lcom/google/tagmanager/Container$ResourceLoaderScheduler;
    //   6: ifnull +32 -> 38
    //   9: aload_0
    //   10: invokespecial 328	com/google/tagmanager/Container:h	()Z
    //   13: ifne +25 -> 38
    //   16: aload_0
    //   17: getfield 125	com/google/tagmanager/Container:s	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   20: ifnonnull +21 -> 41
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_0
    //   27: getfield 326	com/google/tagmanager/Container:g	Lcom/google/tagmanager/Container$ResourceLoaderScheduler;
    //   30: lload_1
    //   31: aload 4
    //   33: invokeinterface 333 4 0
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: aload_0
    //   42: getfield 125	com/google/tagmanager/Container:s	Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   45: invokevirtual 338	com/google/analytics/containertag/proto/Serving$Resource:G	()Ljava/lang/String;
    //   48: astore 5
    //   50: aload 5
    //   52: astore 4
    //   54: goto -28 -> 26
    //   57: astore_3
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_3
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	Container
    //   0	62	1	paramLong	long
    //   57	4	3	localObject1	Object
    //   24	29	4	localObject2	Object
    //   48	3	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	23	57	finally
    //   26	38	57	finally
    //   41	50	57	finally
  }
  
  void a(Container.Callback paramCallback)
  {
    Container.1 local1 = new Container.1(this);
    a(paramCallback, new ResourceLoaderSchedulerImpl(this.c, this.d, this.j), local1);
  }
  
  void a(Container.Callback paramCallback, Container.ResourceLoaderScheduler paramResourceLoaderScheduler, Clock paramClock)
  {
    try
    {
      if (this.b != null) {
        throw new RuntimeException("Container already loaded: container ID: " + this.d);
      }
    }
    finally {}
    this.k = paramClock;
    this.h = paramCallback;
    this.b = new Container.2(this, paramClock);
    if (h()) {
      Log.c("Container is in DEFAULT_CONTAINER mode. Use default container.");
    }
    for (;;)
    {
      return;
      this.f.a(this.b);
      this.a = new Container.3(this, paramClock);
      paramResourceLoaderScheduler.a(this.a);
      if (f())
      {
        this.p = PreviewManager.a().c();
        paramResourceLoaderScheduler.a(this.p);
      }
      if (this.o != null) {
        this.j.a(this.o);
      }
      this.g = paramResourceLoaderScheduler;
      this.f.a();
    }
  }
  
  public Container.FunctionCallMacroHandler b(String paramString)
  {
    try
    {
      Container.FunctionCallMacroHandler localFunctionCallMacroHandler = (Container.FunctionCallMacroHandler)this.l.get(paramString);
      return localFunctionCallMacroHandler;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b()
  {
    for (;;)
    {
      try
      {
        if (e() == null)
        {
          Log.b("refresh called for closed container");
          return;
        }
        try
        {
          if (!h()) {
            break label69;
          }
          Log.b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
        }
        catch (Exception localException)
        {
          Log.a("Calling refresh() throws an exception: " + localException.getMessage());
        }
        continue;
        l1 = this.k.a();
      }
      finally {}
      label69:
      long l1;
      if (b(l1))
      {
        Log.e("Container refresh requested");
        a(0L);
        this.t = l1;
      }
      else
      {
        Log.e("Container refresh was called too often. Ignored.");
      }
    }
  }
  
  public Container.FunctionCallTagHandler c(String paramString)
  {
    try
    {
      Container.FunctionCallTagHandler localFunctionCallTagHandler = (Container.FunctionCallTagHandler)this.m.get(paramString);
      return localFunctionCallTagHandler;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean c()
  {
    return a() == 0L;
  }
  
  EventInfoDistributor d(String paramString)
  {
    if (PreviewManager.a().b().equals(PreviewManager.PreviewMode.c)) {}
    return new NoopEventInfoDistributor();
  }
  
  String d()
  {
    return this.p;
  }
  
  void e(String paramString)
  {
    try
    {
      this.o = paramString;
      if (paramString != null) {
        this.j.a(paramString);
      }
      return;
    }
    finally {}
  }
  
  void f(String paramString)
  {
    try
    {
      this.p = paramString;
      if (this.g != null) {
        this.g.a(paramString);
      }
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
 * Qualified Name:     com.google.tagmanager.Container
 * JD-Core Version:    0.7.0.1
 */