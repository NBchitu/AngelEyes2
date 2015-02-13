package com.google.tagmanager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

class ResourceLoaderSchedulerImpl$1
  implements ResourceLoaderSchedulerImpl.ScheduledExecutorServiceFactory
{
  ResourceLoaderSchedulerImpl$1(ResourceLoaderSchedulerImpl paramResourceLoaderSchedulerImpl) {}
  
  public ScheduledExecutorService a()
  {
    return Executors.newSingleThreadScheduledExecutor();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceLoaderSchedulerImpl.1
 * JD-Core Version:    0.7.0.1
 */