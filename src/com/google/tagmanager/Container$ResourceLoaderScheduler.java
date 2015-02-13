package com.google.tagmanager;

import com.google.analytics.containertag.proto.Serving.Resource;

abstract interface Container$ResourceLoaderScheduler
{
  public abstract void a(long paramLong, String paramString);
  
  public abstract void a(LoadCallback<Serving.Resource> paramLoadCallback);
  
  public abstract void a(String paramString);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Container.ResourceLoaderScheduler
 * JD-Core Version:    0.7.0.1
 */