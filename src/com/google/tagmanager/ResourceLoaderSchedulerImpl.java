package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.proto.Serving.Resource;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class ResourceLoaderSchedulerImpl
  implements Container.ResourceLoaderScheduler
{
  private final String a;
  private final Context b;
  private final ScheduledExecutorService c;
  private final ResourceLoaderSchedulerImpl.ResourceLoaderFactory d;
  private ScheduledFuture<?> e;
  private boolean f;
  private CtfeHost g;
  private String h;
  private LoadCallback<Serving.Resource> i;
  
  public ResourceLoaderSchedulerImpl(Context paramContext, String paramString, CtfeHost paramCtfeHost)
  {
    this(paramContext, paramString, paramCtfeHost, null, null);
  }
  
  ResourceLoaderSchedulerImpl(Context paramContext, String paramString, CtfeHost paramCtfeHost, ResourceLoaderSchedulerImpl.ScheduledExecutorServiceFactory paramScheduledExecutorServiceFactory, ResourceLoaderSchedulerImpl.ResourceLoaderFactory paramResourceLoaderFactory)
  {
    this.g = paramCtfeHost;
    this.b = paramContext;
    this.a = paramString;
    if (paramScheduledExecutorServiceFactory == null) {
      paramScheduledExecutorServiceFactory = new ResourceLoaderSchedulerImpl.1(this);
    }
    this.c = paramScheduledExecutorServiceFactory.a();
    if (paramResourceLoaderFactory == null)
    {
      this.d = new ResourceLoaderSchedulerImpl.2(this);
      return;
    }
    this.d = paramResourceLoaderFactory;
  }
  
  private void a()
  {
    try
    {
      if (this.f) {
        throw new IllegalStateException("called method after closed");
      }
    }
    finally {}
  }
  
  private ResourceLoader b(String paramString)
  {
    ResourceLoader localResourceLoader = this.d.a(this.g);
    localResourceLoader.a(this.i);
    localResourceLoader.a(this.h);
    localResourceLoader.b(paramString);
    return localResourceLoader;
  }
  
  public void a(long paramLong, String paramString)
  {
    try
    {
      Log.e("loadAfterDelay: containerId=" + this.a + " delay=" + paramLong);
      a();
      if (this.i == null) {
        throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
      }
    }
    finally {}
    if (this.e != null) {
      this.e.cancel(true);
    }
    this.e = this.c.schedule(b(paramString), paramLong, TimeUnit.MILLISECONDS);
  }
  
  public void a(LoadCallback<Serving.Resource> paramLoadCallback)
  {
    try
    {
      a();
      this.i = paramLoadCallback;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      a();
      this.h = paramString;
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
 * Qualified Name:     com.google.tagmanager.ResourceLoaderSchedulerImpl
 * JD-Core Version:    0.7.0.1
 */