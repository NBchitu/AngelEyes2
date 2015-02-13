package com.google.tagmanager;

import com.google.analytics.containertag.proto.Serving.Resource;
import com.google.tagmanager.proto.Resource.ResourceWithMetadata;

abstract interface Container$ResourceStorage
{
  public abstract Serving.Resource a(String paramString);
  
  public abstract void a();
  
  public abstract void a(LoadCallback<Resource.ResourceWithMetadata> paramLoadCallback);
  
  public abstract void a(Resource.ResourceWithMetadata paramResourceWithMetadata);
  
  public abstract ResourceUtil.ExpandedResource b(String paramString);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Container.ResourceStorage
 * JD-Core Version:    0.7.0.1
 */